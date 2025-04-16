import java.util.*;
public class MetodosComParametros {
    public static void main(String[] args) {
        mensagem("Bem vindo!");
        somar(4,5);
        exibirDados("Ana", 19);
        exibirNumero(-20);
        cumprimentar("Raissa");
    }
    public static void mensagem(String texto){ // parametros do metodo
        System.out.println(texto);
    }
    public static void somar(int n1, int n2){
        System.out.println("A soma é igual a : " + (n1 + n2));
    }
    public static void exibirDados(String nome, int idade){
        System.out.println("Seu nome é " + nome + ", voce tem " + idade + " anos de idade!");
    }
    public static void exibirNumero(int numero){
        if(numero > 0){
            System.out.println("O numero é positivo");
        }else{
            System.out.println("O número é negativo");
        }
    }
    public static void cumprimentar(String nome){
        System.out.println("Bem vinda " + nome + "! Ficamos felizes em recebe-lá em nosso sistema");
    }


}
