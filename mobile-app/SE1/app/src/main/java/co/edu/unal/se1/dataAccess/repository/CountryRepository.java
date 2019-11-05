package co.edu.unal.se1.dataAccess.repository;

import android.content.Context;
import androidx.room.Room;
import java.util.List;

import co.edu.unal.se1.dataAccess.db.Database;
import co.edu.unal.se1.dataAccess.model.Country;

public class CountryRepository {
    private String DB_NAME = "se1_db_bank";

    private Database database;
    public CountryRepository(Context context) {
        database = Room.databaseBuilder(context, Database.class, DB_NAME).
                allowMainThreadQueries().build();
    }

    public List<Country> getAllUsers() {
        return database.countryDao().getAllCountries();
    }

    public Country getUserById(int id) {
        return database.countryDao().getCountriesById(id);
    }

    public void createUser(final Country country) {
        database.countryDao().createCountry(country);
    }

    public void updateUser(Country country) {
        database.countryDao().updateCountry(country);
    }

    public void deleteUser(int id) {
        Country country = database.countryDao().getCountriesById(id);
        database.countryDao().deleteCountry(country);
    }
}
