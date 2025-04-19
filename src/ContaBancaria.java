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

    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();
        conta.setSaldo(2540);
        conta.setTitular("Pedro");

        System.out.println("Olá cliente " + conta.getTitular() + ", bem vindo a sua conta bancária ! " +
                "Voce tem um saldo de R$ " + conta.getSaldo() + " reais");

    }
}
