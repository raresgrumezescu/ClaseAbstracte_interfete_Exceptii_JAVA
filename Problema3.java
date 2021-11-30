package laborator6;

import java.util.*;
//import java.lang.*;

/*
class Student {
	private String name;
	private Vector<Double> medii;
	
	public Student (String nume) {
		this.name = nume;
	}
	
	public void setName (String nume) {
		this.name = nume;
	}
	
	public void addMedie (double medie) {
		this.medii.add(medie);
	}

	public int nrMedii () {
		return this.medii.size();
	}
	
	public double getMedie(int pos) {
		return medii.get(pos);
	}
}*/

interface Persoana extends Comparable {
	public double calculMedieGenerala();
    public String getNume();
    public void setNume(String nume);
    public void addMedie(double medie);
}

class Student implements Persoana {
	private String name;
	private Vector<Double> medii = new Vector<Double>();
	
	public String getNume() {
		return "Ionescu";
	}
	
	public void setNume(String nume) {
		this.name = nume; 
	}
	
	public void addMedie (double medie) {
		this.medii.add(medie);
	}
	
	public double calculMedieGenerala() {
		int S = 0;
		int n = medii.size();
		for (int i = 0; i < n; i++) {
			S += medii.get(i);
		}
		return S/n;
	}
	
	public String toString () {
		return name;
	}
	
	public int compareTo (Object persoana) {
		Student student2 = (Student) persoana;
		if (this.name.compareTo(student2.name) > 0)
			return 1;
		else if (this.name.compareTo(student2.name) < 0) {
				return -1;
		}
			else {
				if (this.calculMedieGenerala() >= student2.calculMedieGenerala())
					return 1;
				else
					return -1;
			}
	}
}

public class Problema3 {

	public static void main(String[] args) {
		Student student1 = new Student();
		student1.setNume("Ionescu");
		//System.out.println (student1.toString());
		student1.addMedie(8.50);
		student1.addMedie(9.50);
		student1.addMedie(10);
		Student student2 = new Student();
		student2.setNume("Popescu");
		student2.addMedie(7.50);
		student2.addMedie(8);
		student2.addMedie(5);
		Student student3 = new Student();
		student3.setNume("Georgescu");
		student3.addMedie(10);
		student3.addMedie(10);
		student3.addMedie(10);
		Vector<Student> studenti = new Vector<Student>(50);
		studenti.add(student1);
		studenti.add(student2);
		studenti.add(student3);
		//System.out.println (studenti);
		Collections.sort(studenti);
		for (int i = 0; i < studenti.size(); i++) {
			System.out.println (studenti.get(i).toString() + " " + studenti.get(i).calculMedieGenerala());
		}
	}

}
