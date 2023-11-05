package com.example.assignment5

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.assignment5.databinding.ActivityMainBinding
import com.google.firebase.auth.FirebaseAuth

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    private lateinit var firebaseAuth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        firebaseAuth = FirebaseAuth.getInstance()
        binding.logIn.setOnClickListener{
            val intentLog_in = Intent(this, Log_in::class.java)
            startActivity(intentLog_in)
        }

        binding.logIn.setOnClickListener{
            val intentRegister_1 = Intent(this, Register_1::class.java)
            startActivity(intentRegister_1)
        }


    }

}