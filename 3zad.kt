fun main(){
    try {
        var num1 = readLine()!!.toInt()

        when (num1) {
            in 0..2 -> println("Младенец")
            in 2..12 -> println("Ребенок")
            in 13..18 -> println("Подросток");
            in 18..55 -> println("Взрослый человек")
            in 55..100 -> println("пенсионер")
            else-> println("человечность утеряна")
        }
    }catch (e: Exception) {
        println("введен не вырный символ")
    }

}
