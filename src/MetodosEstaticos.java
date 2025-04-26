public class MetodosEstaticos {
    public static void main(String[] args) {
        MetodosEstaticos.mensagem();// métodos estáticos
        System.out.println(MetodosEstaticos.somar(30,50));
        System.out.println(MetodosEstaticos.dobrar(6));
        MetodosEstaticos.mensagem2();
        System.out.println(MetodosEstaticos.verificar(10));
    }
    /*Os métodos estáticos pertecem diretamente a classe*/
    public static void mensagem(){
        System.out.println("Estou aprendendo métodos estáticos!"); // mensagem exibida
    }
    public static int somar(int n1 , int n2){
        return n1+n2; // o metodo vai receber dois numero e retornar a soma deles
    }
    public static int dobrar(int numero){
        return numero*2; //o metodo vai recebr um numero pelo parametro e vai retornar o dobro dele
    }

    public static void mensagem2(){
        int contador = 0;
        while(contador < 3) {
            contador++;
            System.out.println("Estou estudando a linguagem Java");
        }
        /*Criei uma variável chamada contador que vai ser usada dentro do loop while, que vai somar
         1 até que chegue em 3 , exibindo a mensagem a cada vez que se repete */
    }

    public static boolean verificar(int numero){
        if(numero % 2  == 0){
            return true;
        }else {
          return false;
        }
        /*
          Nesse caso, eu criei um if para testar se o numero é par, caso o resultado seja verdadeiro
          vai ser true , se não será false
         */
    }



}
