fun main(args: Array<String>) {
    var charA: Char = 'A'
    //println(charA == 65) = 65 diganti A karena 65 Int & A char

    println(charA.isUpperCase())
    println(charA.isLowerCase())
    println(charA.isDigit())
    println(charA.toLowerCase())
    val strA: String =charA.toString()
    println("kini charA sudah menjadi String = "+strA)
}