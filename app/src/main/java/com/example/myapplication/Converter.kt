package com.example.myapplication

import java.math.RoundingMode

//        println("Enter two numbers in format: {source base} {target base} (To quit type /exit)")
//        println("Enter number in base $from to convert to base $to (To go back type /back)")
//        print("Conversion result: ")

fun main() {
    println("base to dec " + toDec("101010AAA1", "11"))
    println("dec to num " + (fromDec(toDec("101010AAA1", "11"), "26")))
}

fun toDec(number: String, baza: String): String {
    val base = baza.toBigInteger()

    var numResult = 0.toBigInteger()
    var decResult = 0.toBigDecimal()

    val numReversed = number.uppercase().substringBefore(".").reversed()

    if (number.contains(".")) {
        val decimal = number.substringAfter(".")
        for (i in decimal.lastIndex downTo 0) {
            var decFigure = decimal[i].toString().uppercase()
            when (decFigure) {
                "A" -> decFigure = "10"
                "B" -> decFigure = "11"
                "C" -> decFigure = "12"
                "D" -> decFigure = "13"
                "E" -> decFigure = "14"
                "F" -> decFigure = "15"
                "G" -> decFigure = "16"
                "H" -> decFigure = "17"
                "I" -> decFigure = "18"
                "J" -> decFigure = "19"
                "K" -> decFigure = "20"
                "L" -> decFigure = "21"
                "M" -> decFigure = "22"
                "N" -> decFigure = "23"
                "O" -> decFigure = "24"
                "P" -> decFigure = "25"
                "Q" -> decFigure = "26"
                "R" -> decFigure = "27"
                "S" -> decFigure = "28"
                "T" -> decFigure = "29"
                "U" -> decFigure = "30"
                "V" -> decFigure = "31"
                "W" -> decFigure = "32"
                "X" -> decFigure = "33"
                "Y" -> decFigure = "34"
                "Z" -> decFigure = "35"
            }
            decResult =
                (decResult + decFigure.toBigDecimal()
                    .setScale(6, RoundingMode.HALF_UP)) / base.toBigDecimal()
        }
    }

    for (i in 0..numReversed.lastIndex) {
        var numFigure = numReversed[i].toString()
        when (numFigure) {
            "A" -> numFigure = "10"
            "B" -> numFigure = "11"
            "C" -> numFigure = "12"
            "D" -> numFigure = "13"
            "E" -> numFigure = "14"
            "F" -> numFigure = "15"
            "G" -> numFigure = "16"
            "H" -> numFigure = "17"
            "I" -> numFigure = "18"
            "J" -> numFigure = "19"
            "K" -> numFigure = "20"
            "L" -> numFigure = "21"
            "M" -> numFigure = "22"
            "N" -> numFigure = "23"
            "O" -> numFigure = "24"
            "P" -> numFigure = "25"
            "Q" -> numFigure = "26"
            "R" -> numFigure = "27"
            "S" -> numFigure = "28"
            "T" -> numFigure = "29"
            "U" -> numFigure = "30"
            "V" -> numFigure = "31"
            "W" -> numFigure = "32"
            "X" -> numFigure = "33"
            "Y" -> numFigure = "34"
            "Z" -> numFigure = "35"
        }
        numResult += base.pow(i) * numFigure.toBigInteger()
    }

    return numResult.toString() + decResult.toString().substring(1)
}

fun fromDec(number: String, baza: String): String {
    val base = baza.toBigInteger()

    var numResult = ""
    var decResult = ""

    var numberInt = number.substringBefore(".").toBigInteger()

    if (numberInt < base) {
        numResult = numberInt.toString()
    } else {
        var remainderFirst: String
        var remainderLast = ""

        while (base <= numberInt) {
            remainderFirst = (numberInt % base).toString()
            when (remainderFirst) {
                "10" -> remainderFirst = "A"
                "11" -> remainderFirst = "B"
                "12" -> remainderFirst = "C"
                "13" -> remainderFirst = "D"
                "14" -> remainderFirst = "E"
                "15" -> remainderFirst = "F"
                "16" -> remainderFirst = "G"
                "17" -> remainderFirst = "H"
                "18" -> remainderFirst = "I"
                "19" -> remainderFirst = "J"
                "20" -> remainderFirst = "K"
                "21" -> remainderFirst = "L"
                "22" -> remainderFirst = "M"
                "23" -> remainderFirst = "N"
                "24" -> remainderFirst = "O"
                "25" -> remainderFirst = "P"
                "26" -> remainderFirst = "Q"
                "27" -> remainderFirst = "R"
                "28" -> remainderFirst = "S"
                "29" -> remainderFirst = "T"
                "30" -> remainderFirst = "U"
                "31" -> remainderFirst = "V"
                "32" -> remainderFirst = "W"
                "33" -> remainderFirst = "X"
                "34" -> remainderFirst = "Y"
                "35" -> remainderFirst = "Z"
            }
            numResult += remainderFirst
            numberInt /= base
            remainderLast = numberInt.toString()
            when (remainderLast) {
                "10" -> remainderLast = "A"
                "11" -> remainderLast = "B"
                "12" -> remainderLast = "C"
                "13" -> remainderLast = "D"
                "14" -> remainderLast = "E"
                "15" -> remainderLast = "F"
                "16" -> remainderLast = "G"
                "17" -> remainderLast = "H"
                "18" -> remainderLast = "I"
                "19" -> remainderLast = "J"
                "20" -> remainderLast = "K"
                "21" -> remainderLast = "L"
                "22" -> remainderLast = "M"
                "23" -> remainderLast = "N"
                "24" -> remainderLast = "O"
                "25" -> remainderLast = "P"
                "26" -> remainderLast = "Q"
                "27" -> remainderLast = "R"
                "28" -> remainderLast = "S"
                "29" -> remainderLast = "T"
                "30" -> remainderLast = "U"
                "31" -> remainderLast = "V"
                "32" -> remainderLast = "W"
                "33" -> remainderLast = "X"
                "34" -> remainderLast = "Y"
                "35" -> remainderLast = "Z"
            }
        }
        numResult = (numResult + remainderLast).reversed()
    }

    return if (!number.contains('.')) {
        numResult
    } else {
        var numberDec = number.toBigDecimal() - number.substringBefore(".").toBigDecimal()
        var j = numberDec.toString().length - 2
        while (j > 0) {
            val lineToTransform = numberDec * base.toBigDecimal()
            val remainderInteger = lineToTransform.toString().substringBefore(".")
            var figureToTransform = remainderInteger
            when (figureToTransform) {
                "10" -> figureToTransform = "A"
                "11" -> figureToTransform = "B"
                "12" -> figureToTransform = "C"
                "13" -> figureToTransform = "D"
                "14" -> figureToTransform = "E"
                "15" -> figureToTransform = "F"
                "16" -> figureToTransform = "G"
                "17" -> figureToTransform = "H"
                "18" -> figureToTransform = "I"
                "19" -> figureToTransform = "J"
                "20" -> figureToTransform = "K"
                "21" -> figureToTransform = "L"
                "22" -> figureToTransform = "M"
                "23" -> figureToTransform = "N"
                "24" -> figureToTransform = "O"
                "25" -> figureToTransform = "P"
                "26" -> figureToTransform = "Q"
                "27" -> figureToTransform = "R"
                "28" -> figureToTransform = "S"
                "29" -> figureToTransform = "T"
                "30" -> figureToTransform = "U"
                "31" -> figureToTransform = "V"
                "32" -> figureToTransform = "W"
                "33" -> figureToTransform = "X"
                "34" -> figureToTransform = "Y"
                "35" -> figureToTransform = "Z"
            }
            decResult += figureToTransform
            numberDec = lineToTransform - remainderInteger.toBigDecimal()
            j--
        }
        "$numResult.$decResult"
    }
}

