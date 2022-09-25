package lec14

sealed class HyundaiCar(
    val name: String,
    val price: Long
)

class  Abanate : HyundaiCar("아반떼", 1_000L)
class  Sonata : HyundaiCar("소나타", 2_000L)
class  Grandeur : HyundaiCar("그랜져", 3_000L)

//추상화가 필요한 Entity or DTO에서 sealed class 활용