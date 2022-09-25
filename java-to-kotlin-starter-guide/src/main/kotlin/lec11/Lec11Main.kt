package lec11

fun isDirectoryPath(path: String): Boolean{
    return path.endsWith("/")
}

class Car(
    val name: String,
    val owner: String,
    _price: Int
){
    var price = _price
}