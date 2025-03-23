package src

import sun.jvm.hotspot.oops.CellTypeState.value

open class CarAd (
    model: String,
    year: Int,
    var price: Int
) : BaseAd(model, year) {

    init {
        if (price < 0){
            println("CarAd init: цена < 0 => ставим 0.")
            price = 0
        }
//        if (this.year < 1990){
//            println("CarAd init: год < 1990 => ставим 1990.")
//            this.year = 1990
//        }
    }

    constructor(model: String) : this(model, 2022, 0){
        println("Вторичный контруктор CarAd (model=$model, year=2022, price=0)")
    }

    override var city: String = super.city
        set(value) {
            field = if (value.isBlank()) "Unknown" else value
        }

    override var year: Int = super.year
        set(value) {
            field = if (year >= 1990) value else 1990
        }

    override fun getInfo(): String {
        val base = super.getInfo()
        return "$base, price = $price"
    }
}