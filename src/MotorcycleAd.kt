package src

open class MotorcycleAd(
    model: String,
    year: Int,
    city: String,
    val engineVolume: Int
) : BaseAd(model, year, city){

    init {
        if (this.year >= 1980){
            println("MotorAd init: год больше 1980 => ставим 1980")
            this.year = 1980
        }
    }

    constructor(model: String) : this(model, 2021, "Kokshetau",500, ){
        println("Вторичный конcтруктор MotorAd (model=$model, year=2021, engineVolume=500)")
    }

    override var city: String = super.city
        get() {//field - это специальное скрытое свойство, которое хранит текущее значение.
            return field
        }
        set(value) {
            field = value
        }

    override fun getInfo(): String {
        return super.getInfo() + ", engineVolume=$engineVolume"
    }
}