package by.romanovich.koinandcoroutines230622

//2 создаем зависимость
class RepoB: Repo {
    override fun print() {
        println("VVV $this")
    }
}