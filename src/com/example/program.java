package com.example;

import java.io.*;
import java.util.HashMap;

public class program {
    public static void main(String[] args) {
        HashMap<Integer,String> modeloCarros = new HashMap<>();
        HashMap<Integer,String> velocidadCarros = new HashMap<>();
        String[] results = new String[3];

        modeloCarros.put(1,"mustang");
        modeloCarros.put(2,"toledo");
        modeloCarros.put(3,"megane");

        velocidadCarros.put(1,"200");
        velocidadCarros.put(2,"150");
        velocidadCarros.put(3,"300");

        for (int i =0; i<modeloCarros.size();i++){
            results[i] = limiteVelocidad(modeloCarros.get(i+1));
        }

        try {
            PrintStream fileOut = new PrintStream("modelos.txt");
                for (String result :results){
                    System.out.println(result);
                    fileOut.println(result);
                }
                fileOut.close();
        }catch (FileNotFoundException e){
            System.out.println("Programa error: " + e.getMessage());
        }
    }

    public static String limiteVelocidad(String modelo){
        return "El modelo " + modelo + " del carro no excede el limite de velocidad" ;
    }
}
