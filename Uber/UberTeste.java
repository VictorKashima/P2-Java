package Uber;

//Victor Kashima & Matheus Morandi
public class UberTeste {
    public static void main(String args[]){
        Motorista joao = new Motorista();
        Passageiro marcos = new Passageiro();
        Viagem a = new Viagem();

        joao.setNome("João");
        marcos.setNome("Marcos");

        joao.setCarro("Corsa Hatch 1.4 2008");
        marcos.setDestino("Arco Íris");

        a.setDistancia(80);
        a.calcular(1.5);
        a.realizarViagem(marcos);
        
    }
}
