public class MetodosEstaticos {
    public static void main(String[] args) {
        MetodosEstaticos.mensagem();// métodos estáticos
        MetodosEstaticos.somar();
        MetodosEstaticos.dobrar(6);
        MetodosEstaticos.mensagem2();
        MetodosEstaticos.verificar(10);
    }
    /*Os métodos estáticos pertecem diretamente a classe*/
    public static void mensagem(){
        System.out.println("Estou aprendendo métodos estáticos!"); // mensagem exibida
    }
    public static void somar(){
       int n1 = 20;
       int n2 = 30;
       int soma = n1 + n2;
       // criei duas variáveis que vão receber numeros, e uma variável chamada soma para guardar
        // o valor da soma das outras duas varíáveis

        System.out.println("A soma de " + n1 +  " + " + n2 + " é igual a : " + soma);
    }
    public static void dobrar(int numero){
        int dobro = numero * 2;
        // uma variável que guarda o o dobro do numero recebido pelo parametro do metodo dobrar

        System.out.println("O dobro de " + numero + " é igual a " + dobro);
    }

    public static void mensagem2(){
        int contador = 0;
        while(contador < 3) {
            contador++;
            System.out.println("Estou estudando a linguagem Java");
        }
        /*Criei uma variável chamada contador que vai ser usada dentro do loop while, que vai somar
        * 1 até que chegue em 3 , exibindo a mensagem a cada vez que se repete*/
    }

    public static void verificar(int numero){
        if(numero % 2  == 0){
            boolean resposta = true;
            System.out.println(resposta);
        }else {
            boolean resposta = false;
            System.out.println(resposta);
        }
        /*
          Nesse caso, eu criei um if para testar se o numero é par, caso o resultado seja verdadeiro
          a variável resposta que é booleano vai ser true , se não será false
         */
    }



}
