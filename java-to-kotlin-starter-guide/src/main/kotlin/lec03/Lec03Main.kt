package lec03

import com.lannstark.lec03.Person

fun main(){
/* kotlin의 명시적 변환
    val number1 = 3
    val number2: Long = number1.toLong()

    val number1: Int? = 3
    val number2: Long = number1?.toLong() ?: 0L
*/
    val person = Person("otter", 100)
    val name = "otter"

    printAgeIfPerson(person)
    println("이름 : ${person.name}")
    println("이름 : $name")
    //${변수} 형태를 추천한다

    val str = """
        ABC
        EFG
        ${name}
    """.trimIndent()
    println(str)

    val str2 = "ABC"
    println(str2[0])
}

fun printAgeIfPerson(obj: Any?){
    /*if (obj is Person){ // is -> instanceof, !is not is
        val person = obj
        println(person.age)
    }*/
    val person = obj as? Person
    println(person?.age)
    /*
    * 1. value is type
      type 이면 true, 아니면 false

      2. value !is type
      type이면 false, 아니면 true

      3. value as type
      type이면 type으로 타입 캐스팅, 아니면 ClassCastExcetption 발생

      4. value as? type
      type이면 type으로 타입 캐스팅, null이면 null, type이 아니면 null
    * */
}