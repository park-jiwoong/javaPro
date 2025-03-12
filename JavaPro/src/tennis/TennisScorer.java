package tennis;

import java.util.Random;

public class TennisScorer {
   String player1, player2;

   int player1PointScore, player2PointScore;
   int player1GameScore, player2GameScore;
   int player1SetScore, player2SetScore;

   int currentSet = 1;

   boolean tieBreak = false;

   TennisScorer(String player1Name, String player2Name) {
      this.player1 = player1Name;
      this.player2 = player2Name;
   }

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

   public void playGame() {
      Random rnd = new Random();
      pointWinner(rnd.nextInt(2) + 1);

   }

   public boolean gameOver(boolean tieBreak) {
      int diff = player1PointScore - player2PointScore;
      int minScore = tieBreak ? 7 : 4;

      boolean result = false;

      dispScoreBoard();
      // saveRecordToFile();

      if ((player1PointScore >= minScore || player2PointScore >= minScore) && Math.abs(diff) >= 2) {
    	  
         int winner = (player1PointScore > player2PointScore) ? 1 : 2;

         if (winner == 1) {
            player1GameScore++;
            System.out.printf("%s *게임 스코어* 획득\n", player1);
         } else {
            player2GameScore++;
            System.out.printf("%s *게임 스코어* 획득\n", player2);
         }

         if (player1GameScore == 6 && player2GameScore == 6) {
            this.tieBreak = true;
         }

         result = true;
      }

      return result;
   }

   public boolean setOver() {

      int diff = player1GameScore - player2GameScore;
      boolean result = false;

      if ((player1GameScore >= 6 || player2GameScore >= 6) && Math.abs(diff) >= 2 || player1GameScore == 7
            || player2GameScore == 7) {
    	  
         int winner = (player1GameScore > player2GameScore) ? 1 : 2;
         
         if (winner == 1) {
            System.out.println("그리고 세트를 가져옵니다");
            player1SetScore++;
         } else {
            System.out.println("그리고 세트를 가져옵니다");
            player2SetScore++;
         }

         currentSet++;
         result = true;
      }
      return result;
   }

   public boolean finalOver() {

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
         System.out.printf("%s 선수가 득점했습니다!\n", player1);
         player1PointScore++;
      } else {
         System.out.printf("%s 선수가 득점했습니다!\n", player2);
         player2PointScore++;
      }
   }

   public void dispScoreBoard() {
//        System.out.printf("1번[%s] : %d , 2번[%s] : %d\t게임 스코어 : [%d : %d]\t 세트 스코어 : [%d : %d]\n\n", 
//            player1, player1PointScore, player2, player2PointScore, player1GameScore, player2GameScore, player1SetScore, player2SetScore);

      System.out.println("==========================================================");
      System.out.printf("[%d세트]\t\tS\t\tG\t\tP\n", currentSet);
      System.out.print(" " + player1);
      System.out.printf("\t\t%d\t\t%d\t\t%d\n", player1SetScore, player1GameScore, player1PointScore);
      System.out.print(" " + player2);
      System.out.printf("\t\t%d\t\t%d\t\t%d\n", player2SetScore, player2GameScore, player2PointScore);
      System.out.println("==========================================================");

      System.out.println();
   }

   public void resetPointScores() {
      player1PointScore = 0;
      player2PointScore = 0;

   }

   public void resetGameScores() {
      player1GameScore = 0;
      player2GameScore = 0;
      
      this.tieBreak = false;
   }

   public void resetSetScores() {
      player2SetScore = 0;
      player1SetScore = 0;
      
      currentSet = 1;
   }
}