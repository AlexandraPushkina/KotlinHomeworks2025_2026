package homework4

class Book(var title: String = "", var author: String = "", var rating: Float = 0f) {
}

fun main(){
    val library = mutableListOf<Book>()
    var isContinue = 1
    //Изначальная коллекция книг!!
    library.add(Book().apply {
        title = "Ее величество кошка"
        author = "B. Verber"
        rating = 3.4f
    })

    library.add(Book().apply {
        title = "The Mermaids"
        author = "V. Edrik"
        rating = 4.1f
    })

    library.add(Book().apply {
        title = "Франция"
        author = "L. Jones"
        rating = 4.9f
    })

    while (isContinue == 1){
        println("\nЧто желаете?\n" +
                "1. Добавление книги в библиотеку.\n" +
                "2. Удаление книги из библиотеки.\n" +
                "3. Поиск книги по названию.\n" +
                "4. Печать каталога всех книг.\n" +
                "5. Получение среднего рейтинга всех книг.\n" +
                "6. Выход")
        val chosenNumber:Int = readln().toInt()
        when (chosenNumber) {
            1 -> addBook(library)
            2 -> deleteBook(library)
            3 -> searchBook(library)
            4 -> showCatalog(library)
            5 -> println("Средний рейтинг всех книг ${averRating(library)}")
            6 -> isContinue = 0
        }
    }
}

fun addBook(library: MutableList<Book>){
    library.add(Book().apply {
        println("Введите название")
        title = readln()
        println("Введите автора")
        author = readln()
        println("Введите рейтинг")
        val enterRating:Float = readln().toFloat()
        if (enterRating in 1.0..5.0)
            rating = enterRating
    })
}

fun deleteBook(library: MutableList<Book>){
    println("Введите название\n")
    val searchTitle = readln()
    val removedBook = library.find { it.title == searchTitle }?.let {   //Создаем переменную "УдаленнаяКнига", которая ищет по введенному пользователем названию.
                                                                        // Далее найденная книга удаляется
        foundBook -> library.remove(foundBook)}?:false      //Если вернулось null, значит книга не была найдена и removedBook = false

    if (removedBook)
        println("Книга удалена")
    else
        println("Книга не обнаружена")

}

fun searchBook(library: MutableList<Book>){
    println("Введите название\n")
    val searchTitle = readln()
    library.find { it.title == searchTitle }?.let{
        println("Автор $searchTitle - ${it.author}")
        println("Рейтинг $searchTitle - ${it.rating}")
    }
}

fun showCatalog(library: MutableList<Book>){
    library.forEach { it.run {
        println("Название: $title, Автор: $author, Рейтинг: $rating")
    } }
}

fun averRating(library: MutableList<Book>): Float{
    with(library){
        if (library.isNotEmpty()) {
            val total: Double = sumOf { it.rating.toDouble() }  //Для Float вызывает ошибку. Необходимо преобразовать в double
            return (total.toFloat() / library.size)
        }
        else
            return 0f
    }
}
