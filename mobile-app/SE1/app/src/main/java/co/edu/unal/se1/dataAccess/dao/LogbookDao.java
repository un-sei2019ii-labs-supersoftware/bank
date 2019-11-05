package co.edu.unal.se1.dataAccess.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;
import java.util.List;

import co.edu.unal.se1.dataAccess.model.Logbook;

@Dao
public interface LogbookDao {
    
    @Query("SELECT * FROM logbook")
    List<Logbook> getAllLogbooks();

    @Query("SELECT * FROM logbook WHERE ID_Logbook = :id")
    Logbook getLogbooksById(int id);

    @Insert
    void createLogbook(Logbook logbook);

    @Update
    void updateLogbook(Logbook logbook);

    @Delete
    void deleteLogbook(Logbook logbook);
}
