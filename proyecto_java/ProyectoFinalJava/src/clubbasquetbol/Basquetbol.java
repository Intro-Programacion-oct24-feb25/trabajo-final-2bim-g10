/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clubbasquetbol;
/**
 *
 * @author Luis
 */
import java.util.Scanner;

public class Basquetbol {

    public static String registrarParticipanteBasquetbol() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Registro de participante en Básquetbol");
        System.out.println("Nombre del participante:");
        String nombre = entrada.nextLine();
        System.out.println("Edad:");
        String edad = entrada.nextLine();
        System.out.println("Posición preferida: ");
        String posicion = entrada.nextLine();
        System.out.println("Estatura:");
        String estatura = entrada.nextLine();
        System.out.println("Ciudad:");
        String ciudad = entrada.nextLine();
        String cadena = String.format("Básquetbol: \n- Nombre: %s\n- Edad: %s\n"
                + "- Ciudad: %s\n- Posición: %s\n- Estatura: %s\n"
                + "|||||||||||||||||||||||||||||||||||||||||||||||||||",
                nombre, edad, ciudad, posicion, estatura);
        return cadena;
    }
}
