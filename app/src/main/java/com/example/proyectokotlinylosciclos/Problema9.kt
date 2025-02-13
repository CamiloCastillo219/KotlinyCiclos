package com.example.proyectokotlinylosciclos

// Nombre:
// Fecha:
// Descripción: Solución del Problema 9 de la guía de Kotlin y los ciclos

// Función principal
fun main() {
    problema9()
}

// Función que debe desarrollar la lógica para la solución del problema
fun problema9() {
    println("n:")
    val n = readln().toInt()
    if (n < 1) {
        println("Error")
    } else {
        var sumaFactoriales = 0
        for (i in 1..n) {
            var factorial = 1
            for (j in 1..i) {
                factorial *= j
            }
            sumaFactoriales += factorial
        }
        println("s = $sumaFactoriales")
    }
}