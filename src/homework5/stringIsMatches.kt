package homework5
import kotlin.text.Regex

//Применение regex
fun stringInput(stringByUser: String){
    val regExpr = Regex("^[a-zA-Zа-яА-ЯёЁ]+$")

    if (!stringByUser.matches(regExpr)){
        throw Exception("Строка '$stringByUser' не должна содержать числа или символы, " +
                "а должны быть только буквы (ru/eng)")
    }
    println("Строка соответсвует шаблону")
}

fun main() {
    stringInput("оыфвьыв")
    stringInput("324пваы")
    stringInput("(kNADM)")
    stringInput("о = в")
    stringInput("Ss")
    stringInput("Я")
}