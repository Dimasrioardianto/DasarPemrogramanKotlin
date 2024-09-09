
//perintah masukkan dikotlin yaitu fungsi redline, perintah ini akan mengembalikan nilai string ke dlm variabel penampung
fun main(args :Array<String>){
    //program burung beo
    println("Hi i'm Lora, the vitual parrot, and i love to repeat!");
    println("Type something in: ");
    var input: String
    input = readLine()!!
    var output: String
    output = input + "," + input + "!"
    println(output)
}