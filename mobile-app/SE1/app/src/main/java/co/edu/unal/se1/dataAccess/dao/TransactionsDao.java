package co.edu.unal.se1.dataAccess.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;
import java.util.List;

import co.edu.unal.se1.dataAccess.model.Transactions;

@Dao
public interface TransactionsDao {
    @Query("SELECT * FROM transactions")
    List<Transactions> getAllTransactions();

    @Query("SELECT * FROM transactions WHERE ID_Transaction = :id")
    Transactions getTransactionsById(int id);

    @Insert
    void createTransaction(Transactions Transactions);

    @Update
    void updateTransaction(Transactions Transactions);

    @Delete
    void deleteTransaction(Transactions Transactions);
}
