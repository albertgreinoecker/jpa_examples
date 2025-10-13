package at.ac.htlinn.jpa.uni;

import java.io.IOException;
import java.util.List;

public class Runner {
	public static void main(String[] args) throws IOException {
		
		DBManager db = new DBManager();
		db.fillFithTestData();
		
		
//		List<Student> studenten = db.getStudenten();
//		System.out.println("Liste von Studenten:");
//		for (Student student : studenten) {
//			System.out.println(student);
//		}
//
//		System.out.println();
//		System.out.println("Student mit der MatrNr: 25403");
//		Student s = db.getStudent(25403);
//		System.out.println(s);
//		
//		s.setName("Jonas3.0");
//		s.setSemester(200);
//		db.aendereStudent(s);
//		s = db.getStudent(25403);
//		System.out.println(s);
//		
//		Student sNeu = new Student(1, "Hubert Maier",1 );
//		db.speichereStudent(sNeu);
		
		
//		System.out.println("...und den löschen wir jetzt...");
//		db.loescheStudent(25403);
		
		
//		Assistent ass = db.getAssistent(3003);
//		System.out.println(ass);
//		Professor boss = ass.getBoss();
//		System.out.println(boss);
//		
		Professor prof = db.getProfessor(2127);
		System.out.println(prof);
		List<Assistent> assis = prof.getAssistenten();
		for (Assistent assi : assis)
		{
			System.out.println(assi);
		}
		
		System.out.println("Vorlesung:");
		Vorlesung vorlesung = db.getVorlesung(4052);
		
		List<Student> studenten = vorlesung.getStudenten();
		for (Student student : studenten)
		{
			System.out.println(student);
		}
		System.out.println(vorlesung);
		Professor gelesenVon = vorlesung.getGelesenVon();
		
		assis = gelesenVon.getAssistenten();
		for (Assistent assi : assis)
		{
			System.out.println(assi);
		}
		
		System.out.println("NOTEN:");
		for (Note n : vorlesung.getNoten())
		{
			System.out.println(n);
		}
		
		
		db.close();
		System.out.println("Fertig!");
	}
}
