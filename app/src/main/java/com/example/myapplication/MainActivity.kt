package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.DefaultItemAnimator


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonPlay = findViewById<Button>(R.id.buttonPlay)
        val txtName = findViewById<EditText>(R.id.txtName)
        val buttonList = findViewById<Button>(R.id.buttonList)


        // var output: String="Hello" +txtName.text.toString()

        buttonPlay.setOnClickListener() {
            Toast.makeText(this, "Hello  " + txtName.text, Toast.LENGTH_LONG).show()

            val intent = Intent(this, WordActivity::class.java)
            startActivity(intent)
        }



        buttonList.setOnClickListener() {


            val intent = Intent(this, WordList::class.java)
            startActivity(intent)
        }

    }
}



