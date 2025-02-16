fun main() {

    var myBook = Book("The black Tulip","Alexandre Dumas", 1850, "Novel")

    println(myBook.getBookInfo())
    /* part 2
    myBook.author = "Alexandre Dumas"
    myBook.title = "The black Tulip"
    myBook.yearPublished = 1850
     */
}

class Book(var title: String, var author: String, var yearPublished: Int = 0, var genre: String){

    /* part 1
    var title: String = ""
    var author: String = ""
    var yearPublished: Int = 0
    */

    fun getBookInfo(){
        println("$title by $author ($yearPublished) - Genre: $genre")
    }
}