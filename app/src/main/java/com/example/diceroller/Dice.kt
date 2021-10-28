package com.example.diceroller

/**
 * class to roll a dice and return a random side
 */

class Dice(val sides: Int) {

    fun roll(): Int {
        return (1..sides).random()
    }

}