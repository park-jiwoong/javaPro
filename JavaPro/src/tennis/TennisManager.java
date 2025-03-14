package tennis;

public interface TennisManager {
	public void pointWinner(int p);

	public void dispScoreBoard();
	
	final static int GRAND_SLAM_MEN_SOLOS_SET_NUMBER = 5;
	final static int GRAND_SLAM_OTHERS_SET_NUMBER = 3;
	
	final static int TIE_BREAKER_ACTIVATE_GAME_NUMBER = 6;
	final static int TIE_BREAKER_WIN_CONDITION = 7;
}