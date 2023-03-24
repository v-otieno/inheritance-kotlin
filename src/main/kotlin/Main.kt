fun main() {
    //INHERITANCE
    //call the property and function to the main function.
    val captain=Student()
    captain.name="Anitah"
    captain.age=20
    println("I am ${captain.name} and I am ${captain.age} years old")
    captain.intern()
    val principal=Teacher()
    principal.name="Mercy"
    principal.gender="Female"
    println("I am ${principal.name} and I am a ${principal.gender}")
    principal.teach()
}

class Student{
    var name:String=""
    var age:Int=20
    fun graduate(){
        println("graduation")
    }
    fun intern(){
        println("I am doing my internship at KEMRI")
    }
}
class Teacher{
    var name:String=""
    var gender:String=""
    fun graduate(){
        println("graduation")

    }
    fun teach(){
        println("I am teaching coding in kotlin")
    }
}