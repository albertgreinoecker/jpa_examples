package at.ac.htlinn.jpa.uni;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Student {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long matrNr;
	private String name;
	private int semester;
	
	
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


	@Override
	public String toString() {
		return "Student [matrNr=" + matrNr + ", name=" + name + ", semester=" + semester + "]";
	}

	
	
	
}
