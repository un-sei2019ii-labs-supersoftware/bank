package co.edu.unal.se1.businessLogic.controller;

import android.content.Context;

import co.edu.unal.se1.dataAccess.model.*;
import co.edu.unal.se1.dataAccess.repository.*;

public class AccountController {

    private AccountRepository accountRepository;
    private UserRepository userRepository;

    public AccountController() {

    }

    public void createAccount(Account account, Context context) {

        accountRepository = new AccountRepository(context);
        accountRepository.createAccount(account);
        System.out.println("¡Cuenta creada satisfactoriamente!");
    }

    public double getBalanceById( int id , Context context ){
        accountRepository = new AccountRepository(context);
        Account  account = accountRepository.getAccountById( id );
        return account.getBalance();
    }

}
