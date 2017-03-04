package veterinaryClinic;

public class Cat {
	
	private int ID;
	private double weight;
	private int age;
	private String description;
	private Address address;
	
	public Cat(int ID, double weight, int age, String description, Address address) {
		this.ID = ID;
		this.weight = weight;
		this.age = age;
		this.description = description;
		this.address = address;
	}

	public int getID() {
		return ID;
	}

	public void setID(int ID) {
		this.ID = ID;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Cat [ID=" + ID + ", weight=" + weight + ", age=" + age + ", description=" + description + ", address="
				+ address + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ID;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cat other = (Cat) obj;
		if (ID != other.ID)
			return false;
		return true;
	}
	
}
