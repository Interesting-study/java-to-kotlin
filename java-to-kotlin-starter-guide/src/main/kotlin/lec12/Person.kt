package lec12

fun main(){
    println(Singleton.a)
    Singleton.a += 10
    println(Singleton.a)
}

class Person private constructor(
    var name: String,
    var age: Int
){
    /*companion object Factory : Log{ //static 대신 companion object
        val MIN_AGE = 1 //val은 런타임시, const는 컴파일시에 변수가 할당
        fun newBaby(name: String): Person{
            return Person(name, MIN_AGE)
        }

        override fun log() {
            println("나는 Person 클래스의 동행객체 Factory예요")
        }
    }*/


    companion object{ //static 대신 companion object
        val MIN_AGE = 1 //val은 런타임시, const는 컴파일시에 변수가 할당

        @JvmStatic
        fun newBaby(name: String): Person{
            return Person(name, MIN_AGE)
        }
    } //기본이름은 companion

}

object Singleton {
    var a: Int = 0
}