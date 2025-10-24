class Person (name: String = "Tung"){
    var name: String = name
    var age: Int = 0

    init {
        println("This person created")
        this.age = age
    }

    constructor(name: String, age: Int) : this(name) {
        this.age = age
    }


    operator fun inc(age: Int) : Person {
        this.age++
        return this
    }

    operator fun String.compareTo(other: String): Int {
        return this.length - other.length
    }
}