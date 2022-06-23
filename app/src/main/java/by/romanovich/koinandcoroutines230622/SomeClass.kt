package by.romanovich.koinandcoroutines230622

class SomeClass(private val repo:Repo) {
    fun print() {
        println("VVV ${repo.print()}")
    }

}