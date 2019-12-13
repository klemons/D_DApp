package com.example.ddapp

import android.content.Context
import java.util.ArrayList
import java.util.HashMap

class TestCharacterList {
    val ITEM_MAP: MutableMap<String, Character> = HashMap<String, Character>()


    val CHARS: MutableList<Character> = ArrayList<Character>()

    private val name1 = "Bob"
    private val race1 = "Dwarf"
    private val clss1 = "Barbarian"

    fun createMovieMagic(context: Context): List<Character> {
        if (CHARS.size == 0) {
            // make those movie objects
            val char1 =
                Character(name1, race1, clss1)
            // add EACH movie object to our lists and maps
            addCharToList(char1)
        }


        // no more movies to add?  Okay... return our list
        return CHARS
    }

    // Internal helper so we don't forget any steps in the complex two-step system.  Seriously.  It happens.
    private fun addCharToList(datChar: Character) {
        CHARS.add(datChar)
        ITEM_MAP[datChar.getCharName()] = datChar
    }
}