package fooddileverysystem;

import java.util.Scanner;

//Controller Layer

public class Application {
	static UserInterface userInterface = new UserInterface();

	public static void main(String[] args) {
		UserInterface userInterface = new UserInterface();
		userInterface.showUserMenu();
	}

	public void handleUserSelection(int num) {
		FoodStore foodStore = FoodStore.getInstance();
		int n;
		switch (num) {
		case 1: 
			FoodItem foodItem = userInterface.addItem();
			foodStore.add(foodItem);
			break;
		case 2: 
			System.out.println("Enter the name which you want to remove:");
			String name = new Scanner(System.in).nextLine();
			foodStore.remove(new FoodItem(name));
			break;
		case 3: 
			userInterface.print(foodStore.getFoodList());
			break;
		case 4: 
			System.out.println("Enter the name which you want to edit: ");
            String foodname = new Scanner(System.in).nextLine();
            FoodItem food = foodStore.getFoodItem(foodname);
            userInterface.edit(food);
			break;
		case 5: 
			n = 5;
			break;
		}
	}

}
