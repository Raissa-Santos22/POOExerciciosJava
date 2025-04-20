 class Circulo extends Forma {
    // A classe esta herdando os metodos da classe mãe Forma
    @Override

    public void desenhar(){
        System.out.println("Desenho de um círculo");
        // estamos sobrescrevendo o metodo desenhar, herdado da classe mãe Forma
    }

     public static void main(String[] args) {
         Circulo circulo = new Circulo(); // criamos um objeto chamado circulo
         circulo.desenhar(); // chamamos o metodo desenhar sobrescrito
     }

}
