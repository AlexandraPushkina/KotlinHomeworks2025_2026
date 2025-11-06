package homework5

//Шаблон для любого ссылочного типа (массив)
fun <T> swapElements(array: MutableList<T>, element1: T, element2: T){
    val index1 = array.indexOf(element1)
    val index2 = array.indexOf(element2)

    if (index1 == index2)
        println("Элементы имеют одинаковые значения. Менять их местами не требуется")

    if (index1 == -1 || index2 == -1)
        throw Exception("Введено значение, отсутствующее в массиве")
    val temp:T = array[index1]
    array[index1] = array[index2]
    array[index2] = temp
}

fun main() {
    val animals = mutableListOf("Попугай", "Жаба", "Бабочка", "Жираф", "Дельфин")
    println("Массив до смены")
    animals.forEach {
        print("$it ")
    }
    swapElements(animals, "Жаба", "Дельфин")
    println("\nМассив после смены")
    animals.forEach {
        print("$it ")
    }
    swapElements(animals, "Жираф", "Попугай")
    println("\nМассив после смены")
    animals.forEach {
        print("$it ")
    }
}