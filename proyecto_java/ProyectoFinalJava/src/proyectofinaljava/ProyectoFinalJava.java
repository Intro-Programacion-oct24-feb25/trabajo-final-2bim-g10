/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectofinaljava;

/**
 *
 * @author Luis
 */
import clubfutbol.Futbol;
import clubnatacion.Natacion;
import clubatletismo.Atletismo;
import clubbasquetbol.Basquetbol;
import clubciclismo.Ciclismo;
import clubtenis.Tenis;
import clubyoga.Yoga;

import java.util.Scanner;

public class ProyectoFinalJava {

    public static String[] actividades = {"Fútbol", "Natación", "Atletismo",
        "Básquetbol", "Ciclismo", "Tenis", "Yoga"};
    public static int[] participantes = new int[7];
    public static int actividadesRegistradas = 0;
    public static String datosAcumulados = "";

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        boolean bandera = true;

        while (bandera) {
            System.out.printf("Bienvenido al club: El deporte para la vida\n"
                    + "Seleccione la actividad para registrar un participante:\n");
            for (int i = 0; i < actividades.length; i++) {
                System.out.println((i + 1) + ". " + actividades[i]);
            }
            System.out.println("8. Salir");
            int opcion = entrada.nextInt();
            entrada.nextLine();

            switch (opcion) {
                case 1:
                    datosAcumulados = datosAcumulados
                            + Futbol.registrarParticipanteFutbol() + "\n";
                    participantes[0]++;
                    actividadesRegistradas++;
                    break;
                case 2:
                    datosAcumulados = datosAcumulados
                            + Natacion.registrarParticipanteNatacion() + "\n";
                    participantes[1]++;
                    actividadesRegistradas++;
                    break;
                case 3:
                    datosAcumulados = datosAcumulados
                            + Atletismo.registrarParticipanteAtletismo() + "\n";
                    participantes[2]++;
                    actividadesRegistradas++;
                    break;
                case 4:
                    datosAcumulados = datosAcumulados
                            + Basquetbol.registrarParticipanteBasquetbol() + "\n";
                    participantes[3]++;
                    actividadesRegistradas++;
                    break;
                case 5:
                    datosAcumulados = datosAcumulados
                            + Ciclismo.registrarParticipanteCiclismo() + "\n";
                    participantes[4]++;
                    actividadesRegistradas++;
                    break;
                case 6:
                    datosAcumulados = datosAcumulados
                            + Tenis.registrarParticipanteTenis() + "\n";
                    participantes[5]++;
                    actividadesRegistradas++;
                    break;
                case 7:
                    datosAcumulados = datosAcumulados
                            + Yoga.registrarParticipanteYoga() + "\n";
                    participantes[6]++;
                    actividadesRegistradas++;
                    break;
                case 8:
                    bandera = false;
                    break;
                default:
                    System.out.println("Lo sentimos, el club no tiene esa opción");
                    break;
            }

            if (bandera) {
                System.out.println("Desea registrar otro participante? (s/n)?");
                String respuesta = entrada.nextLine();
                if (respuesta.equalsIgnoreCase("n")) {
                    bandera = false;
                }
            }
        }

        String mensaje = Reporte.obtenerInformacion(actividadesRegistradas);
        String reporte = Reporte.obtenerReporte(actividades, participantes);

        System.out.println(mensaje);
        System.out.println(reporte);
        if (actividadesRegistradas > 0) {
            System.out.println("Datos de todos los participantes: \n"
                    + "|||||||||||||||||||||||||||||||||||||||||||||||||||\n"
                        + datosAcumulados);
        }
    }
}
