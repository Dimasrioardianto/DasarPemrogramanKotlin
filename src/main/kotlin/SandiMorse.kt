fun main(args: Array<String>){
   val s = ".. - .-.- ... --- -.- . .-. .. .-.-.."
   println("The original message: $s")

   //the string with the decoded message
   var message =""

   //array definitions
   val alphabetChars = "abcdefghijklmnopqrstuvwxyz"
   val morseChars = arrayOf(".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-",
      ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..")

   val characters =s.split("")

   for(morseChar in characters){
      val index = morseChars.indexOf(morseChar)

      if(index != -1){
         message += alphabetChars[index]
      }
   }
   println("The Decoded message: $message")
}