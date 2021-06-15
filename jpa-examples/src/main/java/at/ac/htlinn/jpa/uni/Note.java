package at.ac.htlinn.jpa.uni;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Note {
	// Every entry must have an id
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private Student student;
	private Vorlesung vorlesung;
	private byte note;
	private Date datum;

	public Note() {
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Vorlesung getVorlesung() {
		return vorlesung;
	}

	public void setVorlesung(Vorlesung vorlesung) {
		this.vorlesung = vorlesung;
	}

	public byte getNote() {
		return note;
	}

	public void setNote(byte note) {
		this.note = note;
	}

	public Date getDatum() {
		return datum;
	}

	public void setDatum(Date datum) {
		this.datum = datum;
	}

	@Override
	public String toString() {
		return "Note [id=" + id + ", student=" + student + ", vorlesung=" + vorlesung + ", note=" + note + ", datum="
				+ datum + "]";
	}

}
