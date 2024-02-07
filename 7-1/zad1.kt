import kotlin.math.sin
import kotlin.math.pow
fun main(){
    try{

        var x = readLine()!!.toDouble();

        when{
            (x > 1.1)->println(9-x)
            (x < -1.1)->println("${String.format("%.2f", (sin(3.0) * x / x.pow(4.0) + 1))}")
        }

    }catch (e:Exception){
        println("Неверно")
    }
}