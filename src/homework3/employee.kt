package homework3



//Создайте класс Employee с полями: фамилия, имя, отчество, должность, электронный адрес, номер телефона, заработная плата и возраст. Конструктор класса должен заполнять эти поля при создании объекта.
// Добавьте вторичный конструктор, куда можно добавлять без зарплаты сотрудников, которые проходят испытательный срок.
// Добавьте метод, который выводит информацию о сотруднике красивым образом, например:
//
//
//ФИО: Петров Алексей Иванович
//
//Должность: Менеджер
//
//Email: petrov@example.ru
//
//Телефон: +7 (999) 123-45-67
//
//Зарплата: 60000 руб.
//
//Возраст: 35 лет
//
//
//Создайте массив из пяти сотрудников и с помощью цикла foreach выведите информацию только о сотрудниках старше 40 лет.


class employee(val secondName:String,val name:String,val surname: String,
               var position: String,var email: String,var number: UInt,
               var salary: Int = 0,var age: Int) {  // Используем значение по умолчанию
    fun showInfo(){
        println("ФИО: $secondName $name $surname" +
                "\nДолжность: $position" +
                "\nEmail: $email" +
                "\nТелефон: $number" +
                "\nЗарплата: $salary" +
                "\nВозраст: $age" +
                "\n-------------------------------------")
    }

}

fun main(){
    var employees = mutableListOf<employee>() //Создаем изменяющийся список сотрудников

    val Anton = employee(
        "Антон", "Шилов", "Дмитриевич",
        "Менеджер по продажам", "anton.s@autoparts.com",
        8932786U, 59000, 29)

    val Katya = employee(
        "Екатерина", "Зубарева", "Сергеевна",
        "Королева Запчастей", "katya.z@autoparts.com",
        8915345U, 82000, 38
    )
    employees.add(Katya)

    val Egor = employee(
        "Егор", "Волков", "Игоревич",
        "Гуру Гаечного Ключа", "egor.v@autoparts.com",
        8903111U, 55000, 42
    )
    employees.add(Egor)

    val Alexandra = employee(
        "Александра", "Пушкина", "Викторовна",
        "Финансовый Страж", "alexandra.c@autoparts.com",
        8926777U, 65000, 25
    )
    employees.add(Alexandra)

    val Karen = employee(
        "Карен", "Петросян", "Ашотович",
        "Технический Гений", "karen.p@autoparts.com",
        8909001U, 170000, 30
    )
    employees.add(Karen)

    employees.forEach{
        it.showInfo()
    }
}