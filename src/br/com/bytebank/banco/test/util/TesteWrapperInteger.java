package br.com.bytebank.banco.test.util;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Integer.*;

public class TesteWrapperInteger {
    public static void main(String[] args) {
        int[] idades = new int[5];
        String[] nomes = new String[5];

        int idade = 29; //Integer;
        Integer idadeRef = valueOf(29); //Boxing;
        System.out.println(idadeRef.doubleValue());

        idadeRef++; // adiciona mais um na referencia por de baixo dos panos
        System.out.println(idadeRef); // adiciona mais um na referencia por de baixo dos panos
        int valor2 = idadeRef.intValue(); // método mais complicado, mas é o que acontece por de baixo dos panos
        valor2 = valor2 + 1;  // método mais complicado, mas é o que acontece por de baixo dos panos
        idadeRef = Integer.valueOf(valor2); // método mais complicado, mas é o que acontece por de baixo dos panos
        System.out.println(idadeRef);


        System.out.println(MAX_VALUE);
        System.out.println(MIN_VALUE);
        System.out.println(SIZE);
        System.out.println(BYTES);


        int valor = idadeRef.intValue(); //Unboxing;

        String s = args[0];

        int numero = parseInt(s);
        System.out.println(numero);
        List<Integer> numeros = new ArrayList<Integer>();
        numeros.add(29); // Autoboxing: transformação de primitivo para OO

        //java.lang.Integer é uma classe Wrapper, ou seja, classes que guardam primitivos internamente como:
        //      java.lang.Boolean, java.lang.Double, java.lang.Float, java.lang.Character e etc.


    }
}
