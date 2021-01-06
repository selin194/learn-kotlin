import learnkotlin5.PublicClass
// This import will give it is internal - make it public error!
//import com.udemy.com.udemy.learnkotlin5.learnkotlin5.internalString
import learnkotlin5.publicString

fun main() {
    // We can call public classes or variables from another module
    println("${PublicClass()} called from another module - test-module-for-access-modifiers")
    println("${publicString} called from another module - test-module-for-access-modifiers")

    // We can not call internal or private visibility classes or variables from another module!
    // All the below lines will give compile error.
    // println("${InternalClass()}")
    // println("${PrivateClass()}")
    // println("$privateString")
    // println("$internalString")
}