package mx.itesm.actividad1

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
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

        //name.text = intent.getStringExtra("nombre")

    }

    fun onClickHobbies(view : View?){
        // Guardar valor
        val intent = Intent()
        intent.putExtra("hobby", answer.text.toString())
        setResult(Activity.RESULT_OK,intent)
        finish()
    }

}