//corrigir calculadora na variavel opcao!!!!
package com.mycompany.operadoraritm;

import java.util.Scanner;

public class OperadorAritm {

    public static void main(String[] args) {
     Scanner scanner = new Scanner (System.in);
     boolean continuar = true;
     
      //menu de opções
      while (continuar) {
        System.out.println("Escolha a operação: ");
        System.out.println("(1) Adição");
        System.out.println("(2) Subtração");
        System.out.println("(3) Multiplicação");
        System.out.println("(4) Divisão");
        System.out.println("(5) Resto");
        System.out.println("(6) Sair");
        
        //leitura da opção
        int opcao = scanner.nextInt();
        
        if(opcao==6){
            continuar = false;
            System.out.println("Saindo da calculadora...");
            
        }
      }
        //leitura dos dados inserido
        System.out.println("Digite o primeiro número: ");
        float num1 = scanner.nextFloat();
        System.out.println("Digite o segundo número: ");
        float num2 = scanner.nextFloat();
        
        //aramazenando resultado
        float result = 0;
        
        //operacao
        switch (opcao){
            case 1:
                result = num1 + num2;
                System.out.println("Resultado da adição e: " +result);
                break;
            case 2:
                result = num1 - num2;
                System.out.println("Resultado da subtração e: " +result);
                break;
            case 3:
                result = num1 * num2;
                System.out.println("Resultado da multiplicação e: " +result);
                break;
            case 4:
                if(num2 != 0){
                result = num1 / num2;
                System.out.println("Resultado da divisão e: " +result);
                }
                else {
                    System.out.println("Erro! Divisão por zero não é permitida.");
                }
                break;
            case 5:
                if(num2 != 0){
                result = num1 % num2;
                System.out.println("Resultado do resto da divisão e: " +result);
                }
                else{
                    System.out.println("Erro! Divisão por zero nao é permitida.");
                }
                break;
            default :
                System.out.println("Escolha uma opção válida");
                break;
        }
        //fechando o scanner
        scanner.close();
    }
}
