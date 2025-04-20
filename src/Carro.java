 class Carro extends Transporte {
    // A classe Carro está herdando o metodo mover da classe Transporte
    @Override

     public void mover(){
        System.out.println("O carro está em movimento");
        // estamos sobrescrevendo o metodo mover da classe mãe Transporte
    }

     public static void main(String[] args) {
         Carro carro = new Carro(); // criamos o objeto carro
         carro.mover(); // chamamos o metodo
         Transporte transporte = new Transporte(); // objeto transporte
         transporte.mover(); // chamamos o metodo mover da classe mae Transporte
     }
}
