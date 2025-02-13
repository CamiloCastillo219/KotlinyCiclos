package com.example.proyectokotlinylosciclos

// Nombre:
// Fecha:
// Descripción: Solución del Problema 7 de la guía de Kotlin y los ciclos

// Función principal
fun main() {
    problema7()
}

// Función que debe desarrollar la lógica para la solución del problema
fun problema7() {
    println("N:")
    val n = readln().toInt()
    if (n <= 0) {
        println("Error")
    } else {
        var suma = 0
        for (i in 1..n) {
            suma += i * i * i
        }
        println("s = $suma")
    }
}