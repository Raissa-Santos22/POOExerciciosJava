
public class MetodoComRetorno {
    // metodo principal
    public static void main(String[] args) {
        System.out.println("Ano atual: " + exibir());
        System.out.println("Nome completo : " + retornar());
        System.out.println(numerar());
        System.out.println(mostrar());
        System.out.println("O numero de pi é : " + retornarPi());
        // métodos com retorno mas sem parametros que vão retonar o que estiver dentro dos métodos
    }
    public static int exibir(){
        // variável que vai guardar o valor do ano atual
        int anoAtual = 2025;
        return anoAtual;
        // uso do return em metodos com retorno
    }
    public static String retornar(){
        // variável que vai guarda meu nome completo
        String nomeCompleto = "Raissa Amorim dos Santos";
        return nomeCompleto;
    }
    public static int numerar(){
        // variável que vai guardar um numero fixo
        int numeroFixo = 100;
        return numeroFixo;
    }
    public static boolean mostrar(){
        // o booleano é usado quando queremos resultado de verdadeiro ou falso;
        return true;
    }
    public static float retornarPi(){
        double pi = 3.14159; // criei uma variável com o valor de pi
        return(float) pi;
    }
}
