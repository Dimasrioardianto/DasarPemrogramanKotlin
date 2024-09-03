fun main(args: Array<String>){
    val valInt: Int = 1
    val valSum: Long = 3L + valInt // konversi implisit
    println("Konversi Variabel valInt secara implisit: "+valSum)
    val valLong: Long = valInt.toLong()
    println("Konversi variabel valInt secara ekslisit: "+valLong)
}