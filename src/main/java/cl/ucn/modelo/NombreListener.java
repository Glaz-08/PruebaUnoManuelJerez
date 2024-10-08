package cl.ucn.modelo;

public class NombreListener implements EventListener{
    private field nombre=string;
    private field datos=SQLite;

    public NombreListener(string nombre,SQLite datos){
        this.datos = new SQLite(datos);
        this.nombre = nombre;
    }
    public void Guardar(SQLite datos){
        datos.write();
        Evento.notify("abierto",datos.name);
    }

    public void setNombre(String nombre){
        //cambiar el nombre del evento y notificar
    }


}