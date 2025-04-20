 class Professor extends Funcionario {
    // A classe Professor está herdando o metodo da classe Funcionario
    @Override

     public void trabalhar(){
        System.out.println("Professor ensinando Java");
        // estamos sobrescrevendo o metodo
    }

     public static void main(String[] args) {
         Professor professor = new Professor(); // criando um novo objeto professor
         professor.trabalhar();
         Funcionario funcionario = new Funcionario(); // criando o objeto funcionario
         funcionario.trabalhar();

     }
}
