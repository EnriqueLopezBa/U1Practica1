
import static javax.swing.JOptionPane.showMessageDialog;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author enriq
 */
public class Persona {
    private String nombre,apellidos,telefono,direccion;
    
    public Persona[] pe = new Persona[50];
    
     public int co = 0;

    public Persona() {
    }

    public Persona(String nombre, String apellidos, String telefono, String direccion) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Persona[] getPe() {
        return pe;
    }

    public void setPe(Persona[] pe) {
        this.pe = pe;
    }

    public int getCo() {
        return co;
    }

    public void setCo(int co) {
        this.co = co;
    }
     
   
    
 
}
