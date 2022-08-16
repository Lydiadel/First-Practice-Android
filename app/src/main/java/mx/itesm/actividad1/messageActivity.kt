package mx.itesm.actividad1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class messageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_message)
        val boton = findViewById<Button>(R.id.button6)
        boton.text = "Send"
    }

    fun sendMessage(view: View?){

        val message = findViewById<EditText>(R.id.editTextTextPersonName3)
        Toast.makeText(this, message.text.toString(), Toast.LENGTH_LONG).show()
        finish()
    }
}