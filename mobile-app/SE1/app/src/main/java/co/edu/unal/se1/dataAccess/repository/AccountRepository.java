package co.edu.unal.se1.dataAccess.repository;

import android.content.Context;
import androidx.room.Room;
import java.util.List;

import co.edu.unal.se1.dataAccess.db.Database;
import co.edu.unal.se1.dataAccess.model.Account;

public class AccountRepository {

    private String DB_NAME = "se1_db_bank";

    private Database database;
    public AccountRepository(Context context) {
        database = Room.databaseBuilder(context, Database.class, DB_NAME).
                allowMainThreadQueries().build();
    }

    public List<Account> getAllUsers() {
        return database.accountDao().getAllAcounts();
    }

    public Account getAccountById(int id) {
        return database.accountDao().getAcountsById(id);
    }

    public void createAccount(final Account account) {
        database.accountDao().createAcount(account);
    }

    public void updateAccount(Account account) {
        database.accountDao().updateAcount(account);
    }

    public void deleteAccount(int id) {
        Account account = database.accountDao().getAcountsById(id);
        database.accountDao().deleteAcount(account);
    }
}
