package co.edu.unal.se1.dataAccess.model;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
import java.io.Serializable;

@Entity
public class Document_Type implements Serializable{
    @PrimaryKey
    public int ID_Document_Type;

    @ColumnInfo(name = "Document_Type")
    @NonNull
    public String Document_Type;

    public int getID_Document_Type() {
        return ID_Document_Type;
    }

    public String getDocument_Type() {
        return Document_Type;
    }

    public void setID_Document_Type(int ID_Document_Type) {
        this.ID_Document_Type = ID_Document_Type;
    }

    public void setDocument_Type(String Document_Type) {
        this.Document_Type = Document_Type;
    }
}
