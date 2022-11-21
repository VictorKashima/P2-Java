package Uber;

/*Classe abstrata com encapsulamento
Classe abstrata = Definindo classe Pessoa como superclasse.
Encapsulamento = Privatização do atributo nome, restringindo sua manipulação a apenas com o get e o set.*/
public abstract class Pessoa{
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
}
