package co.edu.unal.se1.dataAccess.model;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
import java.io.Serializable;

@Entity
public class Action implements Serializable{
    @PrimaryKey
    public int ID_Action;

    @ColumnInfo(name = "Action")
    public String Action;

    public int getID_Action() {
        return ID_Action;
    }

    public void setID_Action(int ID_Action) {
        this.ID_Action = ID_Action;
    }

    public String getAction() {
        return Action;
    }

    public void setAction(String Action) {
        this.Action = Action;
    }
}
