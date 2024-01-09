package com.example.otakuverse;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

import java.util.List;
import java.util.Objects;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        // Obtém os campos do formulário
        EditText usernameEditText = findViewById(R.id.username_edit_text);
        EditText passwordEditText = findViewById(R.id.password_edit_text);
        EditText confirmPasswordEditText = findViewById(R.id.confirm_password_edit_text);

        // Valida as informações de registro
        String username = Objects.requireNonNull(usernameEditText.getText()).toString();
        String password = Objects.requireNonNull(passwordEditText.getText()).toString();
        String confirmPassword = Objects.requireNonNull(confirmPasswordEditText.getText()).toString();

        if (username.isEmpty() || password.isEmpty() || confirmPassword.isEmpty()) {
            // Exibe uma mensagem de erro
            Toast.makeText(this, "Preencha todos os campos", Toast.LENGTH_SHORT).show();
            return;
        }

        if (!password.equals(confirmPassword)) {
            // Exibe uma mensagem de erro
            Toast.makeText(this, "As senhas não coincidem", Toast.LENGTH_SHORT).show();
            return;
        }

        // Verifica se o nome de usuário já está em uso:
        FirebaseAuth.getInstance().fetchSignInMethodsForEmail(username)
                .addOnCompleteListener(task -> {
                    if (task.isSuccessful()) {
                        List<String> signInMethods = task.getResult().getSignInMethods();
                        if (signInMethods != null && !signInMethods.isEmpty()) {
                            // Nome de usuário já está em uso
                            boolean isUsernamePresent = true;
                        } else {
                            // Nome de usuário disponível
                            boolean isUsernamePresent = false;
                        }
                    } else {
                        // Erro ao verificar nome de usuário
                        // Exiba uma mensagem de erro
                    }
                });

// Valida a senha:
        if (password.length() >= 6 && password.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)[a-zA-Z\\d]{6,}$")) {
            // Senha válida
            boolean isPasswordValid = true;
        } else {
            // Senha inválida
            // Exiba uma mensagem de erro
        }


        // Cria uma conta no Firebase
        FirebaseAuth.getInstance().createUserWithEmailAndPassword(username, password)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            // A conta foi criada com sucesso
                            // Redireciona o usuário para a tela principal
                            Intent intent = new Intent(RegisterActivity.this, MainActivity.class);
                            startActivity(intent);
                        } else {
                            // A criação da conta falhou
                            // Exibe uma mensagem de erro
                            Toast.makeText(RegisterActivity.this, "Erro ao criar conta", Toast.LENGTH_SHORT).show();
                        }
                    }
                });

        // Adiciona um botão para voltar à tela de login
        Button loginButton = findViewById(R.id.login_button);
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Redireciona o usuário para a tela de login
                Intent intent = new Intent(RegisterActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });
    }
}
