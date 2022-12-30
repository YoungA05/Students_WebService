package metier;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Etudiant implements Serializable{
     
	private String cni;
	private String cne;
	private Notes grades;
	
	public Etudiant() {
		super();
	}

	public Etudiant(String cni, String cne, Notes grades) {
		super();
		this.cni = cni;
		this.cne = cne;
		this.grades = grades;
	}

	public String getCni() {
		return cni;
	}

	public void setCni(String cni) {
		this.cni = cni;
	}

	public String getCne() {
		return cne;
	}

	public void setCne(String cne) {
		this.cne = cne;
	}

	public Notes getGrades() {
		return grades;
	}

	public void setGrades(Notes grades) {
		this.grades = grades;
	}

	@Override
	public String toString() {
		return "Etudiant [cni=" + cni + ", cne=" + cne + ", grades=" + grades + "]";
	}

	
}
