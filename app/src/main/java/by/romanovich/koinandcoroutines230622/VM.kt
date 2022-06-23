package by.romanovich.koinandcoroutines230622

import androidx.lifecycle.ViewModel


class VM(val repo: Repo): ViewModel() {
    fun doVM(){
        repo.print()
    }
}