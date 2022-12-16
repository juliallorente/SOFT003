package soft;

public class Transacao {

	private int id;
	private String data;
	private String transacao;
    private boolean estado;

    public Transacao() {

    }

    public Transacao(int id, String data, String transacao, boolean estado) {
        this.id = id;
        this.data = data;
        this.transacao = transacao;
        this.estado = estado;
    }


    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getData() {
        return this.data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getTransacao() {
        return this.transacao;
    }

    public void setTransacao(String transacao) {
        this.transacao = transacao;
    }

    public boolean isEstado() {
        return this.estado;
    }

    public boolean getEstado() {
        return this.estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", data='" + getData() + "'" +
            ", transacao='" + getTransacao() + "'" +
            ", estado='" + isEstado() + "'" +
            "}";
    }    
}
