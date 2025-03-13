package tennis;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.List;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;

public class TennisGUI extends JFrame {

	private static final long serialVersionUID = 1L;
	
	private TennisScorer scorer;
    private JLabel lblPointScore, lblGameScore, lblSetScore, lblPlayer1, lblPlayer2;
    private JTextArea txtSetHistory;
    private JButton btnPlayer1, btnPlayer2, btnStartGame;
    private JTextField tfPlayer1, tfPlayer2;
    private JPanel panelButtons;
    private JPanel panelHistoryAndButtons, panelNameInput;
    private List<String> setHistory = new ArrayList<>();

    public TennisGUI() {
        setTitle("테니스 스코어보드");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        getContentPane().setBackground(new Color(20, 20, 20));

        Font koreanFont = new Font("맑은 고딕", Font.BOLD, 16);
        Font largeFont = new Font("맑은 고딕", Font.BOLD, 40);

        JPanel panelScore = new JPanel(new GridLayout(2, 1));
        panelScore.setBackground(new Color(30, 30, 30));

        lblSetScore = new JLabel("", SwingConstants.CENTER);
        lblSetScore.setFont(koreanFont);
        lblSetScore.setForeground(Color.WHITE);
        panelScore.add(lblSetScore);

        lblGameScore = new JLabel("", SwingConstants.CENTER);
        lblGameScore.setFont(koreanFont);
        lblGameScore.setForeground(Color.YELLOW);
        panelScore.add(lblGameScore);

        add(panelScore, BorderLayout.NORTH);

        lblPointScore = new JLabel("테니스", SwingConstants.CENTER);
        lblPointScore.setFont(largeFont);
        lblPointScore.setForeground(Color.GREEN);
        add(lblPointScore, BorderLayout.CENTER);

        panelHistoryAndButtons = new JPanel();
        panelHistoryAndButtons.setLayout(new BoxLayout(panelHistoryAndButtons, BoxLayout.Y_AXIS)); // 세로 배치
        panelHistoryAndButtons.setBackground(new Color(20, 20, 20));

        txtSetHistory = new JTextArea(5, 20);  // Show 5 lines of set history
        txtSetHistory.setEditable(false);
        txtSetHistory.setFont(koreanFont);
        txtSetHistory.setBackground(new Color(40, 40, 40));
        txtSetHistory.setForeground(Color.WHITE);
        JScrollPane scrollPane = new JScrollPane(txtSetHistory);
        panelHistoryAndButtons.add(scrollPane);

        panelNameInput = new JPanel(new GridLayout(2, 2, 10, 10));
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

        panelHistoryAndButtons.add(panelNameInput);

        btnStartGame = createStyledButton("게임 시작");

        
        JPanel startGamePanel = new JPanel(new BorderLayout());
        startGamePanel.setBackground(new Color(20, 20, 20));
        startGamePanel.add(btnStartGame, BorderLayout.CENTER); 
        panelHistoryAndButtons.add(startGamePanel);  

        panelButtons = new JPanel(new GridLayout(1, 2));
        panelButtons.setBackground(new Color(20, 20, 20));
        panelButtons.setVisible(false);  // 초기 상태에서 숨김

        btnPlayer1 = createStyledButton("Player 1 득점");
        btnPlayer2 = createStyledButton("Player 2 득점");

        panelButtons.add(btnPlayer1);
        panelButtons.add(btnPlayer2);

        panelHistoryAndButtons.add(panelButtons);

        add(panelHistoryAndButtons, BorderLayout.SOUTH); 

        btnStartGame.addActionListener(e -> startGame());

        btnPlayer1.addActionListener(e -> updateScore(1));
        btnPlayer2.addActionListener(e -> updateScore(2));

        updateDisplay();
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

        if (player1Name.isEmpty() || player2Name.isEmpty()) {
            JOptionPane.showMessageDialog(this, "두 명의 플레이어 이름을 모두 입력해주세요.", "경고", JOptionPane.WARNING_MESSAGE);
            return;
        }

        scorer = new TennisScorer(new Player(player1Name), new Player(player2Name));
        btnPlayer1.setText(player1Name+" 득점");
        btnPlayer2.setText(player2Name+" 득점");
        
        updateDisplay();  
        
        btnStartGame.setEnabled(false);  
        btnStartGame.setVisible(false);
        panelNameInput.setVisible(false);
        panelButtons.setVisible(true);  
    }

    private void updateScore(int player) {
        if (scorer == null || scorer.finalOver()) return;

        scorer.pointWinner(player);
        if (scorer.gameOver(scorer.tieBreak)) {
            scorer.resetPointScores();
        }
        if (scorer.setOver()) {
            setHistory.add(String.format("세트 [%d] - %s: %d, %s: %d",
                    scorer.currentSet - 1, scorer.player1Name, scorer.player1.getGameScore(), scorer.player2Name, scorer.player2.getGameScore()));
            scorer.resetGameScores();
            updateSetHistoryDisplay();
        }
        
        updateDisplay();
        
        if (scorer.finalOver()) {
            announceWinner();
        }

    }

    private String convertTennis1Score(int score) {
        if (scorer.tieBreak) return String.valueOf(score);
        else {
            switch (score) {
                case 0:
                    return "0";
                case 1:
                    return "15";
                case 2:
                    return "30";
                case 3:
                    return "40";
                default:
                    if (score > scorer.player2.getPointScore()) {
                        return "Adv";
                    } else {
                        return "40";
                    }
            }
        }
    }

    private String convertTennis2Score(int score) {
        if (scorer.tieBreak) return String.valueOf(score);
        else {
            switch (score) {
                case 0:
                    return "0";
                case 1:
                    return "15";
                case 2:
                    return "30";
                case 3:
                    return "40";
                default:
                    if (score > scorer.player1.getPointScore()) {
                        return "Adv";
                    } else {
                        return "40";
                    }
            }
        }
    }

    private void updateDisplay() {
        if (scorer != null) {
            lblSetScore.setText(String.format("세트 점수: %s [%d] - %s [%d]",
                    scorer.player1Name, scorer.player1.getSetScore(), scorer.player2Name, scorer.player2.getSetScore()));
            lblGameScore.setText(String.format("게임 점수: [%d - %d]",
                    scorer.player1.getGameScore(), scorer.player2.getGameScore()));

            lblPointScore.setText(String.format("%s - %s",
                    convertTennis1Score(scorer.player1.getPointScore()), convertTennis2Score(scorer.player2.getPointScore())));
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
        String winner = (scorer.player1.getSetScore() == 2) ? scorer.player1.getPlayerName() : scorer.player2.getPlayerName();
        
        JOptionPane.showMessageDialog(this, "경기 종료! " + winner + " 승리!", "게임 종료", JOptionPane.INFORMATION_MESSAGE);
        
        lblPointScore.setForeground(Color.RED);
        lblPointScore.setText(winner + " 승리!");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new TennisGUI().setVisible(true));
    }
}
