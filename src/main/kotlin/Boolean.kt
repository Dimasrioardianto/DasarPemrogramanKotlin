fun main(args: Array<String>) {
    var varBool: Boolean = true
    if (varBool)
        println("varBool bernilai " + varBool)

    var varInt :Int = 1
    if(varInt != 0) //kondisi if harusnya memiliki tipe bolean karena varInt adalah Int jadi saya menambahkan kondisi seperti varInt !=0
        println("varInt bernilai "+varInt )
}