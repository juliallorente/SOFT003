package soft;

public class Usuario {
    private String id;
    private int cpf;
    private String email;
    private String senha;

    public Usuario(){

    }

    public Usuario (String id, int cpf, String email, String senha){
        this.id = id;
        this.cpf = cpf;
        this.email = email;
        this.senha = senha;
    }

    public void criarCadastro(String id, int cpf, String email, String senha) {
        this.id = id;
        this.cpf = cpf;
        this.email = email;
        this.senha = senha;
	}

	public void fazerLogin(String email, String senha) throws Exception {
        if(this.email != email){
            throw new Exception("Email incorreto.");
        }
        if(this.senha != senha){
            throw new Exception("Senha incorreta.");
        }
        System.out.println("Login feito com sucesso!");
	}

	public void visualizarCadastro() {
        System.out.println(
        " id='" + getId() + "'" +
        ", CPF='" + getCpf() + "'" +
        ", email='" + getEmail() + "'" +
        ", senha='" + getSenha() + "'" 
        );
	}

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getCpf() {
        return this.cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
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

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", cpf='" + getCpf() + "'" +
            ", email='" + getEmail() + "'" +
            ", senha='" + getSenha() + "'" +
            "}";
    }

}
