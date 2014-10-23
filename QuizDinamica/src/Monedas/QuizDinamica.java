package Monedas;

import java.util.ArrayList;
import Mochila.Matriz;
import java.io.IOException;

public class QuizDinamica 
{
    
    static int Algoritmo(ArrayList<Moneda> ListaDeMonedas, int Cambio) throws IOException
    {
        int[] CantidadDeSoluciones = new int[Cambio+1];
        for(int i = 0; i < Cambio+1; i++)
        {
            CantidadDeSoluciones[i] = 0;
        }   

        CantidadDeSoluciones[0] = 1;

        for(int i = 0; i < ListaDeMonedas.size(); i++)
        {
            for(int j = ListaDeMonedas.get(i).getValor(); j <= Cambio; j++)
            {
                CantidadDeSoluciones[j] += CantidadDeSoluciones[j-ListaDeMonedas.get(i).getValor()];                 
            }
        }
        return CantidadDeSoluciones[Cambio];
    } 
    
    public static void main(String[] args) throws IOException
    {
        Moneda moneda1 = new Moneda(2);
        Moneda moneda2 = new Moneda(3);
        Moneda moneda3 = new Moneda(5);
        Moneda moneda4 = new Moneda(6);
        
        ArrayList<Moneda> ListaDeMonedas = new ArrayList<>();
        ListaDeMonedas.add(moneda1);
        ListaDeMonedas.add(moneda2);
        ListaDeMonedas.add(moneda3);
        ListaDeMonedas.add(moneda4);
        
        System.out.println("Cantidad de soluciones que resuelven el cambio de moneda: " + Algoritmo(ListaDeMonedas, 10));
    }
}
