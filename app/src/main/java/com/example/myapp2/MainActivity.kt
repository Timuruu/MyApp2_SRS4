package com.example.myapp2

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import kotlin.random.Random
private const val HELLO_KEY = "HEllo"
class MainActivity : AppCompatActivity() {
    lateinit var nextActivityButton: Button
    lateinit var emailButton: Button
    lateinit var callButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
        nextActivityButton = findViewById(R.id.next_Activity_button)
        nextActivityButton.setOnClickListener {
            val googleLink =Uri.parse("https://google.com")
            val openBrowserIntent = Intent(Intent.ACTION_VIEW,googleLink)
            // val chooser = Intent.createChooser(openBrowserIntent,"Browser")

            val secondActivityIntent: Intent = Intent(this, SecondActivity::class.java)
            secondActivityIntent.putExtra(HELLO_KEY,"Hello from MainActivity")
            startActivity(secondActivityIntent)
        }
        emailButton = findViewById(R.id.email_Button)
        emailButton.setOnClickListener {
            val ourEmail = Uri.parse("mailto:646811@mail.ru")
            val mailerForUs = Intent(Intent.ACTION_VIEW,ourEmail)
            startActivity(mailerForUs)
        }
        callButton = findViewById(R.id.callMe_Button)
        callButton.setOnClickListener {
            val phNumb = Uri.parse("tel:89240170811")
            val callerForUs = Intent(Intent.ACTION_CALL,phNumb)
            startActivity(callerForUs)
        }

    }
}