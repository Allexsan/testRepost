fun main() {
    println("Введите радиус окружности")
    var R = readLine().toString()
    val L = 2 * 3.14 * R.toInt()
    val S = 3.14 * R.toInt() * R.toInt()
    println(L)
    println(S)
}