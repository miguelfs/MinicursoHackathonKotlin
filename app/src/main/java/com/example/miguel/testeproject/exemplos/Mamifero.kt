package com.example.miguel.testeproject.exemplos

/**
 * Created by miguel on 30/08/17.
 */

class Mamifero(val nome: String, especie: String, idade: Int) : Animal(especie, idade) {

    fun mamarDe(mamifero: Mamifero) : String = nome + """ mamou de """ + mamifero
}