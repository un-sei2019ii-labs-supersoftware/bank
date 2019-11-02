package co.edu.unal.se1.dataAccess.model;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;
import java.io.Serializable;
import java.sql.Date;

@Entity
public class Transactions implements Serializable{
    @PrimaryKey
    public int ID_Transaction;

    @ForeignKey(entity = Account.class, parentColumns = "ID_Account", childColumns = "Account1")
    public int Account1;

    @ForeignKey(entity = Account.class, parentColumns = "ID_Account", childColumns = "Account2")
    public int Account2;

    @ForeignKey(entity = Transaction_Type.class, parentColumns = "ID_Transaction_Type", childColumns = "Transaction_Type")
    public int Transaction_Type;

    @ColumnInfo(name = "Amount_Money")
    public int Amount_Money;

    @ColumnInfo(name = "Successful")
    public String Successful;

    @ColumnInfo(name = "Description")
    public String Description;

    @ColumnInfo(name = "Date")
    public Date Date;


    public int getID_Transaction() {
        return ID_Transaction;
    }

    public void setID_Transaction(int ID_Transaction) {
        this.ID_Transaction = ID_Transaction;
    }

    public int getAccount1() {
        return Account1;
    }

    public void setAccount1(int Account1) {
        this.Account1 = Account1;
    }

    public int getAccount2() {
        return Account2;
    }

    public void setAccount2(int Account2) {
        this.Account2 = Account2;
    }

    public int getTransaction_Type() {
        return Transaction_Type;
    }

    public void setTransaction_Type(int Transaction_Type) {
        this.Transaction_Type = Transaction_Type;
    }

    public int getAmount_Money() {
        return Amount_Money;
    }

    public void setAmount_Money(int Amount_Money) {
        this.Amount_Money = Amount_Money;
    }

    public String getSuccessful() {
        return Successful;
    }

    public void setSuccessful(String Successful) {
        this.Successful = Successful;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public java.util.Date getDate() {
        return Date;
    }

    public void setDate(java.sql.Date Date) {
        this.Date = Date;
    }
}
