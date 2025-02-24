fun main() {
    val cakes = mutableListOf<Cake>()


    while (true) {
        println("\nВыберите действие:")
        println("1. Добавить пирожное")
        println("2. Показать все пирожные")
        println("3. Выйти")
        print("Введите номер действия: ")

        when (readln()) {
            "1" -> {
                print("Введите название пирожного: ")
                val name = readln()
                print("Введите тип теста: ")
                val dough = readln()
                print("Введите тип крема: ")
                val cream = readln()
                print("Введите вес пирожного (в граммах): ")
                val weight = readln().toDouble()
                print("Введите калорийность пирожного: ")
                val calories = readln().toInt()
                print("Введите цену пирожного: ")
                val price = readln().toDouble()

                val cake = Cake(name, dough, cream, weight, calories, price)
                cakes.add(cake)
                println("Пирожное добавлено!")
            }
            "2" -> {
                if (cakes.isEmpty()) {
                    println("Список пирожных пуст.")
                } else {
                    println("\nСписок всех пирожных:")
                    cakes.forEach { println(it) }
                }
            }
            "3" -> {
                println("Выход из программы.")
                return
            }
            else -> {
                println("Неверный ввод, попробуйте снова.")
            }
        }
    }
}