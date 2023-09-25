package com.example.opsc_poe

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.opsc_poe.databinding.LoginBinding
import com.example.opsc_poe.ui.theme.OPSC_POETheme


class MainActivity : ComponentActivity() {
    private lateinit var binding: LoginBinding

    lateinit var username : EditText
    lateinit var password : EditText
    lateinit var  loginButton : Button



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = LoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.loginButton.setOnClickListener(View.OnClickListener {
            if(binding.username.text.toString() == "user" && binding.password.text.toString() == "Password@1"){
                Toast.makeText(this, "Login Successful", Toast.LENGTH_SHORT).show()
                setContentView(R.layout.selection_page)
            }
            else
            {
                Toast.makeText(this, "Login Failed", Toast.LENGTH_SHORT).show()
            }

        })
    }
}