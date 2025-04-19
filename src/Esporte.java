 class Esporte { // classe mãe
    public void jogar(){ // metodo jogar
        System.out.println("O jogador pratica esportes"); // mensagem
    }

     public static void main(String[] args) {
         Esporte esporte = new Esporte();
         esporte.jogar();

         Basquete basquete = new Basquete();
         basquete.jogar();

         Futebol futebol = new Futebol();
         futebol.jogar();


     }
}
