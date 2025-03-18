package src

const val APP_VERSION = "1.0"
const val CURRENCY = "KZT"

fun main() {
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

//    print("Сколько хотите ввести объявлений? ")
//    val adCount = readLine()?.toInt()
//
//    for (i in 1..adCount!!){
//        print("Введите модель автомобиля: ")
//        val modelInput = getModelInfo()
//
//        print("Введите цену автомобиля (тенге): ")
//        val price = getPriceInfo()
//
//        print("Введите год выпуска автомобиля: ")
//        val year = getYearInfo()
//
//        println("Вы разместили объявление: ")
//        printFullCarInfo(modelInput, price, year)
//    }
//    var adNum = 0;
//    while (true) {
//        print("Введите 0 для вызова или 1 для выхода: ")
//        var userEnter = readLine()?.toInt()
//
//        if (userEnter == 1) {
//            break
//        }
//        print("Введите модель автомобиля: ")
//        val modelInput = getModelInfo()
//
//        print("Введите цену автомобиля (тенге): ")
//        val price = getPriceInfo()
//
//        print("Введите год выпуска автомобиля: ")
//        val year = getYearInfo()
//
//        adNum++
//        println("Вы разместили объявление #$adNum: ")
//        printFullCarInfo(modelInput, price, year)
//    }
    val carInfo = getCarInfo()
    print(carInfo)
}

fun getModelInfo(): String? {
    var modelInput = readLine()
    if (modelInput.equals("")) {
        modelInput = "Неизвестная модель"
    }
    return modelInput
}

fun getPriceInfo(): Int? {
    var priceString = readLine()
    if (priceString.equals("")) {
        priceString = "0"
    }
    val price = priceString?.toInt()

    return price
}

fun getYearInfo(): Int? {
    var yearString = readLine()
    if (yearString.equals("")) {
        yearString = "Неизвестный год"
    }
    val year = yearString?.toInt()
    return year
}

fun getCarInfo(): String {
    print("Введите модель автомобиля: ")
    val model = readlnOrNull() ?: "Неизвестная модель"

    print("Введите цену автомобиля: ")
    val priceInput = readLine()
    val price = priceInput!!.toInt()

//    if (price < 0) {
//        println("Цена не может быть отрицательной! Сбросим в 0.")
//        return "Модель = $model, Цена = 0 $CURRENCY"
//    } else if (price > 10_000_000) {
//        println("Очень высокая цена! Вы уверены?")
//    }
    val priceException = when {
        price < 0 -> {
            println("Цена не может быть отрицательной! Сбросим в 0.")
            0
        }
        price > 10_000_000 -> {
            "Очень высокая цена! Вы уверены?"
        }
        else -> "Цена подходящая"
    }

//    if (model.equals("Lexus", ignoreCase = true) && price < 5_000_000) {
//        println("Для Lexus обычно ожидается цена от 5_000_000!")
//    }
//    return "Модель = $model, Цена = $price $CURRENCY"

    val priceAndModelException = when{
        model.equals("Lexus", ignoreCase = true) && price < 5_000_000 -> println("Для Lexus обычно ожидается цена от 5_000_000!")
        model.equals("VAZ", ignoreCase = true) && price > 2_000_000 -> println("Для VAZ обычно ожидается цена ниже 2_000_000!")
        else -> "Все правильно"
    }
    return "Модель = $model, Цена = $price $CURRENCY"
}


fun printFullCarInfo(modelInput: String?, price: Int?, year: Int?) {
    val text = """
    |-------------------------
    |Модель: $modelInput
    |Цена: $price $CURRENCY
    |Год: $year
    """.trimMargin()
    println(text)
}
