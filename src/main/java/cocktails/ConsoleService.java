package cocktails;

public class ConsoleService {

	public void printMenu() {
		System.out.println("\n1. Search cocktail recipes by name");
		System.out.println("2. Search cocktails by ingredient");
		System.out.println("3. Get a cocktail recipe by ID");
		System.out.println("4. Get a random cocktail recipe");
		System.out.println("5. Exit");
		System.out.print("\nPlease choose a selection: ");
	}

	public void displayListOfCocktails(Cocktail[] returnedCocktail) {
		if (returnedCocktail != null) {
			for (Cocktail thisCocktail : returnedCocktail) {
				System.out.println();
				System.out.println(thisCocktail.getStrDrink());
				System.out.println("Drink ID: " + thisCocktail.getIdDrink());
			}
		} 
	}

	public void displayCocktailRecipe(Cocktail[] returnedCocktail) {
		if (returnedCocktail != null) {
			for (Cocktail thisCocktail : returnedCocktail) {
				System.out.println();
				System.out.println(thisCocktail.getStrDrink() + " in a " + thisCocktail.getStrGlass());
				System.out.println("Drink ID: " + thisCocktail.getIdDrink()+"\n");
				System.out.println(thisCocktail.getStrIngredient1() + " " + thisCocktail.getStrMeasure1());
				System.out.println(thisCocktail.getStrIngredient2() + " " + thisCocktail.getStrMeasure2());

				if (thisCocktail.getStrIngredient3() != null) {
					if (thisCocktail.getStrMeasure3() != null) {
						System.out.println(thisCocktail.getStrIngredient3() + " " + thisCocktail.getStrMeasure3());
					} else {
						System.out.println(thisCocktail.getStrIngredient3());
					}
				}
				if (thisCocktail.getStrIngredient4() != null) {
					if (thisCocktail.getStrMeasure4() != null) {
						System.out.println(thisCocktail.getStrIngredient4() + " " + thisCocktail.getStrMeasure4());
					} else {
						System.out.println(thisCocktail.getStrIngredient4());
					}
				}
				if (thisCocktail.getStrIngredient5() != null) {
					if (thisCocktail.getStrMeasure5() != null) {
						System.out.println(thisCocktail.getStrIngredient5() + " " + thisCocktail.getStrMeasure5());
					} else {
						System.out.println(thisCocktail.getStrIngredient5());
					}
				}
				if (thisCocktail.getStrIngredient6() != null) {
					if (thisCocktail.getStrMeasure6() != null) {
						System.out.println(thisCocktail.getStrIngredient6() + " " + thisCocktail.getStrMeasure6());
					} else {
						System.out.println(thisCocktail.getStrIngredient6());
					}
				}
				if (thisCocktail.getStrIngredient7() != null) {
					if (thisCocktail.getStrMeasure7() != null) {
						System.out.println(thisCocktail.getStrIngredient7() + " " + thisCocktail.getStrMeasure7());
					} else {
						System.out.println(thisCocktail.getStrIngredient7());
					}
				}
				if (thisCocktail.getStrIngredient8() != null) {
					if (thisCocktail.getStrMeasure8() != null) {
						System.out.println(thisCocktail.getStrIngredient8() + " " + thisCocktail.getStrMeasure8());
					} else {
						System.out.println(thisCocktail.getStrIngredient8());
					}
				}
				if (thisCocktail.getStrIngredient9() != null) {
					if (thisCocktail.getStrMeasure9() != null) {
						System.out.println(thisCocktail.getStrIngredient9() + " " + thisCocktail.getStrMeasure9());
					} else {
						System.out.println(thisCocktail.getStrIngredient9());
					}
				}
				if (thisCocktail.getStrIngredient10() != null) {
					if (thisCocktail.getStrMeasure10() != null) {
						System.out.println(thisCocktail.getStrIngredient10() + " " + thisCocktail.getStrMeasure10());
					} else {
						System.out.println(thisCocktail.getStrIngredient10());
					}
				}
				if (thisCocktail.getStrIngredient11() != null) {
					if (thisCocktail.getStrMeasure11() != null) {
						System.out.println(thisCocktail.getStrIngredient11() + " " + thisCocktail.getStrMeasure11());
					} else {
						System.out.println(thisCocktail.getStrIngredient11());
					}
				} 
				if (returnedCocktail.length > 1) {
					System.out.println("\n************************************");
				}
			} 
		} else {
			System.out.println("\nSorry, nothing matched your search. Try again!");
		}
	}
	
}
