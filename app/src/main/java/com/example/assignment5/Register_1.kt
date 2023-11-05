package com.example.assignment5

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.assignment5.databinding.ActivityMainBinding
import com.example.assignment5.databinding.ActivityRegister1Binding
import com.google.firebase.auth.FirebaseAuth

class Register_1 : AppCompatActivity() {
    private lateinit var binding: ActivityRegister1Binding
    private lateinit var firebaseAuth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityRegister1Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val email = binding.email
        val password = binding.pass



        firebaseAuth = FirebaseAuth.getInstance()
        binding.nextBtn.setOnClickListener{
            val intentNextBtn = Intent(this, Register_2::class.java)
            startActivity(intentNextBtn)
        }

        binding.backBtn.setOnClickListener{
            finish()
        }

        setContentView(R.layout.activity_register1)
    }
}