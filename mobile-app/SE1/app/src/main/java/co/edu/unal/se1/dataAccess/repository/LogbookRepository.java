package co.edu.unal.se1.dataAccess.repository;

import android.content.Context;
import androidx.room.Room;
import java.util.List;

import co.edu.unal.se1.dataAccess.db.Database;
import co.edu.unal.se1.dataAccess.model.Logbook;

public class LogbookRepository {

    private String DB_NAME = "se1_db_bank";

    private Database database;
    public LogbookRepository(Context context) {
        database = Room.databaseBuilder(context, Database.class, DB_NAME).
                allowMainThreadQueries().build();
    }

    public List<Logbook> getAllUsers() {
        return database.logbookDao().getAllLogbooks();
    }

    public Logbook getUserById(int id) {
        return database.logbookDao().getLogbooksById(id);
    }

    public void createUser(final Logbook Logbook) {
        database.logbookDao().createLogbook(Logbook);
    }

    public void updateUser(Logbook Logbook) {
        database.logbookDao().updateLogbook(Logbook);
    }

    public void deleteUser(int id) {
        Logbook Logbook = database.logbookDao().getLogbooksById(id);
        database.logbookDao().deleteLogbook(Logbook);
    }
}
