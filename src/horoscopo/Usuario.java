/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package horoscopo;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

/**
 *
 * @author User
 */
public class Usuario{
    private String identificacion;
    private String nombre;
    private String mesNacimiento;
    private String dulceFavorito;
    private int diaNacimiento;
    private int añoNacimiento;

    public Usuario(String identificacion, String nombre, String mesNacimiento, String dulceFavorito, int diaNacimiento, int añoNacimiento) {
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.mesNacimiento = mesNacimiento;
        this.dulceFavorito = dulceFavorito;
        this.diaNacimiento = diaNacimiento;
        this.añoNacimiento = añoNacimiento;
    }
    
    public int mesAMesNumero(){
        switch(this.mesNacimiento){
            case "enero":
                return 1;
            case "febrero":
                return 2;
            case "marzo":
                return 3;
            case "abril":
                return 4;
            case "mayo":
                return 5;
            case "junio":
                return 6;
            case "julio":
                return 7;
            case "agosto":
                return 8;
            case "septiembre":
                return 9;
            case "octubre":
                return 10;
            case "noviembre":
                return 11;
            case "diciembre":
                return 12;
            default:
                System.out.println("El mes ingresado no se reconoce como un mes valido, verifique por favor");
                return 0;
        }
    }
    
    public int calcularEdad(){
        Period edad  = Period.between(LocalDate.of(this.añoNacimiento, mesAMesNumero(), this.diaNacimiento), LocalDate.now());
        return edad.getYears();
    }

    public boolean esMayor(){
        int edad = calcularEdad();
        return edad > 12;
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

    public String getMesNacimiento() {
        return mesNacimiento;
    }

    public void setMesNacimiento(String mesNacimiento) {
        this.mesNacimiento = mesNacimiento;
    }

    public String getDulceFavorito() {
        return dulceFavorito;
    }

    public void setDulceFavorito(String dulceFavorito) {
        this.dulceFavorito = dulceFavorito;
    }

    public int getDiaNacimiento() {
        return diaNacimiento;
    }

    public void setDiaNacimiento(int diaNacimiento) {
        this.diaNacimiento = diaNacimiento;
    }

    public int getAñoNacimiento() {
        return añoNacimiento;
    }

    public void setAñoNacimiento(int añoNacimiento) {
        this.añoNacimiento = añoNacimiento;
    }
    
    
}
