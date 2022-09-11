package lec01

import com.lannstark.lec01.Person

fun main(){
    var number1 = 10L
    // var number: Long = 10L

    val number2 = 10L
   // 코드를 클린하게 만들기 위해 모든 변수를 불변으로 만들고 변경한다.
    // 최초 한 번 초기화 되지 않은 변수에 한해 값을 변경할 수 있다

    //var number3= 1_000L;
    //boxing과 unboxing을 알아서 해준다

    var number3: Long? = 1000L
    number3 = null
    //null이 변수에 들어갈 수 있다면 타입?을 사용해야한다.

    var person = Person("otter") //객체의 인스턴스화

}
