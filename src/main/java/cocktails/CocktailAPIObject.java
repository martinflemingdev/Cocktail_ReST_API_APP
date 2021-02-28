package cocktails;

public class CocktailAPIObject {

	private Cocktail[] drinks;

	public CocktailAPIObject() {
		
	}
	
	public CocktailAPIObject(Cocktail[] drinks) {
		this.drinks = drinks;
	}

	public Cocktail[] getDrinks() {
		return drinks;
	}

	public void setDrinks(Cocktail[] drinks) {
		this.drinks = drinks;
	}
	

}
