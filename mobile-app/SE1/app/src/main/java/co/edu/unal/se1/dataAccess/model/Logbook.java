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

    @ForeignKey(entity = Action.class, parentColumns = "ID_Action", childColumns = "Action")
    public int Action;

    @ForeignKey(entity = User.class, parentColumns = "Username", childColumns = "Username")
    public String Username;

    @ColumnInfo(name = "Date")
    public Long Date;

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
        this.Action = Action;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public Long getDate() {
        return Date;
    }

    public void setDate(Long Date) {
        this.Date = Date;
    }
}
