public class Animal {
    private String tipo;
    private String som;
    // atributos da classe animal são privados

    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    public void setSom(String som){
        this.som = som;
    }
    // O set vai definir o tipo e o som do animal, uso do void por ser sem retorno
    public String getTipo(){
        return tipo;
    }
    public String getSom(){
        return som;
    }
    // o get vai trazer o som e o tipo do animal, sendo usado o return

    public static void main(String[] args) {
        Animal animal = new Animal(); // criação do objeto animal
        animal.setTipo("Cachorro"); // definição do tipo do animal
        animal.setSom("Au Au"); // definição do som que o animal faz
        System.out.println("O animal " + animal.getTipo() + " faz " + animal.getSom());
    }


}


