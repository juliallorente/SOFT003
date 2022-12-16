package soft;

import java.util.List;

public class Banco {

    private int id;
    private String email;
    private String senha;
	private Conta conta;
	private List<Transacao> transacao;

    public Banco() {

    }

    public Banco(int id, Conta conta, List<Transacao> transacao) {
        this.id = id;
        this.conta = conta;
        this.transacao = transacao;
    }

	public boolean vincularSistema(String emailConta, String senhaConta) {
        Usuario user = this.conta.getUsuarioLogado();
        if(user.getEmail().equals(emailConta) && user.getSenha().equals(senhaConta)){
            this.email = emailConta;
            this.senha = senhaConta;
            return true;
        }
        return false;
	}

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return this.senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Conta getConta() {
        return this.conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }

    public List<Transacao> getTransacao() {
        return this.transacao;
    }

    public void setTransacao(List<Transacao> transacao) {
        this.transacao = transacao;
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", email='" + getEmail() + "'" +
            ", senha='" + getSenha() + "'" +
            ", conta='" + getConta() + "'" +
            ", transacao='" + getTransacao() + "'" +
            "}";
    }
}
