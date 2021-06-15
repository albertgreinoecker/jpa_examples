package at.ac.htlinn.jpa.uni;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

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
	
	@ManyToMany
	@JoinTable(name="hoeren", joinColumns = @JoinColumn(name="VorlNr"), inverseJoinColumns = @JoinColumn(name="MatrNr"))
	private List<Student> studenten;
	
	@OneToMany(mappedBy = "vorlesung")
	private List<Note> noten;
	
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
	
	public List<Student> getStudenten() {
		return studenten;
	}

	public void setStudenten(List<Student> studenten) {
		this.studenten = studenten;
	}

	public List<Note> getNoten() {
		return noten;
	}

	public void setNoten(List<Note> noten) {
		this.noten = noten;
	}

	@Override
	public String toString() {
		return "Vorlesung [vorlNr=" + vorlNr + ", titel=" + titel + ", ECTS=" + ECTS + ", gelesenVon=" + gelesenVon
				+ "]";
	}
	
	
}
