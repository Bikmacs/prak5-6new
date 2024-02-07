import kotlin.math.abs
import kotlin.math.absoluteValue
import kotlin.math.log10
import kotlin.math.pow

fun main() {
    try {
        println("Введите а")
        var a = readLine()!!.toDouble()
        println("Введите b")
        var b = readLine()!!.toDouble()
        var n = 3.0;
        println("Введите c")
        var c = readLine()!!.toDouble()
        println("Введите c")
        var d = readLine()!!.toDouble()
        var x = 10.0
        var result = ("${String.format("%.2f",(0.25*(a-b) / (1/8) - abs(b) / x.pow(n+10)+ log10(b) / c - d))}")
        println("результат этого сложнейшего задания = $result")
            } catch (e: Exception) {
        println("Символ не верный")
    }
}

