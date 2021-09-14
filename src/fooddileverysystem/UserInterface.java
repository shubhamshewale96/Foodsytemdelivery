package fooddileverysystem;

import java.util.List;
import java.util.Scanner;

//View Layer

public class UserInterface {
	private static final String Taste = null;

	public void print(List<FoodItem> foodList) {
		for (FoodItem foodItem : foodList) {
			System.out.println(foodItem);
		}
	}

	public void showUserMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("***********\nFood Delivery System \n***********\n");
		int n = 0;
		Application application = new Application();
		while (n == 0) {
			System.out.print(
					"1. To add an item. \n2. To remove an item. \n3. Print the menu. \n4. To edit \n5. Exit \nEnter your choice:  ");
			int num = sc.nextInt();
			application.handleUserSelection(num);
		}
	}

	public FoodItem addItem() {
		FoodItem foodItem = new FoodItem();
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter item name:");
		foodItem.itemName = sc.nextLine();

		System.out.print("Enter taste: \n1. For Spicy. \n2. For Sweet. \n3. For Sour. \n4. For Sweet-Sour");
		int tasteChoice = sc.nextInt();
		switch (tasteChoice) {
		case 1:
			foodItem.setTaste(FoodItem.Taste.SPICY);
			break;
		case 2:
			foodItem.setTaste(FoodItem.Taste.SWEET);
			break;
		case 3:
			foodItem.setTaste(FoodItem.Taste.SOUR);
			break;
		case 4:
			foodItem.setTaste(FoodItem.Taste.SWEET_SOUR);
			break;
		}
		System.out.print("Enter category type: \n1. Starter. \n2. For Main Course. \n3. For Beverages ");
		int categoryChoice = sc.nextInt();
		switch (categoryChoice) {
		case 1:
			foodItem.setCategory(FoodItem.Category.STARTER);
			break;
		case 2:
			foodItem.setCategory(FoodItem.Category.MAIN_COURSE);
			break;
		case 3:
			foodItem.setCategory(FoodItem.Category.BEVERAGES);
			break;
		}
		System.out.print("Enter the type: \n1. For Veg type. \n2. For Non Veg Type.");
		int type = sc.nextInt();
		switch (type) {
		case 1:
			foodItem.setType(FoodItem.VegType.Veg);
			break;
		case 2:
			foodItem.setType(FoodItem.VegType.Non_Veg);
			break;
		}
		System.out.print("Enter the price of the item: Rs.");
		int price = sc.nextInt();
		foodItem.setPrice(price);
		System.out.println("\n success!!!Food item Inserted .......\n");

		return foodItem;
	}

	
	public FoodItem edit(FoodItem foodItem) {
		int flag = 0;
		while (flag == 0) {
			Scanner sc = new Scanner(System.in);
			System.out.print(
					"which field you want to edit\n1. for Name\n2. for Taste\n3. for Category\n4. for Type\n5. for price\n6. for exit\n=====>> ");
			int choice = sc.nextInt();
			switch (choice) {
			case 1: {
				System.out.print("\nEnter Item Name: ");
				foodItem.itemName = sc.nextLine();
				break;
			}
			case 2: {
				System.out.print(
						"Enter Taste: \n1. For Spicy. \n2. For Sweet. \n3. For Sour. \n4. For Sweet-Sour\n====>> ");
				int tasteChoice = sc.nextInt();
				switch (tasteChoice) {
				case 1:
					foodItem.setTaste(FoodItem.Taste.SPICY);
					break;
				case 2:
					foodItem.setTaste(FoodItem.Taste.SWEET);
					break;
				case 3:
					foodItem.setTaste(FoodItem.Taste.SOUR);
					break;
				case 4:
					foodItem.setTaste(FoodItem.Taste.SWEET_SOUR);
					break;
				default:
					System.out.println("plz enter correct choice........");
				}
			}
			case 3: {
				System.out
						.print("Enter category type: \n1. Starter. \n2. For Main Course. \n3. For Beverages \n====>> ");
				int categoryChoice = sc.nextInt();
				switch (categoryChoice) {
				case 1:
					foodItem.setCategory(FoodItem.Category.STARTER);
					break;
				case 2:
					foodItem.setCategory(FoodItem.Category.MAIN_COURSE);
					break;
				case 3:
					foodItem.setCategory(FoodItem.Category.BEVERAGES);
					break;
				default:
					System.out.println("plz enter correct choice........");
				}
			}
			case 4: {
				System.out.print("Enter the Type: \n1. for Veg type. \n2. for NonVeg Type\n====>> ");
				int type = sc.nextInt();
				switch (type) {
				case 1:
					foodItem.setType(FoodItem.VegType.Veg);
					break;
				case 2:
					foodItem.setType(FoodItem.VegType.Non_Veg);
					break;
				default:
					System.out.println("plz enter correct choice........");
				}
			}
			case 5: 
				System.out.print("Enter Price: Rs.");
				int price = sc.nextInt();
				foodItem.setPrice(price);
				break;
			case 6: 
				flag = 1;
				break;
			default:
				System.out.println("plz enter correct option");
			}
		}
		return foodItem;
	}
}