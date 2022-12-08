/*
Nessa aula fundamental e importante aprendemos que:

    para ordenar uma lista é preciso definir um critério de ordenação

    há duas formas de definir esse critério

    pela interface Comparator

    pela interface Comparable (ordem natural)

    o algoritmo de ordenação já foi implementado

    na lista no método sort

    na classe Collections pelo método sort

    a classe Collections é uma fachada com vários métodos auxiliares para trabalhar com as coleções, principalmente listas

 */


package br.com.bytebank.banco.test.util;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

import java.util.*;

public class TesteOrdenacao {
    public static void main(String[] args) {
        Conta cc1 = new ContaCorrente(22, 33);
        Cliente clienteCC1 = new Cliente();
        clienteCC1.setNome("Nico");
        cc1.setTitular(clienteCC1);
        cc1.deposita(333.0);

        Conta cc2 = new ContaPoupanca(22, 44);
        Cliente clienteCC2 = new Cliente();
        clienteCC2.setNome("Guilherme");
        cc2.setTitular(clienteCC2);
        cc2.deposita(444.0);

        Conta cc3 = new ContaCorrente(22, 11);
        Cliente clienteCC3 = new Cliente();
        clienteCC3.setNome("Paulo");
        cc3.setTitular(clienteCC3);
        cc3.deposita(111.0);

        Conta cc4 = new ContaPoupanca(22, 22);
        Cliente clienteCC4 = new Cliente();
        clienteCC4.setNome("Ana");
        cc4.setTitular(clienteCC4);
        cc4.deposita(222.0);

        List<Conta> lista = new ArrayList<>();
        lista.add(cc1);
        lista.add(cc2);
        lista.add(cc3);
        lista.add(cc4);

        for (Conta conta:
             lista) {
            System.out.println(conta + ", " + conta.getTitular().getNome());
        }

        NumeroDaContaComparator comparator = new NumeroDaContaComparator();
        

        lista.sort(new TitularDaContaComparator());

        Collections.sort(lista, new TitularDaContaComparator() ); // Método antigo de ordenação
        Collections.sort(lista); // método com a ordem natural da classe me questão
        Collections.shuffle(lista); //embaralha a lista
        Collections.reverse(lista); //inverte a lista


        System.out.println("-------------");

        for (Conta conta:
                lista) {
            System.out.println(conta + ", " + conta.getTitular().getNome());
        }
        int[] numeros = new int[]{43, 15, 64, 22, 89};

        Arrays.sort(numeros); //método utilitário sort

        System.out.println(Arrays.toString(numeros)); //método utilitário toString
    }


}

class TitularDaContaComparator implements Comparator<Conta> {

    @Override
    public int compare(Conta c1, Conta c2) {
        String nomeC1 = c1.getTitular().getNome();
        String nomeC2 = c2.getTitular().getNome();

        return nomeC1.compareTo(nomeC2);
    }
}

class NumeroDaContaComparator implements Comparator<Conta> {

    @Override
    public int compare(Conta c1, Conta c2) {

        return Integer.compare(c1.getNumero(), c2.getNumero());
    }
}
