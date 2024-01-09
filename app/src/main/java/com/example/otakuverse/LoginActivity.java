package com.example.otakuverse;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.AuthResult;

import java.util.Objects;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        // Obtém os campos do formulário
        EditText usernameEditText = findViewById(R.id.username_edit_text);
        EditText passwordEditText = findViewById(R.id.password_edit_text);


        // Valida as informações de login
        String username = Objects.requireNonNull(usernameEditText.getText()).toString();
        String password = Objects.requireNonNull(passwordEditText.getText()).toString();

        if (username.isEmpty() || password.isEmpty()) {
            // Exibe uma mensagem de erro
            Toast.makeText(this, "Preencha todos os campos", Toast.LENGTH_SHORT).show();
            return;
        }

        // Autentiza o usuário
        FirebaseAuth.getInstance().signInWithEmailAndPassword(username, password)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            // O usuário foi autenticado com sucesso
                            // Redireciona o usuário para a tela principal
                            Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                            startActivity(intent);
                        } else {
                            // O login falhou
                            // Exibe uma mensagem de erro
                            Toast.makeText(LoginActivity.this, "Login falhou", Toast.LENGTH_SHORT).show();
                        }
                    }
                });
    }
}
