package com.example.ddapp

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import android.content.DialogInterface
import android.text.InputType
import android.widget.EditText
import androidx.appcompat.app.AlertDialog




class ChooseRaceActivity: AppCompatActivity() {
    var classNameHolder =""
    var nameHolder =""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.choose_race_activity)

        /* Holder for class choice, to be sent to CharacterDetailActivity */
        classNameHolder = intent.getStringExtra("classChoice")

    }

    var raceChoice =""
    fun chooseRace(view: View){
        when (view.id) {
            R.id.Dwarf -> raceChoice="Dwarf"
            R.id.Elf -> raceChoice="Elf"
            R.id.Human -> raceChoice="Human"
            R.id.Orc -> raceChoice="Orc"
        }


        val builder = AlertDialog.Builder(this)
        builder.setTitle("Enter Your Character Name")
        val inText = EditText(this)

        // Specify the type of input expected; this, for example, sets the input as a password, and will mask the text
        inText.inputType = InputType.TYPE_CLASS_TEXT
        builder.setView(inText)

        // Set up the buttons
        builder.setPositiveButton("OK",
            DialogInterface.OnClickListener { dialog, which ->
                nameHolder = inText.text.toString()
                moveClassRaceChoice(classNameHolder, raceChoice, nameHolder)
            })
        builder.setNegativeButton("Cancel",
            DialogInterface.OnClickListener { dialog, which -> dialog.cancel() })

        // Finally, make the alert dialog using builder
        val dialog: AlertDialog = builder.create()

        // Display the alert dialog on app interface
        dialog.show()
}

    fun moveClassRaceChoice(choiceC: String, choiceR: String, choiceN: String) {
        val intent = Intent(this, CharacterDetailActivity::class.java).apply {
            putExtra("classChoice", classNameHolder)
            putExtra("raceChoice", raceChoice)
            putExtra("nameChoice", nameHolder)
        }
        startActivity(intent)

    }
}