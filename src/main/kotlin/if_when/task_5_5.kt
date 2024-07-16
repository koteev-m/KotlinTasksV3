package if_when

import kotlin.random.Random

fun main() {
    val winnerNumbers = List(3) { Random.nextInt(0, 42) }

    println("Введите три числа от 0 до 42:")

    val userNumbers = mutableListOf<Int>()
    val number1 = readln().toInt()
    val number2 = readln().toInt()
    val number3 = readln().toInt()
    userNumbers.add(number1)
    userNumbers.add(number2)
    userNumbers.add(number3)

    val matchingNumbers = winnerNumbers.intersect(userNumbers.toSet()).size

    val resultText = when (matchingNumbers) {
        3 -> "Поздравляю! Выугадали все числа и выйграли джекпот!"
        2 -> "Поздравляю! Вы угадали два числа и выйграли крупный приз!"
        1 -> "Вы угадали одно число и выйграли утешительный приз! Поздравляю!"
        else -> "Вы не угадали ни одного числа"
    }
    println(resultText)

    println("Выйгрышные числа: ${winnerNumbers.joinToString(", ")}")
}