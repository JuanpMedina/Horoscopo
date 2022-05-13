/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package horoscopo;

import java.util.Random;

/**
 *
 * @author User
 */
public class Zodiaco {
    private final String [] frases = {
        "La oscuridad no puede expulsar a la oscuridad: sólo la luz puede hacer eso.",
        "El odio no puede expulsar al odio: sólo el amor puede hacer eso.",
        "Un amigo es alguien que sabe todo sobre ti y todavía te ama.",
        "La comprensión es el primer paso para la aceptación y sólo aceptando puede recuperarse.",
        "La mayor declaración de amor es la que no se hace, el hombre que siente mucho habla poco.",
        "Si se puede hacer reír a una mujer, puede obligarla a hacer cualquier cosa.",
        "No olvides nunca que el primer beso no se da con la boca, sino con los ojos.",
        "Las personas no aprenden nunca nada cuando se les dice, tienen que descubrirlo por sí mismas",
        "Si lloras porque no puedes ver el sol, las lágrimas no te dejarán ver las estrellas.",
        "No existe mejor pregunta que una mirada, ni mejor respuesta que una sonrisa.",
        "Uno es dueño de lo que calla y esclavo de lo que habla",
        "Algunos buscan la felicidad, otros la crean",
        "Muchas veces es mejor olvidar lo que uno siente, y recordar lo que uno vale.",
        "Las ventas dependen de la actitud del vendedor, no de la actitud del potencial cliente.",
        "El éxito es la capacidad de ir de fracaso en fracaso sin perder el entusiasmo.",
        "No veo la miseria que hay, sino la belleza que aún queda.",
        "Uno es dueño de lo que calla y esclavo de lo que habla.",
        "Las ventas dependen de la actitud del vendedor, no de la actitud del potencial cliente.",
        "Ser valiente no quiere decir que no tengas miedo, es actuar a pesar de éste."
    };
    private final String [] regalosNiño = {
        "Caramelo",
        "Menta",
        "Chocolate",
        "BomBomBum",
        "Barrilete",
        "Helado",
        "Gomitas",
        "Chicle",
        "Alfajor",
        "Donuts",
        "Quipitos",
        "Quiebra muelas"
    };
    
    private final String [] regalosAdulto = {
        "Una arruga en el tiempo",
        "A sangre fría",
        "Hijos de la medianoche",
        "El Principito",
        "Cumbres borrascosas",
        "El corazón de las tinieblas",
        "Lolita",
        "Fortunata y Jacinta",
        "El extranjero",
        "La dama de blanco",
        "La metamorfosis",
        "Grandes esperanzas",
        "Fahrenheit 451",
        "La historia interminable",
        "El señor de las moscas",
        "El Gran Gatsby",
        "Las uvas de la ira",
        "Nuestra señora de París",
        "El nombre de la rosa",
        "Las ciudades invisibles",
        "Crimen y castigo"
    };

    public String fraseHoroscopo(){
        Random rd = new Random();
        return this.frases[rd.nextInt((this.frases.length - 0) + 0) + 0];
    }
    
    public String calcularSignoZodiacal(int dia, String mes){
        if (dia>=21 && mes.equals("Marzo")||dia<=2 && mes.equals("Abril")) {
            return "Aries";
        }else if(dia>=21 && mes.equals("Abril")||dia<=20 && mes.equals("Mayo")){
            return "Tauro";
        }else if(dia>=21 && mes.equals("Mayo")||dia<=21 && mes.equals("Junio")){
            return "Geminis";
        }else if(dia>=22 && mes.equals("Junio")||dia<=22 && mes.equals("Julio")){
            return "Cancer";
        }else if(dia>=23 && mes.equals("Julio")||dia<=22 && mes.equals("Agosto")){
            return "Leo";
        }else if(dia>=23 && mes.equals("Agosoto")||dia<=22 && mes.equals("Septiembre")){
            return "Virgo";
        }else if(dia>=23 && mes.equals("Septiembre")||dia<=22 && mes.equals("Octubre")){
            return "Libra";
        }else if(dia>=23 && mes.equals("Octubre")||dia<=21 && mes.equals("Noviembre")){
            return "Escorpio";
        }else if(dia>=22 && mes.equals("Noviembre")||dia<=21 && mes.equals("Diciembre")){
            return "Sagitario";
        }else if(dia>=22 && mes.equals("Diciembre")||dia<=20 && mes.equals("Enero")){
            return ("Capricornio");
        }else if(dia>=21 && mes.equals("Enero")||dia<=19 && mes.equals("Febrero")){
            return ("Acuario");
        }else if(dia>=20 && mes.equals("Febrero")||dia<=20 && mes.equals("Marzo")){
            return ("Piscis");
        }else{
            return "DESCONOCIDO";
        }
    }
    
    public String generarRegalo(boolean esMayor){
        if(esMayor){
            Random rd = new Random();
            return this.regalosAdulto[rd.nextInt((this.regalosAdulto.length - 0) + 0) + 0];
        }else{
            Random rd = new Random();
            return this.regalosNiño[rd.nextInt((this.regalosNiño.length - 0) + 0) + 0];
        }
    }
    
    
}
