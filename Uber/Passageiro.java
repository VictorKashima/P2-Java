package Uber;

/*Herança e Encapsulamento
Herança = Passageiro herdando atributos de Pessoa
Encapsulamento = Privatização do atributo destino, restringindo sua manipulação a apenas com o get e o set.*/
public class Passageiro extends Pessoa{
    private String destino;

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }
}