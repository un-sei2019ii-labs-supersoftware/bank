package co.edu.unal.se1.dataAccess.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;
import java.util.List;

import co.edu.unal.se1.dataAccess.model.Action;

@Dao
public interface ActionDao {

    @Query("SELECT * FROM `action`")
    List<Action> getAllActions();

    @Query("SELECT * FROM `action` WHERE ID_Action = :id")
    Action getActionsById(int id);

    @Insert
    void createAction(Action action);

    @Update
    void updateAction(Action action);

    @Delete
    void deleteAction(Action action);

}
