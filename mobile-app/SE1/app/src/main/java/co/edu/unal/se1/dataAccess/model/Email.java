package co.edu.unal.se1.dataAccess.model;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
import java.io.Serializable;
import java.sql.Date;

@Entity
public class Email implements Serializable{
    @PrimaryKey
    public int User_Email;

    @ColumnInfo(name = "Password_Date")
    public Date Password_Date;

    @ColumnInfo(name = "State")
    public String State;


    public int getUser_Email() {
        return User_Email;
    }

    public void setUser_Email(int User_Email) {
        this.User_Email = User_Email;
    }

    public Date getPassword_Date() {
        return Password_Date;
    }

    public void setPassword_Date(Date Password_Date) {
        this.Password_Date = Password_Date;
    }

    public String getState() {
        return State;
    }

    public void setState(String State) {
        this.State = State;
    }
}
