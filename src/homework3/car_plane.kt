package homework3

class Car(val name:String) {                    //Другая реализация конструктора в параметрах самого класса
    companion object {                          //Реализация статического поля
        private var instanceCount = 0           //Изначально количество машин = 0
        fun getInstanceCount():Int {            //Посмотреть, сколько машин
            return instanceCount
        }
    }

    init{                                   //Конструктор, увеличивающий кол-во машин
        instanceCount++
    }

    fun loadCargo(cargoInput: Int){
        if (cargoInput !in 1..5){
            println("Допустимый вес для автомобиля от 1 до 5 тонн")
            return
        }
        println("В $name загрузули $cargoInput тонн")
    }
    fun drive(distance: Int){
        if (distance !in 1..500){
            println("Допустимое расстояние для проезда: от 1 до 500 км.")
            return
        }
        println("$name проехало $distance км.")
    }
}

class Plane(val name:String){
    companion object {
        private var instanceCount = 0
        fun getInstanceCount():Int {
            return instanceCount
        }
        init{
            instanceCount++
        }
    }

    fun loadCargo(cargoInput: Int){
        if (cargoInput !in 1..100){
           println("Допустимый вес для самолёта от 1 до 100 тонн")
            return
        }
        println("В $name загрузули $cargoInput тонн")
    }
    fun fly(distance: Int){
        if (distance !in 1..10000){
            println("Допустимое расстояние для пролета: от 1 до 10000 км.")
            return
        }
        println("$name пролетело $distance км.")
    }
}

fun main(){

    val a6733 = Plane("A6733")
    a6733.loadCargo(300)
    a6733.fly(980)

    val camry = Car("Camry")
    camry.loadCargo(1)
    camry.drive(60)

    val tank = Car("Tank")
    tank.loadCargo(90)
    tank.drive(43)

    val bmw = Car("BMW")
    bmw.loadCargo(5)
    bmw.drive(15)

    println("Всего самолетов: ${Plane.getInstanceCount()}")
    println("Всего машин: ${Car.getInstanceCount()}")
}