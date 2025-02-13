package com.example.proyectokotlinylosciclos

// Nombre:
// Fecha:
// Descripción: Solución del Problema 6 de la guía de Kotlin y los ciclos

// Función principal
fun main() {
    problema6()
}

// Función que debe desarrollar la lógica para la solución del problema
fun problema6() {
    println("A:")
    val a = readln().toInt()
    println("B:")
    val b = readln().toInt()
    if (a < b) {
        for (i in a..b) {
            print(i)
            print(" ")
        }
    } else {
        for (i in a downTo b) {
            print(i)
            print(" ")
        }
    }
}