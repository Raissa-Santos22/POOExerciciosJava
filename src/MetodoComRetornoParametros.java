
public class MetodoComRetornoParametros {
    public static void main(String[] args) {
        System.out.println(MetodoComRetornoParametros.multiplicar(5,6));
        System.out.println(MetodoComRetornoParametros.saudar("Seja bem vinda ao nosso sistema ","Camila" ));
        System.out.println(MetodoComRetornoParametros.dobrar(20));
        System.out.println(MetodoComRetornoParametros.concatenar("Chocolate ", "Doce"));
        System.out.println(MetodoComRetornoParametros.verificarIdade(29));
    }
    public static int multiplicar(int n1, int n2){ // parametros
        return n1 * n2; //  uso do return para retorno do resultado , pois é um metodo com retorno
    }
    public static String saudar(String mensagem, String nome) {
        return mensagem + nome;
    }
    public static int dobrar(int numero){
        return numero * 2; // multiplica o numero por dois
    }
    public static String concatenar(String palavra1, String palavra2){
        return palavra1 + palavra2; // concatena as duas Strings
    }
    public static boolean verificarIdade(int idade){
        if(idade > 18){ // testa para ver se a idade é maior do que 18 anos
            return true;
        }else{
            return false;
        }

    }



}
