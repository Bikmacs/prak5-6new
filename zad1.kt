fun main() {
    try {
        val a = 2
        val b = 10
        val n = 10

        val commonDifference = (b - a) / 4
        val a5 = b + (n - 1) * commonDifference

        val sumOfNTerms = n * (b + a5) / 2

        println("Член прогрессии с номером $n: $a5")
        println("Сумма $n членов прогрессии: $sumOfNTerms")
    }catch (e:Exception){
        println("Символ не верный")
    }

}