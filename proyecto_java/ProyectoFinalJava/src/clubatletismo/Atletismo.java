/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clubatletismo;
/**
 *
 * @author Luis
 */
import java.util.Scanner;

public class Atletismo {

    public static String registrarParticipanteAtletismo() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Registro de participante en Atletismo");
        System.out.println("Nombre del participante:");
        String nombre = entrada.nextLine();
        System.out.println("Edad:");
        String edad = entrada.nextLine();
        System.out.println("Especialidad (carreras, salto, lanzamiento): ");
        String especialidad = entrada.nextLine();
        System.out.println("Ciudad:");
        String ciudad = entrada.nextLine();
        System.out.println("Récord personal:");
        String record = entrada.nextLine();
        String cadena = String.format("Atletismo: \n- Nombre: %s\n- Edad: %s\n"
                + "- Ciudad: %s\n- Especialidad: %s\n- Récord: %s\n"
                + "|||||||||||||||||||||||||||||||||||||||||||||||||||",
                nombre, edad, ciudad, especialidad, record);

        return cadena;
    }
}
