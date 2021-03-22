package cocktails;

import org.springframework.web.client.RestTemplate;

public class CocktailService {

	// Instance variables

	public static final String BASE_URL = "https://www.thecocktaildb.com/api/json/v1/1";
	public RestTemplate restTemplate = new RestTemplate();

	// API Calling Methods

	public CocktailAPIObject getListOfCocktailsByName (String name) {
		CocktailAPIObject results = restTemplate.getForObject(BASE_URL + "/search.php?s=" + name, CocktailAPIObject.class);
		if (results != null) {
			return results;
		}
		System.out.println("\nSorry, nothing matched your search. Try again!");
		return null;
	}

	public CocktailAPIObject getListOfCocktailsByIngredient (String ingredient) {
		CocktailAPIObject results = restTemplate.getForObject(BASE_URL + "/filter.php?i=" + ingredient, CocktailAPIObject.class);
		if (results != null) {
			return results;
		} 
		System.out.println("\nSorry, nothing matched your search. Try again!");
		return null;
	}

	public CocktailAPIObject getCocktailRecipeById (int id) {
		CocktailAPIObject results = restTemplate.getForObject(BASE_URL + "/lookup.php?i=" + id, CocktailAPIObject.class);
		if (results != null) {
			return results;
		} 
		return null;
	}

	public CocktailAPIObject getRandomCocktail() {
		return restTemplate.getForObject(BASE_URL + "/random.php", CocktailAPIObject.class);
	}

}
