class Pessoa {
    private String nome; // A classe Pessoa tem os atributos nome e idade privados
    private int idade;

    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa(); // criação do objeto pessoa
        pessoa.SetIdade(19);
        pessoa.setNome("Camila");
        System.out.println("Prazer em te conhecer " + pessoa.getNome());
        System.out.println("Voce tem " + pessoa.getIdade() + " anos de idade!");
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public void SetIdade(int idade){
        this.idade = idade;
    }
    /*
    o uso do this para acessar o atributo nome e idade;
    o metodo Setter serve para definir o nome e a idade ou atualizar por ser uma classe com
    os atributos privados, ele sempre terá o void por ser sem retorno;
    */

    public String getNome(){
        return nome;
    }
    public int getIdade() {
        return idade;
    }

    /*
    O getter vai retornar o valor da idade e do nome, por isso tem o uso do return, é um metodo
    com retorno, e também vai ser utiliado porque a classe tem seus atributos privados
    */
}

