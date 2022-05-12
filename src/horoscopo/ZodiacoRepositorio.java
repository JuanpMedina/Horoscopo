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
public interface ZodiacoRepositorio {
    String calcularSigno(int dia, String mes);
    boolean esMayorDeEdad(int edad);
    String determinarRegalo(boolean esMayor);
}
