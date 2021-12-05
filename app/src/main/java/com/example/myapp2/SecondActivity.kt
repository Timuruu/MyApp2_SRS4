package com.example.myapp2

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

private const val HELLO_KEY = "HEllo"
class SecondActivity : AppCompatActivity() {
    lateinit var userRecyclerView: RecyclerView
    lateinit var helloTextView2: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val userList:List<User> = listOf(
           User("ivan",20),
            User("Petr",22),
            User("Timur",43),
            User("Arthur",6),
            User("Sveta",45),
            User("Dasha",16)
        )
        userRecyclerView = findViewById(R.id.user_recycler_view)
        userRecyclerView.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        userRecyclerView.adapter = UserAdapter(userList)
        userRecyclerView.addItemDecoration(DividerItemDecoration(this,DividerItemDecoration.VERTICAL))




    //helloTextView2 = findViewById(R.id.hello_text_view2)
    //val helloValue: String? = intent.extras?.getString(HELLO_KEY)
        //helloTextView2.text = helloValue

    }
}