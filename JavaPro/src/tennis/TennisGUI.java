package tennis;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.List;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

/*
 * 
 * 해당 GUI코드는 단순히 가독성 있는 출력을 위해 작성되었으며, UI 구성 파트에서 ChatGPT의 도움을 다수 받음.
 * 따라서 미숙하고 비효율적인 부분이 있으며 해당 프로젝트에서는 중요한 부분이 아니기에 코드 정리 작업을 거치지 않았음을 고지함.
 * 
 * */

public class TennisGUI extends JFrame {

	private static final long serialVersionUID = 1L;

	private TennisScorer scorer;
	private JLabel lblPointScore, lblGameScore, lblSetScore, lblPlayer1, lblPlayer2, lblPlayer3, lblPlayer4;
	private JTextArea txtSetHistory;
	private JButton btnPlayer1, btnPlayer2, btnStartGame;
	private JTextField tfPlayer1, tfPlayer2;
	private JPanel panelButtons, panelMode, panelGender;
	private JPanel panelHistoryAndButtons, panelNameInput;
	private List<String> setHistory = new ArrayList<>();

	private JRadioButton rbSingles, rbDoubles, rbMale, rbFemale;
	private JTextField tfPlayer3, tfPlayer4;

	private JButton btnNewGame;
	
	private JPanel scorePanel;
	
	private JLabel lblGameWinner;
	
	public TennisGUI() {
		setTitle("테니스 스코어보드");
		setSize(500, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		getContentPane().setBackground(new Color(20, 20, 20));

		Font koreanFont = new Font("맑은 고딕", Font.BOLD, 16);
		Font koreanLargeFont = new Font("맑은 고딕", Font.BOLD, 20);
		Font largeFont = new Font("맑은 고딕", Font.BOLD, 40);

		JPanel panelScore = new JPanel(new GridLayout(2, 1));
		panelScore.setBackground(new Color(30, 30, 30));

		lblSetScore = new JLabel("", SwingConstants.CENTER);
		lblSetScore.setFont(koreanLargeFont);
		lblSetScore.setForeground(Color.WHITE);
		panelScore.add(lblSetScore);

		lblGameScore = new JLabel("", SwingConstants.CENTER);
		lblGameScore.setFont(koreanFont);
		lblGameScore.setForeground(Color.YELLOW);
		panelScore.add(lblGameScore);

		add(panelScore, BorderLayout.NORTH);
		
		lblGameWinner = new JLabel(" ", SwingConstants.CENTER);
		lblGameWinner.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		lblGameWinner.setForeground(Color.YELLOW);

		

		lblPointScore = new JLabel("테니스", SwingConstants.CENTER);
		lblPointScore.setFont(largeFont);
		lblPointScore.setForeground(Color.GREEN);

		scorePanel = new JPanel();
		scorePanel.setBackground(new Color(20, 20, 20));

		scorePanel.setLayout(new BoxLayout(scorePanel, BoxLayout.Y_AXIS));

		lblGameWinner.setAlignmentX(Component.CENTER_ALIGNMENT);
		lblPointScore.setAlignmentX(Component.CENTER_ALIGNMENT);

		scorePanel.setAlignmentX(Component.CENTER_ALIGNMENT);

		scorePanel.removeAll();
		scorePanel.add(Box.createVerticalGlue()); 
		scorePanel.add(lblGameWinner);
		scorePanel.add(Box.createVerticalStrut(10)); 
		scorePanel.add(lblPointScore);
		scorePanel.add(Box.createVerticalGlue());


		add(scorePanel, BorderLayout.CENTER);

		panelHistoryAndButtons = new JPanel();
		panelHistoryAndButtons.setLayout(new BoxLayout(panelHistoryAndButtons, BoxLayout.Y_AXIS));
		panelHistoryAndButtons.setBackground(new Color(20, 20, 20));

		txtSetHistory = new JTextArea(5, 20);
		txtSetHistory.setEditable(false);
		txtSetHistory.setFont(koreanFont);
		txtSetHistory.setBackground(new Color(40, 40, 40));
		txtSetHistory.setForeground(Color.WHITE);
		JScrollPane scrollPane = new JScrollPane(txtSetHistory);
		panelHistoryAndButtons.add(scrollPane); 

		panelMode = new JPanel();
		panelMode.setBackground(new Color(20, 20, 20));
		panelMode.setLayout(new FlowLayout());

		rbSingles = new JRadioButton("단식", true);
		rbDoubles = new JRadioButton("복식");
		rbSingles.setFont(koreanFont);
		rbDoubles.setFont(koreanFont);
		rbSingles.setForeground(Color.WHITE);
		rbDoubles.setForeground(Color.WHITE);
		rbSingles.setBackground(new Color(20, 20, 20));
		rbDoubles.setBackground(new Color(20, 20, 20));

		ButtonGroup modeGroup = new ButtonGroup();
		modeGroup.add(rbSingles);
		modeGroup.add(rbDoubles);

		panelMode.add(rbSingles);
		panelMode.add(rbDoubles);
		
        panelGender = new JPanel();
        panelGender.setBackground(new Color(20, 20, 20));
        panelGender.setLayout(new FlowLayout());
        
		rbMale = new JRadioButton("남자", true);
		rbFemale = new JRadioButton("여자");
		rbMale.setFont(koreanFont);
		rbFemale.setFont(koreanFont);
		rbMale.setForeground(Color.WHITE);
		rbFemale.setForeground(Color.WHITE);
		rbMale.setBackground(new Color(20, 20, 20));
		rbFemale.setBackground(new Color(20, 20, 20));

		ButtonGroup genderGroup = new ButtonGroup();
		genderGroup.add(rbMale);
		genderGroup.add(rbFemale);

		panelGender.add(rbMale);
		panelGender.add(rbFemale);

		panelHistoryAndButtons.add(panelMode);
		panelHistoryAndButtons.add(panelGender);

		panelNameInput = new JPanel(new GridLayout(4, 2, 10, 10));
		panelNameInput.setBackground(new Color(20, 20, 20));

		lblPlayer1 = new JLabel("Player 1 이름:");
		lblPlayer1.setFont(koreanFont);
		lblPlayer1.setForeground(Color.WHITE);
		panelNameInput.add(lblPlayer1);

		tfPlayer1 = new JTextField();
		tfPlayer1.setFont(koreanFont);
		panelNameInput.add(tfPlayer1);

		lblPlayer2 = new JLabel("Player 2 이름:");
		lblPlayer2.setFont(koreanFont);
		lblPlayer2.setForeground(Color.WHITE);
		panelNameInput.add(lblPlayer2);

		tfPlayer2 = new JTextField();
		tfPlayer2.setFont(koreanFont);
		panelNameInput.add(tfPlayer2);

		lblPlayer3 = new JLabel("Player 3 이름:");
		lblPlayer3.setFont(koreanFont);
		lblPlayer3.setForeground(Color.WHITE);
		panelNameInput.add(lblPlayer3);

		tfPlayer3 = new JTextField();
		tfPlayer3.setFont(koreanFont);
		panelNameInput.add(tfPlayer3);

		lblPlayer4 = new JLabel("Player 4 이름:");
		lblPlayer4.setFont(koreanFont);
		lblPlayer4.setForeground(Color.WHITE);
		panelNameInput.add(lblPlayer4);

		tfPlayer4 = new JTextField();
		tfPlayer4.setFont(koreanFont);
		panelNameInput.add(tfPlayer4);

		panelHistoryAndButtons.add(panelNameInput);
		updatePlayerInputs(); 

		btnStartGame = createStyledButton("게임 시작");
		JPanel startGamePanel = new JPanel(new BorderLayout());
		startGamePanel.setBackground(new Color(20, 20, 20));
		startGamePanel.add(btnStartGame, BorderLayout.CENTER);
		panelHistoryAndButtons.add(startGamePanel);

		panelButtons = new JPanel(new GridLayout(1, 2));
		panelButtons.setBackground(new Color(20, 20, 20));
		panelButtons.setVisible(false);

		btnPlayer1 = createStyledButton("Player 1 득점");
		btnPlayer2 = createStyledButton("Player 2 득점");

		panelButtons.add(btnPlayer1);
		panelButtons.add(btnPlayer2);
		panelHistoryAndButtons.add(panelButtons);

		add(panelHistoryAndButtons, BorderLayout.SOUTH);

		btnStartGame.addActionListener(e -> startGame());
		btnPlayer1.addActionListener(e -> updateScore(1));
		btnPlayer2.addActionListener(e -> updateScore(2));

		rbSingles.addActionListener(e -> updatePlayerInputs());
		rbDoubles.addActionListener(e -> updatePlayerInputs());

		updateDisplay();

		btnNewGame = createStyledButton("새 게임 시작");
		btnNewGame.setVisible(false); 

		JPanel newGamePanel = new JPanel(new BorderLayout());
		newGamePanel.setBackground(new Color(20, 20, 20));
		newGamePanel.add(btnNewGame, BorderLayout.CENTER);
		panelHistoryAndButtons.add(newGamePanel);

		btnNewGame.addActionListener(e -> startNewGame());
	}

	private void updatePlayerInputs() {
		boolean isDoubles = rbDoubles.isSelected();

		lblPlayer3.setVisible(isDoubles);
		tfPlayer3.setVisible(isDoubles);
		lblPlayer4.setVisible(isDoubles);
		tfPlayer4.setVisible(isDoubles);
	}

	private JButton createStyledButton(String text) {
		JButton button = new JButton(text);
		button.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		button.setBackground(new Color(0, 173, 181));
		button.setForeground(Color.WHITE);
		button.setFocusPainted(false);
		button.setBorderPainted(false);
		button.setOpaque(true);
		return button;
	}

	private void startGame() {
		String player1Name = tfPlayer1.getText().trim();
		String player2Name = tfPlayer2.getText().trim();
		String player3Name = tfPlayer3.getText().trim();
		String player4Name = tfPlayer4.getText().trim();
		boolean isDoubles = rbDoubles.isSelected();

		if (player1Name.isEmpty() || player2Name.isEmpty()
				|| (isDoubles && (player3Name.isEmpty() || player4Name.isEmpty()))) {
			JOptionPane.showMessageDialog(this, "모든 플레이어 이름을 입력해주세요.", "경고", JOptionPane.WARNING_MESSAGE);
			return;
		}

		boolean gender = rbMale.isSelected();

		ArrayList<Player> team1Players = new ArrayList<>();
		ArrayList<Player> team2Players = new ArrayList<>();

		if (isDoubles) {
			team1Players.add(new Player(player1Name));
			team1Players.add(new Player(player2Name));
			team2Players.add(new Player(player3Name));
			team2Players.add(new Player(player4Name));

		} else {
			team1Players.add(new Player(player1Name));
			team2Players.add(new Player(player2Name));
		}
		
		scorer = new TennisScorer(new Team(team1Players), new Team(team2Players), gender, isDoubles);

		btnPlayer1.setText(scorer.team1.getTeamName() + " 득점");
		btnPlayer2.setText(scorer.team2.getTeamName() + " 득점");

		updateDisplay();
		
		panelMode.setVisible(false);
		panelGender.setVisible(false);
		btnStartGame.setEnabled(false);
		btnStartGame.setVisible(false);
		panelNameInput.setVisible(false);
		btnPlayer1.setVisible(true);
		btnPlayer2.setVisible(true);
		panelButtons.setVisible(true);
	}

	private void updateScore(int player) {
		if (scorer == null || scorer.finalOver())
			return;

		int prevPlayer1Score = scorer.team1.getPointScore();
		int prevPlayer2Score = scorer.team2.getPointScore();
		
		int prevPlayer1Game = scorer.team1.getGameScore();
		int prevPlayer2Game = scorer.team2.getGameScore();
		
		
		scorer.pointWinner(player);
		
		boolean gameOver = scorer.gameOver;
		boolean setOver = scorer.setOver;
		boolean finalOver = scorer.finalOver;
		boolean tieBreak = scorer.tieBreak;
		

		
		if (gameOver) {
		    if (prevPlayer1Score > prevPlayer2Score) {
		        lblGameWinner.setText("[" + scorer.team1.getTeamName() + "] 게임 포인트 획득!" + (tieBreak?" 타이브레이크 시작":""));
		    } else {
		        lblGameWinner.setText("[" + scorer.team2.getTeamName() + "] 게임 포인트 획득!" + (tieBreak?" 타이브레이크 시작":""));
		    }
		} else {
			if(player == 1) {
				lblGameWinner.setText("[" + scorer.team1.getTeamName() + "] 득점!");
			} else {
				lblGameWinner.setText("[" + scorer.team2.getTeamName() + "] 득점!");
			}
		}
		
		if (setOver) {
		    if (prevPlayer1Score > prevPlayer2Score) {
		        lblGameWinner.setText("[" + scorer.team1.getTeamName() + "] 세트 포인트 획득!");
		    } else {
		        lblGameWinner.setText("[" + scorer.team2.getTeamName() + "] 세트 포인트 획득!");
		    }
			
			if (player==1) {
				setHistory.add(String.format("세트 [%d] - %s: %d, %s: %d", scorer.currentSet-1, scorer.team1Name,
						prevPlayer1Game+1, scorer.team2Name, prevPlayer2Game));

			} else {
				setHistory.add(String.format("세트 [%d] - %s: %d, %s: %d", scorer.currentSet-1, scorer.team1Name,
						prevPlayer1Game, scorer.team2Name, prevPlayer2Game+1));
			}
			
			updateSetHistoryDisplay();

		}
		
		if(scorer.team1.getPointScore() == scorer.team2.getPointScore()) {
			if(tieBreak && scorer.team1.getPointScore() >= 6) {
				lblGameWinner.setText("듀스!");
			} else if(!tieBreak && scorer.team1.getPointScore() >= 3) {
				lblGameWinner.setText("듀스!");
			}
		}
		updateDisplay();
		
		if (finalOver) {
			announceWinner();
			showNewGameButton(); 
		}
	}

	private void showNewGameButton() {
		panelButtons.setVisible(true);
		btnPlayer1.setVisible(false);
		btnPlayer2.setVisible(false);
		btnNewGame.setVisible(true);
	}

	private void startNewGame() {
		scorer = null;
		setHistory.clear();
		txtSetHistory.setText("");

		tfPlayer1.setText("");
		tfPlayer2.setText("");
		tfPlayer3.setText("");
		tfPlayer4.setText("");

		lblSetScore.setText("");
		lblGameScore.setText("");
		lblPointScore.setForeground(Color.GREEN);
		lblPointScore.setText("테니스");

		panelMode.setVisible(true);
		panelGender.setVisible(true);
		btnStartGame.setEnabled(true);
		btnStartGame.setVisible(true);
		panelNameInput.setVisible(true);
		panelButtons.setVisible(false);
		btnNewGame.setVisible(false);
	}

	private String convertScore(Team myTeam, Team compareTeam) {
		
		int myPoint = myTeam.getPointScore();
		int comparePoint = compareTeam.getPointScore();
		boolean isTieBreak = scorer.tieBreak;
		
		String convertedString = "";


		if(isTieBreak) {
			convertedString = String.format("%d", myPoint);
		} else {
			switch(myPoint) {
			case 0:
				convertedString = "0";
				break;
			case 1:
				convertedString = "15";
				break;
			case 2:
				convertedString = "30";
				break;
			case 3:
				convertedString = "40";
				break;
			default:
				convertedString = "40";
				
				if(myPoint > comparePoint) {
					convertedString += "A";
				}
				break;
			}
		}
		
		return convertedString;
	}

	private void updateDisplay() {
		if (scorer != null) {
			lblSetScore.setText(String.format("세트 점수: %s [%d] - %s [%d]", scorer.team1Name, scorer.team1.getSetScore(),
					scorer.team2Name, scorer.team2.getSetScore()));
			lblGameScore.setText(
					String.format("게임 점수: [%d - %d]", scorer.team1.getGameScore(), scorer.team2.getGameScore()));

			lblPointScore.setText(String.format("%s - %s", convertScore(scorer.team1, scorer.team2), convertScore(scorer.team2, scorer.team1)));
		}
	}

	private void updateSetHistoryDisplay() {
		StringBuilder historyText = new StringBuilder();

		for (String history : setHistory) {
			historyText.append(history).append("\n");
		}

		txtSetHistory.setText(historyText.toString());
	}

	private void announceWinner() {
		String winner = (scorer.team1.getSetScore() == scorer.WIN_CONDITION) ? scorer.team1.getTeamName() : scorer.team2.getTeamName();

		JOptionPane.showMessageDialog(this, "경기 종료! " + winner + " 승리!", "게임 종료", JOptionPane.INFORMATION_MESSAGE);
		lblGameWinner.setText(" ");
		lblPointScore.setForeground(Color.RED);
		lblPointScore.setText(winner + " 승리!");
	}
}
