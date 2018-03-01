package bangla_font_writting;


import javax.swing.*;

import java.awt.*;

public class Main2 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JLabel label1 = new JLabel("see,  description,  know", JLabel.CENTER);
	private JLabel label2 = new JLabel(" †`Lv,  weeiY,  Rvbv", JLabel.CENTER);
	private JLabel label3 = new JLabel("I like Programming and I am a beginner");

	public Main2() {
		super();
		setSize(300, 300);
		setTitle("JLabel Font Change");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);

		label1.setBounds(95, 00, 140, 40);
		label2.setBounds(95, 35, 140, 40);
		label3.setBounds(15, 200, 270, 40);

		Font displayFont = new Font("Times New Roman", Font.PLAIN, 12);
		label1.setFont(displayFont);

		Font displayFont1 = new Font("SutonnyMJ", Font.PLAIN, 16);
		label2.setFont(displayFont1);

		JPanel panel = new JPanel();
		getContentPane().add(panel);
		panel.setLayout(null);
		panel.add(label1);
		panel.add(label2);
		panel.add(label3);
	}

	public static void main(String args[]) {
		Main myFont = new Main();
		myFont.setVisible(true);
	}
}