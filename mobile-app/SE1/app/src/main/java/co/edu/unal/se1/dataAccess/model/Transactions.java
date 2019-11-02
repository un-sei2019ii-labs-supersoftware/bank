package co.edu.unal.se1.dataAccess.model;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
import java.io.Serializable;

@Entity
public class Transactions implements Serializable{
    @PrimaryKey
    public int ID_Transaction;

    @ColumnInfo(name = "Account1")
    public String Account1;

    @ColumnInfo(name = "Account2")
    public double Account2;

    @ColumnInfo(name = "Transaction_Type")
    public String Transaction_Type;

    @ColumnInfo(name = "Successful")
    public double Successful;

    @ColumnInfo(name = "Description")
    public String Description;

    @ColumnInfo(name = "Date")
    public double Date;

    public int getID_Transaction() {
        return ID_Transaction;
    }

    public void setID_Transaction(int ID_Transaction) {
        this.ID_Transaction = ID_Transaction;
    }

    public String getAccount1() {
        return Account1;
    }

    public void setAccount1(String Account1) {
        this.Account1 = Account1;
    }

    public double getAccount2() {
        return Account2;
    }

    public void setAccount2(double Account2) {
        this.Account2 = Account2;
    }

    public String getTransaction_Type() {
        return Transaction_Type;
    }

    public void setTransaction_Type(String Transaction_Type) {
        this.Transaction_Type = Transaction_Type;
    }

    public double getSuccessful() {
        return Successful;
    }

    public void setSuccessful(double Successful) {
        this.Successful = Successful;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public double getDate() {
        return Date;
    }

    public void setDate(double Date) {
        this.Date = Date;
    }
}
