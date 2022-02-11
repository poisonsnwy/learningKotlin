fun main() {
    val x = readLine()
    x?.let{
        val y = x.length / 2 - 1

        var i = 0
        while (i <= y) {
            print(x[i])
            i++
        }
    }
}