package cl.ucn.modelo;
import java.util.ArrayList;
import java.util.Observer;

public class ManagerObserver{

    public ManagerObserver(){}

    private ArrayList<Evento> listaDeObservadores;

    public void AgregarObserver(Evento o){
        listaDeObservadores.add(o);
    }

    public void EliminarObserver(Evento o){
        for (Evento listaDeObservadores : Evento) {
            if(o.equals(Evento)){
                listaDeObservadores.deleted(o);
            }
        }
    }
    public Evento BuscarObserver(Evento o){
        for (Evento listaDeObservadores : Evento) {
            if(o.equals(Observer)){
                return o;
            }
        }
        return null;
    }






}