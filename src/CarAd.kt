package src

open class CarAd (
    model: String,
    year: Int,
    city: String
) : BaseAd(model, year, city) {

    override var year: Int = super.year
        set(value) {
            field = if (year >= 1990) value else 1990
        }

    init {
//        if (price < 0){
//            println("CarAd init: цена < 0 => ставим 0.")
//            price = 0
//        }
        if (this.year < 1990){
            println("CarAd init: год < 1990 => ставим 1990.")
            this.year = 1990
        }
    }

    var price: Int = 25
        set(value){
            field = if (price > 20) value else 20
        }

    constructor(model: String, city: String) : this(model, 2022, city){
        println("Вторичный конcтруктор CarAd (model=$model, year=2022, price=0)")
    }



    override var city: String = super.city
        set(value) {
            field = if (value.isBlank()) "Unknown" else value
        }

    override fun getInfo(): String {
        val base = super.getInfo()
        return "$base, price = $price"
    }
}