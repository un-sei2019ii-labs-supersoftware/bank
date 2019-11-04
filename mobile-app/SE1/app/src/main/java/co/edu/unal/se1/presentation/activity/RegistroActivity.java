package co.edu.unal.se1.presentation.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.textfield.TextInputEditText;

import co.edu.unal.se1.R;
import co.edu.unal.se1.businessLogic.controller.UserController;
import co.edu.unal.se1.dataAccess.model.Account;
import co.edu.unal.se1.dataAccess.model.User;
import co.edu.unal.se1.dataAccess.repository.UserRepository;
public class RegistroActivity extends AppCompatActivity {
    private UserController userController;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.registro);

        final TextInputEditText idInput = findViewById(R.id.id);
        final TextInputEditText passwordInput = findViewById(R.id.password);
        final TextInputEditText usernameInput = findViewById(R.id.username);
        final TextInputEditText nameInput = findViewById(R.id.name);
        final TextInputEditText balanceInput = findViewById(R.id.balance);
        Button regButton = findViewById(R.id.registerButton);
        regButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                String id =idInput.getText().toString();

                if(id.isEmpty()){
                    Toast.makeText(getApplicationContext(),"el id del usuario no puede estar vacio",Toast.LENGTH_SHORT );
                }else{
                    int id_user= Integer.parseInt(id);

                    String password =passwordInput.getText().toString();
                    if(password.isEmpty()){
                        Toast.makeText(getApplicationContext(),"el campo de contraseña no puede estar vacio",Toast.LENGTH_SHORT );
                    }else{
                        String username =usernameInput.getText().toString();
                        if(username.isEmpty()){
                            Toast.makeText(getApplicationContext(),"el nombre usuario no puede estar vacio",Toast.LENGTH_SHORT );
                        }else{
                            String name =nameInput.getText().toString();
                            if(name.isEmpty()){
                                Toast.makeText(getApplicationContext(),"el campo del nombre no puede estar vacio",Toast.LENGTH_SHORT );
                            }else{
                                String balance =balanceInput.getText().toString();
                                if(id.isEmpty()){
                                    Toast.makeText(getApplicationContext(),"el campo de balance no puede estar vacio",Toast.LENGTH_SHORT );
                                }else{
                                    double bal = Double.parseDouble(balance);
                                    if(bal<0){
                                        Toast.makeText(getApplicationContext(),"el campo de balance no puede ser negativo",Toast.LENGTH_SHORT );
                                    }else{
                                        if(id_user<0){
                                            Toast.makeText(getApplicationContext(),"el campo de id no puede ser negativo",Toast.LENGTH_SHORT );
                                        }else{
                                            User user =new User();
                                            user.setID_User(id_user);
                                            user.setAccount(id_user);
                                            user.setName(name);
                                            user.setUsername(username);
                                            user.setPassword(password);
                                            Account cuenta = new Account();
                                            cuenta.setID_Account(id_user);
                                            cuenta.setBalance(bal);
                                            userController = new UserController();
                                            userController.createUser(user, getApplicationContext());
                                            Intent i = new Intent(RegistroActivity.this , sesionActivity.class);
                                            startActivity(i);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        });

    }

}
