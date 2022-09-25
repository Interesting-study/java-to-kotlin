package lec14

fun main(){
    val dto1 = PersonDto("otter1", 26)
    val dto2 = PersonDto("otter2", 27)

    println(dto1 == dto2)
}


data class PersonDto(
    val name: String,
    val age: Int
)