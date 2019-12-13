package com.example.ddapp

class Barbarian : Character {
    constructor(charName: String, charRace: String, charClass: String) : super(charName, charRace, charClass) {
        name = charName
        race = charRace
        classification = charClass
        setStrength()
        setDexterity()
        setConstitution()
        setIntelligence()
        setWisdom()
        setCharisma()
        setstrengthMod()
        setdexterityMod()
        setconstitutionMod()
        setintelligenceMod()
        setwisdomMod()
        setcharismaMod()

        /*new setter calls*/
        setHealth()
        setArmorClass()
    }

    private var health = 0
    private var AC = 0

    /* new setters */

    private fun setHealth() {
        health = 12 + getConstitutionMod()
    }

    private fun setArmorClass() {
        AC = 10 + getConstitutionMod() + getDexterityMod()
    }
}