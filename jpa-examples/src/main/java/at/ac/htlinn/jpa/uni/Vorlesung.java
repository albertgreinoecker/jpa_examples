package at.ac.htlinn.jpa.uni;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Vorlesung {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long vorlNr;
	private String titel;
	private int ECTS; //European Credit Transfer and Accumulation System
	@ManyToOne
	@JoinColumn(nullable = false)
	private Professor gelesenVon;
	
	public Vorlesung() {
	}

	public long getVorlNr() {
		return vorlNr;
	}

	public void setVorlNr(long vorlNr) {
		this.vorlNr = vorlNr;
	}

	public String getTitel() {
		return titel;
	}

	public void setTitel(String titel) {
		this.titel = titel;
	}

	public int getECTS() {
		return ECTS;
	}

	public void setECTS(int eCTS) {
		ECTS = eCTS;
	}

	public Professor getGelesenVon() {
		return gelesenVon;
	}

	public void setGelesenVon(Professor gelesenVon) {
		this.gelesenVon = gelesenVon;
	}

	@Override
	public String toString() {
		return "Vorlesung [vorlNr=" + vorlNr + ", titel=" + titel + ", ECTS=" + ECTS + ", gelesenVon=" + gelesenVon
				+ "]";
	}
	
	
}
