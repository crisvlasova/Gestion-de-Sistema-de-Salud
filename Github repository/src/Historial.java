import javax.swing.*;
import java.util.LinkedList;

public class Historial {
    private Paciente paciente;
    private LinkedList<Turno> turnosHistorial = new LinkedList<>();
    private static Historial instancia;

    public Historial(Paciente paciente, LinkedList<Turno> turnosHistorial) {
        this.paciente = paciente;
        this.turnosHistorial = turnosHistorial;
    }

    private Historial() {
        turnosHistorial = new LinkedList<>();
    }

    // la funcion  hace que solamente haya una instancia sola de la clase, y la retorna;
    public static Historial getInstance() {
        if (instancia == null) {
            instancia = new Historial();
        }
        return instancia;
    }


    //Funcion para agregar turnos al historial
    public void agregarTurno(Turno turno) {
        JOptionPane.showMessageDialog(null, "Funcion de agregar historial");
        turnosHistorial.add(turno);

    }

    public LinkedList<Turno> getPersonas() {
        return turnosHistorial;
    }

    public void setPersonas(LinkedList<Turno> personas) {
        this.turnosHistorial = personas;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public LinkedList<Turno> getTurno() {
        return turnosHistorial;
    }

    public void setTurno(LinkedList<Turno> turno) {
        this.turnosHistorial = turno;
    }

    @Override
    public String toString() {
        return "Historial{" +
                "paciente=" + paciente +
                ", turno=" + turnosHistorial +
                '}';
    }
}
