package com.example;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class reverseMain {
    public static void main(String[] args) {

        //Punto 1
        String[] arraytext = new String[]{"Jaime","Alejandro","Andres"};
        for (String name: arraytext){
            System.out.println(name);
        }

        //Punto 2
        recorrerMatriz();

        //Punto 3
        vectorEliminarPosicion();

        //Punto 4
        /*
        El problema de utilizar un Vector con la capacidad por defecto si tuviesemos 1000 elementos para ser agregados, es el consumo de memoria ya que cuando se sobrepasa
        la capacidad por defecto el por debajo crea un nuevo array con un tamaño mas grande y hace la copia de los elementos que ya estaban en el array anterior y ese proceso tiene
        un consumo grande para el aplicativo.
        System.out.println(vectorString);
        */

        //Punto 5
        copiaArrayListALinkedList();


        //Punto 6
        sacarPares();


        //Punto 7
        try {
            double result = dividePorCero(2,3);
            System.out.println("El resultado es: "+result);
        }catch (ArithmeticException e){
            System.out.println("Esto no puede hacerse");
        } finally {
            System.out.println("Demo de codigo");
        }

        copiaFichero();
        String text = reverse("Hola");
        System.out.println(text);
    }

    public static String reverse(String text){
        for (int i = text.length() - 1 ; i >= 0 ; i--){
            System.out.println(text.charAt(i));
        }
        return text;
    }

    public static void recorrerMatriz(){
        int[][] enterosBi = new int[][]{{0,1,2,3,4},{0,1,2,3,4},{0,1,2,3,4},{0,1,2,3,4},{0,1,2,3,4}};

        for (int i = 0; i < 5;i++){
            for (int j = 0; j < 5 ; j++){
                System.out.println(enterosBi[i][j]);
                System.out.println("Estas en la posicion: " + i + "," + j);
            }
        }
    }
    public static void vectorEliminarPosicion(){
        Vector<String> vectorString = new Vector<>();
        vectorString.add("moto");
        vectorString.add("carro");
        vectorString.add("avion");
        vectorString.add("helicoptero");
        vectorString.add("barco");

        vectorString.remove(1);
        vectorString.remove(1);
    }
    public static void copiaArrayListALinkedList(){
        ArrayList<String> arrayListInt = new ArrayList<>();
        arrayListInt.add("samsung");
        arrayListInt.add("sony");
        arrayListInt.add("microsoft");
        arrayListInt.add("asus");

        LinkedList<String> copyArrayList = new LinkedList<>(arrayListInt);

        for (String marca : arrayListInt) {
            System.out.println(marca);
        }

        for (String marca :
                copyArrayList) {
            System.out.println(marca);
        }
    }
    public static void sacarPares(){
        ArrayList<Integer> numeros = new ArrayList<>();
        for (int i = 0 ; i < 10 ; i ++){
            numeros.add(i);
        }

        for (int i = 0; i< numeros.size();i++){
            System.out.println(numeros.get(i));
            if (numeros.get(i)%2 == 0){
                numeros.remove(i);
            }
        }

        for (Integer numero:numeros){
            System.out.println(numero);
        }
    }
    public static double dividePorCero(int a,int b) throws ArithmeticException{
        return a/b;
    }

    public static void copiaFichero(){
        try {
            InputStream fileIn = new FileInputStream("ArchivoDeEntrada.txt");
            PrintStream fileOut = new PrintStream("copia.txt");

            try{
                byte[] datos = fileIn.readAllBytes();
                fileOut.write(datos);

                fileIn.close();
                fileOut.close();
            }catch (IOException e){
                System.out.println("No se puede leer el fichero: " + e.getMessage());
            }
        }catch (FileNotFoundException e){
            System.out.println("Programa error: " + e.getMessage());
        }
    }
}
