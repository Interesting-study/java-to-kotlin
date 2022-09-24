package lec10

fun main(){

}

open class Base(
    open val number: Int = 100
) {
    init{
        println("Base Class")
        println(number)
    }
}

class Derived(
    override val number: Int
) : Base(number){
    init{
        println("Derived Class")
    }
}