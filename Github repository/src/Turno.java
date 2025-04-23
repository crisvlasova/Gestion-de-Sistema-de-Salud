import java.time.LocalDate;

public class Turno {
    private String nombre;
    private int nroTurno;
    private TipoTurno tipoTurno;
    private Medico medico;
    private Horario horario;
    private LocalDate fecha;
    private String motivoDeConsulta;
    private String diagnostico;
    private String tratamiento;
    private String detalles;
    private EstadoTurno estadoTurno;

    public Turno(String nombre, int nroTurno, TipoTurno tipoTurno, Medico medico, Horario horario, LocalDate fecha, String motivoDeConsulta, String diagnostico, String tratamiento, String detalles, EstadoTurno estadoTurno) {
        this.nombre = nombre;
        this.nroTurno = nroTurno;
        this.tipoTurno = tipoTurno;
        this.medico = medico;
        this.horario = horario;
        this.fecha = fecha;
        this.motivoDeConsulta = motivoDeConsulta;
        this.diagnostico = diagnostico;
        this.tratamiento = tratamiento;
        this.detalles = detalles;
        this.estadoTurno = estadoTurno;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNroTurno() {
        return nroTurno;
    }

    public void setNroTurno(int nroTurno) {
        this.nroTurno = nroTurno;
    }

    public TipoTurno getTipoTurno() {
        return tipoTurno;
    }

    public void setTipoTurno(TipoTurno tipoTurno) {
        this.tipoTurno = tipoTurno;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public Horario getHorario() {
        return horario;
    }

    public void setHorario(Horario horario) {
        this.horario = horario;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getMotivoDeConsulta() {
        return motivoDeConsulta;
    }

    public void setMotivoDeConsulta(String motivoDeConsulta) {
        this.motivoDeConsulta = motivoDeConsulta;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public String getTratamiento() {
        return tratamiento;
    }

    public void setTratamiento(String tratamiento) {
        this.tratamiento = tratamiento;
    }

    public String getDetalles() {
        return detalles;
    }

    public void setDetalles(String detalles) {
        this.detalles = detalles;
    }

    public EstadoTurno getEstadoTurno() {
        return estadoTurno;
    }

    public void setEstadoTurno(EstadoTurno estadoTurno) {
        this.estadoTurno = estadoTurno;
    }

    @Override
    public String toString() {
        return "Turno{" +
                "nombre='" + nombre + '\'' +
                ", nroTurno=" + nroTurno +
                ", tipoTurno=" + tipoTurno +
                ", medico=" + medico +
                ", horario=" + horario +
                ", fecha=" + fecha +
                ", motivoDeConsulta='" + motivoDeConsulta + '\'' +
                ", diagnostico='" + diagnostico + '\'' +
                ", tratamiento='" + tratamiento + '\'' +
                ", detalles='" + detalles + '\'' +
                ", estadoTurno=" + estadoTurno +
                '}';
    }

}
