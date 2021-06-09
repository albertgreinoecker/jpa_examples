package at.ac.htlinn.jpa.uni;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table
public class Assistent {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long persNr;
	private String name;
	private String fachGebiet;
	@ManyToOne
	@JoinColumn(name="boss", nullable = false)
	private Professor boss;
	
	public Assistent() {
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
	public String getFachGebiet() {
		return fachGebiet;
	}
	public void setFachGebiet(String fachGebiet) {
		this.fachGebiet = fachGebiet;
	}
	public Professor getBoss() {
		return boss;
	}
	public void setBoss(Professor boss) {
		this.boss = boss;
	}

	@Override
	public String toString() {
		return "Assistent [persNr=" + persNr + ", name=" + name + ", fachGebiet=" + fachGebiet + ", boss=" + boss + "]";
	}
	
	
	
	
}
