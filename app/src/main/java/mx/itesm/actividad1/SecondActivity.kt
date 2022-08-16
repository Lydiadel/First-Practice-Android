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

    private lateinit var hobby : TextView

    val lanzador = registerForActivityResult(ActivityResultContracts.StartActivityForResult()){ result ->

        if (result.resultCode == Activity.RESULT_OK){
            val datos = result.data
            hobby = findViewById(R.id.textView3)
            hobby.text = "Hobby: " + datos?.getStringExtra("hobby")
        }
    }
    override fun onCreate(savedInstanceState: Bundle?) {



        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val nombre = intent.getStringExtra("nombre").toString()

        val texto = findViewById<TextView>(R.id.textView)
        texto.text = "HI " + intent.getStringExtra("nombre")

        val hobbiesButton = findViewById<Button>(R.id.button2)
        hobbiesButton.text = "My hobbies"
        hobbiesButton.setOnClickListener {
            val intent = Intent(this, Hobbies::class.java)
            //intent.putExtra("nombre", intent.getStringExtra("nombre"))
            lanzador.launch(intent)
        }
        val friends = findViewById<Button>(R.id.button3)
        friends.text = "Friends"

        friends.setOnClickListener {

            val intent = Intent( this, Friends::class.java )
            intent.putExtra("hobby", hobby.text)
            intent.putExtra("nombre", nombre)
            startActivity(intent)
        }

        val messageSend = findViewById<Button>(R.id.button4)

        messageSend.setOnClickListener{
            val intent = Intent( this, messageActivity::class.java )
            startActivity(intent)
        }
    }
}