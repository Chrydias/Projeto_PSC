package classes;

import java.util.List;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

@Entity
public class Local {

	@Id @GeneratedValue
	private int id;
	
	private boolean disponivel;
	
	@Embedded
	private Endereco endereco;
	
	@OneToMany (mappedBy="local", fetch = FetchType.LAZY)
	@Cascade (CascadeType.ALL)
	private List<AreaConcurso> areasconcurso;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public boolean isDisponivel() {
		return disponivel;
	}

	public void setDisponivel(boolean disponivel) {
		this.disponivel = disponivel;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public List<AreaConcurso> getConcursos() {
		return areasconcurso;
	}

	public void setConcursos(List<AreaConcurso> areasconcurso) {
		this.areasconcurso = areasconcurso;
	}

	public Local(int id, boolean disponivel, Endereco endereco,
			List<AreaConcurso> areasconcurso) {
		super();
		this.id = id;
		this.disponivel = disponivel;
		this.endereco = endereco;
		this.areasconcurso = areasconcurso;
	}

	public Local() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
