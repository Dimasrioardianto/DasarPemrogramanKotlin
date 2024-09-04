//program utk mencari huruf konsonan&huruf vokal
fun main(args:Array<String>){
    var s ="A programer gets stuck in the showe because the instructions on the shampoo were: Lather, Wash, and Repeat ."
    println(s)
    s= s.toLowerCase()

    var vowelCount = 0
    var consonantCount = 0

    val vowels = "aeiouy"
    val consonants = "bcdfghjklmnopqrstvwxyz"

    for(c in s)
        if(vowels.contains(c)){
            vowelCount++
        } else if (consonants.contains(c)){
            consonantCount++
        }

    println("Vowels: $vowelCount")
    println("Consonants: $consonantCount")
    println("Other characters: ${s.length - (vowelCount + consonantCount)}")
}