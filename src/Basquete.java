 class Basquete extends Esporte {
    // A classe basquete vai herdar o metodo jogar da classe esporte
    @Override

     public void jogar(){
        System.out.println("Os jogadores de basquete jogam na quadra"); // sobrescrevendo o metodo jogar herdado da classe mae Esporte
    }

     public static void main(String[] args) {
         Basquete basquete = new Basquete(); // criação de um objeto chamado basquete
         basquete.jogar(); // chamando o metodo jogar já sobrescrito
     }
}
