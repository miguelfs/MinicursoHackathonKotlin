package com.example.miguel.testeproject.exemplos

/**
 * Created by miguel on 30/08/17.
 */

open class Animal(var especie: String, var idade: Int){

     fun comer(comida: String): String{
        return especie + " comeu " + comida
    }
}