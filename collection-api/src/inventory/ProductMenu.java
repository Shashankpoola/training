package inventory;

import java.util.Scanner;

public class ProductMenu {
	private static ProductJdbcDao dao;

	static {
		dao = new ProductJdbcDao();
	}
	
	public static void main(String[] args) {

		Scanner console = new Scanner(System.in);
		while (true) {

			System.out.println("MainMenu");
			System.out.println("1-Add Product\n 2-Find Product\n 3-List Products\n 4-Delete Product\n 5-Exit");
			System.out.println("Enter choice: ");
			int choice = console.nextInt();
			// console.nextLine();
			switch (choice) {

			case 1:
				addProduct();
				break;
			case 2:
				findProduct();
				break;
			case 3:
				listProducts();
				break;
			case 4:
				delProduct();
				break;
			case 5:
				System.exit(0);
			default:
				System.out.println("Invalid option");

			}

		}

	}

	private static void delProduct() {
		Scanner console = new Scanner(System.in);
		System.out.println("Enter Product code");
		int code = console.nextInt();
		dao.delete(code);
		// console.close();
	}

	private static void listProducts() {
		dao.list().forEach(System.out::println);
	}

	private static void findProduct() {
		Scanner console = new Scanner(System.in);
		System.out.println("Enter Product code");
		int code = console.nextInt();
		System.out.println(dao.find(code));
		// console.close();
	}

	private static void addProduct() {
		Scanner console = new Scanner(System.in);

		System.out.println("Enter Product code: ");
		int code = console.nextInt();
		System.out.println("Enter product name ");
		String name = console.next();
		System.out.println("Enter Product price");
		double price = console.nextDouble();

		Product p = new Product(code, name, price);
		dao.add(p);

		// console.close();

	}

}
