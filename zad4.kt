fun main(){
    try {

        println("Сколько было 5?")
        var p = readLine()!!.toInt()

        println("Сколько было 4?")
        var ch = readLine()!!.toInt()

        println("Сколько было 3?")
        var tr = readLine()!!.toInt()

        println("Сколько было 2?")
        var dv = readLine()!!.toInt()

        var result = (dv + tr +ch + p)
        println("в классе училось $result детей")

    }catch (e:Exception){
        println("Символ не верный")
    }
}