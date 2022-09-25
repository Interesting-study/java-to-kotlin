package lec15

fun main(){
    val array = arrayOf(100, 200)
    for (i in array.indices){
        println("${i} ${array[i]}")
    }

    val numbers = listOf(100, 200)
    val numbers2 = mutableListOf(200, 300)
    numbers2.add(300)

    val emptyList = emptyList<Int>()

    println(numbers[0])

    for (number in numbers){
        println(number)
    }

    for ((idx, value) in numbers.withIndex()){
        println("$idx, $value")
    }
}