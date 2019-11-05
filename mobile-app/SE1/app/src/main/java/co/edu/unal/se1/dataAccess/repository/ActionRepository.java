package co.edu.unal.se1.dataAccess.repository;

import android.content.Context;
import androidx.room.Room;
import java.util.List;

import co.edu.unal.se1.dataAccess.db.Database;
import co.edu.unal.se1.dataAccess.model.Action;

public class ActionRepository {
    private String DB_NAME = "se1_db_bank";

    private Database database;
    public ActionRepository(Context context) {
        database = Room.databaseBuilder(context, Database.class, DB_NAME).
                allowMainThreadQueries().build();
    }

    public List<Action> getAllUsers() {
        return database.actionDao().getAllActions();
    }

    public Action getUserById(int id) {
        return database.actionDao().getActionsById(id);
    }

    public void createUser(final Action Action) {
        database.actionDao().createAction(Action);
    }

    public void updateUser(Action Action) {
        database.actionDao().updateAction(Action);
    }

    public void deleteUser(int id) {
        Action Action = database.actionDao().getActionsById(id);
        database.actionDao().deleteAction(Action);
    }
}
