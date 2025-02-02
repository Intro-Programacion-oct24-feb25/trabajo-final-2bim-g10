def registrar_participante_atletismo():
    print("Registro de participante en Atletismo")
    nombre = input("Nombre del participante: ")
    edad = input("Edad: ")
    especialidad = input("Especialidad (carreras, salto, lanzamiento): ")
    ciudad = input("Ciudad: ")
    record = input("Récord personal: ")
    return f"Atletismo: \n- Nombre: {nombre}\n- Edad: {edad}\n- Ciudad: {ciudad}\n- Especialidad: {especialidad}\n- Récord: {record}\n|||||||||||||||||||||||||||||||||||||||||||||||||||"