package co.edu.unal.se1.dataAccess.model;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;
import java.io.Serializable;
import java.sql.Date;

@Entity
public class Logbook implements Serializable{
    @PrimaryKey
    public int ID_Logbook;

    @ForeignKey()

    @ForeignKey(name = "Action")
    public int Action;

    @ColumnInfo(name = "Username")
    public int Username;

    @ColumnInfo(name = "Date")
    public Date Date;

    public int getID_Logbook() {
        return ID_Logbook;
    }

    public void setID_Logbook(int ID_Logbook) {
        this.ID_Logbook = ID_Logbook;
    }

    public int getAction() {
        return Action;
    }

    public void setAction(int Action) {
        this.Action = Aaction;
    }

    public int getUsername() {
        return Username;
    }

    public void setUsername(int Username) {
        this.Username = Username;
    }

    public java.sql.Date getDate() {
        return Date;
    }

    public void setDate(java.sql.Date Date) {
        this.Date = Date;
    }
}
