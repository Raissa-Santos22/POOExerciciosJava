public class MetodoSimples {
    public static void main(String[] args) {
        iniciar();
        imprimir();
        mensagem();
        contar();
        exibir();
        // Métodos simples sem parametros e sem retorno
    }
    public static void iniciar(){
        System.out.println("Olá Mundo!");
    }
    public static void imprimir(){
        String nome = "Raissa Amorim dos Santos"; // variável para guardar meu nome
        System.out.println(nome);
    }
    public static void mensagem(){
        String nomeEscola = "Etec Uirapuru";
        System.out.println("Nome da escola : "+ nomeEscola);
    }
    public static void contar(){
        for (int x = 1; x <= 10; x++) { // uso do laço de repetição for para contar de 1 até 10
            System.out.println(x);
        }
    }
    public static void exibir(){
        System.out.println("Eu adoro programar em Java!");
    }

}
