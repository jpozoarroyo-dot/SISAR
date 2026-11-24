package MisClases;

public class Triaje {

    private final Paciente paciente;
    private final String motivoConsulta;
    private final double peso;
    private final double talla;
    private final String presionArterial;
    private final String prioridad;

    public Triaje(Paciente paciente, String motivoConsulta, double peso, double talla, String presionArterial, String prioridad) {
        this.paciente = paciente;
        this.motivoConsulta = motivoConsulta;
        this.peso = peso;
        this.talla = talla;
        this.presionArterial = presionArterial;
        this.prioridad = prioridad;
    }

    public double calcularIMC() {
        return talla > 0 ? Math.round((peso / (talla * talla)) * 100.0) / 100.0 : 0;
    }

    public Paciente getPaciente() { return paciente; }
    public String getMotivoConsulta() { return motivoConsulta; }
    public double getPeso() { return peso; }
    public double getTalla() { return talla; }
    public String getPresionArterial() { return presionArterial; }
    public String getPrioridad() { return prioridad; }
}
