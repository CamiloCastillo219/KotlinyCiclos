package com.example.proyectokotlinylosciclos

// Nombre:
// Fecha:
// Descripción: Solución del Problema 3 de la guía de Kotlin y los ciclos

// Función principal
fun main() {
    problema3()
}

// Función que debe desarrollar la lógica para la solución del problema
fun problema3() {
    var suma = 0
    while (true) {
        println("n:")
        val numero = readln().toInt()
        if (numero == 0) {
            break
        }
        suma += numero
    }
    println("Suma = $suma")
}