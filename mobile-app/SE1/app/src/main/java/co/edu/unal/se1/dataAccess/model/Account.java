package co.edu.unal.se1.dataAccess.model;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
import java.io.Serializable;

@Entity
public class Account implements Serializable{
    @PrimaryKey
    public int ID_Account;

    @ColumnInfo(name = "Balance")
    public int Balance;


    public int getID_Account() {
        return ID_Account;
    }

    public void setID_Account(int ID_Account) {
        this.ID_Account = ID_Account;
    }

    public int getBalance() {
        return Balance;
    }

    public void setBalance(int Balance) {
        this.Balance = Balance;
    }
}
