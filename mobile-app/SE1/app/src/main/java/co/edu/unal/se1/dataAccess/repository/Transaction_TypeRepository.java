package co.edu.unal.se1.dataAccess.repository;

import android.content.Context;
import androidx.room.Room;
import java.util.List;

import co.edu.unal.se1.dataAccess.db.Database;
import co.edu.unal.se1.dataAccess.model.Transaction_Type;

public class Transaction_TypeRepository {

    private String DB_NAME = "se1_db_bank";

    private Database database;
    public Transaction_TypeRepository(Context context) {
        database = Room.databaseBuilder(context, Database.class, DB_NAME).
                allowMainThreadQueries().build();
    }

    public List<Transaction_Type> getAllUsers() {
        return database.transaction_typeDao().getAllTransaction_Types();
    }

    public Transaction_Type getUserById(int id) {
        return database.transaction_typeDao().getTransaction_TypesById(id);
    }

    public void createUser(final Transaction_Type transaction_type) {
        database.transaction_typeDao().createTransaction_Type(transaction_type);
    }

    public void updateUser(Transaction_Type transaction_type) {
        database.transaction_typeDao().updateTransaction_Type(transaction_type);
    }

    public void deleteUser(int id) {
        Transaction_Type transaction_type = database.transaction_typeDao().getTransaction_TypesById(id);
        database.transaction_typeDao().deleteTransaction_Type(transaction_type);
    }
}
