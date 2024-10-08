package cl.ucn.modelo;

interface EventListener {
    //los metodos que notifican

    void AbrirArch(SQLite datos);

    void GuardarArch();

    void setNombre(String nombre);

    void setFecha(String fecha);

    void setLugar(String lugar);

    
}