package com.example.myapplication

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {

    @Test
    fun percentage_11_tip() {
        val amount = 150.00
        val tipPercent = 11.00
        val roundUp = false
        val correctAnswer = "$16.50"
        val actualAnswer = calculateTip(amount, tipPercent, roundUp)
        assertEquals(correctAnswer, actualAnswer)
    }


    @Test
    fun percentage_0_tip() {
        val amount = 150.0
        val tipPercent = 0.0
        val roundUp = false
        val correctAnswer = "$0.00"
        val actualAnswer = calculateTip(amount, tipPercent, roundUp)
        assertEquals(correctAnswer, actualAnswer)
    }

    @Test
    fun percentage_19_rounding_tip() {
        val amount = 100.0
        val tipPercent = 19.9
        val roundUp = true
        val correctAnswer = "$20.00"
        val actualAnswer = calculateTip(amount, tipPercent, roundUp)
        assertEquals(correctAnswer, actualAnswer)
    }

    @Test
    fun percentage_19_noRounding_tip() {
        val amount = 100.0
        val tipPercent = 19.9
        val roundUp = false
        val correctAnswer = "$19.90"
        val actualAnswer = calculateTip(amount, tipPercent, roundUp)
        assertEquals(correctAnswer, actualAnswer)
    }

    @Test
    fun percentage_half() {
        val amount = 100.0
        val tipPercent = 0.05
        val roundUp = false
        val correctAnswer = "$0.05"
        val actualAnswer = calculateTip(amount, tipPercent, roundUp)
        assertEquals(correctAnswer, actualAnswer)
    }
}
