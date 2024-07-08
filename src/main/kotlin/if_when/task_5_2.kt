package if_when

import java.util.Calendar

fun main() {
    val currentYear = Calendar.getInstance().get(Calendar.YEAR)

    println("Введите год своего рождения:")
    val userYearOfBirth = readln().toInt()

    val currentAge = currentYear - userYearOfBirth

    val resultText = if (currentAge >= AGE_OF_MAJORITY) "Показать экран со скрытым контентом"
    else "Вернуться на главный экран"

    println(resultText)
}

const val AGE_OF_MAJORITY = 18