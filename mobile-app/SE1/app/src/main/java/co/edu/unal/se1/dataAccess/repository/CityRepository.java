package co.edu.unal.se1.dataAccess.repository;

import android.content.Context;
import androidx.room.Room;
import java.util.List;

import co.edu.unal.se1.dataAccess.db.Database;
import co.edu.unal.se1.dataAccess.model.City;

public class CityRepository {

    private String DB_NAME = "se1_db_bank";

    private Database database;
    public CityRepository(Context context) {
        database = Room.databaseBuilder(context, Database.class, DB_NAME).
                allowMainThreadQueries().build();
    }

    public List<City> getAllUsers() {
        return database.cityDao().getAllCities();
    }

    public City getUserById(int id) {
        return database.cityDao().getCitiesById(id);
    }

    public void createUser(final City City) {
        database.cityDao().createCity(City);
    }

    public void updateUser(City City) {
        database.cityDao().updateCity(City);
    }

    public void deleteUser(int id) {
        City City = database.cityDao().getCitiesById(id);
        database.cityDao().deleteCity(City);
    }
}
