package lec13

class House(
    private var address: String,
    private var liviRoom: LivingRoom = LivingRoom(10.0)
){
    /*inner class LivingRoom(
        var area: Double
    ){
        val address: String
        get() = this@House.address
    } 권장되지 않는 내부 클래스 작성성    */

    class LivingRoom(
        var area: Double
    )
}