package com.codecheck123.dumbbdd;

/**
 * Entry point into Dumb-BDD<br/><br/>
 * Example:<br/>
 * First create a UserStory, then use it to create any number of scenarios
 * <pre>
 * List<String> results = Collections.emptyList();
 * 
 * UserStory story = new UserStory.WithTitle("Search for customers")
 *	.asA("Retention Manager")
 *	.iWant("to search for my customers by their first and last names")
 *	.create();
 *
 * Query query = new SearchQuery();
 * story.scenarioWithTitle("Search by first name")
 *	.given("first name 'John'", (args) -> {
 *		query.byFirstname(args.first().asString());
 *	})
 *	.when("I submit search query", (args) -> {
 *		results = query.search();
 *	})
 *	.then("then the results size should be more than '0'", (args) -> {
 *		assertThat(results.size()).isGreaterThan(args.first().asInt());
 *	});
 * </pre>
 * @author matt.mahlatse@gmail.com
 */
public class UserStory extends AbstractBDD {

	private static final char NEXT_LINE = '\n';
	private static final String AS_A = "As a ";
	
	private StringBuilder story = new StringBuilder();
	private final String title;
	
	private UserStory(String title){
		Util.checkForNotNullOrEmpty(title);
		this.title = title;
	}
	
	String getStory() {
		return story.toString();
	}

	String getTitle() {
		return title;
	}
	
	void appendUserExpression(String template, String userExpression) {
		Util.checkForNotNullOrEmpty(userExpression);
		story.append(template);
		story.append(userExpression);
		story.append(NEXT_LINE);
	}

	public static class WithTitle {
		private UserStory userStory;
		
		/**
		 * Creates a new UserStory instance
		 * @param title Title of the UserStory - should be very short, around 3 to 10 words
		 * @throws IllegalArgumentException If the Title is NULL or an Empty string
		 */
		public WithTitle(String title){
			Util.checkForNotNullOrEmpty(title);
			userStory = new UserStory(title);
		}
		
		/**
		 * @param role Role of the User
		 * @throws IllegalArgumentException If the Role is NULL or an Empty string
		 */
		public AsA asA(String role) {
			userStory.appendUserExpression(AS_A, role);
			return new AsA(userStory);
		}
	}
	
	/**
	 * @param title - Title of the scenario
	 * @return A new Scenario instance
	 */
	public Scenario scenarioWithTitle(String title){
		Util.checkForNotNullOrEmpty(title);
		return new Scenario(this, title);
	}
}