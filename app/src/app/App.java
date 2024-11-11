/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Aline
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Fazer um programa para ler um número inteiro N e depois os dados (id, nome e salario) de N funcionários. Não deve haver repetição de id.
        //Em seguida, efetuar o aumento de X por cento no salário de um determinado funcionário. Para isso, o programa deve ler um id e o valor X.
        //Se o id informado não existir, mostrar uma mensagem e abortar a operação. Ao final, mostrar a listagem atualizada dos funcionários, conforme exemplos.
        //Lembre-se de aplicar a técnica de encapsulamento para não permitir que o salário possa ser mudado livremente.
        //Um salário só pode ser aumentado com base em uma operação de aumento por porcentagem dada.

        Scanner s = new Scanner(System.in);
        
        System.out.println("Quantos funcionarios irao ser registrados? ");
        Integer funcionarios = s.nextInt();
        
        List<Object> listaFuncionarios;
        listaFuncionarios = new ArrayList<>();
        
        for (int i = 1; i <= funcionarios; i++) {
            System.out.println("Digite o ID do funcionario " + i + ":");
            Integer idFuncionario = s.nextInt();
            listaFuncionarios.add(idFuncionario);
            
            System.out.println("Digite o nome do funcionario " + i + ":");
            String nomeFuncionario = s.next();
            listaFuncionarios.add(nomeFuncionario);
            
            System.out.println("Digite o salario do funcionario " + i + ":");
            Integer salarioFuncionario = s.nextInt();
            listaFuncionarios.add(salarioFuncionario);
        }
    }
}
