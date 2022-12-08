/*
Nessa aula focamos nas classes WRAPPERS e aprendemos que

    para cada primitivo existe uma classe chamada Wrapper

    para guardar um primitivo numa coleção é preciso criar um objeto que embrulha o valor

    a criação do objeto Wrapper é chamada de autoboxing

    a retirada do valor primitivo do objeto Wrapper é chamada de unboxing

    autoboxing e unboxing acontecem automaticamente.

    as classes wrapper possuem vários métodos auxiliares, por exemplo para o parsing

    todas as classes wrappers que representam um valor numérico possuem a classe java.lang.Number como mãe

 */

package br.com.bytebank.banco.test.util;

import java.util.ArrayList;
import java.util.List;

public class TesteOutrosWrappers {

    public static void main(String[] args) {

        Integer idadeRef = Integer.valueOf(29);
        System.out.println(idadeRef.intValue());

        Double dRef = Double.valueOf(3.2);
        System.out.println(dRef.doubleValue());

        Boolean bRef = Boolean.FALSE;
        System.out.println(bRef.booleanValue());

        Number refNumero = Float.valueOf(29.3f);


        List<Number> lista = new ArrayList<>();

        lista.add(32);
        lista.add(10.5);
        lista.add(25.6f);

    }

}
