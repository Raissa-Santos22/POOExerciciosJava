 class Cachorro extends SobrescritaAnimal {
    @Override

    // A classe Cachorro vai herdar os métodos da classe SobreescritaAnimal

     public void emitirsom(){
        System.out.println("Au Au"); // vamos sobrescrever o metodo emitir som da classe mãe SobrescritaAnimal
    }
     public static void main(String [] args){
         SobrescritaAnimal sobrescritaAnimal = new SobrescritaAnimal(); // criamos o objeto animal;
         Cachorro cachorro = new Cachorro();

         sobrescritaAnimal.emitirsom(); // exibimos o metodo emitirsom da classe Sobrescrita Animal
         cachorro.emitirsom(); // exibimos o metodo emitirsom da classe Cachorro depois de sobrescrita


     }
}
