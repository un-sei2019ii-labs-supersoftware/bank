package co.edu.unal.se1.dataAccess.model;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
import java.io.Serializable;

@Entity
public class Transaction_Type implements Serializable{
    @PrimaryKey
    public int ID_Transaction_Type;

    @ColumnInfo(name = "Transaction_Type")
    public String Transaction_Type;

    public int getID_Transaction_Type() {
        return ID_Transaction_Type;
    }

    public void setID_Transaction_Type(int ID_Transaction_Type) {
        this.ID_Transaction_Type = ID_Transaction_Type;
    }

    public String getTransaction_Type() {
        return Transaction_Type;
    }

    public void setTransaction_Type(String Transaction_Type) {
        this.Transaction_Type = Transaction_Type;
    }
}
