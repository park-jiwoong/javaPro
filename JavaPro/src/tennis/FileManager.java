package tennis;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;

public class FileManager {
	String pathname;
	File saveFile;
	
	FileManager(Player player1, Player player2) {
		
		String parent = System.getProperty("user.dir");
		
		this.pathname = player1.getPlayerName()+" vs "+player2.getPlayerName()+".txt";

		saveFile = new File(parent, this.pathname);

	}
	
	public void writeGameHistory(TennisScorer scorer) {
		try (FileWriter writer = new FileWriter(saveFile.getAbsolutePath(), true);
				BufferedWriter bw = new BufferedWriter(writer);) {
			bw.append(String.format("[%d세트] 게임 스코어 %d : %d, 세트 스코어 %d : %d\n", scorer.currentSet, scorer.player1.getGameScore(), scorer.player2.getGameScore(), scorer.player1.getSetScore(), scorer.player2.getSetScore()));
			bw.append(scorer.player1Name+" ");
			for(ArrayList<Integer> history : scorer.gameHistoryList) {
				bw.append(history.get(0).toString()+" ");
			}
			bw.append("\n");
			bw.append(scorer.player2Name+" ");
			for(ArrayList<Integer> history : scorer.gameHistoryList) {
				bw.append(history.get(1).toString()+" ");
			}
			bw.append("\n\n");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void writeFinalResult(TennisScorer scorer) {
		try (FileWriter writer = new FileWriter(saveFile.getAbsolutePath(), true);
				BufferedWriter bw = new BufferedWriter(writer);) {
			bw.append(String.format("최종 세트 스코어 : %s[%d] : [%d]%s\n", scorer.player1.getPlayerName(),  scorer.player1.getSetScore(), scorer.player2.getSetScore(), scorer.player2.getPlayerName()));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
