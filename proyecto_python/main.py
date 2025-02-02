from reporte import obtener_informacion, obtener_reporte
from futbol import registrar_participante_futbol
from natacion import registrar_participante_natacion
from atletismo import registrar_participante_atletismo
from basquetbol import registrar_participante_basquetbol
from ciclismo import registrar_participante_ciclismo
from tenis import registrar_participante_tenis
from yoga import registrar_participante_yoga

actividades = ["Fútbol", "Natación", "Atletismo", "Básquetbol", "Ciclismo", "Tenis", "Yoga"]
participantes = [0] * 7
actividades_registradas = 0
datos_acumulados = ""

def principal():
    global actividades_registradas, datos_acumulados
    while True:
        print("Bienvenido al club: El deporte para la vida")
        print("Seleccione la actividad para registrar un participante:")
        for i, actividad in enumerate(actividades, 1):
            print(f"{i}. {actividad}")
        print("8. Salir")
        opcion = int(input("Ingrese una opción: "))

        if opcion == 1:
            datos_acumulados += registrar_participante_futbol() + "\n"
            participantes[0] += 1
            actividades_registradas += 1
        elif opcion == 2:
            datos_acumulados += registrar_participante_natacion() + "\n"
            participantes[1] += 1
            actividades_registradas += 1
        elif opcion == 3:
            datos_acumulados += registrar_participante_atletismo() + "\n"
            participantes[2] += 1
            actividades_registradas += 1
        elif opcion == 4:
            datos_acumulados += registrar_participante_basquetbol() + "\n"
            participantes[3] += 1
            actividades_registradas += 1
        elif opcion == 5:
            datos_acumulados += registrar_participante_ciclismo() + "\n"
            participantes[4] += 1
            actividades_registradas += 1
        elif opcion == 6:
            datos_acumulados += registrar_participante_tenis() + "\n"
            participantes[5] += 1
            actividades_registradas += 1
        elif opcion == 7:
            datos_acumulados += registrar_participante_yoga() + "\n"
            participantes[6] += 1
            actividades_registradas += 1
        elif opcion == 8:
            break
        else:
            print("Lo sentimos, el club no tiene esa opción.")

        if input("Desea registrar otro participante? (s/n): ") == "n":
            break

    mensaje = obtener_informacion(actividades_registradas)
    reporte = obtener_reporte(actividades, participantes)

    print(mensaje)
    print(reporte)
    if actividades_registradas > 0:
        print("Datos de todos los participantes:\n" + datos_acumulados)

if __name__ == "__main__":
    principal()