package com.example.ddapp

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class CharacterDetailActivity : AppCompatActivity() {
    //To hold the eventual character object
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.character_detail_activity)

        var charImage = findViewById<ImageView>(R.id.imageView)

        val classPickView = findViewById<TextView>(R.id.charName)
        val racePickView = findViewById<TextView>(R.id.raceName)
        val namePickView = findViewById<TextView>(R.id.name)

        val className = intent.getStringExtra("classChoice")
        val raceName = intent.getStringExtra("raceChoice")
        val name = intent.getStringExtra("nameChoice")

        when (raceName) {
            "Orc" -> charImage.setImageResource(R.drawable.orc)
            "Dwarf" -> charImage.setImageResource(R.drawable.dwarf)
            "Human" -> charImage.setImageResource(R.drawable.human)
            "Elf" -> charImage.setImageResource(R.drawable.elf)
        }

        namePickView.append(name.capitalize())
        classPickView.append(className)
        racePickView.append(raceName)

        var characterBarb = Barbarian(name, raceName, className)

        val strView = findViewById<TextView>(R.id.str)
        val dexView = findViewById<TextView>(R.id.dex)
        val conView = findViewById<TextView>(R.id.con)
        val intView = findViewById<TextView>(R.id.intell)
        val wisView = findViewById<TextView>(R.id.wis)
        val chaView = findViewById<TextView>(R.id.cha)
        strView.append("STR:" + characterBarb.getStrength())
        dexView.append("DEX:" + characterBarb.getDexterity())
        conView.append("CON:" + characterBarb.getConstitution())
        intView.append("INT:" + characterBarb.getIntelligence())
        wisView.append("WIS:" + characterBarb.getWisdom())
        chaView.append("CHA:" + characterBarb.getCharisma())
    }
}