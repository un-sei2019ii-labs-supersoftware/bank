package co.edu.unal.se1.businessLogic.controller;

import android.content.Context;

import java.util.Random;

import co.edu.unal.se1.dataAccess.model.Account;
import co.edu.unal.se1.dataAccess.model.Transaction;
import co.edu.unal.se1.dataAccess.model.User;
import co.edu.unal.se1.dataAccess.repository.AccountRepository;
import co.edu.unal.se1.dataAccess.repository.TransactionRepository;
import co.edu.unal.se1.dataAccess.repository.UserRepository;

public class TransactionController {
    private TransactionRepository transactionRepository;
    private AccountRepository accountRepository;
    private UserRepository userRepository;

    public void createTransaction(Transaction transaction, Context context) {

        transactionRepository = new TransactionRepository(context);
        transactionRepository.createTransaction(transaction);
        System.out.println("¡Transaccion realizada!");
    }

    public boolean modifyBalance(int targetId, double value, Context context){
        userRepository = new UserRepository(context);
        accountRepository = new AccountRepository(context);

        final User targetUser = userRepository.getUserById(targetId);
        final Account targetAccount = accountRepository.getAccountById(targetId);
        System.out.println("Target User - ID: " + targetUser.getID_User() +
                ", Name: " + targetUser.getName() +
                ", Balance: " + targetAccount.getBalance());

        targetAccount.setBalance(targetAccount.getBalance() + value);
        accountRepository.updateAccount(targetAccount);

        final Account updatedTargetAccount = accountRepository.getAccountById(targetId);
        System.out.println("Target User (updated) - ID: " + targetUser.getID_User() +
                ", Name: " + targetUser.getName() +
                ", Balance: " + updatedTargetAccount.getBalance());


        Transaction transaction = new Transaction();
        transaction.setAccount1(targetAccount.getID_Account());
        transaction.setTransaction_Type(1);
        transaction.setAmount_Money(value);
        transaction.setDescription("Consignación");
        createTransaction(transaction, context);
        return true;
    }

    public boolean sendMoney(int sourceId, int targetId, double value, Context context){
        transactionRepository = new TransactionRepository(context);
        userRepository = new UserRepository(context);
        accountRepository = new AccountRepository(context);

        final User sourceUser = userRepository.getUserById(sourceId);
        final Account sourceAccount = accountRepository.getAccountById(sourceId);
        System.out.println("Source User - ID: " + sourceUser.getID_User() +
                ", Name: " + sourceUser.getName() +
                ", Balance: " + sourceAccount.getBalance());

        if (sourceAccount.getBalance() >= value) {

            final User targetUser = userRepository.getUserById(targetId);
            final Account targetAccount = accountRepository.getAccountById(targetId);
            System.out.println("Target User - ID: " + targetUser.getID_User() +
                    ", Name: " + targetUser.getName() +
                    ", Balance: " + targetAccount.getBalance());

            sourceAccount.setBalance(sourceAccount.getBalance() - value);
            targetAccount.setBalance(targetAccount.getBalance() + value);
            accountRepository.updateAccount(sourceAccount);
            accountRepository.updateAccount(targetAccount);

            final Account updatedSourceAccount = accountRepository.getAccountById(sourceId);
            System.out.println("Source User (updated) - ID: " + sourceUser.getID_User() +
                    ", Name: " + sourceUser.getName() +
                    ", Balance: " + updatedSourceAccount.getBalance());

            final Account updatedTargetAccount = accountRepository.getAccountById(targetId);
            System.out.println("Target User (updated) - ID: " + targetUser.getID_User() +
                    ", Name: " + targetUser.getName() +
                    ", Balance: " + updatedTargetAccount.getBalance());
            Transaction transaction = new Transaction();
            transaction.setAccount1(targetAccount.getID_Account());
            transaction.setAccount2(sourceAccount.getID_Account());
            transaction.setTransaction_Type(1);
            transaction.setAmount_Money(value);
            transaction.setDescription("Transferencia");
            createTransaction(transaction, context);

            return true;

        } else {

            return false;
        }

    }
}
