package com.example.foodorder

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.foodorder.databinding.ActivityLoginBinding
import com.example.foodorder.databinding.ActivityStartBinding

class LoginActivity : AppCompatActivity() {
    private val binding : ActivityLoginBinding by lazy {
        ActivityLoginBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.dontAccount.setOnClickListener{
            val intent = Intent(this,SigninActivity::class.java)
            startActivity(intent)
        }
        binding.loginFacebook.setOnClickListener{
            val intent = Intent(this,ChoseLocationActivity::class.java)
            startActivity(intent)
        }
    }
}