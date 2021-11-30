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


const val TAG = "MainActivity"
const val KEY = "random text"
class MainActivity : AppCompatActivity() {

    lateinit var helloTextView: TextView
    lateinit var newTextButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
        helloTextView = findViewById(R.id.hello_world_text_view)
        newTextButton = findViewById(R.id.newTextButton2)

        if(savedInstanceState != null) {
            helloTextView.text = savedInstanceState.getString(KEY)
        }
        newTextButtonClick()
        Log.d(
            TAG, "Ты видел деву на скале\n" +
                    "В одежде белой над волнами"
        )
    }

    fun newTextButtonClick() {
        newTextButton.setOnClickListener {
            helloTextView.text = (Random.nextInt(6) + 1).toString()

        }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putString(KEY,helloTextView.text.toString())
    }

    override fun onStart() {
        super.onStart()
        Log.d(
            TAG, "Когда, бушуя в бурной мгле,\n" +
                    "Играло море с берегами,"
        )
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "Когда луч молний озарял\n" +
                "Ее всечасно блеском алым")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "И ветер бился и летал\n" +
                "С ее летучим покрывалом?")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "Прекрасно море в бурной мгле\n" +
                "И небо в блесках без лазури;")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG, "onRestart")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "Но верь мне: дева на скале\n" +
                "Прекрасней волн, небес и бури.")
    }
}