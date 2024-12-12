package com.example.recyclerview_v_1

import android.annotation.SuppressLint
import android.graphics.Color
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Activity2 : AppCompatActivity() {

       private lateinit var toolbar: Toolbar
       private lateinit var listTv: RecyclerView

    @SuppressLint("MissingInflatedId", "ResourceAsColor")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_2)

           toolbar = findViewById(R.id.toolbar)
           listTv = findViewById(R.id.listTv)
             listTv.layoutManager = LinearLayoutManager(this)


           setSupportActionBar(toolbar)
         title = "Мой гардероб"
         toolbar.setBackgroundColor(Color.GRAY )
         toolbar.titleMarginStart = 160

          val dress = Dress.dress

            listTv.adapter = MyAdapter(dress)













        }
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
         menuInflater.inflate(R.menu.menu_exit,menu)
        return super.onCreateOptionsMenu(menu) }

    @SuppressLint("SuspiciousIndentation")
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val builder = AlertDialog.Builder(this)
            builder.setTitle("Действительно выйти?")
                .setPositiveButton("Да") {_,_ -> finishAffinity()}
                .setNegativeButton("Нет") {s,_ -> s.cancel() }.create()
             builder.show()
        return super.onOptionsItemSelected(item)
    }

    }
