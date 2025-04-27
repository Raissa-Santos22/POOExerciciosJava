
public class MetodoComRetornoParametros {
    // metodo principal
    public static void main(String[] args) {
        System.out.println(MetodoComRetornoParametros.multiplicar(5,6));
        System.out.println(MetodoComRetornoParametros.saudar("Seja bem vinda ao nosso sistema ","Camila" ));
        System.out.println(MetodoComRetornoParametros.dobrar(20));
        System.out.println(MetodoComRetornoParametros.concatenar("Chocolate ", "Doce"));
        System.out.println(MetodoComRetornoParametros.verificarIdade(20));
        // esses metodos são com retorno e parametros
        // exibi o resultado dos metodos
    }
    public static int multiplicar(int n1, int n2){ // parametros do metodo multiplicar
        return n1 * n2; //  uso do return para retorno do resultado , pois é um metodo com retorno, que traz a multiplicação dos dois numeros
    }
    public static String saudar(String mensagem, String nome) { // parametros do metodo saudar
        return mensagem + nome; // retorna uma mensagem personalizada
    }
    public static int dobrar(int numero){ // parametro do metodo dobrar
        return numero * 2; // retorna o dobro do numero
    }
    public static String concatenar(String palavra1, String palavra2){ // parametros do metodo concatenar
        return palavra1 + palavra2; // retorna a concatenação das duas Strings
    }
    public static boolean verificarIdade(int idade){ // parametros do metodo verificarIdade
        if(idade >= 18){ // testa para ver se a idade é maior ou igual a 18 anos com o uso do if
            return true; // se for verdadeiro retorna true
        }else{
            return false; // se não retorna false
        }
    }
}
