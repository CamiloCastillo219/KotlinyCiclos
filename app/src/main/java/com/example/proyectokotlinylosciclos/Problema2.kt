package com.example.proyectokotlinylosciclos

// Nombre:
// Fecha:
// Descripción: Solución del Problema 2 de la guía de Kotlin y los ciclos

// Función principal
fun main() {
    problema2()
}

// Función que debe desarrollar la lógica para la solución del problema
fun problema2() {
    println("Ingresa x:")
    val x = readln().toDouble()
    println("Ingresa y:")
    val y = readln().toDouble()
    var distancia = x
    var dias = 0
    while (distancia < y) {
        distancia *= 1.10
        dias++
    }
    dias = dias + 1
    val dista = y.toInt()
    println("Necesitas $dias días para correr bien los $dista Km")

}