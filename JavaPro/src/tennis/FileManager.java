package tennis;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.time.LocalDate;
import java.util.ArrayList;

public class FileManager {
    String pathname;
    File saveFile;
    TennisScorer scorer;
    LocalDate d = LocalDate.now();

    // 생성자
    FileManager(TennisScorer scorer) {
        String parent = System.getProperty("user.dir");
        this.pathname = scorer.team1.getTeamName() + " vs " + scorer.team2.getTeamName() + " (" + d + ").txt"; 
        this.saveFile = new File(parent, this.pathname);
        this.scorer = scorer;
    }

    // 초기 경기 정보 저장
    public void writeInit() {
        writeToFile(String.format("%s 경기 (%s vs %s) [%s %s]\n\n", d, scorer.team1.getTeamName(), scorer.team2.getTeamName(),
                scorer.gender ? "남자" : "여자", scorer.isDoubles ? "복식" : "단식"));
    }

    // 게임 기록 저장
    public void writeGameHistory() {
        boolean isTieBreak = scorer.tieBreak;
        StringBuilder sb = new StringBuilder();

        sb.append(String.format("[%d세트] |게임 스코어| %d : %d  |세트 스코어| %d : %d\n", scorer.currentSet,
                scorer.team1.getGameScore(), scorer.team2.getGameScore(), scorer.team1.getSetScore(),
                scorer.team2.getSetScore()));

        appendScoreHistory(sb, scorer.team1Name, 0, isTieBreak);
        appendScoreHistory(sb, scorer.team2Name, 1, isTieBreak);

        sb.append("\n\n");
        writeToFile(sb.toString());
    }

    // 최종 결과 저장
    public void writeFinalResult() {
        String finalResult = String.format("최종 세트 스코어 : %s[%d] : [%d]%s\n", scorer.team1.getTeamName(),
                scorer.team1.getSetScore(), scorer.team2.getSetScore(), scorer.team2.getTeamName());
        writeToFile(finalResult);
    }

    // 파일에 기록하는 메소드
    private void writeToFile(String content) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(saveFile, true))) {
            bw.append(content);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 점수 기록을 추가하는 메소드
    private void appendScoreHistory(StringBuilder sb, String teamName, int teamIndex, boolean isTieBreak) {
        sb.append(String.format("%-12s", teamName));
        for (int i = 0; i < scorer.gameHistoryList.size(); i++) {
            sb.append(convertScore(teamIndex, i, isTieBreak));
        }
        sb.append("\n");
    }

    // 점수 변환
    private String convertScore(int team, int index, boolean isTieBreak) {
        ArrayList<ArrayList<Integer>> historyList = scorer.gameHistoryList;
        int originalScore = historyList.get(index).get(team);
        int compareScore = historyList.get(index).get((team + 1) % 2);

        String convertedString = isTieBreak ? String.format("%d", originalScore) : String.format("%3s",convertNormalScore(originalScore, compareScore));
        if (index == historyList.size() - 1 && originalScore > compareScore) {
            convertedString = "WIN";
        }

        return convertedString + "\t";
    }

    // 일반 점수 변환
    private String convertNormalScore(int originalScore, int compareScore) {
        switch (originalScore) {
            case 0: return "0";
            case 1: return "15";
            case 2: return "30";
            case 3: return "40";
            default: return (originalScore > compareScore) ? "40A" : "40";
        }
    }
}
