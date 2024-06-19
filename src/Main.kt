import java.util.*

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val scanner = Scanner(System.`in`)
    val number = scanner.nextInt()
    var sum = 0
    var tempNumber = number

    while (tempNumber > 0) {
        val digit = tempNumber % 10

        sum += digit.toDouble().toInt()
        tempNumber /= 10

    }
    println("Sum of number = $sum")

}