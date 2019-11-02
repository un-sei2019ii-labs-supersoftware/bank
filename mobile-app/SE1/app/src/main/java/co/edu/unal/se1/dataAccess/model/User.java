package co.edu.unal.se1.dataAccess.model;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;
import java.io.Serializable;
import java.sql.Date;

@Entity
public class User implements Serializable {

    @PrimaryKey
    public int ID_User;

    @ColumnInfo(name = "Username")
    public String Username;

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
    public Date Creation_Day;
}