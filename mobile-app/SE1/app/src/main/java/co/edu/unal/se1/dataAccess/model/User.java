package co.edu.unal.se1.dataAccess.model;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;
import java.io.Serializable;

@Entity
public class User implements Serializable {

    @PrimaryKey
    public int ID_User;

    @ColumnInfo(name = "Username")
    public String Username;

    @ColumnInfo(name = "Password")
    public String Password;

    @ColumnInfo(name = "Name")
    public String Name;

    @ColumnInfo(name = "Phone")
    public int Phone;

    @ForeignKey(entity = Document_Type.class, parentColumns = "ID_Document_Type", childColumns = "Document_Type")
    public int Document_Type;

    @ColumnInfo(name = "Document_Number")
    public int Document_Number;

    @ForeignKey(entity = City.class, parentColumns = "ID_City", childColumns = "City")
    public int City;

    @ForeignKey(entity = Country.class, parentColumns = "ID_Country", childColumns = "Country")
    public int Country;

    @ForeignKey(entity = Email.class, parentColumns = "User_Email", childColumns = "Email")
    public String Email;

    @ForeignKey(entity = Account.class, parentColumns = "ID_Account", childColumns = "Account")
    public int Account;

    @ColumnInfo(name = "Creation_Day")
    public Long Creation_Day;


    public int getID_User() {
        return ID_User;
    }

    public void setID_User(int ID_User) {
        this.ID_User = ID_User;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }



    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getPhone() {
        return Phone;
    }

    public void setPhone(int phone) {
        Phone = phone;
    }

    public int getDocument_Type() {
        return Document_Type;
    }

    public void setDocument_Type(int document_Type) {
        Document_Type = document_Type;
    }

    public int getDocument_Number() {
        return Document_Number;
    }

    public void setDocument_Number(int document_Number) {
        Document_Number = document_Number;
    }

    public int getCity() {
        return City;
    }

    public void setCity(int city) {
        City = city;
    }

    public int getCountry() {
        return Country;
    }

    public void setCountry(int country) {
        Country = country;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public int getAccount() {
        return Account;
    }

    public void setAccount(int account) {
        Account = account;
    }

    public Long getCreation_Day() {
        return Creation_Day;
    }

    public void setCreation_Day(Long creation_Day) {
        Creation_Day = creation_Day;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }
}