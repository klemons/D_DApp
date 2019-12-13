package com.example.ddapp

import kotlin.random.Random


open class Character {

    /* Character Name, Race, Class */
    protected var name = ""
    protected var race = ""
    protected var classification = ""

    //Primary Attributes
    private var strength = 0
    private var dexterity = 0
    private var constitution = 0
    private var intelligence = 0
    private var wisdom = 0
    private var charisma = 0
    private var strengthMod = 0
    private var dexterityMod = 0
    private var constitutionMod = 0
    private var intelligenceMod = 0
    private var wisdomMod = 0
    private var charismaMod = 0

    /*Constructor*/
    constructor(charName: String, charRace: String, charClass: String) {
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
    }

    /* Hitpoints and armor class will be determined in barbarian, wizard, etc. */


    /* Set methods */
    protected fun setStrength() {
        val randomStr = Random.nextInt(6, 18)
        this.strength = randomStr
    }
    protected fun setDexterity() {
        val randomDex = Random.nextInt(6, 18)
        this.dexterity = randomDex
    }
    protected fun setConstitution() {
        val randomCon = Random.nextInt(6, 18)
        this.constitution = randomCon
    }
    protected fun setIntelligence() {
        val randomInt = Random.nextInt(6, 18)
        this.intelligence = randomInt
    }
    protected fun setWisdom() {
        val randomWis = Random.nextInt(6, 18)
        this.wisdom = randomWis
    }
    protected fun setCharisma() {
        val randomCha = Random.nextInt(6, 18)
        this.charisma = randomCha
    }

    /* Get methods */
    fun getStrengthMod(): Int {
        return strengthMod
    }
    fun getDexterityMod(): Int {
        return dexterityMod
    }
    fun getConstitutionMod(): Int {
        return constitutionMod
    }
     fun getIntelligenceMod(): Int {
        return intelligenceMod
    }
    fun getWisdomMod(): Int {
        return wisdomMod
    }
    fun getCharismaMod(): Int {
        return charismaMod
    }
    fun getStrength(): Int {
        return strength
    }
    fun getDexterity(): Int {
        return dexterity
    }
    fun getConstitution(): Int {
        return constitution
    }
    fun getIntelligence(): Int {
        return intelligence
    }
    fun getWisdom(): Int {
        return wisdom
    }
    fun getCharisma(): Int {
        return charisma
    }
    fun getCharName(): String {
        return name
    }


    /*Modifier Methods*/
    fun setstrengthMod() {
        when (strength) {
            6, 7 -> strengthMod = -2
            8, 9 -> strengthMod = -1
            10, 11 -> strengthMod = 0
            12, 13 -> strengthMod = 1
            14, 15 -> strengthMod = 2
            16 -> strengthMod = 3
        }
    }
    fun setdexterityMod() {
        when (dexterity) {
            6, 7 -> dexterityMod = -2
            8, 9 -> dexterityMod = -1
            10, 11 -> dexterityMod = 0
            12, 13 -> dexterityMod = 1
            14, 15 -> dexterityMod = 2
            16 -> dexterityMod = 3
        }
    }
    fun setconstitutionMod() {
        when (constitution) {
            6, 7 -> constitutionMod = -2
            8, 9 -> constitutionMod = -1
            10, 11 -> constitutionMod = 0
            12, 13 -> constitutionMod = 1
            14, 15 -> constitutionMod = 2
            16 -> constitutionMod = 3
        }
    }
    fun setintelligenceMod() {
        when (intelligence) {
            6, 7 -> intelligenceMod = -2
            8, 9 -> intelligenceMod = -1
            10, 11 -> intelligenceMod = 0
            12, 13 -> intelligenceMod = 1
            14, 15 -> intelligenceMod = 2
            16 -> intelligenceMod = 3
        }
    }
    fun setwisdomMod() {
        when (wisdom) {
            6, 7 -> wisdomMod = -2
            8, 9 -> wisdomMod = -1
            10, 11 -> wisdomMod = 0
            12, 13 -> wisdomMod = 1
            14, 15 -> wisdomMod = 2
            16 -> wisdomMod = 3
        }
    }
    fun setcharismaMod() {
        when (charisma) {
            6, 7 -> charismaMod = -2
            8, 9 -> charismaMod = -1
            10, 11 -> charismaMod = 0
            12, 13 -> charismaMod = 1
            14, 15 -> charismaMod = 2
            16 -> charismaMod = 3
        }
    }
}