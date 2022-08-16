package mx.itesm.actividad1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Friends : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_friends)

        val boton = findViewById<Button>(R.id.friendsButton)
        val hobby = intent.getStringExtra("hobby")
        val nombre = intent.getStringExtra("nombre")
        boton.setOnClickListener{
            val intent = Intent()
            intent.putExtra("hobby", hobby)
            intent.putExtra("nombre", nombre)
            finish()
            //startActivity(intent)
        }

    }
}