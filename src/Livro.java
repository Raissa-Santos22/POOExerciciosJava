public class Livro {
    private String titulo;
    private String autor;
    // atributos privados

    public static void main(String[] args) {
        Livro livro = new Livro(); // criação do objeto livro
        livro.setNome("Era uma vez um coração partido"); // definição do titulo
        livro.setAutor("Stephanie Garber"); // definição do autor
        System.out.println("Livro: " + livro.getTitulo()); // mostra o titulo
        System.out.println("Autora : " + livro.getAutor()); // mostra o autor
    }

    public void setNome(String titulo){
        this.titulo = titulo;
    }
    public void setAutor(String autor){
        this.autor = autor;
    }
    /*o uso do this para acessar o atributo titulo e autor;
    o metodo Setter serve para definir o titulo e o autor ou atualizar por ser uma classe com
    os atributos privados, ele sempre terá o void por ser sem retorno ;*/
    public String getTitulo(){
        return titulo;
    }
    public String getAutor(){
        return autor;
    }
    // // o get vai mostrar o titulo e o autor da classe Livro, uso do return, pois é com retorno
}
