package at.ac.htlinn.jpa.uni;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class DBManager {
	// Ist ein wenig wie die Connection/Connection Pool bei JDBC
	private EntityManagerFactory emf;

	public DBManager() {
		emf = Persistence.createEntityManagerFactory("uni");

	}

	public void fillFithTestData() throws IOException {
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		for (String sql : Files.readAllLines(Paths.get("./sql/init_data.sql"))) {
			System.out.println(sql);
			em.createNativeQuery(sql).executeUpdate();
		}
		em.getTransaction().commit();
		em.close();
	}

	public Vorlesung getVorlesung(long vorlNr) {
		EntityManager em = emf.createEntityManager();
		Vorlesung vorlesung = em.find(Vorlesung.class, vorlNr);
		em.close();
		return vorlesung;
	}

	public Professor getProfessor(long persNr) {
		EntityManager em = emf.createEntityManager();
		Professor professor = em.find(Professor.class, persNr);
		em.close();
		return professor;
	}

	public Assistent getAssistent(long persNr) {
		EntityManager em = emf.createEntityManager();
		Assistent assistent = em.find(Assistent.class, persNr);
		em.close();
		return assistent;
	}

	public Student getStudent(long matrNr) {
		EntityManager em = emf.createEntityManager();
		// JPQL - Java Persistence Query Language - nicht SQL
		String sql = "SELECT s FROM Student s  WHERE s.matrNr = :matrNr";
		Query query = em.createQuery(sql, Student.class);
		query.setParameter("matrNr", matrNr);
		Student student = null;
		try {
			student = (Student) query.getSingleResult();
			// student = em.find(Student.class, matrNr);
		} catch (NoResultException e) {
			e.printStackTrace();
		}
		em.close();
		return student;
	}

	public void loescheStudent(int matrNr) {
		EntityManager em = emf.createEntityManager();
		Student student = getStudent(matrNr);
		em.remove(student);
		em.close();
	}

	public void aendereStudent(Student s) {
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.merge(s);
		em.getTransaction().commit();
		em.close();
	}

	public void speichereStudent(Student s) {
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(s);
		em.getTransaction().commit();
		em.close();
	}

	public List<Student> getStudenten() {
		EntityManager em = emf.createEntityManager();
		// JPQL - Java Persistence Query Language - nicht SQL
		String sql = "SELECT s FROM Student s";
		Query query = em.createQuery(sql, Student.class);
		query.setMaxResults(2); // Funktioniert wie das limit in SQL
		@SuppressWarnings("unchecked")
		List<Student> studenten = query.getResultList();
		em.close();
		return studenten;
	}

	public void close() {
		emf.close();
	}
}
