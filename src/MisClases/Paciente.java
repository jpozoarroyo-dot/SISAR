
package MisClases;

public class Paciente {
    // Atributos PRIVADOS: Encapsulamiento estricto (Cumplimiento Ley N.º 29733)
    private String dni;
    private String nombres;
    private int edad;
    private String direccion;

    public Paciente(String dni, String nombre, int edad, String dirrecion) {
        this.dni = dni;
        this.nombres = nombre;
        this.edad = edad;
        this.direccion = dirrecion;
    }
    // --- GETTERS y SETTERS ---
    // Única forma autorizada de acceder o modificar los datos médicos sensibles

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombres;
    }

    public void setNombre(String nombre) {
        this.nombres = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDirrecion() {
        return direccion;
    }

    public void setDirrecion(String dirrecion) {
        this.direccion = dirrecion;
    }
    
    
}
