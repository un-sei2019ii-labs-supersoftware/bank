package co.edu.unal.se1.dataAccess.repository;

import android.content.Context;
import androidx.room.Room;
import java.util.List;

import co.edu.unal.se1.dataAccess.db.Database;
import co.edu.unal.se1.dataAccess.model.Email;

public class EmailRepository {

    private String DB_NAME = "se1_db_bank";

    private Database database;
    public EmailRepository(Context context) {
        database = Room.databaseBuilder(context, Database.class, DB_NAME).
                allowMainThreadQueries().build();
    }

    public List<Email> getAllUsers() {
        return database.emailDao().getAllEmails();
    }

    public Email getUserById(String email) {
        return database.emailDao().getEmailsById(email);
    }

    public void createUser(final Email Email) {
        database.emailDao().createEmail(Email);
    }

    public void updateUser(Email Email) {
        database.emailDao().updateEmail(Email);
    }

    public void deleteUser(String email) {
        Email Email = database.emailDao().getEmailsById(email);
        database.emailDao().deleteEmail(Email);
    }
}
