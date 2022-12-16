package soft;

public class Conta {
    
    private boolean compartilharLocalizacao;
	private String localizacaoSelecionada;
	private Usuario usuarioLogado;


    public Conta() {

    }

    public Conta(String localizacaoSelecionada, Usuario usuarioLogado) {
        this.compartilharLocalizacao = false;
        this.localizacaoSelecionada = localizacaoSelecionada;
        this.usuarioLogado = usuarioLogado;
    }

	public boolean vincularSistema(String id, int cpf, String senha) {
        if(this.usuarioLogado.getId().equals(id) && this.usuarioLogado.getCpf() == cpf && this.usuarioLogado.getSenha().equals(senha)){
            return true;
        }
		return false;
	}

	public boolean localizacao(String localizacaoSelecionada) {
        if(localizacaoSelecionada.equals("")){ 
            this.compartilharLocalizacao = false;
            return false;
        }
        this.localizacaoSelecionada = localizacaoSelecionada;
        this.compartilharLocalizacao = true;
		return true;
	}

    public boolean isCompartilharLocalizacao() {
        return this.compartilharLocalizacao;
    }

    public boolean getCompartilharLocalizacao() {
        return this.compartilharLocalizacao;
    }

    public void setCompartilharLocalizacao(boolean compartilharLocalizacao) {
        this.compartilharLocalizacao = compartilharLocalizacao;
    }

    public String getLocalizacaoSelecionada() {
        return this.localizacaoSelecionada;
    }

    public void setLocalizacaoSelecionada(String localizacaoSelecionada) {
        this.localizacaoSelecionada = localizacaoSelecionada;
    }

    public Usuario getUsuarioLogado() {
        return this.usuarioLogado;
    }

    public void setUsuarioLogado(Usuario usuarioLogado) {
        this.usuarioLogado = usuarioLogado;
    }

    @Override
    public String toString() {
        return "{" +
            " compartilharLocalizacao='" + isCompartilharLocalizacao() + "'" +
            ", localizacaoSelecionada='" + getLocalizacaoSelecionada() + "'" +
            ", usuarioLogado='" + getUsuarioLogado() + "'" +
            "}";
    }
    
}
