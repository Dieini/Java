package curso_em_video;
import java.util.Scanner;

// CALCULADORA IMC - Este programa calcula o índice de massa corporal e classifica de acordo com a tabela IMC.
public class Calculadora_IMC {
    static void main(String[] args){
        Scanner leia = new Scanner(System.in);

        System.out.print("Informe seu peso: ");
        float peso = leia.nextFloat();
        leia.nextLine();

        System.out.print("Informe sua altura: ");
        float altura = leia.nextFloat();
        leia.nextLine();

        float imc = peso / (altura * altura);
       
        if(imc < 18.5){ 
            System.out.print("Seu IMC é " + String.format("%.2f", imc) + ". Você está abaixo do peso!");
        
         }else if(imc >= 18.5 && imc <= 24.9){
            System.out.println("Seu IMC é " + String.format("%.2f",imc) +". Você está no peso normal!");

         }else if(imc >= 25 && imc <= 29.9){
            System.out.println("Seu IMC é " + String.format("%.2f",imc) + ". Você está com sobrepeso!");

         }else if(imc >= 30 && imc <= 34.9){
            System.out.print("Seu IMC é " + String.format("%.2f", imc) + ". Você está com obesidade grau I!");

         }else if(imc >= 35 && imc <= 40){
            System.out.print("Seu IMC é " + String.format("%.2f", imc) + ". Voce está com obesidade severa grau II!");

         }else{
            System.out.print("Seu IMC é " + String.format("%.2f", imc) + ". Você está com obesidade mórbida grau III! ");
         }
    }
}
