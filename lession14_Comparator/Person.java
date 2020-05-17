package lession14_Comparator;

public class Person implements Comparable<Person>{
	private String name;
	private int age;
	private int weight;
	public Person(String name, int age, int weight) {
		super();
		this.name = name;
		this.age = age;
		this.weight = weight;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", weight=" + weight + "]";
	}
	@Override
	public int compareTo(Person o) {
		if(this.name.compareTo(o.getName())>0) {
			return 1;
		} else if(this.name.compareTo(o.getName())<0) {
			return -1;
		} else {
			if(this.age>o.getAge()) {
				return 1;
			} else if(this.age<o.getAge()) {
				return -1;
			}
			else
				if(this.weight>o.getWeight()) {
					return 1;
				} else if(this.weight<o.getWeight()) {
					return -1;
				}

		}
		return 0;
	}



}