import kotlin.random.Random

fun main() {

    val lista=mutableListOf<Int>()

    for(i in 0..5){
        lista.add(Random.nextInt(0,100))
    }

    println("Menor a mayor: ")

    lista.sort()//ordena
    lista.forEach {
        println(it)
    }

    println("Mayor a menor: ")

    lista.sortDescending()//ordena descendente
    lista.forEach {
        println(it)
    }

    println("Lista nueva de menor a mayor: ")

    val listaNueva=lista.sorted()

    listaNueva.forEach {
        println(it)
    }

    println("Lista nueva de mayor a menor: ")

    val listaNueva2=lista.sortedDescending()

    listaNueva2.forEach {
        println(it)
    }

}