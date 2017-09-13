package com.example.miguel.testeproject.exemplos

/**
 * Created by miguel on 30/08/17.
 */

class Peixe(numeroDeNadadeiras : String, especie: String, idade : Int) : Animal(especie, idade) {
    var numeroDeNadadeiras : Int = numeroDeNadadeiras.toIntOrNull() ?: 0

}