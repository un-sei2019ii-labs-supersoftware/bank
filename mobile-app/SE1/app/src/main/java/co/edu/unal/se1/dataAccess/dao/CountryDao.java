package co.edu.unal.se1.dataAccess.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;
import java.util.List;

import co.edu.unal.se1.dataAccess.model.Country;

@Dao
public interface CountryDao {
    @Query("SELECT * FROM country")
    List<Country> getAllCountries();

    @Query("SELECT * FROM country WHERE ID_Country = :id")
    Country getCountriesById(int id);

    @Insert
    void createCountry(Country country);

    @Update
    void updateCountry(Country country);

    @Delete
    void deleteCountry(Country country);
}
