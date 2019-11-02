package co.edu.unal.se1.dataAccess.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;
import java.util.List;

import co.edu.unal.se1.dataAccess.model.Transaction_Type;

@Dao
public interface Transaction_TypeDao {
    @Query("SELECT * FROM transaction_Type")
    List<Transaction_Type> getAllTransaction_Types();

    @Query("SELECT * FROM transaction_Type WHERE ID_Transaction_Type = :id")
    Transaction_Type getTransaction_TypesById(int id);

    @Insert
    void createTransaction_Type(Transaction_Type transaction_Type);

    @Update
    void updateTransaction_Type(Transaction_Type transaction_Type);

    @Delete
    void deleteTransaction_Type(Transaction_Type transaction_Type);
}
