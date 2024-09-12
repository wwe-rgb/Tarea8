package ico.fes.aragon.unam.mx.clases;

public class clienteBanco {
    private String Nombre;
    private int Edad;
    private String lugarDondeVive;
    private Wallet billetera;


    public clienteBanco(){

    }

    public clienteBanco(String nombre, int edad, String lugarDondeVive, int saldo) {
        Nombre = nombre;
        Edad = edad;
        this.lugarDondeVive = lugarDondeVive;
        this.billetera = new Wallet(saldo);
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int edad) {
        Edad = edad;
    }

    public String getLugarDondeVive() {
        return lugarDondeVive;
    }

    public void setLugarDondeVive(String lugarDondeVive) {
        this.lugarDondeVive = lugarDondeVive;
    }

    public Wallet getBilletera() {
        return billetera;
    }

    public void setBilletera(Wallet billetera) {
        this.billetera = billetera;
    }


    @Override
    public String toString() {
        return "clienteBanco{" +
                "Nombre='" + Nombre + '\'' +
                ", Edad=" + Edad +
                ", lugarDondeVive='" + lugarDondeVive + '\'' +
                ", billetera=" + billetera +
                '}';
    }
}
