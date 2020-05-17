package lession14_Commodity;

import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		String st,st1;
		Commodity shop = new Commodity();
		while (true) {
			printMenu();
			st = new Scanner(System.in).nextLine();
			switch (st) {
			case "1": { // add
				System.out.print("Введіть (через пробіл) назву продукту, довжину, ширину, вагу: ");
				st = new Scanner(System.in).nextLine();
				String[] s = st.split(" ");
				
				if (!shop.addCargo(new Commodity(s[0], Integer.parseInt(s[1]), Integer.parseInt(s[2]),Integer.parseInt(s[3]))))
				{
					System.out.println("Помилка додавання товару " + st + " Скоріше за все такий товар уже існує!");
					} 
				else {
						System.out.println("Товар " + st + " успішно доданий!");
					}
				
				break;
			} // of 1
			case "2": { // remove by name
				System.out.print("Введіть назву продукту, який видалятимемо: ");
				st = new Scanner(System.in).nextLine();
				if (!shop.removeCargo(st))
				{
					System.out.println("Помилка видалення товару " + st + " Скоріше за все такий товар НЕ існує!");
					} 
				else {
						System.out.println("Всі товари зназвою " + st + " успішно видалений!");
					}
				
				break;
			} // if 2
			case "3": { // replace
				System.out.print("Введіть назву продукту, який потрібно замінити: ");
				st = new Scanner(System.in).nextLine();
				
				System.out.print("Введіть для НОВОГО ПРОДУКТУ (через пробіл) назву, довжину, ширину, вагу: ");
				st1 = new Scanner(System.in).nextLine();
				String[] s = st1.split(" ");
				
				if (!shop.replaceCargo(st, new Commodity(s[0], Integer.parseInt(s[1]), Integer.parseInt(s[2]),Integer.parseInt(s[3]))))
				{
					System.out.println("Помилка замінт товару " + st1 + " Скоріше за все такий товар НЕ існує!");
					} 
				else {
						System.out.println("Весь товар з назвою " + st + " успішно замінений на "+ st1);
					}
				
				break;
			} // of 3
			case "4": { // sort by name
				System.out.println("До сортування за назвою");
				shop.printAll();
				System.out.println("Після сортування за назвою");
				shop.sortByName();
				shop.printAll();
				break;
			} // of 4
			case "5": { // sort by довжиною
				System.out.println("До сортування за довжиною");
				shop.printAll();
				System.out.println("Після сортування за довжиною");
				shop.sortByLenght();
				shop.printAll();
				break;
			} // of 5
			case "6": { // sort by шириною
				System.out.println("До сортування за шириною");
				shop.printAll();
				System.out.println("Після сортування за шириною");
				shop.sortByWidth();
				shop.printAll();
				break;
			} // of 6
			case "7": { // sort by вагою
				System.out.println("До сортування за вагою");
				shop.printAll();
				System.out.println("Після сортування за вагою");
				shop.sortByWeight();
				shop.printAll();
				break;
			} // of 7
			case "8": { // print by index
				System.out.println("ВВедіть індекс ");
				st = new Scanner(System.in).nextLine();
				System.out.println("Всі товари");
				shop.printAll();
				System.out.println("Прошук за індексом "+st);
				if (!shop.printCargoByIndex(Integer.parseInt(st)))
				{
					System.out.println("Помилка індексу "+st);
				}
				break;
			} // of 8

			case "9": { // print all
				shop.printAll();
				break;
			} // of 9
			case "0": { // exit
				System.exit(0);
			} // of 0
	

			}// of case
		} // of while

		
	}
	// print menu
	private static void printMenu() {
		System.out.println("Введіть 1  щоб створити новий продукт");
		System.out.println("Введіть 2  щоб видалити продукт");
		System.out.println("Введіть 3  щоб замінити продукт");
		System.out.println("Введіть 4  щоб посортувати за назвою");
		System.out.println("Введіть 5  щоб посортувати за довжиною");
		System.out.println("Введіть 6  щоб посортувати за шириною");
		System.out.println("Введіть 7  щоб посортувати за вагою");
		System.out.println("Введіть 8  щоб надрукувати і-й продукт");
		System.out.println("Введіть 9  щоб надрукувати всі продукти");
		System.out.println("Введіть 0  щоб вийти з програми");

	}
}
