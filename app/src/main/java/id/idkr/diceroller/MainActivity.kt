package id.idkr.diceroller

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener{rollDice()}

       /** val countButton: Button = findViewById(R.id.countup_button)
        countButton.setOnClickListener{countUp()} **/
    }

    private fun rollDice(){
        val randomInt = (1..6).random()

        val diceImage : ImageView = findViewById(R.id.dice_image)

        val drawableResource =  when (randomInt) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        diceImage.setImageResource(drawableResource)
    }

   /** private fun countUp(){
        val resultText: TextView = findViewById(R.id.result_text)

        if (resultText.text == "Hello World!"){
            resultText.text = "1"
        }else{

            var resultInt = resultText.text.toString().toInt()

            if (resultInt < 6){
                resultInt++
                resultText.text = resultInt.toString()
            }
        }
    } **/
}
