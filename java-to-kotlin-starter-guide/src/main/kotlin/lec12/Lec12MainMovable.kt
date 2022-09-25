package lec12

import com.lannstark.lec12.Movable

fun main(){
    moveSomethig(object : Movable{
        override fun move() {
            println("무브 무브")
        }

        override fun fly() {
            println("날다 날다")
        }
    })

}

private fun moveSomethig(movable: Movable){
    movable.move()
    movable.fly()
}