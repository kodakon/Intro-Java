package TugasStudent;

public class App {
	
	public static void main(String[] args) {
		Student student = new Student("Rayhan", "Aditya", "Jakarta", "123345");
		Person person = new Person("Rayhan", "Aditya", "Jakarta", "123345");
		
		person.getfullName();
		person.getdomisili();
		person.getcardIdentity();
		System.out.println("Mata Kuliah");
		System.out.println();
		student.getmataKuliah("Algoritma", "101", "Pak Andi", 4);
		student.getmataKuliah("Database", "201", "Pak Budi", 5);
		System.out.println();
		student.gettotalSks();
		
	}
}
