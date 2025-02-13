package com.example.proyectokotlinylosciclos

// Nombre:
// Fecha:
// Descripción: Solución del Problema 4 de la guía de Kotlin y los ciclos

// Función principal
fun main() {
    problema4()
}

// Función que debe desarrollar la lógica para la solución del problema
fun problema4() {
    var maxNumero = Int.MIN_VALUE
    var maxIndice = -1
    var indice = 1
    while (true) {
        println("n:")
        val numero = readln().toInt()
        if (numero == 0) {
            break
        }
        if (numero > maxNumero) {
            maxNumero = numero
            maxIndice = indice
        }
        indice++
    }
    if (maxIndice >= 0) {
        println("Posición del mayor = $maxIndice")
    }
}