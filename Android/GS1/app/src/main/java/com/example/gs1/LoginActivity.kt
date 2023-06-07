package com.example.gs1
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputEditText

class LoginActivity : AppCompatActivity() {

    private lateinit var usernameEditText: TextInputEditText
    private lateinit var passwordEditText: TextInputEditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        usernameEditText = findViewById(R.id.username_edit_text)
        passwordEditText = findViewById(R.id.password_edit_text)

        val loginButton: Button = findViewById(R.id.login_button)
        loginButton.setOnClickListener {
            val username: String = usernameEditText.text.toString()
            val password: String = passwordEditText.text.toString()

            if (authenticateUser(username, password)) {
                navigateToHome()
            } else {
                showErrorToast("Credenciais inválidas")
            }
        }

    }

    private fun authenticateUser(username: String, password: String): Boolean {
        return username == "teste" && password == "teste"
    }

    private fun navigateToHome() {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
        finish()
    }

    private fun showErrorToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }
}
