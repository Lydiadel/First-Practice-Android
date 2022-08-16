package mx.itesm.actividad1

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.result.contract.ActivityResultContract
import androidx.activity.result.contract.ActivityResultContracts
import android.content.Intent as Intent

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val nombre = intent.getStringExtra("nombre")

        val texto = findViewById<TextView>(R.id.textView)
        texto.text = "HI " + intent.getStringExtra("nombre")

        val hobby = findViewById<TextView>(R.id.textView3)
        hobby.text = " " + intent.getStringExtra("hobby")

        val hobbiesButton = findViewById<Button>(R.id.button2)
        hobbiesButton.text = "My hobbies"
        hobbiesButton.setOnClickListener {
            val intent = Intent(this, Hobbies::class.java)
            intent.putExtra("nombre", intent.getStringExtra("nombre"))
            startActivity(intent)
        }
        val friends = findViewById<Button>(R.id.button3)
        friends.text = "Friends"

        friends.setOnClickListener {

            val intent = Intent( this, Friends::class.java )
            intent.putExtra("nombre", intent.getStringExtra("nombre"))
            startActivity(intent)
        }
        val message = findViewById<Button>(R.id.button4)
        message.text = "Send message"
    }
}