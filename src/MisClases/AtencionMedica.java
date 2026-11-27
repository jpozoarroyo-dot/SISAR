
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MisClases;

public class AtencionMedica {

    private final String diagnostico;
    private final String tratamiento;
    private final String destino;

    public AtencionMedica(String diagnostico, String tratamiento, String destino) {
        this.diagnostico = diagnostico;
        this.tratamiento = tratamiento;
        this.destino = destino;
    }

    public String getDiagnostico() { return diagnostico; }
    public String getTratamiento() { return tratamiento; }
    public String getDestino() { return destino; }
}
