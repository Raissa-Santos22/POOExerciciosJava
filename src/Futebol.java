 class Futebol extends Esporte{
    // a classe Futebol está herdando o metodo jogar da classe mãe Esporte
     @Override // usado para indicar que o metodo está sobrescrevendo  um metodo da classe mãe

     public void jogar(){
         System.out.println("Os jogadores da seleção brasileria vão jogar na copa do mundo!");
         // estou sobrescrevendo a classe
     }

     public static void main(String[] args) {
         Futebol futebol = new Futebol();// criando um objeto
         futebol.jogar(); // chamando o metodo jogar ja sobrescrito
     }
 }
