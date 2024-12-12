package com.example.recyclerview_v_1

import android.annotation.SuppressLint
import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class activity3 : AppCompatActivity() {

           private lateinit var toolbar: Toolbar
           private lateinit var nameText: TextView
           private lateinit var descriptionText: TextView
           private lateinit var imageTv: ImageView
           private lateinit var mainDisplay: ConstraintLayout
           private lateinit var button: Button

    @SuppressLint("MissingInflatedId", "InflateParams")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_3)

        toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)
        title = "Мой гардероб"
        toolbar.setBackgroundColor(Color.GRAY)
        toolbar.titleMarginStart = 120
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
        toolbar.setNavigationOnClickListener { onBackPressed() }
        nameText = findViewById(R.id.nameText)
        descriptionText = findViewById(R.id.descriptionText)
        imageTv = findViewById(R.id.imageTv)
        mainDisplay = findViewById(R.id.main)
        button = findViewById(R.id.button)
         var name: String = ""; var description: String = ""; var flag = false; var image = 0


                  val dress = intent.getSerializableExtra(Dress::class.java.simpleName) as Dress?

               if ( dress != null) { name = dress.name; description = dress.description;  image = dress.image }

                   nameText.text = name
                   descriptionText.text = description
                   imageTv.setImageResource(image)

           mainDisplay.setOnLongClickListener {

               val dialog = AlertDialog.Builder(this)
               val inflater = this.layoutInflater
               val dialogTv = inflater.inflate(R.layout.editi_item,null)
                   dialog.setView(dialogTv)
                   val name_ed = dialogTv.findViewById<TextView>(R.id.name_edit)
                   val description_ed = dialogTv.findViewById<EditText>(R.id.description_edit)
                  name_ed.setText(name)
                 description_ed.setText(description)

                      dialog.setTitle("Редактирование\n\n")
                            .setNegativeButton("Отмена") {_,_ ->}
                          .setPositiveButton("Сохранить") {_,_ ->
                              nameText.text = name_ed.text; name = name_ed.text.toString()
                              descriptionText.text = description_ed.text; description = description_ed.text.toString()
                           flag = true
                          }
                dialog.create().show()
               false }

                   button.setOnClickListener { if ( flag ) {

                         val dialog = AlertDialog.Builder(this)
                             dialog.setTitle("Сохранить изменения?")
                                 .setNegativeButton("Нет") {_,_ -> finish()}
                                 .setPositiveButton("Да") { _,_ ->
                                   //  val intent = Intent(this,Activity2::class.java)
                                              intent.putExtra(Dress::class.java.simpleName,Dress(name,description,image))

                                     setResult(RESULT_OK,intent)
                                     finish()




                                 }
                            dialog.create().show()
                   } else finish() }



    }





    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_exit,menu)
        return super.onCreateOptionsMenu(menu)}

    @SuppressLint("SuspiciousIndentation")
    override fun onOptionsItemSelected(item: MenuItem): Boolean {

       val builder = AlertDialog.Builder(this)
           builder.setTitle("Действительно выйти?")
               .setPositiveButton("Да") { _,_ -> finishAffinity()}
               .setNegativeButton("Нет") {s,_ -> s.cancel()}.create()
             builder.show()
        return super.onOptionsItemSelected(item) }



    }
