 class Circulo extends Forma {

    @Override

    public void desenhar(){
        System.out.println("Desenho de um círculo");
    }

     public static void main(String[] args) {
         Circulo circulo = new Circulo();
         circulo.desenhar();
     }

}
