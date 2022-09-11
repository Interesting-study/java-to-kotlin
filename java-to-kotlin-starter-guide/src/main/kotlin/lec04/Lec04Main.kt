package lec04

import com.lannstark.lec04.JavaMoney

fun main(){
    val money1 = JavaMoney(1_000L)
    val money2 = money1
    val money3 = JavaMoney(1_000L)

    /*if (money1 > money2){ // > 을 호출하면 compare to를 자동으로 호출해준다
       println("Money1이 Money2보다 금액이 큽니다")
    }*/
    /*
    java - 동일성 == 동등성 equals
    kotlin - 동일성 === 동등성 ==(equals)
    * */

    println(money1 == money3) // 값이 같은지
    println(money1 === money2) // 주소가 같은지

    if (fun1() || fun2()){
        println("본문") // lazy 연산 뒤에 fun2를 확인할 필요가 없다
    }

    val money4 = Money(1_000L)
    val money5 = Money(2_000L)
    println(money1 + money2)
}

fun fun1(): Boolean{
    println("fun 1")

    return true
}

fun fun2(): Boolean{
    println("fun 2")

    return false
}