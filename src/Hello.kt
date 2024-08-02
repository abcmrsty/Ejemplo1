import java.util.*

//PRIMER CODELAB: KOTLIN BASICS

fun main(args: Array<String>) {
    println("Hello, ${args[0]}")

    val isUnit = println("This is an expression")
    println(isUnit)

    val temperature = 10
    val isHot = if (temperature > 50) true else false
    println(isHot)

    val message = "The water temperature is ${ if (temperature > 50) "too warm" else "OK" }."
    println(message)

    feedTheFish()

    //Llamando a la función swim() de tres maneras
    swim()   // usa la velocidad predeterminada
    swim("slow")   // argumento posicional
    swim(speed = "turtle-like")   // argumento nombrado


    // Llamando a la función mainFilters para ver los resultados
    mainFilters()

}

//SEGUNDO CODELAB: FUNCIONES

fun randomDay() : String {
    return "Thursday"
}

fun fishFood (day : String) : String {
    return when (day) {
        "Monday" -> "flakes"
        "Wednesday" -> "redworms"
        "Thursday" -> "granules"
        "Friday" -> "mosquitoes"
        "Sunday" -> "plankton"
        else -> "nothing"
    }
}

//fun feedTheFish() {
    //val day = randomDay()
    //val food = fishFood(day)
    //println ("Today is $day and the fish eat $food")
//}

fun feedTheFish() {
    val day = randomDay()
    val food = fishFood(day)
    println("Today is $day and the fish eat $food")
    println("Change water: ${shouldChangeWater(day)}")
}

fun swim(speed: String = "fast") {
    println("swimming $speed")
}

fun shouldChangeWater(day: String, temperature: Int = 22, dirty: Int = 20): Boolean {
    return when {
        isTooHot(temperature) -> true
        isDirty(dirty) -> true
        isSunday(day) -> true
        else -> false
    }
}

fun isTooHot(temperature: Int) = temperature > 30

fun isDirty(dirty: Int) = dirty > 30

fun isSunday(day: String) = day == "Sunday"

val decorations = listOf("rock", "pagoda", "plastic plant", "alligator", "flowerpot")

fun mainFilters() {
    println(decorations.filter { it[0] == 'p' })

    // Filtro ansioso
    val eager = decorations.filter { it[0] == 'p' }
    println("eager: $eager")

    // Filtro perezoso
    val filtered = decorations.asSequence().filter { it[0] == 'p' }
    println("filtered: $filtered")

    // Evaluación forzada de la secuencia
    val newList = filtered.toList()
    println("new list: $newList")

    // Visualización de la evaluación diferida
    val lazyMap = decorations.asSequence().map {
        println("access: $it")
        it
    }

    println("lazy: $lazyMap")
    println("-----")
    println("first: ${lazyMap.first()}")
    println("-----")
    println("all: ${lazyMap.toList()}")

    val lazyMap2 = decorations.asSequence().filter { it[0] == 'p' }.map {
        println("access: $it")
        it
    }
    println("-----")
    println("filtered: ${lazyMap2.toList()}")
}