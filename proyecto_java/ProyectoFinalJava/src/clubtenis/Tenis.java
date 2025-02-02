/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clubtenis;
/**
 *
 * @author Luis
 */
import java.util.Scanner;

public class Tenis {

    public static String registrarParticipanteTenis() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Registro de participante en Tenis");
        System.out.println("Nombre del participante: ");
        String nombre = entrada.nextLine();
        System.out.println("Edad: ");
        String edad = entrada.nextLine();
        System.out.println("Nivel (principiante, intermedio, avanzado): ");
        String nivel = entrada.nextLine();
        System.out.println("Ciudad: ");
        String ciudad = entrada.nextLine();
        System.out.println("Mano hábil (derecha/izquierda): ");
        String mano = entrada.nextLine();
        String cadena = String.format("Tenis: \n- Nombre: %s\n- Edad: %s\n"
                + "- Ciudad: %s\n- Nivel: %s\n- Mano hábil: %s\n"
                + "|||||||||||||||||||||||||||||||||||||||||||||||||||",
                nombre, edad, ciudad, nivel, mano);
        return cadena;
    }
}
