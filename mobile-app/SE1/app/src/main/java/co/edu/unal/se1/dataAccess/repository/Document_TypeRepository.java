package co.edu.unal.se1.dataAccess.repository;

import android.content.Context;
import androidx.room.Room;
import java.util.List;

import co.edu.unal.se1.dataAccess.db.Database;
import co.edu.unal.se1.dataAccess.model.Document_Type;

public class Document_TypeRepository {
    
    private String DB_NAME = "se1_db_bank";

    private Database database;
    public Document_TypeRepository(Context context) {
        database = Room.databaseBuilder(context, Database.class, DB_NAME).
                allowMainThreadQueries().build();
    }

    public List<Document_Type> getAllUsers() {
        return database.document_typeDao().getAllDocument_Types();
    }

    public Document_Type getUserById(int id) {
        return database.document_typeDao().getDocument_TypesById(id);
    }

    public void createUser(final Document_Type Document_Type) {
        database.document_typeDao().createDocument_Type(Document_Type);
    }

    public void updateUser(Document_Type Document_Type) {
        database.document_typeDao().updateDocument_Type(Document_Type);
    }

    public void deleteUser(int id) {
        Document_Type Document_Type = database.document_typeDao().getDocument_TypesById(id);
        database.document_typeDao().deleteDocument_Type(Document_Type);
    }
}
