package by.romanovich.koinandcoroutines230622

//2 создаем зависимость
class RepoA: Repo {
    override fun print() {
        println("VVV $this")
    }
}