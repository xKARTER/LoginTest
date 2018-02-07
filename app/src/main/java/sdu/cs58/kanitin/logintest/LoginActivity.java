package sdu.cs58.kanitin.logintest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    //Explicit
    EditText nameEditText,userNameEditText, passwordEditText;
    Button loginButton;
    String nameString;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        //Initial view ผูกตัวแปรบน JAVA ให้รู้จัก element บน xml
        nameEditText = findViewById(R.id.txtName);
        userNameEditText = findViewById(R.id.txtName);
        passwordEditText = findViewById(R.id.txtName);
        loginButton = findViewById(R.id.btnLogin);





        loginButton .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nameString = nameEditText.getText().toString().trim();




                Toast.makeText(getApplicationContext(), "john cena "+ nameString , Toast.LENGTH_SHORT).show();



            }
        });





    } //END Void
}//END
