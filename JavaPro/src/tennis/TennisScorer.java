package tennis;

import java.util.ArrayList;

public class TennisScorer implements TennisManager {
    Team team1, team2;
    FileManager fileManager;
    int currentSet = 1;
    String team1Name, team2Name;
    boolean tieBreak = false, gender, isDoubles, gameOver, setOver, finalOver;
    final int WIN_CONDITION;
    
    // 게임 기록 저장
    ArrayList<ArrayList<Integer>> gameHistoryList = new ArrayList<>();

    // 생성자
    TennisScorer(Team team1, Team team2, boolean gender, boolean isDoubles) {
        this.team1 = team1;
        this.team2 = team2;
        this.team1Name = team1.getTeamName();
        this.team2Name = team2.getTeamName();
        this.fileManager = new FileManager(this);
        this.WIN_CONDITION = ((!isDoubles && gender) ? GRAND_SLAM_MEN_SOLOS_SET_NUMBER : GRAND_SLAM_OTHERS_SET_NUMBER) - 1;
        this.gender = gender;
        this.isDoubles = isDoubles;
        fileManager.writeInit(); // 초기화 작업
    }

    // 득점 처리
    @Override
    public void pointWinner(int p) {
        gameOver = setOver = finalOver = false;
        
        if (p == 1) {
            team1.updatePointScore();
            System.out.printf("%s 선수가 득점했습니다!\n", team1Name);
        } else {
            team2.updatePointScore();
            System.out.printf("%s 선수가 득점했습니다!\n", team2Name);
        }

        saveRecordToArrayList();
        dispScoreBoard();

        if (gameOver = gameOver(tieBreak)) {
            updateGameResult();
            if (setOver = setOver()) {
                updateSetResult();
                if (finalOver = finalOver()) {
                    tennisEnd();
                }
            }
        }
    }

    // 콘솔 출력
    @Override
    public void dispScoreBoard() {
        System.out.println("==========================================================");
        System.out.printf("[%d세트]       \tS\t\tG\t\tP\n", currentSet);
        printTeamScore(team1);
        printTeamScore(team2);
        System.out.println("==========================================================\n");
    }

    private void printTeamScore(Team team) {
        System.out.print(String.format("%-12s", team.getTeamName()));
        System.out.printf("\t%d\t\t%d\t\t%d\n", team.getSetScore(), team.getGameScore(), team.getPointScore());
    }

    // 게임 종료 후 처리
    public void updateGameResult() {
        Team winner = (team1.getPointScore() > team2.getPointScore()) ? team1 : team2;
        winner.updateGameScore();
        System.out.printf("%s *게임 스코어* 획득\n", winner.getTeamName());
        resetPointScores();
        tieBreakUpdate();
    }

    // 세트 종료 후 처리
    public void updateSetResult() {
        Team winner = (team1.getGameScore() > team2.getGameScore()) ? team1 : team2;
        winner.updateSetScore();
        System.out.println("그리고 세트를 가져옵니다");
        currentSet++;
        resetGameScores();
    }

    // 최종 결과 출력
    private void printFinalResult() {
        System.out.println("\n<최종 결과>");
        System.out.printf("세트 스코어 -> [%d : %d]\n", team1.getSetScore(), team2.getSetScore());
        if (team1.getSetScore() == WIN_CONDITION) {
            System.out.println("1번 선수 최종 승리\n");
        } else {
            System.out.println("2번 선수 최종 승리\n");
        }
    }

    // 기록 저장
    private void saveRecordToArrayList() {
        ArrayList<Integer> gameHistory = new ArrayList<>();
        gameHistory.add(team1.getPointScore());
        gameHistory.add(team2.getPointScore());
        gameHistoryList.add(gameHistory);
    }

    private void saveRecordToFile() {
        fileManager.writeGameHistory();
    }

    // 게임 종료 체크
    public boolean gameOver(boolean tieBreak) {
        int team1PointScore = team1.getPointScore();
        int team2PointScore = team2.getPointScore();
        int diff = Math.abs(team1PointScore - team2PointScore);
        return (team1PointScore >= (tieBreak ? 7 : 4) || team2PointScore >= (tieBreak ? 7 : 4)) && diff >= 2;	//  	diff 점수차 2점
    }

    // 세트 종료 체크
    public boolean setOver() {
        int diff = Math.abs(team1.getGameScore() - team2.getGameScore());
        return (team1.getGameScore() >= 6 || team2.getGameScore() >= 6) && diff >= 2 || team1.getGameScore() == 7 || team2.getGameScore() == 7; // 6점을 달성하고 나서 2점 차이가 이상이 날때 || 타이브레이크 7점 상황일 때 종료
    }

    // 경기 종료 체크
    public boolean finalOver() {
        return team1.getSetScore() == WIN_CONDITION || team2.getSetScore() == WIN_CONDITION; // 남자 단식 조건 5판중 3판 승리 //여자 단식 5판중 2판 승리
    }

    // 타이브레이크 설정
    public void tieBreakUpdate() {
        if (team1.getGameScore() == 6 && team2.getGameScore() == 6) {
            this.tieBreak = true;
        }
    }

    // 점수 초기화
    public void resetPointScores() {
        team1.initPointScore();
        team2.initPointScore();
        saveRecordToFile();
        gameHistoryList.clear();
    }

    // 게임 점수 초기화
    public void resetGameScores() {
        team1.initGameScore();
        team2.initGameScore();
        this.tieBreak = false;
    }

    // 경기 종료
    public void tennisEnd() {
        printFinalResult();
        fileManager.writeFinalResult();
    }
}