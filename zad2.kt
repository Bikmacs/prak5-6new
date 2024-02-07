fun main(){
    try {
        println("введите трехзначное число")
        var number = readLine()!!.toInt()

        var num1 = number / 100
        var num2 = (number % 100) / 10
        var num3 = number % 10

        var result = (num1 + num2 + num3)
        var multiplication =  (num1 * num2* num3)
        println("результат при сложение = $result")
        println("результат при умножение = $multiplication")

    }catch (e:Exception){
        println("не верно")
    }
}