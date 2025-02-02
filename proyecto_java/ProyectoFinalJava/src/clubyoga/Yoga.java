/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clubyoga;
/**
 *
 * @author Luis
 */
import java.util.Scanner;

public class Yoga {

    public static String registrarParticipanteYoga() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Registro de participante en Yoga");
        System.out.println("Nombre del participante: ");
        String nombre = entrada.nextLine();
        System.out.println("Edad: ");
        String edad = entrada.nextLine();
        System.out.println("Nivel (principiante, intermedio, avanzado): ");
        String nivel = entrada.nextLine();
        System.out.println("Ciudad: ");
        String ciudad = entrada.nextLine();
        System.out.println("Estilo de yoga preferido: ");
        String estilo = entrada.nextLine();
        String cadena = String.format("Yoga: \n- Nombre:%s\n- Edad: %s\n"
                + "- Ciudad: %s\n- Nivel: %s\n- Estilo: %s\n"
                + "|||||||||||||||||||||||||||||||||||||||||||||||||||",
                nombre, edad, ciudad, nivel, estilo);
        return cadena;
    }
}
