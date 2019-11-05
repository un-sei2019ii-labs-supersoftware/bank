package co.edu.unal.se1.dataAccess.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.Calendar;
import java.util.List;

import co.edu.unal.se1.dataAccess.model.Email;

@Dao
public interface EmailDao {
    @Query("SELECT * FROM email")
    List<Email> getAllEmails();

    @Query("SELECT * FROM email WHERE User_Email = :id")
    Email getEmailsById(String id);

    @Insert
    void createEmail(Email email);

    @Update
    void updateEmail(Email email);

    @Delete
    void deleteEmail(Email email);
}
