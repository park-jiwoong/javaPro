package tennis;


public class Player {
	private final String playerName;
	private int pointScore;
	private int gameScore;
	private int setScore;
	
	Player(String playerName) {
        this.playerName = playerName;
    }

	public void initPointScore() {
		this.pointScore = 0;
	}

	public void initGameScore() {
		this.gameScore = 0;
	}

	public void updatePointScore() {
		pointScore++;
	}

	public void updateGameScore() {
		gameScore++;
	}

	public void updateSetScore() {
		setScore++;
	}

	public int getPointScore() {
		return pointScore;
	}

	public int getSetScore() {
		return setScore;
	}

	public int getGameScore() {
		return gameScore;
	}

	public String getPlayerName() {
		return playerName;
	}

	public void initSetScore() {
		this.setScore = 0;
		
	}
}
