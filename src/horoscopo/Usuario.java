/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package horoscopo;

/**
 *
 * @author User
 */
public class Usuario implements ZodiacoRepositorio{
    private String identificacion;
    private String nombre;
    private int edad;
    private int diaNacimiento;
    private String mesNacimiento;

    public Usuario(String identificacion, String nombre, int edad, int diaNacimiento, String mesNacimiento) {
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.edad = edad;
        this.diaNacimiento = diaNacimiento;
        this.mesNacimiento = mesNacimiento;
    }
    
    @Override
    public String calcularSigno(int dia, String mes) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean esMayorDeEdad(int edad) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String determinarRegalo(boolean esMayor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
 
    
    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getDiaNacimiento() {
        return diaNacimiento;
    }

    public void setDiaNacimiento(int diaNacimiento) {
        this.diaNacimiento = diaNacimiento;
    }

    public String getMesNacimiento() {
        return mesNacimiento;
    }

    public void setMesNacimiento(String mesNacimiento) {
        this.mesNacimiento = mesNacimiento;
    }
}
