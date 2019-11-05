package co.edu.unal.se1.dataAccess.model;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
import java.io.Serializable;

import javax.annotation.Nonnull;

@Entity
public class Email implements Serializable{
    @PrimaryKey
    @NonNull
    public String User_Email;

    @ColumnInfo(name = "Password_Date")
    @NonNull
    public Long Password_Date;

    @ColumnInfo(name = "State")
    @NonNull
    public String State;


    public String getUser_Email() {
        return User_Email;
    }

    public void setUser_Email(String User_Email) {
        this.User_Email = User_Email;
    }

    public Long getPassword_Date() {
        return Password_Date;
    }

    public void setPassword_Date(Long Password_Date) {
        this.Password_Date = Password_Date;
    }

    public String getState() {
        return State;
    }

    public void setState(String State) {
        this.State = State;
    }

}
