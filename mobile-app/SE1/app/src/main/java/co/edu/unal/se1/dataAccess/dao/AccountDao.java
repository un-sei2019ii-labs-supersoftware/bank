package co.edu.unal.se1.dataAccess.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;
import java.util.List;

import co.edu.unal.se1.dataAccess.model.Account;

@Dao
public interface AccountDao {
    @Query("SELECT * FROM account")
    List<Account> getAllAcounts();

    @Query("SELECT * FROM account WHERE ID_Account = :id")
    Account getAcountsById(int id);

    @Insert
    void createAcount(Account account);

    @Update
    void updateAcount(Account account);

    @Delete
    void deleteAcount(Account account);
}
