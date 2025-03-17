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
    var modelInput = readLine()
    if (modelInput.equals("")){
        modelInput = "Неизвестная модель"
    }

    print("Введите цену автомобиля (тенге): ")
    var priceString = readLine()
    if (priceString.equals("")){
        priceString = "0"
    }
    val price = priceString?.toInt()

    print("Введите год выпуска автомобиля: ")
    var yearString = readLine()
    if (yearString.equals("")){
        yearString = "2000"
    }
    val year = yearString?.toInt()

    println("Вы разместили объявление: ")

    val text = """
    |-------------------------
    |Модель: $modelInput
    |Цена: $price $CURRENCY
    |Год: $year
    """.trimMargin()
    println(text)

}
