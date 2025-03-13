package tennis;

public class Main {
	public static void main(String[] args) {
		TennisScorer tennisScorer = new TennisScorer(new Player("최인석"), new Player("최승호"));
		tennisScorer.startGame();
	}
}
