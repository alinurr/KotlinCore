package src

open class CarAd (
    model: String,
    year: Int,
    var price: Int
) : BaseAd(model, year) {

    override var city: String = super.city
        set(value) {
            field = if (value.isBlank()) "Unknown" else value
        }

    override fun getInfo(): String {
        val base = super.getInfo()
        return "$base, price = $price"
    }
}