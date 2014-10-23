package Mochila;

public class Objeto 
{
    private int Peso;
    private int Valor;
    
    Objeto(int pValor, int pPeso)
    {
        Peso = pPeso;
        Valor = pValor;
    }
    public int getPeso() {
        return Peso;
    }

    public void setPeso(int Peso) {
        this.Peso = Peso;
    }

    public int getValor() {
        return Valor;
    }

    public void setValor(int Valor) {
        this.Valor = Valor;
    }
}