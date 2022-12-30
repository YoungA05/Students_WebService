package metier;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Notes implements Serializable{
      private int id;
      private double Maths;
      private double Physiques;
      private double Arabe;
      private double Anglais;
      
	public Notes() {
		super();
	}

	public Notes(int id, double maths, double physiques, double arabe, double anglais) {
		super();
		this.id = id;
		Maths = maths;
		Physiques = physiques;
		Arabe = arabe;
		Anglais = anglais;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getMaths() {
		return Maths;
	}

	public void setMaths(double maths) {
		Maths = maths;
	}

	public double getPhysiques() {
		return Physiques;
	}

	public void setPhysiques(double physiques) {
		Physiques = physiques;
	}

	public double getArabe() {
		return Arabe;
	}

	public void setArabe(double arabe) {
		Arabe = arabe;
	}

	public double getAnglais() {
		return Anglais;
	}

	public void setAnglais(double anglais) {
		Anglais = anglais;
	}

	@Override
	public String toString() {
		return "Notes [id=" + id + ", Maths=" + Maths + ", Physiques=" + Physiques + ", Arabe=" + Arabe + ", Anglais="
				+ Anglais + "]";
	}
	
      
      
}
