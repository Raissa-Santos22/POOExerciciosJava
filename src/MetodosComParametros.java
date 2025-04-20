
public class MetodosComParametros {
    // metodo principal
    public static void main(String[] args) {
        mensagem("Bem vindo!");
        somar(4,5);
        exibirDados("Ana", 19);
        exibirNumero(-20);
        cumprimentar("Raissa");
        // metodos com parametros, sem retorno
    }
    public static void mensagem(String texto){ // parametros do metodo
        System.out.println(texto);
    }
    public static void somar(int n1, int n2){
        // o metodo somar recebe dois numeros como parametros
        System.out.println("A soma é igual a : " + (n1 + n2));
        // é exibido a soma desses dois numeros
    }
    public static void exibirDados(String nome, int idade){
        // o metodo exibir dados recebe dois paramtros, um nome e uma idade
        System.out.println("Seu nome é " + nome + ", voce tem " + idade + " anos de idade!");
        // exibi o nome e a idade
    }
    public static void exibirNumero(int numero){
        // o metodo recebe um numero
        if(numero > 0){
            System.out.println("O numero é positivo");
        }else{
            System.out.println("O número é negativo");
        }
        // o numero será testado através de um if , se o numero for maior que zero
        // exibi a mensagem que ele é positivo, se não ele é negativo
    }
    public static void cumprimentar(String nome){
        // o metodo cumprimentar recebe um nome
        System.out.println("Bem vinda " + nome + "! Ficamos felizes em recebe-lá em nosso sistema!");
        // exibi uma mensagem personalizada
    }


}
