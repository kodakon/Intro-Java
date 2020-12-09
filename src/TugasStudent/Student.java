package TugasStudent;
import java.util.Scanner;

public class Student extends Person implements learningPlan {
	
	public Student(String firstName, String lastName, String domisili, String cardNumber) {
		super(firstName, lastName, domisili, cardNumber);
		// TODO Auto-generated constructor stub
	}

	private int sks;
	private String matkul;
	private String room;
	private String lecture;
	

	public int getSks() {
		return sks;
	}

	public void setSks(int sks) {
		this.sks = sks;
	}

	public String getMatkul() {
		return matkul;
	}

	public void setMatkul(String matkul) {
		this.matkul = matkul;
	}

	public String getRoom() {
		return room;
	}

	public void setRoom(String room) {
		this.room = room;
	}

	public String getLecture() {
		return lecture;
	}

	public void setLecture(String lecture) {
		this.lecture = lecture;
	}

	@Override
	public void getmataKuliah(String matkul, String room, String lecture, int sks) {
		// TODO Auto-generated method stub
		System.out.println(matkul + " " + sks + " " + room + " " + lecture);
		
	}

	@Override
	public void gettotalSks() {
		// TODO Auto-generated method stub
		System.out.println("Enter initiate sks: ");
		Scanner su = new Scanner(System.in);
		int sum = su.nextInt();
		System.out.println("Enter total subject: ");
		Scanner si = new Scanner(System.in);
		int size = si.nextInt();
		int array[] = new int [size];
		
		System.out.println("Enter sks in each subject: ");
		for(int i=0; i<size; i++) {
			array[i] = si.nextInt();
			sum = sum + array[i];
		}
		
		System.out.println("Total sks: " + sum);
		
		if(sum >= 144) {
			getfullNameTitle();
		}
	}

	private void getfullNameTitle() {
		// TODO Auto-generated method stub
		System.out.println("Full Name: " + firstName + " " + lastName + " ST");
	}

	
}
