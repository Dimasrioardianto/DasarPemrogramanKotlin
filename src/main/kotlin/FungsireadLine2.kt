//program ini utk merubah nilai string yg dikembalikan oleh fungsi readline kedalam nilai yg diinginkan bisa dilakukan dgn menggunakan konversi secara eksplisit
fun main(args : Array<String>){
    //penguraian program pengganda
    println("Enter a number and I'II double it: ")
    val input = readLine()!!
    var a =input.toInt()
    a = a * 2
    println(a)

    println("Enter a number, and I'II square it: ")
    val number =readLine()!!.toInt()
    val square = number  * number
    println("Result: " + square)
}