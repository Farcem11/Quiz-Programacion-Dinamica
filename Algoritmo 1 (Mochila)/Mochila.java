package Mochila;
import java.util.ArrayList;

public class Mochila 
{
    private ArrayList<Objeto> ListaDeObjetos;;
    private int Capacidad;
    
    Mochila(int pCapacidad)
    {
        ListaDeObjetos = new ArrayList<>();
        Capacidad = pCapacidad;
    }
    
    public void Meter(Objeto pObjeto)
    {
        ListaDeObjetos.add(pObjeto);
    }
    
    public ArrayList<Objeto> getListaDeObjetos() {
        return ListaDeObjetos;
    }

    public void setListaDeObjetos(ArrayList<Objeto> ListaDeObjetos) {
        this.ListaDeObjetos = ListaDeObjetos;
    }

    public int getCapacidad() {
        return Capacidad;
    }

    public void setCapacidad(int Capacidad) {
        this.Capacidad = Capacidad;
    }
}
