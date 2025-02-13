package com.example.proyectokotlinylosciclos

// Nombre:
// Fecha:
// Descripción: Solución del Problema 1 de la guía de Kotlin y los ciclos

// Función principal
fun main() {
    problema1()
}

// Función que debe desarrollar la lógica para la solución del problema
fun problema1() {
    println("Ingresa N:")
    val num = readln().toInt()
    var i = 1
    while (i * i <= num) {
        print(i * i)
        print(" ")
        i++
    }
}