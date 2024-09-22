import java.util.Objects

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    println("Задание 1")
    print("Введите текст: ")
    val str = readln()
    str?.let { println("Текст: $it, Длинна строки: ${it.length}") }

    println("Задание 2")
    val city = City()
    city.setTitle("Москва")
    city.setPoppulation(10000000)
    println("Название города -  ${city.title}, Численность - ${city.populatiom}")

    println("Задание 3")
    val arr = arrayOf((1..15).random(), (1..15).random(),(1..15).random(), (1..15).random(), (1..15).random())
    val arrInf = with(arr){
        var elements = ""
        forEach { elements += "$it " }
        var sum = 0
        forEach { sum += it }

        ArrIntInf(size, sum, elements)
    }
    println("Элементы: ${arrInf.elements}, Кол-во: ${arrInf.size}, Сумма: ${arrInf.sum}")
}

data class ArrIntInf(val size:Int, val sum:Int, val elements:String)