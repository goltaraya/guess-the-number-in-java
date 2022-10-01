package entitities;

public class Banner {
	private String guessTheNumberBanner = "  __________________________   \n"
			+ " /  _____/\\__    ___/\\      \\  \n"
			+ "/   \\  ___  |    |   /   |   \\ \n"
			+ "\\    \\_\\  \\ |    |  /    |    \\\n"
			+ " \\______  / |____|  \\____|__  /\n"
			+ "        \\/                  \\/ \n"
			+ "";

	public Banner() {
	}

	public String getGuessTheNumberBanner() {
		return guessTheNumberBanner;
	}
	
	@Override
	public String toString() {
		return this.getGuessTheNumberBanner();
	}
	
}
