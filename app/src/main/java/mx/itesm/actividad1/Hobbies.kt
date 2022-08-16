package mx.itesm.actividad1

import androidx.appcompat.app.AppCompatActivity
import android.app.Activity
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


class Hobbies : AppCompatActivity() {


    private lateinit var answer: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hobbies)

        val hobbies = findViewById<TextView>(R.id.textView2)
        hobbies.text = "What is your hobby?"

        val send_answ = findViewById<Button>(R.id.button5)
        answer = findViewById(R.id.editTextTextPersonName2)

        send_answ.setOnClickListener{
            // Guardar valor
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("nombre", intent.getStringExtra("nombre"))
            intent.putExtra("hobby", "Hobby: " + this.answer.text.toString())
            startActivity(intent)
        }

    }
}