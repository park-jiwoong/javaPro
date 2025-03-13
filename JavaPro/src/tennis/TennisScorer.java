package tennis;

import java.util.ArrayList;
import java.util.Random;

public class TennisScorer implements TennisManager {
	Player player1, player2;
	FileManager fileManager;

//   int player1PointScore, player2PointScore;
//   int player1GameScore, player2GameScore;
//   int player1SetScore, player2SetScore;

	int currentSet = 1;

	String player1Name;
	String player2Name;

	boolean tieBreak = false;
	
	ArrayList<ArrayList<Integer>> gameHistoryList = new ArrayList<>();
	
	TennisScorer(Player player1, Player player2) {
		this.player1 = player1;
		this.player2 = player2;

		this.player1Name = player1.getPlayerName();
		this.player2Name = player2.getPlayerName();
		
		this.fileManager = new FileManager(player1, player2);

	}

	@Override
	public void startGame() {
		
		while (!finalOver()) {
			
			while (!setOver()) {
				
				while (!gameOver(tieBreak)) {
					
					playGame();
				}
				
				resetPointScores();
			}
			
			resetGameScores();
		}
		
		resetSetScores();
	}

	@Override
	public void playGame() {
		Random rnd = new Random();
		pointWinner(rnd.nextInt(2) + 1);
	}

	public boolean gameOver(boolean tieBreak) {

		int player1PointScore = player1.getPointScore();
		int player2PointScore = player2.getPointScore();

		int diff = player1PointScore - player2PointScore;
		int minScore = tieBreak ? 7 : 4;

		boolean result = false;

		dispScoreBoard();
		saveRecordToArrayList();

		if ((player1PointScore >= minScore || player2PointScore >= minScore) && Math.abs(diff) >= 2) {

			int winner = (player1PointScore > player2PointScore) ? 1 : 2;

			if (winner == 1) {
				player1.updateGameScore();
				System.out.printf("%s *게임 스코어* 획득\n", player1Name);
			} else {
				player2.updateGameScore();
				System.out.printf("%s *게임 스코어* 획득\n", player2Name);
			}

			tieBreakUpdate();

			result = true;
		}

		return result;
	}

	private void saveRecordToFile() {
		fileManager.writeGameHistory(this);
	}

	private void saveRecordToArrayList() {
		ArrayList<Integer> gameHistory = new ArrayList<>();
		gameHistory.add(player1.getPointScore());
		gameHistory.add(player2.getPointScore());
		gameHistoryList.add(gameHistory);
	}

	public void tieBreakUpdate() {
		if (player1.getGameScore() == 6 && player2.getGameScore() == 6) {
			this.tieBreak = true;
		}
	}

	public boolean setOver() {

		int player1GameScore = player1.getGameScore();
		int player2GameScore = player2.getGameScore();

		int diff = player1GameScore - player2GameScore;
		boolean result = false;

		if ((player1GameScore >= 6 || player2GameScore >= 6) && Math.abs(diff) >= 2 || player1GameScore == 7
				|| player2GameScore == 7) {

			int winner = (player1GameScore > player2GameScore) ? 1 : 2;

			if (winner == 1) {
				System.out.println("그리고 세트를 가져옵니다");
				player1.updateSetScore();
			} else {
				System.out.println("그리고 세트를 가져옵니다");
				player2.updateSetScore();
			}

			currentSet++;
			result = true;
		}
		return result;
	}

	public boolean finalOver() {

		int player1SetScore = player1.getSetScore();
		int player2SetScore = player2.getSetScore();

		if (player1SetScore == 2 || player2SetScore == 2) {

			System.out.println("\n<최종 결과>");
			System.out.printf("세트 스코어 -> [%d : %d]\n", player1SetScore, player2SetScore);

			if (player1SetScore == 2) {
				System.out.println("1번 선수 최종 승리\n");
			} else {
				System.out.println("2번 선수 최종 승리\n");
			}
			return true;
		}
		return false;
	}

	public void pointWinner(int p) {
		if (p == 1) {
			System.out.printf("%s 선수가 득점했습니다!\n", player1Name);
			player1.updatePointScore();
		} else {
			System.out.printf("%s 선수가 득점했습니다!\n", player2Name);
			player2.updatePointScore();
		}
	}

	public void dispScoreBoard() {
//        System.out.printf("1번[%s] : %d , 2번[%s] : %d\t게임 스코어 : [%d : %d]\t 세트 스코어 : [%d : %d]\n\n", 
//            player1, player1PointScore, player2, player2PointScore, player1GameScore, player2GameScore, player1SetScore, player2SetScore);

		System.out.println("==========================================================");
		System.out.printf("[%d세트]\t\tS\t\tG\t\tP\n", currentSet);
		System.out.print(" " + player1Name);
		System.out.printf("\t\t%d\t\t%d\t\t%d\n", player1.getSetScore(), player1.getGameScore(),
				player1.getPointScore());
		System.out.print(" " + player2Name);
		System.out.printf("\t\t%d\t\t%d\t\t%d\n", player2.getSetScore(), player2.getGameScore(),
				player2.getPointScore());
		System.out.println("==========================================================");

		System.out.println();
	}

	public void resetPointScores() {
		player1.initPointScore();
		player2.initPointScore();
		
		
		saveRecordToFile();
		gameHistoryList.clear();
	}

	public void resetGameScores() {
		player1.initGameScore();
		player2.initGameScore();

		this.tieBreak = false;
	}

	public void resetSetScores() {
		fileManager.writeFinalResult(this);
		
		player1.initSetScore();
		player2.initSetScore();

		currentSet = 1;
	}
}