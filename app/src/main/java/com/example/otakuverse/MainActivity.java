package com.example.otakuverse;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Crie uma instância do DatabaseReference
        DatabaseReference database = FirebaseDatabase.getInstance().getReference();

        // Crie a tabela "users" com uma coluna "name" com valor inicial vazio
        database.child("users").child("name").setValue("");
        database.child("users").child("email").setValue("");
        database.child("users").child("password").setValue("");
        database.child("users").child("profile_photo").setValue("");
        database.child("users").child("bio").setValue("");
        database.child("users").child("username").setValue("");
        database.child("users").child("birthdate").setValue("");
        database.child("users").child("gender").setValue("");
        database.child("users").child("interests").setValue("");
        database.child("users").child("following").setValue("");
        database.child("users").child("followers").setValue("");
        database.child("users").child("email").setValue("usuario@example.com");

    }
}
