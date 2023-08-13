fun main(args: Array<String>) {

    fun division(ageInDays: Int): Map<String, Int> {
        val years = ageInDays / 365
        val remainingDays = ageInDays % 365
        val months = remainingDays / 30
        val days = remainingDays % 30
        return mapOf("years" to years, "months" to months, "days" to days)
    }
    while (true) {
        print("Введите свой возраст в днях (Для того чтобы выйти из программы, введите слово «Банан»):")
        val input = readLine()
        if (input == "Банан") {
            println("Выход из программы")
            break
        }

        val ageInDays = input?.toIntOrNull()
        if (ageInDays != null) {
            val ageResult = division(ageInDays)
            println("Ваш возраст: ${ageResult["years"]} лет, ${ageResult["months"]} месяц, ${ageResult["days"]} день")
        } else {
            println("Слишком много цифр либо вы ввели символ или букву")
        }
    }
}

