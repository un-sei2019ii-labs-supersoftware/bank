package co.edu.unal.se1.presentation.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

import co.edu.unal.se1.R;
import co.edu.unal.se1.businessLogic.controller.UserController;
import co.edu.unal.se1.dataAccess.model.Account;
import co.edu.unal.se1.dataAccess.model.User;
import co.edu.unal.se1.dataAccess.repository.UserRepository;

public class MainActivity extends AppCompatActivity {

    private UserController userController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextInputEditText idInput = findViewById(R.id.id);
        final TextInputEditText passwordInput = findViewById(R.id.password);

        Button iniciarsesionButton = findViewById(R.id.createButton);
        iniciarsesionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String id_all =idInput.getText().toString();

                if(id_all.isEmpty()){
                    Toast.makeText(getApplicationContext(),"el id del usuario no puede estar vacio",Toast.LENGTH_SHORT );
                }else{
                    int id_user= Integer.parseInt(id_all);
                    UserRepository userRepository = new UserRepository(getApplicationContext());
                    final User usuario = userRepository.getUserById(id_user);
                    String password =passwordInput.getText().toString();
                    if(password.isEmpty()){
                        Toast.makeText(getApplicationContext(),"la contraseña no puede estar vacia no puede estar vacio",Toast.LENGTH_SHORT );
                    }else{
                        if(usuario.getPassword().equals(password)){
                            Intent i = new Intent(MainActivity.this , sesionActivity.class);
                            startActivity(i);
                        }else{
                            Toast.makeText(getApplicationContext(),"usuario o contraseña incorrecta",Toast.LENGTH_SHORT );
                        }
                    }
                }
            }
        });


        Button sendMoneyButton = findViewById(R.id.registroB);
        sendMoneyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this , RegistroActivity.class);
                startActivity(i);
            }
        });
    }

}