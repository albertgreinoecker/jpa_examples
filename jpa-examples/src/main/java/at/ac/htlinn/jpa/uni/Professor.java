package at.ac.htlinn.jpa.uni;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Professor {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long persNr;
	private String name;
	private String rang;
	private String raum;

	public Professor() {
	}

	public Professor(long persNr, String name, String rang, String raum) {
		this.persNr = persNr;
		this.name = name;
		this.rang = rang;
		this.raum = raum;
	}

	public long getPersNr() {
		return persNr;
	}

	public void setPersNr(long persNr) {
		this.persNr = persNr;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRang() {
		return rang;
	}

	public void setRang(String rang) {
		this.rang = rang;
	}

	public String getRaum() {
		return raum;
	}

	public void setRaum(String raum) {
		this.raum = raum;
	}

	@Override
	public String toString() {
		return "Professor [persNr=" + persNr + ", name=" + name + ", rang=" + rang + ", raum=" + raum + "]";
	}
}
