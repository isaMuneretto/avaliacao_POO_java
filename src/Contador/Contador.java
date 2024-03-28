package Contador;

public class Contador {
    Double valor;

    public void incrementarValor(){
        valor++;
    }
    public void decrementarValor(){
        valor--;
    }
    public void valorAtual(){
        System.out.println("Valor atual é:"+valor);
    }
}
