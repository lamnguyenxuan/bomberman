package uet.oop.bomberman.gui;

import uet.oop.bomberman.Game;

import javax.swing.*;
import java.awt.*;


public class 	InfoPanel extends JPanel {
	
	private JLabel timeLabel;
	private JLabel pointsLabel;


	public InfoPanel(Game game) {
		setLayout(new GridLayout());
		timeLabel = new JLabel("Time: " + game.get_board().get_time());
		timeLabel.setForeground(Color.white);
		timeLabel.setHorizontalAlignment(JLabel.CENTER);

		pointsLabel = new JLabel("Points: " + game.get_board().get_point());
		pointsLabel.setForeground(Color.white);
		pointsLabel.setHorizontalAlignment(JLabel.CENTER);


		add(timeLabel);
		add(pointsLabel);


		setBackground(Color.black);
		setPreferredSize(new Dimension(0, 40));
	}
	
	public void setTime(int t) {

		timeLabel.setText("Time: " + t);
	}

	public void setPoints(int t) {
		pointsLabel.setText("Score: " + t);
	}

}
