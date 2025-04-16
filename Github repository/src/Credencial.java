public class Credencial {
    private int nroSocio;
    private int plan;
    private int token;

    public Credencial(int nroSocio, int plan, int token) {
        this.nroSocio = nroSocio;
        this.plan = plan;
        this.token = token;
    }

    public int getNroSocio() {
        return nroSocio;
    }

    public void setNroSocio(int nroSocio) {
        this.nroSocio = nroSocio;
    }

    public int getPlan() {
        return plan;
    }

    public void setPlan(int plan) {
        this.plan = plan;
    }

    public int getToken() {
        return token;
    }

    public void setToken(int token) {
        this.token = token;
    }

    @Override
    public String toString() {
        return "Credencial{" +
                "nroSocio=" + nroSocio +
                ", plan=" + plan +
                ", token=" + token +
                '}';
    }
}
