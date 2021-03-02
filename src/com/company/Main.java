package com.company;


import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here

        //Inicializo mis listas
        List <Frutas> frutas = new ArrayList<>();
        List <Verduras> verduras = new ArrayList<>();

        //Agrego objetos a las listas

        frutas.add(new Frutas("Straberry",10));
        frutas.add(new Frutas("Pineapple",10));
        frutas.add(new Frutas("Apple",10));
        verduras.add(new Verduras("Carrot",10));
        verduras.add(new Verduras("Letucce",10));

        //muestro cantidad
        System.out.println("la cantidad de frutas es: " +frutas.size());
        System.out.println("");

        // Imprimo la lista
        for(int i=0;i<frutas.size();i++ ){
            System.out.println("Fruta: " +frutas.get(i).getNombre() + "  Cantidad: " +frutas.get(i).getCantidad());
        }
        System.out.println("");

        //muestro cantidad
        System.out.println("la cantidad de verduras es: " +verduras.size());
        System.out.println("");

        // Imprimo la lista
        for(int i=0;i<verduras.size();i++ ){
            System.out.println("Verduras: " +verduras.get(i).getNombre() + "  Cantidad: " +verduras.get(i).getCantidad());
        }
        System.out.println("");

         //duplicar la cantidad de la fruta 2 y la verdura 1
        Frutas f = frutas.get(1);
        f.setCantidad(f.getCantidad()*2);

        System.out.println("The amount of the fruit 2 is:" +frutas.get(1).getNombre()+ " - " +frutas.get(1).getCantidad() );

        System.out.println("");
        Verduras v = verduras.get(0);
        v.setCantidad(v.getCantidad()*2);
        System.out.println("The amount of the vegetable 1 is:" + verduras.get(0).getNombre()+ " - " +verduras.get(0).getCantidad() );
        System.out.println("");

        //eliminar la fruta 1
        frutas.remove(0);
        verduras.get(1).setNombre("Tomato");
        verduras.get(1).setCantidad(300);

        System.out.println(frutas);
        System.out.println("");
        System.out.println(verduras);

        }


    }



