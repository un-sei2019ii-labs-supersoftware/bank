package co.edu.unal.se1.dataAccess.model;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
import java.io.Serializable;

@Entity
public class City implements Serializable{
    @PrimaryKey
    public int ID_City;

    @ColumnInfo(name = "City")
    public String City;

    public int getID_City() {
        return ID_City;
    }

    public void setID_City(int ID_City) {
        this.ID_City = ID_City;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String City) {
        this.City = City;
    }
}
