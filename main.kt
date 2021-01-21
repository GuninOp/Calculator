package demo
import java.util.Scanner

fun main(args: Array<String>){
    while (true) {
        val reader = Scanner(System.`in`)
        println("Enter 1st number")
        val num1: Int = reader.nextInt()
        println("Enter 2nd number")
        val num2: Int = reader.nextInt()
        println("Enter a Maths operator")
        val sign = readLine()

        if (sign == "+") {
            println(num1 + num2)
            continue
        }

        else if (sign == "-") {
            println(num1 - num2)
            continue
        }

        else if (sign == "*") {
            println(num1 * num2)
            continue
        }

        else if (sign == "/") {
            println(num1 / num2)
            continue
        }

        else if (sign == "remain") {
            println(num1 % num2)
            continue
        }
    }

}
