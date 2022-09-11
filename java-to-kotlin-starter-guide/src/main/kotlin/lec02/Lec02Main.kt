package lec02

import com.lannstark.lec02.Person


fun main(){
    var str: String? = "ABC"
    //println(str.length)
    println(str?.length ?: 0) // safe call + Elvis 연산자
    // ?: 앞에 있는게 null이면 이 뒤에 있는 값으로 보여준다

    val person = Person("공부하는 개발자")
    startsWithA5(person.name)
    /*
    1. 자바의 person이 @Nullable일 경우
    startsWithA5(person.name)는 에러가 난다. null이 들어올 수 없다고 선언했으므로

     2.@NotNull 어노테이션으로 교체한다.
     */
}

fun startsWithA1(str: String?): Boolean{
    return str?.startsWith("A")
        ?: throw IllegalArgumentException("null이 들어왔습니다")

   /* if (str == null){
        throw IllegalArgumentException("null이 들어왔습니다")
    }

    return str.startsWith("A")*/
}

fun startsWithA2(str: String?): Boolean?{
    return str?.startsWith("A")

    /*if (str == null){
        return null
    }
    return str.startsWith("A")*/
}

fun startsWithA3(str: String?): Boolean{
    return str?.startsWith("A") ?: false

    /*if (str == null){
        return false
    }
    return str.startsWith("A")*/
}

fun startsWithA4(str : String?): Boolean{
    return str!!.startsWith("A")
    //들어올 땐 null일 수 있지만, null이 아니라고 단언할 때
}

fun startsWithA5(str: String): Boolean{
    return str.startsWith("A")
}