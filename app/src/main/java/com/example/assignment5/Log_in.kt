package com.example.assignment5

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.assignment5.databinding.ActivityLogInBinding
import com.example.assignment5.databinding.ActivityMainBinding
import com.google.firebase.auth.FirebaseAuth

class Log_in : AppCompatActivity() {

    private lateinit var binding: ActivityLogInBinding
    private lateinit var firebaseAuth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityLogInBinding.inflate(layoutInflater)
        setContentView(binding.root)

        firebaseAuth = FirebaseAuth.getInstance()

        val mail = binding.mail
        val pass = binding.passwordToggle

        binding.backBtn.setOnClickListener {
            val intentbackBtn = Intent(this, MainActivity::class.java)
            startActivity(intentbackBtn)
        }
    }
}