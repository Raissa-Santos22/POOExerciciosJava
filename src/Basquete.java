 class Basquete extends Esporte {
    // A classe basquete vai herdar o metodo jogar da classe esporte
    @Override

     public void jogar(){
        System.out.println("Os jogadores de basquete jogam na quadra");
    }

     public static void main(String[] args) {
         Basquete basquete = new Basquete();
         basquete.jogar();
     }
}
