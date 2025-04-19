public class Produto {
    private String nome;
    private double preco;
    // Os atributos da classe Produto são privados, para acessar é preciso o uso do get e set


    public void setNome(String nome){
        this.nome = nome;
    }
    public void setPreco(double preco){
        this.preco = preco;
    }
    // O set vai definir o nome e do preço do produto, uso do void por ser sem retorno
    public String getNome(){
        return nome;
    }
    public double getPreco(){
        return preco;
    }
    // o get vai mostrar o nome e do preço do produto, uso do return, pois é com retorno
    public static void main(String[] args) {
        Produto produto = new Produto();
        produto.setNome("Iphone"); // definição do nome
        produto.setPreco(4000); // definição do preço
        System.out.println("Produto: " + produto.getNome() ); // mostra o nome
        System.out.println("Preço : R$ " + produto.getPreco()); // mostra o preço
    }

}
