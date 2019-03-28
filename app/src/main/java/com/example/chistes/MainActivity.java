package com.example.chistes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {
    EditText txtchiste;
    Button btnchiste;
    DatabaseReference reff;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(MainActivity.this, "Conexion OK",Toast.LENGTH_LONG).show();
        txtchiste = (EditText) findViewById(R.id.txtChiste);
        btnchiste = (Button) findViewById(R.id.btnChiste);
        reff = FirebaseDatabase.getInstance().getReference().child("Chiste");
    }
}
