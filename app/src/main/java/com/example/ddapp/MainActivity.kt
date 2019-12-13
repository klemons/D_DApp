package com.example.ddapp

import android.content.Intent
import android.os.Bundle
import android.view.*
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        //TODO Future implementation of multiple characters
//        val recyclerView = findViewById<RecyclerView>(R.id.character_list)!!
//        recyclerView.layoutManager = LinearLayoutManager(this)
//        val chars = ArrayList<Character>()
//        chars.add(Character("Bob","Dwarf", "fighter"))
//
//        var adapter = CharacterAdapter(chars)
//        recyclerView.adapter = adapter

    }
    var classChoice =""
    fun chooseClass(view: View){
        when (view.id) {
            R.id.barb -> classChoice="Barbarian"
            R.id.bard -> classChoice="Bard"
            R.id.cleric -> classChoice="Cleric"
            R.id.druid -> classChoice="Druid"
            R.id.fighter -> classChoice="Fighter"
            R.id.monk -> classChoice="Monk"
            R.id.paladin -> classChoice="Paladin"
            R.id.ranger -> classChoice="Ranger"
            R.id.rogue -> classChoice="Rogue"
            R.id.warlock -> classChoice="Warlock"
            R.id.wizard -> classChoice="Wizard"
        }
        moveClassChoice(classChoice)
    }

    fun moveClassChoice(choice: String) {
        val intent = Intent(this, ChooseRaceActivity::class.java).apply {
            putExtra("classChoice", choice)
        }
        startActivity(intent)

    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }

}
