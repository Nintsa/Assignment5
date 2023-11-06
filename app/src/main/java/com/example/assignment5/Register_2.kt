package com.example.assignment5

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.assignment5.databinding.ActivityRegister1Binding
import com.example.assignment5.databinding.ActivityRegister2Binding
import com.google.firebase.auth.FirebaseAuth

class Register_2 : AppCompatActivity() {
    private lateinit var binding: ActivityRegister2Binding
    private lateinit var firebaseAuth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegister2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.backBtn.setOnClickListener {
            val intentbackBtn = Intent(this, MainActivity::class.java)
            startActivity(intentbackBtn)
        }
    }

}