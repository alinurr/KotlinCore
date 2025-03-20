package src

open class BaseAd (
    open val model: String,
    open var year: Int
){
    open val city: String = "Almaty"
    open val specialNote: String = "..."

    open fun getInfo(): String{
        return "BaseAd(model=$model, year=$year, city=$city)"
    }
}