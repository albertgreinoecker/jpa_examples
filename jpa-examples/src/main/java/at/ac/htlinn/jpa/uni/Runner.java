package at.ac.htlinn.jpa.uni;

import java.util.List;

public class Runner {
	public static void main(String[] args) {
		DBManager db = new DBManager();

		List<Student> studenten = db.getStudenten();
		System.out.println("Liste von Studenten:");
		for (Student student : studenten) {
			System.out.println(student);
		}

		System.out.println();
		System.out.println("Student mit der MatrNr: 25403");
		Student s = db.getStudent(25403);
		System.out.println(s);
		
		s.setName("Jonas3.0");
		s.setSemester(200);
		db.aendereStudent(s);
		s = db.getStudent(25403);
		System.out.println(s);
		
		Student sNeu = new Student(1, "Hubert Maier",1 );
		db.speichereStudent(sNeu);
		
		
//		System.out.println("...und den löschen wir jetzt...");
//		db.loescheStudent(25403);
		
		
		Assistent ass = db.getAssistent(3003);
		System.out.println(ass);
		//Professor boss =
		
		
		db.close();
		System.out.println("Fertig!");
	}
}
