package Uber;

/*Encapsulamento, Polimorfismo, Interface e Exception.
Interface = Utilização do método calcular da interface CalculaTarifa.java sobrescrevendo com @Override.
Polimorfismo = Utilizando atributo a.getNome da clase Passageiro herdado da superclase Pessoa.
Encapsulamento = Privatização do atributo distancia, restringindo sua manipulação a apenas com o get e o set.
Exception = Tratando erro impedindo que a distancia seja menor que 0.*/
public class Viagem implements CalculaTarifa{
    //Passada em Km
    private int distancia;

    public int getDistancia() {
        return distancia;
    }
    public void setDistancia(int distancia) {
        this.distancia = distancia;
    }

    void realizarViagem(Passageiro a) {
        if (distancia < 0) {
            IllegalArgumentException erro = new IllegalArgumentException();
            throw erro;
        } else {
            System.out.println("Realizando a viagem do passageiro  "+a.getNome()+"para "+a.getDestino());
        }
    }

    @Override
    public void calcular(double precokm){
        double preco = this.distancia * precokm;
        System.out.println("Valor da corrida: "+preco);
    }
        
}