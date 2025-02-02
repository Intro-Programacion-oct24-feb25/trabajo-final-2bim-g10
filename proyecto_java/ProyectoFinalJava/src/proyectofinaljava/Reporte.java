package proyectofinaljava;

public class Reporte {

    public static String obtenerInformacion(int actividadesRegistradas) {
        if (actividadesRegistradas == 0) {
            return "Mala campaña, debemos mejorar";
        } else {
            if (actividadesRegistradas >= 1 && actividadesRegistradas <= 5) {
                return "Poca participación en el club, hay que mejorar";
            } else {
                if (actividadesRegistradas >= 6 && actividadesRegistradas <= 15) {
                    return "Buena participación, sigan así";
                } else {
                    return "Excelente campaña del club";
                }
            }
        }
    }

    public static String obtenerReporte(String[] actividades, int[] participantes) {
        String reporte = "Las actividades ingresadas son:\n";
        for (int i = 0; i < actividades.length; i++) {
            reporte = String.format("%s%d. Número de Participantes de %s: %d\n",
                    reporte, (i + 1), actividades[i], participantes[i]);
        }
        return reporte;
    }
}
