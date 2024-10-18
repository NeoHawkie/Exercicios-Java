import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClickerGame {
    private int score = 0; // Pontuação do jogador
    private JLabel scoreLabel; // Label para mostrar a pontuação

    public ClickerGame() {
        // Criar a janela do jogo
        JFrame frame = new JFrame("Jogo Clicker");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new FlowLayout());

        // Criar um botão
        JButton clickButton = new JButton("Clique aqui!");
        clickButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                score++; // Incrementa a pontuação
                scoreLabel.setText("Pontuação: " + score); // Atualiza a pontuação
            }
        });

        // Criar um label para mostrar a pontuação
        scoreLabel = new JLabel("Pontuação: " + score);
        scoreLabel.setFont(new Font("Arial", Font.BOLD, 24));

        // Adicionar os componentes à janela
        frame.add(scoreLabel);
        frame.add(clickButton);

        // Tornar a janela visível
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        // Executar o jogo
        SwingUtilities.invokeLater(() -> new ClickerGame());
    }
}
    