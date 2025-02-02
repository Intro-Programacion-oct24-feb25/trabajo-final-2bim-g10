/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clubciclismo;
/**
 *
 * @author Luis
 */
import java.util.Scanner;

public class Ciclismo {

    public static String registrarParticipanteCiclismo() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Registro de participante en Ciclismo");
        System.out.println("Nombre del participante:");
        String nombre = entrada.nextLine();
        System.out.println("Edad:");
        String edad = entrada.nextLine();
        System.out.println("Tipo de ciclismo (montaña, ruta, urbano):");
        String tipo = entrada.nextLine();
        System.out.println("Ciudad: ");
        String ciudad = entrada.nextLine();
        System.out.println("Marca de bicicleta preferida:");
        String marca = entrada.nextLine();
        String cadena = String.format("Ciclismo:\n- Nombre: %s\n- Edad: %s\n"
                + "- Ciudad: %s\n- Tipo: %s\n- Marca: %s\n"
                + "|||||||||||||||||||||||||||||||||||||||||||||||||||",
                 nombre, edad, ciudad, tipo, marca);
        return cadena;
    }
}
