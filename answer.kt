fun main(args: Array<String>) {
    var n: Int = Integer.parseInt(readLine())
    
    for (j in 1..n) {
        var nArray: Array<String> = arrayOf()
        
        if (j == 1) {
            var space: String = ""
            repeat(n - 1) {
                space += " "
            }
            println(space + j)
            continue
        }
        else {
            for (i in 1..j){
                nArray = nArray.plus(i.toString())
            }
            
            var nArray2: Array<String> = nArray.copyOfRange(0, j - 1)
            nArray2.reverse()
            
            nArray = nArray + nArray2
        }
        var space: String = ""
        repeat(n - j){
            space += " "
        }
        println(space + nArray.joinToString(""))
    }
}
