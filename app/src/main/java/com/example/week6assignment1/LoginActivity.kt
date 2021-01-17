package com.example.week6assignment1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class LoginActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var username : EditText
    private lateinit var password : EditText
    private lateinit var login : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        binding()
        login.setOnClickListener(this)
    }

    private fun binding() {
        username = findViewById(R.id.username)
        password = findViewById(R.id.password)
        login = findViewById(R.id.login)
    }
    override fun onClick(v: View?) {
        if (username.text.toString() == "softwarica") {
            if (password.text.toString() == "coventry"){
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
            }
            else{Toast.makeText(this, "Invalid Username or Password", Toast.LENGTH_SHORT).show()}
        }
        else{
            Toast.makeText(this, "Invalid Username or Password", Toast.LENGTH_SHORT).show()
        }
    }
}


