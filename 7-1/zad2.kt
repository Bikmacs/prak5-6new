import kotlin.math.pow
fun main() {
    try {

        var x = readLine()!!.toInt()
        var lastsimvol = x % 10

            when {
                (lastsimvol % 2 != 0) -> println("Последняя цифра чила $x являеться нечетной")
                else -> println("Последняя цифра чила $x являеться четной")
            }
    }catch (e:Exception){
        println("Символ не верный")
    }
}