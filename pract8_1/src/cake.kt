class Cake (
    val name: String,
    val dough: String,
    val cream: String,
    val weight: Double,
    val calories: Int,
    val price: Double

    ) {
        override fun toString(): String {
            val RED = "\u001B[31m"
            val RESET = "\u001B[0m"
            val GREEN = "\u001B[32m"
            val BOLD = "\u001B[1m"

            return RED + BOLD + "Название:" + GREEN + "$name,\u001B[0m " + RED + "Тесто:" + GREEN + "$dough, " + RED + "Крем:" + GREEN + "$cream, " + RED + "Вес:" + GREEN + "${weight}г, " + RED + "Калорийность:" + GREEN + "${calories}ккал, " + RED + "Цена:" + GREEN + "${price}руб." + RESET
        }
    }
