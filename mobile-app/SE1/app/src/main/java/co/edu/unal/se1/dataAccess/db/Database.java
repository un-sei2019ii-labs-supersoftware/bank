package co.edu.unal.se1.dataAccess.db;

import androidx.room.RoomDatabase;

import co.edu.unal.se1.dataAccess.dao.AccountDao;
import co.edu.unal.se1.dataAccess.dao.ActionDao;
import co.edu.unal.se1.dataAccess.dao.CityDao;
import co.edu.unal.se1.dataAccess.dao.CountryDao;
import co.edu.unal.se1.dataAccess.dao.Document_TypeDao;
import co.edu.unal.se1.dataAccess.dao.EmailDao;
import co.edu.unal.se1.dataAccess.dao.LogbookDao;
import co.edu.unal.se1.dataAccess.dao.Transaction_TypeDao;
import co.edu.unal.se1.dataAccess.dao.TransactionsDao;
import co.edu.unal.se1.dataAccess.dao.UserDao;
import co.edu.unal.se1.dataAccess.model.Account;
import co.edu.unal.se1.dataAccess.model.Action;
import co.edu.unal.se1.dataAccess.model.City;
import co.edu.unal.se1.dataAccess.model.Country;
import co.edu.unal.se1.dataAccess.model.Document_Type;
import co.edu.unal.se1.dataAccess.model.Email;
import co.edu.unal.se1.dataAccess.model.Logbook;
import co.edu.unal.se1.dataAccess.model.Transaction_Type;
import co.edu.unal.se1.dataAccess.model.Transactions;
import co.edu.unal.se1.dataAccess.model.User;

@androidx.room.Database(entities = {Account.class,User.class, Action.class, City.class, Country.class, Document_Type.class, Email.class, Logbook.class, Transaction_Type.class, Transactions.class}, version = 1)
public abstract class Database extends RoomDatabase {

    public abstract UserDao userDao();
    public abstract AccountDao accountDao();
    public abstract ActionDao actionDao();
    public abstract CityDao cityDao();
    public abstract CountryDao countryDao();
    public abstract Document_TypeDao document_typeDao();
    public abstract EmailDao emailDao();
    public abstract LogbookDao logbookDao();
    public abstract Transaction_TypeDao transaction_typeDao();
    public abstract TransactionsDao transactionsDao();
}