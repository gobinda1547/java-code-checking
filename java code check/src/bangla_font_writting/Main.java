package bangla_font_writting;

import javax.swing.*;

import java.awt.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

class Main extends JFrame {

	private static final long serialVersionUID = 1L;
	private JLabel label1 = new JLabel("see,  description,  know", JLabel.CENTER);
	private JLabel label2 = new JLabel("গবিন্দা ", JLabel.CENTER);
	private JLabel label3 = new JLabel("I like Programming and I am a beginner");

	public Main() {
		super();
		setSize(300, 300);
		setTitle("JLabel Font Change");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);

		label1.setBounds(95, 00, 140, 40);
		label2.setBounds(95, 35, 140, 40);
		label3.setBounds(15, 200, 270, 40);

		try {
			Font displayFont = new Font("Times New Roman", Font.PLAIN, 12);
			label1.setFont(displayFont);

			Font displayFont1 = new Font("Kalpurush", Font.BOLD, 30);
			//font2 = Font.createFont(Font.TRUETYPE_FONT, new FileInputStream(new File(fontFileLocation)));// Font displayFont1 = new Font("font/kalpurush.ttf", Font.PLAIN,
			// 16);
			label2.setFont(displayFont1);

			JPanel panel = new JPanel();
			getContentPane().add(panel);
			panel.setLayout(null);
			panel.add(label1);
			panel.add(label2);
			panel.add(label3);
			System.out.println("all done");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String args[]) {
		Main myFont = new Main();
		myFont.setVisible(true);
	}
}