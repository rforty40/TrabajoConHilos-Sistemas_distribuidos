package clases;

import javax.swing.JTextArea;

public class Cliente extends Thread {

    private String usuario;
    private String contrasena;
    private String codigoCelular;
    private JTextArea area;

    public Cliente(String usuario, String contrasena, String codigoCelular) {
        this.usuario = usuario;
        this.contrasena = contrasena;
        this.codigoCelular = codigoCelular;

    }

    public void setArea(JTextArea area) {
        this.area = area;
    }

    @Override
    public void run() {

        area.append("**********Datos de la cuenta********** "
                + "\nNombre: " + usuario + "\nContraseña: " + contrasena + "\nCodigo Celular: " + codigoCelular);
        int contador = 0;
        while (!Thread.currentThread().isInterrupted() && contador < 120) {
            // System.out.println("Hilo en proceso actual -->  " + Thread.currentThread().getName());
            area.append("\n" + usuario + " lleva " + (contador + 1) + " seg en la sesión");
            // System.out.println("\n" + usuario + " lleva " + (contador + 1) + " seg en la sesión");
            contador++;
            try {
                Thread.currentThread().sleep(1000);
            } catch (InterruptedException ex) {
                area.append("\nSesión Finalizada");
                Thread.currentThread().interrupt();
            }

        }

    }

}
