public class SobrecargaDeMetodos {
    // metodo principal
    public static void main(String[] args) {
        SobrecargaDeMetodos sobrecarga = new SobrecargaDeMetodos(); // criamos um objeto
        sobrecarga.exibir(7, 75.4);
        sobrecarga.exibir(6,8,6);
        sobrecarga.exibir("Estou aprendendo Programação Orientada Objeto", "Fazendo exercícios em Java");
        sobrecarga.exibir(2);
        sobrecarga.exibir('!', "Olá!");

    }
    public static void exibir(int numeroInteiro,double numeroReal){ // metodo exibir e os parametros
        System.out.println("Numero inteiro: " + numeroInteiro); // exibi o numero inteiro
        System.out.println("Numero real: " + numeroReal); // exibi o numero real
    }
    public static void exibir(double ladoQuadrado, double baseRetangulo, double alturaRetangulo){ // parametros do metodo
        double AreaQuadrado = ladoQuadrado * ladoQuadrado; // calculo da área do quadrado
        double AreaRetangulo = baseRetangulo * alturaRetangulo; // calculo da área do retangulo
        System.out.println("O calculo da área do quadrado é igual a : " + AreaQuadrado);
        System.out.println("O calculo da área do retangulo é igual a: " + AreaRetangulo);
        // exibi o resultado do calculo da area do quadrado e do retangulo
    }
    public static void exibir(String texto, String textoRepetido) {
        System.out.println(texto);
        /*
        No código abaixo, criei uma variável chamada repetir, que será o contador de quantas vezes
        o texto será repetido, começando com zero, e usei o while como um loop de repetição até 10
        somando um a cada vez que será repetido exibindo o texto
        */

        int repetir = 0;
        while (repetir < 10) {
            repetir++;
            System.out.println(textoRepetido);
        }
    }
    public static void exibir(int numero){
        int numero2 = 8;
        int numero3 = 12;
        int numero4 = 20;

        int soma1 = numero + numero2;
        int soma2 = soma1 + numero3;
        int soma3 = soma2 + numero4;

        /*Criei variáveis para guardar os valores e criei variáveis para
         guardar o resultado das somas */

        System.out.println("Somando o numeros inteiros!");
        System.out.println("Soma com dois numeros inteiros: " +  soma1);
        System.out.println("Soma com tres numeros inteiros: " + soma2);
        System.out.println("Soma com quatro numeros inteiros: " + soma3);
    }
    public static void exibir(char caractere, String texto){
        System.out.println(caractere); // exibi um caractere
        System.out.println(texto); // exibi uma String
    }
}

