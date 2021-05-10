import kotlin.random.Random

fun main() {

    val listaAlumnos= mutableListOf<AlumnosComparables>()

    for(i in 0..5){
        listaAlumnos.add(AlumnosComparables("Alumno $i", Random.nextInt(0,10)))
    }

    println("Ordenados por la nota: ")

    listaAlumnos.sort()
    listaAlumnos.forEach {
        println(it.toString())
    }

    println("Ordenados alfabeticamente: ")

    listaAlumnos.sortBy {
        it.nombre
    }

    listaAlumnos.forEach {
        println(it.toString())
    }

    println("Ordenador por longitud de nombre: ")

    listaAlumnos.sortBy {
        it.nombre.length
    }

    listaAlumnos.forEach {
        println(it.toString())
    }

}

class AlumnosComparables(var nombre:String, var nota:Int): Comparable<AlumnosComparables>{

    override fun compareTo(other: AlumnosComparables): Int {
        return nota - other.nota
    }

    override fun toString(): String {
        return "$nombre con un $nota"
    }
}