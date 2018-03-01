package bangla_font_writting;

import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.border.EmptyBorder;
import java.util.Vector;

public class CroationTextInGUI {

	private JComponent ui = null;
	private String text = "তথ্য দেখুন  নতুন ক্রেতা যোগ করুন  ";

	CroationTextInGUI() {
		initUI();
	}

	public void initUI() {
		if (ui != null)
			return;

		ui = new JPanel(new BorderLayout(4, 4));
		ui.setBorder(new EmptyBorder(4, 4, 4, 4));

		String[] fontFamilies = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
		Vector<String> croatFreindlyFonts = new Vector<String>();
		for (String name : fontFamilies) {
			Font font = new Font(name, Font.PLAIN, 20);
			if (font.canDisplayUpTo(text) < 0) {
				croatFreindlyFonts.add(name);
			}
		}
		final JList list = new JList(croatFreindlyFonts);
		list.setVisibleRowCount(20);
		list.getSelectionModel().setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		ui.add(new JScrollPane(list), BorderLayout.LINE_START);

		final JTextArea output = new JTextArea(text, 2, 12);
		output.setLineWrap(true);
		output.setWrapStyleWord(true);
		ui.add(new JScrollPane(output));

		ListSelectionListener showFontListener = new ListSelectionListener() {

			@Override
			public void valueChanged(ListSelectionEvent e) {
				System.out.println("="+list.getSelectedValue().toString()+"=");
				Font f = new Font(list.getSelectedValue().toString(), Font.PLAIN, 50);
				output.setFont(f);
			}
		};
		list.addListSelectionListener(showFontListener);
		list.setSelectedIndex(0);
	}

	public JComponent getUI() {
		return ui;
	}

	public static void main(String[] args) {
		Runnable r = new Runnable() {
			@Override
			public void run() {
				try {
					UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
				} catch (Exception useDefault) {
				}
				CroationTextInGUI o = new CroationTextInGUI();

				JFrame f = new JFrame("Croation Text in GUI");
				f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				f.setLocationByPlatform(true);

				f.setContentPane(o.getUI());
				f.pack();
				f.setMinimumSize(f.getSize());

				f.setVisible(true);
			}
		};
		SwingUtilities.invokeLater(r);
		
		
//		char[] bengaliDigits = {'০','১','২','৩','৪','৫','৬','৭','৮','৯'};
//	    for (char bengaliDigit : bengaliDigits) {
//	    	
//	        char digit = (char) (bengaliDigit - '০' + '0');
//	        System.out.println((int)digit+" "+(int) bengaliDigit);
//	    }
//	    System.out.println("\n\n\n\n");
//	    char[] bengaliDigits2 = {'0','1','2','3','4','5','6','7','8','9',};
//	    for (char bengaliDigit : bengaliDigits2) {
//	    	
//	        char digit = (char) (bengaliDigit + '০' - '0');
//	        System.out.println((int)digit+" "+(int) bengaliDigit);
//	    }
//	    
	    
	    System.out.println(convertBanglaNumberToEnglish("৬৭৯০"));
	    int x = Integer.parseInt(convertBanglaNumberToEnglish("০০০৭৯০"));
	    System.out.println(x);

	    
	    
	}
	
	
	public static String convertBanglaNumberToEnglish(String banglaNumber){
		int len = banglaNumber.length();
		char[] ch = banglaNumber.toCharArray();
		for(int i=0;i<len;i++){
			if('০'<=ch[i] && ch[i]<='৯'){
				ch[i] = (char) (ch[i]- '০' + '0');
			}else {
				return null;
			}
		}
		return String.valueOf(ch);
	}
	
	
	public static String convertEnglishNumberToBangla(String englishNumber){
		int len = englishNumber.length();
		char[] ch = englishNumber.toCharArray();
		for(int i=0;i<len;i++){
			if('0'<=ch[i] && ch[i]<='9'){
				ch[i] = (char) (ch[i]+ '০' - '0');
			}else {
				return null;
			}
		}
		return String.valueOf(ch);
	}
	
}