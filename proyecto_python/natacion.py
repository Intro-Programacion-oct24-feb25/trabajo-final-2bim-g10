def registrar_participante_natacion():
    print("Registro de participante en Natación")
    nombre = input("Nombre del participante: ")
    edad = input("Edad: ")
    nivel = input("Nivel (principiante, intermedio, avanzado): ")
    ciudad = input("Ciudad: ")
    estilo = input("Estilo favorito: ")
    return f"Natación: \n- Nombre: {nombre}\n- Edad: {edad}\n- Ciudad: {ciudad}\n- Nivel: {nivel}\n- Estilo: {estilo}\n|||||||||||||||||||||||||||||||||||||||||||||||||||"