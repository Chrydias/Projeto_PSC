package classes;

import javax.persistence.Embeddable;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Embeddable
public class LocaisAreaConcursoPK {

	@ManyToOne (fetch=FetchType.EAGER)
	@JoinColumn (name="id_concurso")
	private AreaConcurso areaconcurso;
	
	@ManyToOne (fetch=FetchType.EAGER)
	@JoinColumn (name="id_local")
	private Local local;
	
}
