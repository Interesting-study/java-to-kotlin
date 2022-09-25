package lec16

import com.lannstark.lec16.Person

fun main(){
    val str = "ABC"
    println(str.lastChar())

    val person = Person("A", "B", 27)
    person.nextYearage()
}

fun String.lastChar(): Char{
    return this[this.length - 1]
}

fun Person.nextYearage(): Int{
    println("확장 함수")
    return this.age + 1
}