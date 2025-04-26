public class MetodoSimples {
    // metodo principal
    public static void main(String[] args) {
        iniciar();
        imprimir();
        mensagem();
        contar();
        exibir();
        // metodos simples sem retorno e sem parametros
    }
    public static void iniciar(){
        System.out.println("Olá Mundo!");
        // exibe a mensagem
    }

    public static void imprimir(){
        String nome = "Raissa Amorim dos Santos"; // variável para guardar meu nome
        System.out.println(nome);
        // exibe o valor guardado na variavel
    }
    public static void mensagem(){
        String nomeEscola = "Etec Uirapuru"; // variavel que guarda o nome da escola
        System.out.println("Nome da escola : "+ nomeEscola);
        // exibe uma mensagem e o nome da escola
    }
    public static void contar(){
        for (int x = 1; x <= 10; x++) {
            // uso do laço de repetição for para contar de 1 até 10, somando 1 a cada vez que ele repete
            System.out.println(x);
        }
    }
    public static void exibir(){
        System.out.println("Eu adoro programar em Java!");
        // exibe a mensagem
    }

}
