public class ContaBancaria {
    private double saldo; // atributos privados
    private String titular;

    public void setSaldo(int saldo){
        this.saldo = saldo;
    }
    public void setTitular(String titular){
        this.titular = titular;
    }
    public double getSaldo(){
        return saldo;
    }
    public String getTitular(){
        return titular;
    }
    // o set vai definir ou atualizar os campos saldo e titular
    // o get vai trazer esse valor
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria(); // criação do objeto
        conta.setSaldo(2540); // definindo o saldo
        conta.setTitular("Pedro"); // definindo o titular

        System.out.println("Olá cliente " + conta.getTitular() + ", bem vindo a sua conta bancária ! " +
                "Voce tem um saldo de R$ " + conta.getSaldo() + " reais");
        // exibindo uma mensagem personalizada

    }

}
