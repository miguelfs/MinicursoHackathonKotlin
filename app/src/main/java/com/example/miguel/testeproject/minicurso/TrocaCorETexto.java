package com.example.miguel.testeproject.minicurso;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

/**
 * Created by miguel on 30/08/17.
 */

public class TrocaCorETexto {
    private int numero = 0;

    public int getNumero(){
        return numero;
    }

    public void setNumero(int numero){

        this.numero = numero * 10;
    }

    ArrayList<String> vetorCor = new ArrayList<>(
            Arrays.asList(
                    "#39add1", // light blue
                    "#3079ab", // dark blue
                    "#c25975", // mauve
                    "#e15258" // red
            )
    );




    ArrayList<String> vetorTexto =new ArrayList<>(
            Arrays.asList(
            "O primeiro nome dado, em 1500, pelos portugueses ao Brasil foi Terra de Vera Cruz.",
"A primeira missa foi realizada no Brasil no dia 26 de abril de 1500.",
"A primeira forma de organização territorial implantada no Brasil pela coroa portuguesa foi o sistema das Capitanias Hereditárias."
            ));

    String getColor(){
        Random random = new Random();
      return vetorCor.get(  random.nextInt(3));

    }

    String getTexto(){
        Random random = new Random();
        return vetorTexto.get(  random.nextInt(2));
    }


}
