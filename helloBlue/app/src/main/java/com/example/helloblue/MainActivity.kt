package com.example.helloblue

import android.graphics.Color
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlin.random.Random


class MainActivity : AppCompatActivity() {
    fun getRandomColor(): Int {
        return Color.argb(255, Random.nextInt(256), Random.nextInt(256), Random.nextInt(256))
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //connects the activity_main.xml file and the MainActivity.kt file
        setContentView(R.layout.activity_main)

        //Goal 1: display cutomized text to show 'hello from {michelle}!'

        //Goal2: Change layout background color

        //Goal 3: User can tap a button to change the color of the label
        //1. Add button to layout
        //2. set up logic to know if user has tapped on button

        //Get a reference to our button
        //inside the <> we tell the Kotlin what kind of widget or view we are getting a reference to
        findViewById<Button>(R.id.button).setOnClickListener {
            //Handle button tap
            //3. Change the color of the text
            //In the first argument of the Log, enter a tag with a string you can easily search for
            Log.i("Michelle", "Tapped on button")
            //Get a reference to the text view
            findViewById<TextView>(R.id.textView).setTextColor(getResources().getColor(R.color.Chantilly))
        }

        //Change text color to a random color every time button is clicked
        findViewById<Button>(R.id.button4).setOnClickListener {
            //Handle button tap
            //3. Change the color of the text
            //In the first argument of the Log, enter a tag with a string you can easily search for
            //Get a reference to the text view
            findViewById<TextView>(R.id.textView).setTextColor(getRandomColor())
        }


        //Change background color on click of button
        findViewById<Button>(R.id.button2).setOnClickListener {
            findViewById<View>(R.id.backgroundView).setBackgroundColor(getResources().getColor(R.color.Biscay))
            findViewById<Button>(R.id.button).setBackgroundColor(getResources().getColor(R.color.Steel_Blue))
            findViewById<Button>(R.id.button2).setBackgroundColor(getResources().getColor(R.color.Steel_Blue))
            findViewById<Button>(R.id.button3).setBackgroundColor(getResources().getColor(R.color.Steel_Blue))
            findViewById<Button>(R.id.button4).setBackgroundColor(getResources().getColor(R.color.Steel_Blue))
        }

        //Change text message on click of button
        findViewById<Button>(R.id.button3).setOnClickListener {
            val userString = findViewById<EditText>(R.id.et_simple).getText().toString()
            if (userString.isEmpty()) {
                findViewById<TextView>(R.id.textView).setText("¿Que pasa?")
            } else {
                findViewById<TextView>(R.id.textView).setText(userString)
            }
            findViewById<TextView>(R.id.textView).setTextColor(getResources().getColor(R.color.Chantilly))
        }

        //Set everything back to original when click on background
        findViewById<View>(R.id.backgroundView).setOnClickListener {
            findViewById<View>(R.id.backgroundView).setBackgroundColor(getResources().getColor(R.color.Tawny_Port))
            findViewById<TextView>(R.id.textView).setTextColor(getResources().getColor(R.color.Tawny_Port))
            findViewById<TextView>(R.id.textView).setText("¡Hola! from Michelle!")
            findViewById<Button>(R.id.button).setBackgroundColor(getResources().getColor(R.color.Toledo))
            findViewById<Button>(R.id.button2).setBackgroundColor(getResources().getColor(R.color.Toledo))
            findViewById<Button>(R.id.button3).setBackgroundColor(getResources().getColor(R.color.Toledo))
            findViewById<Button>(R.id.button4).setBackgroundColor(getResources().getColor(R.color.Toledo))
            findViewById<EditText>(R.id.et_simple).setText("")
        }




//        User can update the label text with custom text entered into the text field.
//        a. User can enter text into a text field using the keyboard.
//        b. User can tap the “Change text string” button to update the label with the text from the text field.
//        c. If the text field is empty, update label with default text string.


    }
}