
public class MetodoComRetorno {
    public static void main(String[] args) {
        System.out.println("Ano atual: " + MetodoComRetorno.exibir()); // não tem parametros
        System.out.println("Nome completo : " + MetodoComRetorno.retornar());
        System.out.println(MetodoComRetorno.numerar());
        System.out.println(MetodoComRetorno.mostrar());
        System.out.println("O numero de pi é : " + MetodoComRetorno.retornarPi());
    }
    public static int exibir(){
        int ano = 2025;
        return ano; // return usado em metodos com retorno
    }
    public static String retornar(){
        String nomeCompleto = "Raissa Amorim dos Santos";
        return nomeCompleto;
    }
    public static int numerar(){
       int numeroFixo = 100;
        return numeroFixo;
    }
    public static boolean mostrar(){
        boolean sim = true; // booleano que só é usado para verdadeiro ou falso
        return sim;
    }
    public static float retornarPi(){
        double pi = 3.14159;
        return(float) pi;
    }




}
