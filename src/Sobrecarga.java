public class Sobrecarga {
    // o metodo exibir vai realizar a soma de dois numeros inteiros,
    public void exibir(int n1,int n2){
        System.out.println("Numeros inteiros : " + n1  + " " + n2);
    }
    // o metodo exibir como parametros diferentes vai exibir a soma de dois numero reais
    public void exibir(double numero1 , double numero2){
        System.out.println("Numeros reais : " + numero1 + " " + numero2);
    }


    // o metodo calcular vai exibir o calculo da área do quadrado
    public void calcular(double lado){
        double areaQuadrado = lado * lado;
        System.out.println("Área do quadrado : " + areaQuadrado);
    }

    // o metodo calcular com parametros diferentes vai exibir o calculo da área de um retangulo
    public void calcular(double base, double altura){
        double areaRetangulo = base * altura;
        System.out.println("Área do retangulo " + areaRetangulo);
    }

   public void exibirTexto(String texto){
       System.out.println(texto);
   }
    /*
       No código abaixo, criei uma variável chamada contador, que será o contador de quantas vezes
       o texto será repetido, começando com zero, e usei o while como um loop de repetição até 10
       somando um a cada vez que será repetido exibindo o texto
     */
   public void exibirTexto(String texto, int contador) {
       while(contador < 10){
           contador++;
           System.out.println(texto);
       }
   }

    public void somar(int numero1, int numero2){
        int soma = numero1 + numero2;
        System.out.println("Soma de dois numeros inteiros : " + soma);
    }
    public void somar(int n1, int n2, int n3){
        int soma = n1 + n2 + n3;
        System.out.println("Soma de tres numeros inteiros : " + soma);
    }
    public void somar(int n1, int n2 ,int n3, int n4){
        int soma = n1+n2+n3+n4;
        System.out.println("Soma de quatro numeros inteiros : " + soma);
    }
    /*O metodo somar vai ser usado tres vezes com parametros diferentes para realizar a soma com dois, tres e quatro números inteiros
    */


    public void exibirLetras(char caracter){
        System.out.println("Exibindo caracter " + caracter);
    }
    public void exibirLetras(String palavra){
        System.out.println("Exibindo string " + palavra);
    }

    // o metodo exibir letras vai ter parametros diferentes para exibir caracteres e strings

    public static void main(String[] args) {
        Sobrecarga sobrecarga = new Sobrecarga();
        sobrecarga.exibir(10, 20);
        sobrecarga.exibir(30.60, 98.7);
        sobrecarga.calcular(20);
        sobrecarga.calcular(30, 40);
        sobrecarga.exibirTexto("Texto simples");
        sobrecarga.exibirTexto("Esse texto será repetido", 0);
        sobrecarga.somar(20, 50);
        sobrecarga.somar(3,5, 8);
        sobrecarga.somar(4,2,6,8);
        sobrecarga.exibirLetras('!');
        sobrecarga.exibirLetras("Hello");

    }

}
