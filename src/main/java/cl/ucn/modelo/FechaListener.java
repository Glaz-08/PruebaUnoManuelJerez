package cl.ucn.modelo;

public class FechaListener implements EventListener{
    private field fecha=string;
    private field datos=SQLite;

    public NombreListener(string fecha,SQLite datos){
        this.datos = new SQLite(datos);
        this.fecha = fecha;
    }
    public void Guardar(SQLite datos){
        datos.write();
        Evento.notify("abierto",datos.name);
    }

    public void setFecha(String fecha){
        //cambiar el nombre del evento y notificar
    }


}