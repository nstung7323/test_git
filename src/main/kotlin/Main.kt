import java.lang.NumberFormatException
import java.math.BigInteger
import java.util.TreeMap
import javax.sql.rowset.Predicate

fun main(args: Array<String>) {
//    println(caculate(inver = 0.05, amount = 90))
//    var str = "4";
//    var personA = Person("Tung", 12)
//    personA.name = "I am "
//    personA.age = 10
//    var personB = Person()
//    personB.name = "Tung"
//    personB.age = 22
//    println((personA plus personB).name)
//    println(personA.name + " " + personA.age)
//    var human : Human? = Human()
//    human?.name = "TungNS"
    //human = null
    //println(human?.name!!.length)

//    var x = 1
//    val str = when (x) {
//        1 -> {
//            "One"
//            "Two"
//            x++
//        }
//        2 -> "Two"
//        3 -> "Three"
//        else -> "No match"
//    }
//    println(str)
//    println(x)
//    val numbers = 1 until 20
//    for (a in numbers.reversed()) {
//        println(a)
//    }
//    println(numbers.count())
//    var sum: Int = 0
//    val number = HashMap<String, Int>()
//    number["a"] = 1
//    number["b"] = 2
//    number["c"] = 3
//    number.forEach { (k, v) -> println("Key $k: $v") }

    var str = "5"
    var num: Int = try {
        str.toInt()
    } catch (e : NumberFormatException) {
        0
    }
    num++
    println(num)
}

@JvmOverloads
fun calculate(a: Int = 5, b : Double) : Int {
    return (a + b).toInt()
}

fun add(a : Int, b : Int) : Int = a + b

fun max(a: Int, b: Int) : Int = if(a > b)  a else b

@JvmOverloads
fun caculate(amount: Int, inver: Double = 0.03) : Int = (amount + amount * inver).toInt()

infix fun Person.plus (person : Person) : Person {
    var newPerson = Person()
    newPerson.name = this.name + person.name
    return newPerson
}

tailrec fun fact(value: BigInteger, result: BigInteger = BigInteger.ONE) : BigInteger {
    if (value == BigInteger.ZERO) {
        return result
    }
    else {
        return fact(value - BigInteger.ONE, value * result)
    }
}

fun abc() {

}

fun commit2() {

}

fun test() {

}

fun fix() {

}