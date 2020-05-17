package lession14_Commodity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;


public class Commodity implements Comparable<Commodity>{

	private String name;
	private int length;
	private int width;
	private int weight;

	private ArrayList<Commodity> cargo = new ArrayList<>();

	public Commodity(String name, int length, int width, int weight) {
		super();
		this.name = name;
		this.length = length;
		this.width = width;
		this.weight = weight;
	}

	public Commodity() {}

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public ArrayList<Commodity> getProducts() {
		return cargo;
	}

	public void setProducts(ArrayList<Commodity> cargo) {
		this.cargo = cargo;
	}

	public boolean addCargo(Commodity newCargo) {
		Iterator<Commodity> tempCargo = cargo.iterator();
		boolean bool = false;
		while (tempCargo.hasNext())
		{
			Commodity product= tempCargo.next();
			if ((product.getName().equals(newCargo.getName()))&&(product.getLength()==newCargo.getLength() && (product.getWeight()==newCargo.getWeight())&& (product.getWidth()==newCargo.getWidth())))
			{
				bool = true;
			}
		}
		if (!bool)
		{
			cargo.add(newCargo);
			return true;
		}
		return false;
	}
	public boolean removeCargo(String nameCargo) {
		Iterator<Commodity> tempCargo = cargo.iterator();
		boolean bool = false;
		while (tempCargo.hasNext())
		{
			Commodity product= tempCargo.next();
			if (product.getName().equalsIgnoreCase(nameCargo))
			{
				bool = true;
				tempCargo.remove();
			}
		}
		return bool;
	}
	public boolean replaceCargo(String nameOldCargo, Commodity newCargo) {
		boolean bool = false;
		for (int i =0; i < cargo.size(); i++) {
			if (cargo.get(i).getName().equalsIgnoreCase(nameOldCargo)) {
				cargo.set(i, newCargo);
				bool = true;
			}
		}
		return bool;
	}
	
	public void sortByName() {
		Collections.sort(cargo, new CommodyComparatorByName());
	}
	public void sortByLenght() {
		Collections.sort(cargo, new CommodyComparatorByLenght());
	}
	public void sortByWeight() {
		Collections.sort(cargo, new CommodyComparatorByWeight());
	}
	public void sortByWidth() {
		Collections.sort(cargo, new CommodyComparatorByWidth());
	}

	public void printAll() {
		for (Commodity commodity : cargo) {
			System.out.println(commodity);
		}
	}

	public boolean printCargoByIndex(int index) {
		boolean bool = false;
		for (int i =0; i < cargo.size(); i++) {
			if ( i == index) {
				System.out.println(cargo.get(i).toString());
				bool = true;
				break;
			}
		}
	return bool;
	}
	
	@Override
	public String toString() {
		return "[name=" + name + ", length=" + length + ", width=" + width + ", weight=" + weight + "]";
	}

	@Override
	public int compareTo(Commodity o) {
		if(this.getName().compareTo(o.getName())>0) {
			return 1;
		} else if(this.getName().compareTo(o.getName())<0) {
			return -1;
		} else {
			if(this.getLength()>o.getLength()) {
				return 1;
			} else if(this.getLength()<o.getLength()) {
				return -1;
			} else {
				if(this.getWidth()>o.getWidth()) {
					return 1;
				} else if(this.getWidth()<o.getWidth()) {
					return -1;
				} else {
					if(this.getWeight()>o.getWeight()) {
						return 1;
					} else if(this.getWeight()<o.getWeight()) {
						return -1;
					}
				}
			}
		}
		return 0;
	}
	
	

}
