package co.edu.unal.se1.dataAccess.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;
import java.util.List;

import co.edu.unal.se1.dataAccess.model.City;

@Dao
public interface CityDao {
    @Query("SELECT * FROM city")
    List<City> getAllCities();

    @Query("SELECT * FROM city WHERE ID_City = :id")
    City getCitiesById(int id);

    @Insert
    void createCity(City city);

    @Update
    void updateCity(City city);

    @Delete
    void deleteCity(City city);
}
