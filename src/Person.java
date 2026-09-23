import java.time.LocalDate;
import java.time.LocalDateTime;

/// Classe representativa de uma pessoa
public class Person {

    private String nome;
    private String apelido;
    private int idade;

    /// Construtor default (vazio)
    public Person(){
        this.nome = "";
        this.apelido = "";
        this.idade = 0;
    }

    /// Construtor com parametros de entrada
    /// @param nome Nome da pessoa
    /// @param apelido Apelido da pessoa
    /// @param idade Idade da pessoa
    public Person(String nome, String apelido, int idade){
        this.nome=nome;
        this.apelido=apelido;
        this.idade=idade;
    }

    /// Função para obter o nome da pessoa
    /// @return O nome da pessoa
    public String getNome() {
        return nome;
    }

    /// Função para atribuir um nome à pessoa
    /// @param nome O noma a atribuir à pessoa
    public void setNome(String nome) {
        this.nome = nome;
    }

    /// Função para obter o apelido da pessoa
    /// @return O apelido da pessoa
    public String getApelido() {
        return apelido;
    }

    /// Função para atribuir um apelido à pessoa
    /// @param apelido O apelido a atribuir à pessoa
    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    /// Função para obter a iadade da pessoa
    /// @return A idade da pessoa
    public int getIdade() {
        return idade;
    }

    /// Função para atribuir uma idade à pessoa
    /// @param idade A idade a atribuir à pessoa
    public void setIdade(int idade) {
        if(idade>0 && idade < 150)
            this.idade = idade;
    }

    /// Função que calcula o ano de nascimento de uma pessoa dada a sua idade
    /// @return o ano de nascimento da pessoa
    public int calcularAnoNascimento(){
        return LocalDate.now().getYear()-idade;
    }

    /// Função que compara as idades da pessoa instancida e de uma outra pessoa passada por paramtro. Escreve no ecrã um texto informativo do resultado.
    /// @param p1 O objeto Pessoa a comparar
    public void compararIdades(Person p1){
        if (this.idade > p1.getIdade()){
            IO.println("O " + this.nome +" "+ this.apelido + " é mais velho do que o " + p1.getNome() +" "+ p1.getApelido() +".");
        }else if(this.idade < p1.getIdade()){
            IO.println("O " + this.nome +" "+ this.apelido + " é mais novo do que o " + p1.getNome() +" "+ p1.getApelido() +".");
        }else{
            IO.println("O " + this.nome +" "+ this.apelido + " tem a mesma idade do que o " + p1.getNome() +" "+ p1.getApelido() +".");
        }
    }

    /// Método que devolve ao utilizador uma informação do nome, apelido e idade da Pessoa
    /// @return Um texto informativo scom o nome, apelido e idade da Pessoa
    @Override
    public String toString(){
        // Esta linha é a mesma coisa que ter:
        // return this.nome + " " + this.apelido + ", " + this.idade + " anos";
        return String.format("%s %s, %d anos", this.nome, this.apelido, this.idade);
    }

}
