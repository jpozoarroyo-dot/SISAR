package MisClases;

public class Cita {

    private final String codigo;
    private final Paciente paciente; // Agregación (el paciente existe independiente de la cita)
    private String fecha;
    private String hora;
    private EstadoCita estado;
    private Triaje triaje; // Composición (el triaje pertenece a esta cita)

    public Cita(String codigo, Paciente paciente, String fecha, String hora) {
        this.codigo = codigo;
        this.paciente = paciente;
        this.fecha = fecha;
        this.hora = hora;
        this.estado = EstadoCita.PROGRAMADA;
    }

    public void asignarTriaje(String motivo, double peso, double talla, String presion) {
        this.triaje = new Triaje(this.paciente, motivo, peso, talla, presion);
    }

    public String getCodigo() { return codigo; }
    public Paciente getPaciente() { return paciente; }
    public String getFecha() { return fecha; }
    public String getHora() { return hora; }
    public EstadoCita getEstado() { return estado; }
    public void setEstado(EstadoCita estado) { this.estado = estado; }
    public Triaje getTriaje() { return triaje; }
}


