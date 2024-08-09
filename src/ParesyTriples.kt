
/*
fun main() {


//Creando un par

    val equipment = "fish net" to "catching fish"
    println("${equipment.first} used for ${equipment.second}")

//Creando un triple

    val numbers = Triple(6, 9, 42)
    println(numbers.toString())
    println(numbers.toList())

//Creando un par donde la primera parte del par sea en si misma un par

    val equipment2 = ("fish net" to "catching fish") to "equipment"
    println("${equipment2.first} is ${equipment2.second}")
    println("${equipment2.first.second}")


    //Paso 2: Desestructurar algunos pares y triples

//Desestructurando un par
    val equipment = "fish net" to "catching fish"
    val (tool, use) = equipment
    println("$tool is used for $use")

//Desestructurando un triple

    val numbers = Triple(6, 9, 42)
    val (n1, n2, n3) = numbers
    println("$n1 $n2 $n3")



// Creando una lista de números y sumando los elementos
    val list = listOf(1, 5, 3, 4)
    println(list.sum())

// Creando una lista de cadenas y sumando la longitud de cada cadena
    val list2 = listOf("a", "bbb", "cc")
    println(list2.sumBy { it.length })

// Usando listIterator para recorrer la lista
    for (s in list2.listIterator()) {
        println("$s ")
    }


    //Map hash

//Creando el Mapa hash con enfermedades.
    val cures = hashMapOf("white spots" to "Ich", "red sores" to "hole disease")
//imprimiendo los valores
    println(cures.get("white spots")) //ich
    println(cures["red sores"]) //hole disease

//imprimiendo vales que no existen
    println(cures["scale loss"]) //null

//mensaje especial en lugar de null
    println(cures.getOrDefault("bloating", "Lo siento, no lo se"))

    println(cures.getOrElse("bloating") { "No cure for this" })


    //Mapa mutable

    val inventory = mutableMapOf("fish net" to 1)
//agregando tres depuradores de tanque
    inventory.put("tank scrubber", 3)
    println(inventory.toString())
//quitando la red de pesca
    inventory.remove("fish net")
    println(inventory.toString())



   //Estudiar constantes

    // Usando const val
    println(rocks)

    // Usando val con una función
    val value1 = complexFunctionCall()
    println(value1)

    // Usando la constante del objeto singleton
    val foo = Constants.CONSTANT2
    println(foo)

    // Usando la constante del objeto vomplementario
    println(MyClass.CONSTANT3)

    println("Does it have spaces?".hasSpaces())
}
*/



/*

    //Estudiar constantes
//Creando una constante fuera de la funcion main
const val rocks = 3

// objeto singleton
object Constants {
    const val CONSTANT2 = "object constant"
}

//definiendo un objeto complementario
class MyClass {
    companion object {
        const val CONSTANT3 = "constant in companion"
    }
}

fun complexFunctionCall(): String {
    return "Result from complex function"
}
*/


    //Escribir extensiones (EN REPL)

//funcion de extension

fun String.hasSpaces() = find { it == ' ' } != null


//para imprimir
fun main(){
    //imprimiendo 'funcion de extension'
//println("Does it have spaces?".hasSpaces())

    /*
    //imprimiendo la open class AquariumPlant
    val plant = GreenLeafyPlant(size = 10)
    plant.print()
    println("\n")
    val aquariumPlant: AquariumPlant = plant
    aquariumPlant.print()  // what will it print?
     */


    //Imprimiendo propiedad de extension
    println(aquariumPlant.isGreen)
}

/*
//limitaciones de las extensiones
class AquariumPlant(val color: String, private val size: Int)

fun AquariumPlant.isRed() = color == "red"    // OK
fun AquariumPlant.isBig() = size > 50         // gives error
*/


open class AquariumPlant(val color: String, private val size: Int)

/*
class GreenLeafyPlant(size: Int) : AquariumPlant("green", size)
fun AquariumPlant.print() = println("AquariumPlant")
fun GreenLeafyPlant.print() = println("GreenLeafyPlant")

*/

//Agregar una propiedad de extension
val aquariumPlant = AquariumPlant("green", 50)
val AquariumPlant.isGreen: Boolean
    get() = color == "green"








