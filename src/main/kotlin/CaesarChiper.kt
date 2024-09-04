//program ini mengenskripsi utk input text string yg diberikan ke karakter yang dinaikan/diturunkan
fun main(args: Array<String>){
    val s = "blackholesarewheregoddividedbyzero"
    println("Original message: $s")
    var message = ""
    var shift = 1

    for (c in s){
        var i = c.toInt()
        i += shift
        if(i> 'z'.toInt()){
            i-= 26
        }
        val char = i.toChar()
        message +=char
    }
    println("Encrypted message: $message")
}