package com.example.proyectokotlinylosciclos

// Nombre:
// Fecha:
// Descripción: Solución del Problema 5 de la guía de Kotlin y los ciclos

// Función principal
fun main() {
    problema5()
}

// Función que debe desarrollar la lógica para la solución del problema
fun problema5() {
    var contadorPares = 0
    while (true) {
        println("n:")
        val numero = readln().toInt()
        if (numero == -1) {
            break
        }
        if (numero % 2 == 0) {
            contadorPares++
        }
    }
    println("Pares = $contadorPares")
}