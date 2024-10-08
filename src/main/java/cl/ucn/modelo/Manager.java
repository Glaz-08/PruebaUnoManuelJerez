package cl.ucn.modelo;

public class Manager{
    private ManagerObserver o;
    private SQLite datos;

    public Manager(){
        o=new ManagerObserver();
    }
    //metodos que tienen nque avisar que notifican

    public void AbrirArch(SQLite datos){
        this.datos = new SQLite(datos);
        Evento.notify("abierto",datos.name);
    }
    public void GuardarArch(){
        datos.write();
        Evento.notify("abierto",datos.name);
    }
    public void setNombre(String nombre){
        //cambiar el nombre del evento y notificar
    }

    public void setFecha(String fecha){
        //cambiar la fecha del evento y notificar
    }
    
    public void setLugar(String lugar){
        //cambiar el lugar del evento y notificar
    }

}