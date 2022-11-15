package id.idkr.diceroller

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    //Toast notif when button clicked.
    private fun rollDice(){
        Toast.makeText(this, "Button Clicked", Toast.LENGTH_SHORT).show()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.roll_button)
        val countUP: Button = findViewById(R.id.count_up)
        val resultText: TextView = findViewById(R.id.result_text)
        val randomInt = (1..6).random()
        val countUpValue = 1
        resultText.text= "1"
        countUP.setOnClickListener{resultText.text=randomInt.toString()}
        rollButton.setOnClickListener{rollDice()}

    }
}