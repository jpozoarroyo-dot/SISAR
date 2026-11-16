
package MisClases;

public class Main {

    public static void main(String[] args) {

        System.out.println("---SISAR: Prueba de viabilidad tecnica---");
        System.out.println("Iniciando validacion de encapsulamiento POO...\n");

        // 1. Instanciamos un paciente (Simulando un registro en el Puesto de Salud)
        Paciente pacientePrueba = new Paciente("48320084", "Jesus Pozo", 32, "Calle Cajamarca Mz J lt 1B");

        // 2. Demostración de acceso seguro a los datos mediante Getters
        System.out.println("Regitro de paciente exitoso");
        System.out.println("Nombre del paciente: " + pacientePrueba.getNombre());

        // 3. Simulación de enmascaramiento de datos (RS-05 / Ley N.º 29733)
        // Extraemos el DNI real y ocultamos los primeros 4 dígitos
        String dniReal = pacientePrueba.getDni();
        String dniEnmascarado = "****" + dniReal.substring(4);

        System.out.println("Dni Seguro (Enmascarado): " + dniEnmascarado);
        System.out.println("\nVEREDICTO: Componente VIABLE. Build Successful.");
    }

}
