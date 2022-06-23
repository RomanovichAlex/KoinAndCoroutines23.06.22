package by.romanovich.koinandcoroutines230622.di

import by.romanovich.koinandcoroutines230622.*
import org.koin.android.ext.koin.androidApplication
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.qualifier.named
import org.koin.dsl.module

//1 создаем модуль
object Di {
    val mainModule = module {
        //
        single<Repo>(qualifier = named("RepoA")) { RepoA() }
        single<Repo>(qualifier = named("RepoB")) { RepoB() }
        single <SomeClassWithConstructor>{ (data:String) -> SomeClassWithConstructor(data)}
        single { SomeClass(repo = get(named("RepoB")))}
        viewModel{VM(repo = get(named("RepoB")))}
        single { SomeClassAndroid(context = androidApplication())}
    }

}