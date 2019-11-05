package co.edu.unal.se1.dataAccess.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;
import java.util.List;

import co.edu.unal.se1.dataAccess.model.Transaction;

@Dao
public interface TransactionDao {
    @Query("SELECT * FROM `Transaction`")
    List<Transaction> getAllTransactions();

    @Query("SELECT * FROM `Transaction` WHERE ID_Transaction = :id")
    Transaction getTransactionById(int id);

    @Insert
    void createTransaction(Transaction Transaction);

    @Update
    void updateTransaction(Transaction Transaction);

    @Delete
    void deleteTransaction(Transaction Transaction);
}
