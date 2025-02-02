/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clubfutbol;
/**
 *
 * @author Luis
 */
import java.util.Scanner;

public class Futbol {

    public static String registrarParticipanteFutbol() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Registro de participante en Fútbol");
        System.out.println("Nombre del participante:");
        String nombre = entrada.nextLine();
        System.out.println("Edad: ");
        String edad = entrada.nextLine();
        System.out.println("Posición preferida:");
        String posicion = entrada.nextLine();
        System.out.println("Ciudad:");
        String ciudad = entrada.nextLine();
        System.out.println("Equipo favorito:");
        String equipo = entrada.nextLine();
        String cadena = String.format("Fútbol: \n- Nombre: %s\n- Edad: %s\n"
                + "- Ciudad: %s\n- Posición: %s\n- Equipo: %s\n"
                + "|||||||||||||||||||||||||||||||||||||||||||||||||||",
                nombre, edad, ciudad, posicion, equipo);
        return cadena;
    }
}
