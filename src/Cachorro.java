 class Cachorro extends SobreescitaAnimal {
    @Override

    // A classe Cachorro vai herdar os métodos da classe SobreescritaAnimal

     public void emitirsom(){
        System.out.println("Au Au"); // vamos sobrescrever o metodo emitir som
    }
     public static void main(String [] args){
        Cachorro cachorro = new Cachorro(); // criamos o objeto cachorro
        cachorro.emitirsom();
        SobreescitaAnimal animal = new SobreescitaAnimal();
        animal.emitirsom();
     }
}
