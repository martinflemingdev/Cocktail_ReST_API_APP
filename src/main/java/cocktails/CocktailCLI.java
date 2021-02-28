package cocktails;

import java.util.Scanner;

public class CocktailCLI {

	public static void main(String[] args) {
		System.out.println("**************************************");
		System.out.println("WELCOME TO THE COCKTAIL RECIPE FINDER!");
		System.out.println("**************************************");
		System.out.println("** powered by TheCocktailDb.com/API **");
		System.out.println("**************************************");
		while (true) {

			CocktailService cocktailService = new CocktailService();
			Scanner scanner = new Scanner(System.in);
			int menuSelection;

			cocktailService.printMenu();

			// eliminates format exception
			if (scanner.hasNextInt()) {
				menuSelection = scanner.nextInt();
				scanner.nextLine();
			} else {
				menuSelection = 0;
			}

			if ( menuSelection == 1 ) {

				System.out.print("Please enter a search word: ");
				String name = scanner.nextLine();
				CocktailAPIObject searchedCocktail = cocktailService.getListOfCocktailsByName(name);

				if (searchedCocktail != null) {
					cocktailService.displayCocktailRecipe(searchedCocktail.getDrinks());
				}
			}
			else if ( menuSelection == 2 ) {

				System.out.print("Please enter an ingredient: ");
				String ingredient = scanner.nextLine();
				CocktailAPIObject searchedCocktail = cocktailService.getListOfCocktailsByIngredient(ingredient);

				if (searchedCocktail != null) {
					cocktailService.displayListOfCocktails(searchedCocktail.getDrinks());
				}
			} 
			else if ( menuSelection == 3 ) {

				System.out.print("Please enter a drink ID: ");
				int id;

				if (scanner.hasNextInt()) {
					id = scanner.nextInt();
					scanner.nextLine();
				} else {
					System.out.println("\nSorry, nothing matched your search. Try again!");
					id = 0;
				}

				Cocktail[] cocktailFoundById = cocktailService.getCocktailRecipeById(id).getDrinks();
				if (cocktailFoundById != null) {
					cocktailService.displayCocktailRecipe(cocktailFoundById);
				}
			} 
			else if ( menuSelection == 4 ) {

				Cocktail[] randomCocktail = cocktailService.getRandomCocktail().getDrinks();
				cocktailService.displayCocktailRecipe(randomCocktail);

			}
			else if ( menuSelection == 5 ) {
				scanner.close();
				System.exit(1);
			}
			else { 
				System.out.println("Invalid selection, please try again!");
			}
		}
	}

}
