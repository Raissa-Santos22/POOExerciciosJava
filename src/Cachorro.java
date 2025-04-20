 class Cachorro extends SobreescitaAnimal {
    @Override

    // A classe Cachorro vai herdar os métodos da classe SobreescritaAnimal

     public void emitirsom(){
        System.out.println("Au Au"); // vamos sobrescrever o metodo emitir som da classe mãe SobrescritaAnimal
    }
     public static void main(String [] args){
        Cachorro cachorro = new Cachorro(); // criamos o objeto cachorro
        cachorro.emitirsom(); // chamamos o metodo
        SobreescitaAnimal animal = new SobreescitaAnimal(); // objeto animal
        animal.emitirsom(); // metodo da classe mãe
     }
}
