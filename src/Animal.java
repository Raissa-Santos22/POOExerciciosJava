public class Animal {
    private String tipo;
    private String som;

    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    public void setSom(String som){
        this.som = som;
    }
    public String getTipo(){
        return tipo;
    }
    public String getSom(){
        return som;
    }

    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.setTipo("Cachorro");
        animal.setSom("Au Au");
        System.out.println("O animal " + animal.getTipo() + " faz " + animal.getSom());
    }
}
