package co.edu.unal.se1.dataAccess.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;
import java.util.List;

import co.edu.unal.se1.dataAccess.model.Document_Type;

@Dao
public interface Document_TypeDao {
    @Query("SELECT * FROM document_type")
    List<Document_Type> getAllDocument_Types();

    @Query("SELECT * FROM document_type WHERE ID_Document_Type = :id")
    Document_Type getDocument_TypesById(int id);

    @Insert
    void createDocument_Type(Document_Type document_Type);

    @Update
    void updateDocument_Type(Document_Type document_Type);

    @Delete
    void deleteDocument_Type(Document_Type document_Type);
}
