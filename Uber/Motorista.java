package Uber;

/*Herança e Encapsulamento
Herança = Motorista herdando atributos de Pessoa
Encapsulamento = Privatização do atributo carro, restringindo sua manipulação a apenas com o get e o set.*/
public class Motorista extends Pessoa{
    private String carro;

    public String getCarro() {
        return carro;
    }

    public void setCarro(String carro) {
        this.carro = carro;
    }
}