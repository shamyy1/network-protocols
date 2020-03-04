package android.myproject.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText username,password ;
    Button Login;
    String username2="Shamy";
    String password2="1234";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username=findViewById(R.id.textEmail);
        password=findViewById(R.id.textPassword);
        Login=findViewById(R.id.buttonLogin);

        Login.setOnClickListener(new View.OnClickListener(){
            public  void onClick(View v){
                if (TextUtils.isEmpty(username.getText().toString())|| TextUtils.isEmpty(password.getText().toString())){

                    Toast.makeText(MainActivity.this, "Empty data provided", Toast.LENGTH_LONG).show();
                }
                else if(username.getText().toString().equals(username2)){
                    if (password.getText().toString().equals(password2))
                        Toast.makeText(MainActivity.this, "Success Login", Toast.LENGTH_LONG).show();
                    openListActivity();

                }
                else{
                    Toast.makeText(MainActivity.this, "Invalid username/password", Toast.LENGTH_LONG).show();
                }

            }
        });


    }
    public void openListActivity(){
        Intent intent= new Intent(this,ListActivity.class);
        startActivity(intent);

    }
}
