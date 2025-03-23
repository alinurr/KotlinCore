package src

open class MotorcycleAd(
    model: String,
    year: Int,
    val engineVolume: Int
) : BaseAd(model, year){

    override var city: String = super.city
        get() {
            return field
        }
        set(value) {
            field = value
        }

    override fun getInfo(): String {
        return super.getInfo() + ", engineVolume=$engineVolume"
    }
}