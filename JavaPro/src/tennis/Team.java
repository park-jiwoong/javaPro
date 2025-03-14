package tennis;

import java.util.ArrayList;

public class Team {
	private final String teamName;
	private int pointScore;
	private int gameScore;
	private int setScore;

	ArrayList<Player> players = new ArrayList<>();

	Team(ArrayList<Player> players) {
		String name = "";

		if (players.size() == 1) {
			name = players.get(0).getPlayerName();
		} else {
			name = players.get(0).getPlayerName() + "," + players.get(1).getPlayerName();
		}

		this.teamName = name;
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

	public String getTeamName() {
		return teamName;
	}

	public void initSetScore() {
		this.setScore = 0;

	}
}
