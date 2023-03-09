package com.example.mydomashparttwo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val contactConteiner: RecyclerView = findViewById(R.id.contact_container)

        val contactItems = arrayListOf(
        ContactItem("Pidr","+375666666",R.drawable.fuck),
        ContactItem("Pidr66","+375666666",R.drawable.fuck),
        ContactItem("Pidr55","+375666666",R.drawable.fuck),
        ContactItem("Pidr22","+375666666",R.drawable.fuck),
        ContactItem("Pidr1","+375666666",R.drawable.fuck),
        ContactItem("Pidr8","+375666666",R.drawable.fuck),
        ContactItem("Pidr6","+375666666",R.drawable.fuck),
        ContactItem("Pidr2","+375666666",R.drawable.fuck),
        ContactItem("Pidr12","+375666666",R.drawable.fuck),
        ContactItem("Pidr6","+375666666",R.drawable.fuck),
        ContactItem("Pid6","+375666666",R.drawable.fuck),
        ContactItem("Pidr6","+375666666",R.drawable.fuck)
        )
        contactConteiner.adapter = ContactAdapter(contactItems)
        contactConteiner.layoutManager = LinearLayoutManager(this)
    }
}