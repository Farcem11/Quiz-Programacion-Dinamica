package Mochila;

import java.util.ArrayList;

public class QuizDinamica 
{   
    static Matriz Algoritmo(Mochila pMochila, ArrayList<Objeto> pListaDeObjetos)
    {
        Matriz Optimos = new Matriz(pListaDeObjetos.size()+1, pMochila.getCapacidad()+1);

        for (int i = 1; i <= pListaDeObjetos.size(); i++)
        {
            int Peso = pListaDeObjetos.get(i-1).getPeso();
            int Valor = pListaDeObjetos.get(i-1).getValor();
            
            for (int j = 0; j < pMochila.getCapacidad(); j++)
            {
                Optimos.getMatriz()[i][j] = Optimos.getMatriz()[i-1][j];
            }
            
            for(int j = Peso; j <= pMochila.getCapacidad(); j++)
            {
                Optimos.getMatriz()[i][j] = Math.max(Optimos.getMatriz()[i-1][j], Optimos.getMatriz()[i-1][j-Peso] + Valor);
            }
        }
        return Optimos;
    }
    
    public static void main(String[] args)
    {
        Mochila mochila = new Mochila(4);
        //new Objeto(Valor,Peso)
        Objeto Jugo = new Objeto(8,1);
        Objeto Mapa = new Objeto(7,2);
        Objeto Botella = new Objeto(11,3);
        
        ArrayList<Objeto> ListaDeObjetos = new ArrayList();
        
        ListaDeObjetos.add(Jugo);
        ListaDeObjetos.add(Mapa);
        ListaDeObjetos.add(Botella);
        
        Matriz MatrizOptimos = Algoritmo(mochila, ListaDeObjetos);
        System.out.println("Matriz de soluciones optimas:");
        MatrizOptimos.Mostrar();
        
        System.out.println("Basado en el tamaño de la mochila, el mayor valor que se puede obtener de los objetos es: " + 
        MatrizOptimos.getMatriz()[ListaDeObjetos.size()][mochila.getCapacidad()]);
    }
}
