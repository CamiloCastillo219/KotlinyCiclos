package com.example.proyectokotlinylosciclos

// Nombre:
// Fecha:
// Descripción: Solución del Problema 8 de la guía de Kotlin y los ciclos

// Función principal
fun main() {
    problema8()
}

// Función que debe desarrollar la lógica para la solución del problema
fun problema8() {
    println("n:")
    val n = readln().toInt()
    if (n == 0) {
        val factorial = 1
        println("$n ! = $factorial")
    } else {
        var factorial = 1
        for (i in 1..n) {
            factorial *= i
        }
        println("$n ! = $factorial")
    }
}