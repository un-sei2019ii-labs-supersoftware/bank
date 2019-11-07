package co.edu.unal.se1.businessLogic.controller;

import android.content.Context;
import org.junit.Test;

import co.edu.unal.se1.dataAccess.model.Account;

import static androidx.test.core.app.ApplicationProvider.getApplicationContext;
import static org.junit.Assert.*;

public class TransactionControllerTest extends junit.framework.TestCase{

    @Test
    public void sendMoney() {
        int input1 = 1234567;
        int input2 = 7654321;
        double input3 = 10000;
        Account cuenta = new Account();
        cuenta.setID_Account(input1);
        cuenta.setBalance(input3);
        Account cuenta2 = new Account();
        cuenta2.setID_Account(input2);
        cuenta2.setBalance(0);
        Context context = getApplicationContext();
        boolean expected = true;
        boolean output;

        TransactionController transactionController = new TransactionController();

        output = transactionController.sendMoney(input1,input2,input3,context);

        assertEquals(expected,output);
    }
}