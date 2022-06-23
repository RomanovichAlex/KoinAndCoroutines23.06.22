package by.romanovich.koinandcoroutines230622

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModel
import org.koin.android.ext.android.getKoin
import org.koin.android.ext.android.inject
import org.koin.androidx.viewmodel.ext.android.viewModel
import org.koin.core.parameter.parametersOf
import org.koin.core.qualifier.named
import java.lang.Exception


class MainActivity : AppCompatActivity() {

   /* //4. инжектим в поле
    private val repo: Repo by inject(named("RepoB"))
    private val someClass: SomeClass by inject()
   // private val someClassWithConstructor: SomeClassWithConstructor by inject { parametersOf("!!!!") }
   private val vm: VM by viewModel()*/

    private val someClassAndroid: SomeClassAndroid by inject()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        someClassAndroid.print()

        /*vm.doVM()

        //someClassWithConstructor.emitData()
        try {
            getKoin().get<SomeClassWithConstructor>{
                parametersOf(1)
            }
        }catch (e: Exception){
            println("VVV $e")
        }
*/
    }
}