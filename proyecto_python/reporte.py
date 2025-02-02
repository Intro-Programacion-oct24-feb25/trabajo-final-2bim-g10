def obtener_informacion(actividades_registradas):
    if actividades_registradas == 0:
        return "Mala campaña, debemos mejorar"
    elif 1 <= actividades_registradas <= 5:
        return "Poca participación en el club, hay que mejorar"
    elif 6 <= actividades_registradas <= 15:
        return "Buena participación, sigan así"
    else:
        return "Excelente campaña del club"

def obtener_reporte(actividades, participantes):
    reporte = "Las actividades ingresadas son:\n"
    for i in range(len(actividades)):
        reporte += f"{i+1}. Número de Participantes de {actividades[i]}: {participantes[i]}\n"
    return reporte