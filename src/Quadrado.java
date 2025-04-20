class Quadrado extends Forma{
    // A classe esta herdando os metodos da classe mãe Forma
    @Override

    public void desenhar(){
        System.out.println("Desenhando um quadrado");
        // estamos sobrescrevendo o metodo desenhar, herdado da classe mãe Forma
    }

    public static void main(String[] args) {
        Quadrado quadrado = new Quadrado();// criação de um novo objeto, chamado quadrado
        quadrado.desenhar(); // chamamos o metodo desenhar ja sobrescrito
    }
}
