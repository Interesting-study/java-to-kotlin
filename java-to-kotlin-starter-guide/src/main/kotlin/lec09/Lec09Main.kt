package lec09

fun main(){
    val person = Person("otter", 27)
    println(person.name)
    println(person.age)
}


//기본이 public, constructor 생략 가능
//디폴트 파라미터를 더 추천함, 그럼에도 사용해야한다면 정적 팩토리 메소드 패턴
class Person(
    val name: String = "default otter",
    /*
    * custom getter
    * name: String = "default otter",
    * */
    var age: Int = 1
) {

   /* custom getter
   val name = name
        get() = field.uppercase()

    예약어 field = backing field
    */

    /*fun getUppercaseName(): String = return this.name.uppercase()

    val uppercaseName: String
        get() = this.name.uppercase()
    */



    init {
        if(age <= 0){
            throw IllegalArgumentException("나이는 ${age}일 수 없습니다")
        }
        println("초기화 블록")
    } //init 블록은 생성자가 호출도는 시점에서 호출됨, 값을 적절히 만들어주거나 validation 하는 용도

   /* 생성자는 디폴트 파라미터를 추천함
   constructor(name: String) : this(name, 1){
        println("첫 번째 부생성자")
    }

    constructor(): this("홍길동"){
        println("두 번쨰 부생성자")
    }*/
    //생성자 추가시 constructor 키워드 사용함, 부생성자는 body를 가질 수 있다

   /* fun isAdult(): Boolean{
        return this.age >= 20
    }
    아래와 동일한 방식이다. 아래는 프로퍼티로 만드는 법
    객체의 속성이라면 프로퍼티처럼
    */

    /*val isAdult: Boolean
        get() {
            return this.age >= 20
        }*/

    val isAdult: Boolean
        get() = this.age >= 20
}
/*
    * 프로퍼티 = 필드 + getter + setter
    * 코틀린에서는 필드만 만들면 getter, setter를 자동으로 만들어준다
 */