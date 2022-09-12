package lec05

fun main(){

}
fun judgeNumber2(number: Int){
    when{
        number == 0 -> println("주어진 숫자는 0입니다")
        number %2 == 0  -> println("주어진 숫자는 짝수입니다")
        else -> println("주어진 숫자는 홀수입니다")
    }
}

fun judgeNumber(number: Int){
   when(number){
       1, 0, -1 -> println("어디서 많이 본 숫자입니다.")
       else -> println("1, 0, -1 이 아닙니다.")
   }
}

fun validateScoreIsNotNeagtive(score: Int){
//    if (score < 0){
    if (score !in 0..100){
        throw IllegalArgumentException("score의 범위는 0부터 100까지 입니다.")
    }
}

fun getPassOrFail(score: Int): String{
    /* java에서 if는 statement 하나의 값으로 도출되지 않는다.
        kotlin에서 if는 expression 하나의 값으로 도출된다.
        3항 연산자가 존재하지 않는 이유
    */
/*
    if (score >= 50){
        return "P"
    } else{
        return "F"
    }*/
     return if (score >= 50){
        "P"
    } else{
        "F"
    }
}

fun startsWithA(obj:Any): Boolean {
    return  when(obj){
        is String -> obj.startsWith("A")
        else -> false
    }
}

fun getGradeWithSwitch(score: Int): String{
    //when도 expression 이다.
    return when (score / 10){     //when(score)
        9 -> "A" //  in 90.00 -> "A"
        8 -> "B"
        7 -> "C"
        else -> "D"
    }
}