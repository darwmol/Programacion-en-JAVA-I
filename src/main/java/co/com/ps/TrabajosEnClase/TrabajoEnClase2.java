package co.com.ps.TrabajosEnClase;
//El objeto es un computador
public class TrabajoEnClase2 {

        private String discoduro;
        private String memoriaRam;
        private String pantalla;
        private String procesador;

    public String getDiscoduro() {
        return discoduro;
    }

    public void setDiscoduro(String discoduro) {
        this.discoduro = discoduro;
    }

    public String getMemoriaRam() {
        return memoriaRam;
    }

    public void setMemoriaRam(String memoriaRam) {
        this.memoriaRam = memoriaRam;
    }

    public String getPantalla() {
        return pantalla;
    }

    public void setPantalla(String pantalla) {
        this.pantalla = pantalla;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public void comunicar(){
            System.out.println("Comunicacion");
        }
    public void procesardatos(){
        System.out.println("Procesamiento de datos");
    }
    public void almacenardatos(){
        System.out.println("Almacenamiento de datos");
    }
    public void navegar(){
        System.out.println("Navegación por intenet");
    }
}

