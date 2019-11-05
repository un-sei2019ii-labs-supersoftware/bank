package co.edu.unal.se1.presentation.activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.textfield.TextInputEditText;

import co.edu.unal.se1.R;
import co.edu.unal.se1.businessLogic.controller.TransactionController;
import co.edu.unal.se1.businessLogic.controller.UserController;
import co.edu.unal.se1.dataAccess.model.Account;
import co.edu.unal.se1.dataAccess.model.User;
import co.edu.unal.se1.dataAccess.repository.UserRepository;
public class sesionActivity extends AppCompatActivity{
    private UserController userController;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sesion);

        final TextView sourceIdInput = findViewById(R.id.id1);
        final TextView targetIdInput = findViewById(R.id.id2);
        final TextView valueInput = findViewById(R.id.dinero);
        Button sendMoneyButton = findViewById(R.id.sendMoneyButton);
        sendMoneyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                userController = new UserController();

                int sourceId = Integer.parseInt(sourceIdInput.getText().toString());
                int targetId = Integer.parseInt(targetIdInput.getText().toString());
                double value = Double.parseDouble(valueInput.getText().toString());
                TransactionController transaccion = new TransactionController();
                boolean transaction = transaccion.sendMoney(sourceId, targetId, value, getApplicationContext());

                if (transaction) {
                    System.out.println("¡Transacción satisfactoria!");
                } else {
                    System.out.println("¡Transacción no satisfactoria!");
                }
            }
        });

    }
}
