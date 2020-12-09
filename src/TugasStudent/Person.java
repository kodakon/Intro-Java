package TugasStudent;

public class Person implements studentRegistration{
	
	public String firstName;
	public String lastName;
	private String domisili;
	private String cardNumber;
	
	public Person(String firstName, String lastName, String domisili, String cardNumber) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.domisili = domisili;
		this.cardNumber = cardNumber;
	}
	

	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	@Override
	public void getfullName() {
		// TODO Auto-generated method stub
		System.out.println("Full Name: " + firstName + " " + lastName);
	}
	
	@Override
	public void getcardIdentity() {
		// TODO Auto-generated method stub
		System.out.println("Card Number: " + cardNumber);
		System.out.println("");
	}


	@Override
	public void getdomisili() {
		// TODO Auto-generated method stub
		System.out.println("Domisili: " + domisili);
	}	
	
}
