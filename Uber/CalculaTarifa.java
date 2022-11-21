package Uber;

//Interface utilizada na Viagem.java para calcular o preço da viagem passando como parametro o preço que o motorista cobra por kilômetro.
public interface CalculaTarifa {
    public void calcular(double precokm);
}