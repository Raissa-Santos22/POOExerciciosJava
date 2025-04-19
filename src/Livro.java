public class Livro {
    private String titulo;
    private String autor;
    // atributos privados

    public static void main(String[] args) {
        Livro livro = new Livro(); // criação do objeto livro
        livro.setNome("Era uma vez um coração partido");
        livro.setAutor("Stephanie Garber");
        System.out.println("Livro: " + livro.getTitulo());
        System.out.println("Autora : " + livro.getAutor());
    }

    public void setNome(String titulo){
        this.titulo = titulo;
    }
    public void setAutor(String autor){
        this.autor = autor;
    }
    public String getTitulo(){
        return titulo;
    }
    public String getAutor(){
        return autor;
    }
}
