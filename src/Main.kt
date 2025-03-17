package src

const val APP_VERSION = "1.0"
const val CURRENCY = "KZT"

fun main(){
    println("Добро пожаловать в KolesaMini")
    //const val APP_MODEL = 0;

    val serviceName = "Kolesa Mini"
    var currentUser = "Guest"
    var carPrice = 3_000_000
    val carModel = "Toyota Camry"


    println("Текущий пользователь: $currentUser")
    println("Автомобиль по умолчанию: $carModel, цена: $carPrice $CURRENCY")

    currentUser = "dealer_ivan"
    println("Теперь ползователь $currentUser")

    //carModel = "Toyota Carina"

    print("Введите модель автомобиля: ")
    val modelInput = readLine() ?: "Неизвестная модель"

}
