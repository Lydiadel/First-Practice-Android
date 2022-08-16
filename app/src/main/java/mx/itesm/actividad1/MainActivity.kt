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

class MainActivity : AppCompatActivity() {


    private lateinit var textoEditable: EditText

    val lanzador = registerForActivityResult(ActivityResultContracts.StartActivityForResult()){ result ->

        if (result.resultCode == Activity.RESULT_OK){
            val datos = result.data
            val hobby = findViewById<TextView>(R.id.editTextTextPersonName2)
            hobby.text = datos?.getStringExtra("hobby")
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textoEditable = findViewById(R.id.editTextTextPersonName)
        val botoncito = findViewById<Button>(R.id.button)

        //textito.text = "HOLA, SOY CÓDIGO"
        Log.wtf("MAIN", textoEditable.text.toString())
        botoncito.text = "Menú"


        botoncito.setOnClickListener {/*
            Toast.makeText(this, "HOLA DESDE BOTON 3", Toast.LENGTH_LONG).show()
            */
            val intent = Intent(this, SecondActivity::class.java)


            // como mandar datos hacia la nueva actividad
            intent.putExtra("nombre", this.textoEditable.text.toString())
            startActivity(intent)
            //lanzador.launch(intent)
        }
    }
}


