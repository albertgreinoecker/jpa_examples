package at.ac.htlinn.jpa.uni;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long matrNr;
	private String name;
	private int semester;
	@ManyToMany
	@JoinTable(name = "hoeren", joinColumns = @JoinColumn(name = "MatrNr"), inverseJoinColumns = @JoinColumn(name = "VorlNr"))
	private List<Vorlesung> vorlesungen;

	@OneToMany(mappedBy = "student")
	private List<Note> noten;
	
	public Student() {
	}

	public Student(long matrNr, String name, int semester) {
		this.matrNr = matrNr;
		this.name = name;
		this.semester = semester;
	}

	public long getMatrNr() {
		return matrNr;
	}

	public void setMatrNr(long matrNr) {
		this.matrNr = matrNr;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSemester() {
		return semester;
	}

	public void setSemester(int semester) {
		this.semester = semester;
	}

	public List<Vorlesung> getVorlesungen() {
		return vorlesungen;
	}

	public void setVorlesungen(List<Vorlesung> vorlesungen) {
		this.vorlesungen = vorlesungen;
	}

	
	
	public List<Note> getNoten() {
		return noten;
	}

	public void setNoten(List<Note> noten) {
		this.noten = noten;
	}

	@Override
	public String toString() {
		return "Student [matrNr=" + matrNr + ", name=" + name + ", semester=" + semester + "]";
	}
}
