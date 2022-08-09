package agenda;

public class ContatoPessoaFisica extends Contato {

	private String cpf;

	//construtor
	public ContatoPessoaFisica(String umNome, String umTelefone, String cpf) {
		super(umNome,umTelefone);
		this.cpf= cpf;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

}
