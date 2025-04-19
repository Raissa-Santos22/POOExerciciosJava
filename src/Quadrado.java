class Quadrado extends Forma{

    @Override

    public void desenhar(){
        System.out.println("Desenhando um quadrado");
    }

    public static void main(String[] args) {
        Quadrado quadrado = new Quadrado();
        quadrado.desenhar();
    }
}
