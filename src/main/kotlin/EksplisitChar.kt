fun main(args: Array<String>){
    var c: Char //character
    var i: Int

    c = 'a'
    i = c.toInt()
    println("The character $c was converted to its ASCII value of $i")

    //conversion from an ascii value to text
    i = 98
    c = i.toChar()
    println("The ASCII value of $i was converted its textual value of $c")
}