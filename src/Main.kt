/**
 * Solicita un número entero en un rango.
 *
 * @param min Int - valor mínimo
 * @param max Int - valor máximo
 *
 * @return Int - número entero válido dentro del rango especificado
 */
fun pedirNum() : Int {
    var num = 0
    do {
        try {
            print("Introduce un número del 1 al 100: ")
            num = readln().toInt()
            if (num in 1..100) {
                return num
            } else {
                print("**ERROR** Número no válido (pulse ENTER para continuar...) ")
                readln()
            }
        }catch (e: Exception) {
            print("**ERROR** Número no válido (pulse ENTER para continuar...) ")
            readln()
        }
        } while (num < 1 || num > 100)
    return 0
}

/**
 * Realiza una pregunta para contestar con s/si ó n/no
 *
 * @param text String - Texto de la pregunta
 *
 * @return Boolean - true/false dependiendo de la respuesta válida a la pregunta
 */
fun pregunta():Boolean {
    var respuesta = true
    do {
        print("¿Desea generar otra tabla de multiplicación? (s/n) ")
        val p = readln()
        when (p) {
            "s" -> respuesta = true
            "n" -> respuesta = false
            else -> {
                print("**Respuesta no válida** (Pulse ENTER para continuar)")
                readln()
            }
        }
    } while (p != "s" && p != "n")
    return respuesta
}

fun main() {
//TODO: Solicitar la introducción de un número entre 1 y 100 y mostrar su table de multiplicar...
//Hasta que se responda negativamente a la pregunta "¿Desea generar otra tabla de multiplicación? (s/n)"
    do {
        val num = pedirNum()
        println("La tabla de multiplicar del número $num es: ")
        val tabla = IntArray(10, {i -> i + 1})
        for (i in tabla) {
            println("$i -> $num x $i = ${i * num}")
        }
    } while (pregunta())
}
