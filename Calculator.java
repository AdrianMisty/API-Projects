/* Name  : Adriana Alva
 * Class : CS 2336
 * Date Started : 06-16-2018
 * Date (Finally) Finished : 07-21-2018
 * */

package cal;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JSeparator;
import java.awt.SystemColor;
import javax.swing.JMenuItem;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import java.awt.Dimension;
import java.awt.Component;
import javax.swing.UIManager;

public class Calculator {

	private JFrame frame;
	private JTextField textField;
	private JTextField BinTxtField;
	private JTextField OctTxtField;
	private JTextField DecTxtField;
	private JTextField HexTxtField;
	// global variables
	double firstnum;
	double secondnum;
	double result;
	String operations;
	String answer;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
					// window.frame.setSize(390, 750);
					window.frame.setTitle("Calculator");
					window.frame.setVisible(true);
					// window.frame.setResizable(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(SystemColor.controlHighlight);
		frame.getContentPane().setForeground(Color.BLACK);
		frame.setBounds(200, 100, 506, 860);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		// Label
		JLabel ProgramerLabel = new JLabel("PROGRAMMER");
		ProgramerLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		ProgramerLabel.setBounds(46, 2, 126, 36);
		frame.getContentPane().add(ProgramerLabel);
		// user input
		textField = new JTextField();
		textField.setBorder(null);
		textField.setBackground(SystemColor.controlHighlight);
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setFont(new Font("Tahoma", Font.PLAIN, 23));
		textField.setBounds(9, 45, 456, 109);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		// Converters : HEX
		JButton lblHex = new JButton("HEX");
		lblHex.setBorder(null);
		lblHex.setBackground(SystemColor.controlHighlight);
		lblHex.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a = Integer.parseInt(textField.getText());
				HexTxtField.setText(Integer.toString(a, 16));

			}
		});
		lblHex.setHorizontalAlignment(SwingConstants.CENTER);
		lblHex.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblHex.setBounds(9, 162, 60, 33);
		frame.getContentPane().add(lblHex);
		// Output : HEX
		HexTxtField = new JTextField();
		HexTxtField.setBorder(null);
		HexTxtField.setBackground(SystemColor.controlHighlight);
		HexTxtField.setHorizontalAlignment(SwingConstants.LEFT);
		HexTxtField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		HexTxtField.setColumns(10);
		HexTxtField.setBounds(74, 163, 390, 33);
		frame.getContentPane().add(HexTxtField);
		// Converters : DEC
		JButton lblDec = new JButton("DEC");
		lblDec.setBorder(null);
		lblDec.setBackground(SystemColor.controlHighlight);
		lblDec.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a = Integer.parseInt(textField.getText());
				DecTxtField.setText(Integer.toString(a, 10));
			}

		});
		lblDec.setHorizontalAlignment(SwingConstants.CENTER);
		lblDec.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblDec.setBounds(9, 196, 60, 33);
		frame.getContentPane().add(lblDec);
		// Output : DEC
		DecTxtField = new JTextField();
		DecTxtField.setBorder(null);
		DecTxtField.setBackground(SystemColor.controlHighlight);
		DecTxtField.setHorizontalAlignment(SwingConstants.LEFT);
		DecTxtField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		DecTxtField.setColumns(10);
		DecTxtField.setBounds(74, 193, 390, 36);
		frame.getContentPane().add(DecTxtField);
		// Converters : OCT
		JButton lblOct = new JButton("OCT");
		lblOct.setBorder(null);
		lblOct.setBackground(SystemColor.controlHighlight);
		lblOct.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a = Integer.parseInt(textField.getText());
				OctTxtField.setText(Integer.toString(a, 8));
			}
		});
		lblOct.setHorizontalAlignment(SwingConstants.CENTER);
		lblOct.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblOct.setBounds(9, 230, 60, 33);
		frame.getContentPane().add(lblOct);
		// Output : OCT
		OctTxtField = new JTextField();
		OctTxtField.setBorder(null);
		OctTxtField.setBackground(SystemColor.controlHighlight);
		OctTxtField.setHorizontalAlignment(SwingConstants.LEFT);
		OctTxtField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		OctTxtField.setColumns(10);
		OctTxtField.setBounds(74, 228, 391, 34);
		frame.getContentPane().add(OctTxtField);
		// Converters : BIN
		JButton lblBin = new JButton("BIN");
		lblBin.setBorder(null);
		lblBin.setBackground(SystemColor.controlHighlight);
		lblBin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a = Integer.parseInt(textField.getText());
				BinTxtField.setText(Integer.toString(a, 2));
			}
		});
		lblBin.setHorizontalAlignment(SwingConstants.CENTER);
		lblBin.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblBin.setBounds(9, 264, 60, 33);
		frame.getContentPane().add(lblBin);
		// Output : BIN
		BinTxtField = new JTextField();
		BinTxtField.setBorder(null);
		BinTxtField.setBackground(SystemColor.controlHighlight);
		BinTxtField.setHorizontalAlignment(SwingConstants.LEFT);
		BinTxtField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		BinTxtField.setColumns(10);
		BinTxtField.setBounds(74, 263, 390, 32);
		frame.getContentPane().add(BinTxtField);

		JLabel FakeDotsLabel = new JLabel("");
		FakeDotsLabel.setHorizontalAlignment(SwingConstants.CENTER);
		FakeDotsLabel.setForeground(SystemColor.menu);
		FakeDotsLabel.setBorder(null);
		FakeDotsLabel.setBackground(SystemColor.menu);
		FakeDotsLabel.setIcon(new ImageIcon("C:\\Users\\Misty\\Desktop\\dots.png"));
		FakeDotsLabel.setBounds(9, 310, 69, 58);
		frame.getContentPane().add(FakeDotsLabel);

		JLabel FakeGreyDotsLabel = new JLabel("");
		FakeGreyDotsLabel.setBorder(null);
		FakeGreyDotsLabel.setBackground(SystemColor.menu);
		FakeGreyDotsLabel.setHorizontalAlignment(SwingConstants.CENTER);
		FakeGreyDotsLabel.setIcon(new ImageIcon("C:\\Users\\Misty\\Desktop\\Graydots.png"));
		FakeGreyDotsLabel.setBounds(85, 310, 69, 58);
		frame.getContentPane().add(FakeGreyDotsLabel);
		// FIRST ROW OF BUTTONS
		JButton Arrowbtn = new JButton("");
		Arrowbtn.setBorder(null);
		Arrowbtn.setBackground(SystemColor.control);
		Arrowbtn.setForeground(SystemColor.controlHighlight);
		Arrowbtn.setFont(new Font("Tahoma", Font.PLAIN, 8));
		Arrowbtn.setIcon(new ImageIcon(
				Calculator.class.getResource("/com/sun/javafx/scene/control/skin/caspian/images/capslock-icon.png")));
		Arrowbtn.setBounds(9, 438, 69, 58);
		frame.getContentPane().add(Arrowbtn);

		JButton Modbtn = new JButton("Mod");
		Modbtn.setBorder(null);
		Modbtn.setBackground(SystemColor.control);
		Modbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(textField.getText());
				// whatever # that is inputted is stored into firstnum
				textField.setText("");
				operations = "%";// String variable takes in
			}
		});
		Modbtn.setFont(new Font("Tahoma", Font.BOLD, 12));
		Modbtn.setBounds(85, 438, 69, 58);
		frame.getContentPane().add(Modbtn);

		JButton CEbtn = new JButton("CE");
		CEbtn.setBorder(null);
		CEbtn.setBackground(SystemColor.control);
		CEbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);				
				DecTxtField.setText(null);
				HexTxtField.setText(null);
				OctTxtField.setText(null);
				BinTxtField.setText(null);
			}
		});
		CEbtn.setFont(new Font("Tahoma", Font.BOLD, 12));
		CEbtn.setBounds(163, 438, 69, 58);
		frame.getContentPane().add(CEbtn);
		// Clear Button
		JButton Clearbtn = new JButton("C");
		Clearbtn.setBorder(null);
		Clearbtn.setBackground(SystemColor.control);
		Clearbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
				DecTxtField.setText(null);
				HexTxtField.setText(null);
				OctTxtField.setText(null);
				BinTxtField.setText(null);
			}
		});
		Clearbtn.setFont(new Font("Tahoma", Font.BOLD, 12));
		Clearbtn.setBounds(240, 438, 69, 58);
		frame.getContentPane().add(Clearbtn);
		// delete
		JButton Deletebtn = new JButton("\uF0E7");
		Deletebtn.setBorder(null);
		Deletebtn.setBackground(SystemColor.control);
		Deletebtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String backspace = null;

				if (textField.getText().length() > 0) {
					StringBuilder strBack = new StringBuilder(textField.getText());
					strBack.deleteCharAt(textField.getText().length() - 1);
					backspace = strBack.toString();
					textField.setText(backspace);
				}
				if (HexTxtField.getText().length() > 0) {
					StringBuilder strBack = new StringBuilder(HexTxtField.getText());
					strBack.deleteCharAt(HexTxtField.getText().length() - 1);
					backspace = strBack.toString();
					HexTxtField.setText(backspace);
				}
				if (DecTxtField.getText().length() > 0) {
					StringBuilder strBack = new StringBuilder(DecTxtField.getText());
					strBack.deleteCharAt(DecTxtField.getText().length() - 1);
					backspace = strBack.toString();
					DecTxtField.setText(backspace);
				}
				if (OctTxtField.getText().length() > 0) {
					StringBuilder strBack = new StringBuilder(OctTxtField.getText());
					strBack.deleteCharAt(OctTxtField.getText().length() - 1);
					backspace = strBack.toString();
					OctTxtField.setText(backspace);
				}
				if (BinTxtField.getText().length() > 0) {
					StringBuilder strBack = new StringBuilder(BinTxtField.getText());
					strBack.deleteCharAt(BinTxtField.getText().length() - 1);
					backspace = strBack.toString();
					BinTxtField.setText(backspace);
				}
				
			}
		});
		Deletebtn.setFont(new Font("Dialog", Font.PLAIN, 12));
		Deletebtn.setBounds(317, 438, 69, 58);
		frame.getContentPane().add(Deletebtn);
		// Divide
		JButton Dividebtn = new JButton("/");
		Dividebtn.setBorder(null);
		Dividebtn.setBackground(SystemColor.control);
		Dividebtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField.getText() == "A")
				{firstnum =10;}	
				else if(textField.getText() == "B")
				{firstnum =11;}	
				else if(textField.getText() == "C")
				{firstnum =12;}	
				else if(textField.getText() == "D")
				{firstnum =13;}	
				else if(textField.getText() == "E")
				{firstnum =14;}	
				else if(textField.getText() == "F")
				{firstnum =15;}	
				else
				firstnum = Double.parseDouble(textField.getText());
				// whatever # that is inputted is stored into firstnum
				textField.setText("");
				operations = "/";// String variable takes in
			}
		});
		Dividebtn.setFont(new Font("Tahoma", Font.BOLD, 16));
		Dividebtn.setBounds(394, 438, 69, 58);
		frame.getContentPane().add(Dividebtn);
		// SECOND ROWOF BUTTONS
		JButton Abtn = new JButton("A");
		Abtn.setBorder(null);
		Abtn.setBackground(SystemColor.inactiveCaptionBorder);
		Abtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNum = textField.getText() + Abtn.getText();
				textField.setText(EnterNum);
				int a =10;
				DecTxtField.setText(Integer.toString(a, 10));
				HexTxtField.setText(Integer.toString(a, 16));
				BinTxtField.setText(Integer.toString(a, 2));
				OctTxtField.setText(Integer.toString(a, 8));
			}
		});
		Abtn.setForeground(Color.GRAY);
		Abtn.setFont(new Font("Tahoma", Font.PLAIN, 18));
		Abtn.setBounds(9, 504, 69, 58);
		frame.getContentPane().add(Abtn);

		JButton Bbtn = new JButton("B");
		Bbtn.setBorder(null);
		Bbtn.setBackground(SystemColor.inactiveCaptionBorder);
		Bbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNum = textField.getText() + Bbtn.getText();
				textField.setText(EnterNum);
				int a = 11;
				DecTxtField.setText(Integer.toString(a, 10));
				HexTxtField.setText(Integer.toString(a, 16));
				BinTxtField.setText(Integer.toString(a, 2));
				OctTxtField.setText(Integer.toString(a, 8));
			}
		});
		Bbtn.setFont(new Font("Tahoma", Font.PLAIN, 18));
		Bbtn.setForeground(Color.GRAY);
		Bbtn.setBounds(85, 504, 69, 58);
		frame.getContentPane().add(Bbtn);

		JButton Seven7btn = new JButton("7");
		Seven7btn.setBorder(null);
		Seven7btn.setBackground(SystemColor.inactiveCaptionBorder);
		Seven7btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNum = textField.getText() + Seven7btn.getText();
				textField.setText(EnterNum);
				int a = 7;
				DecTxtField.setText(Integer.toString(a, 10));
				HexTxtField.setText(Integer.toString(a, 16));
				BinTxtField.setText(Integer.toString(a, 2));
				OctTxtField.setText(Integer.toString(a, 8));
			}
		});
		Seven7btn.setFont(new Font("Tahoma", Font.PLAIN, 18));
		Seven7btn.setBounds(163, 504, 69, 58);
		frame.getContentPane().add(Seven7btn);

		JButton Eight8btn = new JButton("8");
		Eight8btn.setBorder(null);
		Eight8btn.setBackground(SystemColor.inactiveCaptionBorder);
		Eight8btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNum = textField.getText() + Eight8btn.getText();
				textField.setText(EnterNum);
				int a = 8;
				DecTxtField.setText(Integer.toString(a, 10));
				HexTxtField.setText(Integer.toString(a, 16));
				BinTxtField.setText(Integer.toString(a, 2));
				OctTxtField.setText(Integer.toString(a, 8));
			}
		});
		Eight8btn.setFont(new Font("Tahoma", Font.PLAIN, 18));
		Eight8btn.setBounds(240, 504, 69, 58);
		frame.getContentPane().add(Eight8btn);

		JButton Nine9btn = new JButton("9");
		Nine9btn.setBorder(null);
		Nine9btn.setBackground(SystemColor.inactiveCaptionBorder);
		Nine9btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNum = textField.getText() + Nine9btn.getText();
				textField.setText(EnterNum);
				int a = 9;
				DecTxtField.setText(Integer.toString(a, 10));
				HexTxtField.setText(Integer.toString(a, 16));
				BinTxtField.setText(Integer.toString(a, 2));
				OctTxtField.setText(Integer.toString(a, 8));
			}
		});
		Nine9btn.setFont(new Font("Tahoma", Font.PLAIN, 18));
		Nine9btn.setBounds(317, 504, 69, 58);
		frame.getContentPane().add(Nine9btn);
		// Multiply
		JButton Multiplybtn = new JButton("x");
		Multiplybtn.setBorder(null);
		Multiplybtn.setBackground(SystemColor.control);
		Multiplybtn.setFont(new Font("Tahoma", Font.BOLD, 18));
		Multiplybtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField.getText() == "A")
				{firstnum =10;}	
				else if(textField.getText() == "B")
				{firstnum =11;}	
				else if(textField.getText() == "C")
				{firstnum =12;}	
				else if(textField.getText() == "D")
				{firstnum =13;}	
				else if(textField.getText() == "E")
				{firstnum =14;}	
				else if(textField.getText() == "F")
				{firstnum =15;}	
				else
				firstnum = Double.parseDouble(textField.getText());
				// whatever # that is inputted is stored into firstnum
				textField.setText("");
				operations = "*";// String variable takes in
			}
		});
		// THIRD ROW OF BUTTONS
		Multiplybtn.setBounds(394, 504, 69, 58);
		frame.getContentPane().add(Multiplybtn);

		JButton Cbtn = new JButton("C");
		Cbtn.setBorder(null);
		Cbtn.setBackground(SystemColor.inactiveCaptionBorder);
		Cbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNum = textField.getText() + Cbtn.getText();
				textField.setText(EnterNum);
				int a =12;
				DecTxtField.setText(Integer.toString(a, 10));
				HexTxtField.setText(Integer.toString(a, 16));
				BinTxtField.setText(Integer.toString(a, 2));
				OctTxtField.setText(Integer.toString(a, 8));
			}
		});
		Cbtn.setFont(new Font("Tahoma", Font.PLAIN, 18));
		Cbtn.setForeground(Color.GRAY);
		Cbtn.setBounds(9, 570, 69, 58);
		frame.getContentPane().add(Cbtn);

		JButton Dbtn = new JButton("D");
		Dbtn.setBorder(null);
		Dbtn.setBackground(SystemColor.inactiveCaptionBorder);
		Dbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String EnterNum = textField.getText() + Dbtn.getText();
				textField.setText(EnterNum);
				int a = 13;
				DecTxtField.setText(Integer.toString(a, 10));
				HexTxtField.setText(Integer.toString(a, 16));
				BinTxtField.setText(Integer.toString(a, 2));
				OctTxtField.setText(Integer.toString(a, 8));
			}
		});
		Dbtn.setFont(new Font("Tahoma", Font.PLAIN, 18));
		Dbtn.setForeground(Color.GRAY);
		Dbtn.setBounds(86, 571, 69, 58);
		frame.getContentPane().add(Dbtn);

		JButton Four4btn = new JButton("4");
		Four4btn.setBorder(null);
		Four4btn.setBackground(SystemColor.inactiveCaptionBorder);
		Four4btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNum = textField.getText() + Four4btn.getText();
				textField.setText(EnterNum);
				int a = 4;
				DecTxtField.setText(Integer.toString(a, 10));
				HexTxtField.setText(Integer.toString(a, 16));
				BinTxtField.setText(Integer.toString(a, 2));
				OctTxtField.setText(Integer.toString(a, 8));
			}
		});
		Four4btn.setFont(new Font("Tahoma", Font.PLAIN, 18));
		Four4btn.setBounds(163, 570, 69, 58);
		frame.getContentPane().add(Four4btn);

		JButton Five5btn = new JButton("5");
		Five5btn.setBorder(null);
		Five5btn.setBackground(SystemColor.inactiveCaptionBorder);
		Five5btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNum = textField.getText() + Five5btn.getText();
				textField.setText(EnterNum);
				int a = 5;
				DecTxtField.setText(Integer.toString(a, 10));
				HexTxtField.setText(Integer.toString(a, 16));
				BinTxtField.setText(Integer.toString(a, 2));
				OctTxtField.setText(Integer.toString(a, 8));
			}
		});
		Five5btn.setFont(new Font("Tahoma", Font.PLAIN, 18));
		Five5btn.setBounds(240, 570, 69, 58);
		frame.getContentPane().add(Five5btn);

		JButton Six6btn = new JButton("6");
		Six6btn.setBorder(null);
		Six6btn.setBackground(SystemColor.inactiveCaptionBorder);
		Six6btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNum = textField.getText() + Six6btn.getText();
				textField.setText(EnterNum);
				int a = 6;
				DecTxtField.setText(Integer.toString(a, 10));
				HexTxtField.setText(Integer.toString(a, 16));
				BinTxtField.setText(Integer.toString(a, 2));
				OctTxtField.setText(Integer.toString(a, 8));
			}
		});
		Six6btn.setFont(new Font("Tahoma", Font.PLAIN, 18));
		Six6btn.setBounds(317, 570, 69, 58);
		frame.getContentPane().add(Six6btn);
		// subtract
		JButton Subtractbtn = new JButton("-");
		Subtractbtn.setBorder(null);
		Subtractbtn.setBackground(SystemColor.control);
		Subtractbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField.getText() == "A")
				{firstnum =10;}	
				else if(textField.getText() == "B")
				{firstnum =11;}	
				else if(textField.getText() == "C")
				{firstnum =12;}	
				else if(textField.getText() == "D")
				{firstnum =13;}	
				else if(textField.getText() == "E")
				{firstnum =14;}	
				else if(textField.getText() == "F")
				{firstnum =15;}	
				else
				firstnum = Double.parseDouble(textField.getText());
				// whatever # that is inputted is stored into firstnum
				textField.setText("");
				operations = "-";// String variable takes in
			}
		});
		Subtractbtn.setFont(new Font("Tahoma", Font.BOLD, 24));
		Subtractbtn.setBounds(394, 570, 69, 58);
		frame.getContentPane().add(Subtractbtn);
		// FOURTH ROW OF BUTTONS
		JButton Ebtn = new JButton("E");
		Ebtn.setBorder(null);
		Ebtn.setBackground(SystemColor.inactiveCaptionBorder);
		Ebtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNum = textField.getText() + Ebtn.getText();
				textField.setText(EnterNum);
				int a = 14;
				DecTxtField.setText(Integer.toString(a, 10));
				HexTxtField.setText(Integer.toString(a, 16));
				BinTxtField.setText(Integer.toString(a, 2));
				OctTxtField.setText(Integer.toString(a, 8));
			}
		});
		Ebtn.setForeground(Color.GRAY);
		Ebtn.setFont(new Font("Tahoma", Font.PLAIN, 18));
		Ebtn.setBounds(9, 636, 69, 58);
		frame.getContentPane().add(Ebtn);

		JButton Fbtn = new JButton("F");
		Fbtn.setBorder(null);
		Fbtn.setBackground(SystemColor.inactiveCaptionBorder);
		Fbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNum = textField.getText() + Fbtn.getText();
				textField.setText(EnterNum);
				int a = 15;
				DecTxtField.setText(Integer.toString(a, 10));
				HexTxtField.setText(Integer.toString(a, 16));
				BinTxtField.setText(Integer.toString(a, 2));
				OctTxtField.setText(Integer.toString(a, 8));
			}
		});
		Fbtn.setForeground(Color.GRAY);
		Fbtn.setFont(new Font("Tahoma", Font.PLAIN, 18));
		Fbtn.setBounds(86, 636, 69, 58);
		frame.getContentPane().add(Fbtn);

		JButton One1btn = new JButton("1");
		One1btn.setBorder(null);
		One1btn.setBackground(SystemColor.inactiveCaptionBorder);
		One1btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNum = textField.getText() + One1btn.getText();
				textField.setText(EnterNum);
				int a =1;
				DecTxtField.setText(Integer.toString(a, 10));
				HexTxtField.setText(Integer.toString(a, 16));
				BinTxtField.setText(Integer.toString(a, 2));
				OctTxtField.setText(Integer.toString(a, 8));
			}
		});
		One1btn.setFont(new Font("Tahoma", Font.PLAIN, 18));
		One1btn.setBounds(163, 636, 69, 58);
		frame.getContentPane().add(One1btn);

		JButton Two2btn = new JButton("2");
		Two2btn.setBorder(null);
		Two2btn.setBackground(SystemColor.inactiveCaptionBorder);
		Two2btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNum = textField.getText() + Two2btn.getText();
				textField.setText(EnterNum);
				int a = 2;
				DecTxtField.setText(Integer.toString(a, 10));
				HexTxtField.setText(Integer.toString(a, 16));
				BinTxtField.setText(Integer.toString(a, 2));
				OctTxtField.setText(Integer.toString(a, 8));
			}
		});
		Two2btn.setFont(new Font("Tahoma", Font.PLAIN, 18));
		Two2btn.setBounds(240, 636, 69, 58);
		frame.getContentPane().add(Two2btn);

		JButton Three3btn = new JButton("3");
		Three3btn.setBorder(null);
		Three3btn.setBackground(SystemColor.inactiveCaptionBorder);
		Three3btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNum = textField.getText() + Three3btn.getText();
				textField.setText(EnterNum);
				int a = 3;
				DecTxtField.setText(Integer.toString(a, 10));
				HexTxtField.setText(Integer.toString(a, 16));
				BinTxtField.setText(Integer.toString(a, 2));
				OctTxtField.setText(Integer.toString(a, 8));

			}
		});
		Three3btn.setFont(new Font("Tahoma", Font.PLAIN, 18));
		Three3btn.setBounds(317, 636, 69, 58);
		frame.getContentPane().add(Three3btn);
		// add
		JButton Addbtn = new JButton("+");
		Addbtn.setBorder(null);
		Addbtn.setBackground(SystemColor.control);
		Addbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField.getText() == "A")
				{
					firstnum =10;
					textField.setText(" ");
					HexTxtField.setText(" ");
					DecTxtField.setText(" ");
					OctTxtField.setText(" ");
					BinTxtField.setText(" ");
					operations = "+";	
				}	
				else if(textField.getText() == "B")
				{
					firstnum =11;
					textField.setText(" ");
					HexTxtField.setText(" ");
					DecTxtField.setText(" ");
					OctTxtField.setText(" ");
					BinTxtField.setText(" ");
					operations = "+";	
				}	
				else if(textField.getText() == "C")
				{
					firstnum =12;
					textField.setText(" ");
					HexTxtField.setText(" ");
					DecTxtField.setText(" ");
					OctTxtField.setText(" ");
					BinTxtField.setText(" ");
					operations = "+";	
				}	
				else if(textField.getText() == "D")
				{
					firstnum =13;
					textField.setText(" ");
					HexTxtField.setText(" ");
					DecTxtField.setText(" ");
					OctTxtField.setText(" ");
					BinTxtField.setText(" ");
					operations = "+";
				}	
				else if(textField.getText() == "E")
				{
					firstnum =14;
					textField.setText(" ");
					HexTxtField.setText(" ");
					DecTxtField.setText(" ");
					OctTxtField.setText(" ");
					BinTxtField.setText(" ");
					operations = "+";
				}	
				else if(textField.getText() == "F")
				{
					firstnum =15;
					textField.setText(" ");
					HexTxtField.setText(" ");
					DecTxtField.setText(" ");
					OctTxtField.setText(" ");
					BinTxtField.setText(" ");
					operations = "+";
				}	
				else {
				firstnum = Double.parseDouble(textField.getText());
				// whatever # that is inputted is stored into firstnum
				textField.setText(" ");
				HexTxtField.setText(" ");
				DecTxtField.setText(" ");
				OctTxtField.setText(" ");
				BinTxtField.setText(" ");
				operations = "+";// String variable takes in
				}
			}
		});
		Addbtn.setFont(new Font("Tahoma", Font.BOLD, 19));
		Addbtn.setBounds(394, 636, 69, 58);
		frame.getContentPane().add(Addbtn);
		// FIFTH ROW OF BUTTONS
		JButton LParthbtn = new JButton("(");
		LParthbtn.setBorder(null);
		LParthbtn.setBackground(SystemColor.control);
		LParthbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNum = textField.getText() + LParthbtn.getText();
				textField.setText(EnterNum);
			}
		});
		LParthbtn.setFont(new Font("Tahoma", Font.BOLD, 18));
		LParthbtn.setBounds(9, 702, 69, 58);
		frame.getContentPane().add(LParthbtn);

		JButton RParthbtn = new JButton(")");
		RParthbtn.setBorder(null);
		RParthbtn.setBackground(SystemColor.control);
		RParthbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNum = textField.getText() + RParthbtn.getText();
				textField.setText(EnterNum);
			}
		});
		RParthbtn.setFont(new Font("Tahoma", Font.BOLD, 18));
		RParthbtn.setBounds(86, 702, 69, 58);
		frame.getContentPane().add(RParthbtn);

		JButton PlusMinusBtn = new JButton("+/-");
		PlusMinusBtn.setBorder(null);
		PlusMinusBtn.setBackground(SystemColor.control);
		PlusMinusBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ahh = Double.parseDouble(String.valueOf(textField.getText()));
				ahh = ahh * (-1);
				textField.setText(String.valueOf(ahh));
			}
		});
		PlusMinusBtn.setFont(new Font("Tahoma", Font.BOLD, 16));
		PlusMinusBtn.setBounds(163, 703, 69, 58);
		frame.getContentPane().add(PlusMinusBtn);

		JButton Zero0btn = new JButton("0");
		Zero0btn.setBorder(null);
		Zero0btn.setBackground(SystemColor.inactiveCaptionBorder);
		Zero0btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNum = textField.getText() + Zero0btn.getText();
				textField.setText(EnterNum);
				int a = 0;
				DecTxtField.setText(Integer.toString(a, 10));
				HexTxtField.setText(Integer.toString(a, 16));
				BinTxtField.setText(Integer.toString(a, 2));
				OctTxtField.setText(Integer.toString(a, 8));
			}
		});
		Zero0btn.setFont(new Font("Tahoma", Font.PLAIN, 18));
		Zero0btn.setBounds(240, 703, 69, 58);
		frame.getContentPane().add(Zero0btn);
		// period
		JButton Periodbtn = new JButton(".");
		Periodbtn.setBorder(null);
		Periodbtn.setBackground(SystemColor.control);
		Periodbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNum = textField.getText() + Periodbtn.getText();
				textField.setText(EnterNum);
			}
		});
		Periodbtn.setFont(new Font("Tahoma", Font.BOLD, 19));
		Periodbtn.setBounds(317, 703, 69, 58);
		frame.getContentPane().add(Periodbtn);
		// equals
		JButton Equalbtn = new JButton("=");
		Equalbtn.setBorder(null);
		Equalbtn.setBackground(SystemColor.control);
		Equalbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// equals button
				// set dec/hex/oct/bin text fields to null so it can convert the result of the
				// operation the user picks
				DecTxtField.setText(null);
				HexTxtField.setText(null);
				BinTxtField.setText(null);
				OctTxtField.setText(null);
				String answer ;
				secondnum = Double.parseDouble(textField.getText());
				if (operations == "+") {
					result = firstnum + secondnum;
					answer = String.format("%.0f", result);
					textField.setText(answer);
				} else if (operations == "-") {
					result = firstnum - secondnum;
					answer = String.format("%.0f", result);
					textField.setText(answer);

				} else if (operations == "*") {
					result = firstnum * secondnum;
					answer = String.format("%.0f", result);
					textField.setText(answer);
				} else if (operations == "/") {
					result = firstnum / secondnum;
					answer = String.format("%.0f", result);
					textField.setText(answer);
				} else if (operations == "%") {
					result = firstnum % secondnum;
					answer = String.format("%.0f", result);
					textField.setText(answer);

				}
				// After result is set onto textField, have dec/hex/oct/bin display converted
				// result only is displays if it's not a fraction
				// if fraction it doesn't display anything
				int a = (int)Integer.parseInt(textField.getText());
				if (a > 1) {

					DecTxtField.setText(Integer.toString(a, 10));
					HexTxtField.setText(Integer.toString(a, 16));
					BinTxtField.setText(Integer.toString(a, 2));
					OctTxtField.setText(Integer.toString(a, 8));
				} else if (a < 1) {
					DecTxtField.setText("0");
					HexTxtField.setText("0");
					BinTxtField.setText("0");
					OctTxtField.setText("0");
				}

			}
		});
		Equalbtn.setFont(new Font("Tahoma", Font.BOLD, 18));
		Equalbtn.setBounds(394, 703, 69, 58);
		frame.getContentPane().add(Equalbtn);
        //the following buttons aren't meant to work
		JButton Wordbtn = new JButton("QWORD");
		Wordbtn.setBorder(null);
		Wordbtn.setBackground(SystemColor.menu);
		Wordbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

			}
		});
		Wordbtn.setForeground(SystemColor.infoText);
		Wordbtn.setFont(new Font("Tahoma", Font.PLAIN, 18));
		Wordbtn.setBounds(163, 310, 145, 58);
		frame.getContentPane().add(Wordbtn);

		JButton LSHbut = new JButton("LSH");
		LSHbut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		LSHbut.setForeground(Color.BLACK);
		LSHbut.setFont(new Font("Tahoma", Font.BOLD, 12));
		LSHbut.setBorder(null);
		LSHbut.setBackground(SystemColor.control);
		LSHbut.setBounds(9, 372, 69, 58);
		frame.getContentPane().add(LSHbut);

		JButton RSHbut = new JButton("RSH");
		RSHbut.setForeground(Color.BLACK);
		RSHbut.setFont(new Font("Tahoma", Font.BOLD, 12));
		RSHbut.setBorder(null);
		RSHbut.setBackground(SystemColor.control);
		RSHbut.setBounds(85, 372, 69, 58);
		frame.getContentPane().add(RSHbut);

		JButton btnOr = new JButton("OR");
		btnOr.setForeground(Color.BLACK);
		btnOr.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnOr.setBorder(null);
		btnOr.setBackground(SystemColor.control);
		btnOr.setBounds(163, 372, 69, 58);
		frame.getContentPane().add(btnOr);

		JButton btnXor = new JButton("XOR");
		btnXor.setForeground(Color.BLACK);
		btnXor.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnXor.setBorder(null);
		btnXor.setBackground(SystemColor.control);
		btnXor.setBounds(240, 372, 69, 58);
		frame.getContentPane().add(btnXor);

		JButton btnNot = new JButton("NOT");
		btnNot.setForeground(Color.BLACK);
		btnNot.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNot.setBorder(null);
		btnNot.setBackground(SystemColor.control);
		btnNot.setBounds(317, 372, 69, 58);
		frame.getContentPane().add(btnNot);

		JButton btnAnd = new JButton("AND");
		btnAnd.setForeground(Color.BLACK);
		btnAnd.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnAnd.setBorder(null);
		btnAnd.setBackground(SystemColor.control);
		btnAnd.setBounds(394, 372, 69, 58);
		frame.getContentPane().add(btnAnd);

		JButton MSbut = new JButton("MS");
		MSbut.setForeground(Color.BLACK);
		MSbut.setFont(new Font("Tahoma", Font.BOLD, 12));
		MSbut.setBorder(null);
		MSbut.setBackground(SystemColor.menu);
		MSbut.setBounds(317, 310, 69, 58);
		frame.getContentPane().add(MSbut);

		JButton btnM = new JButton("M-");
		btnM.setForeground(Color.BLACK);
		btnM.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnM.setBorder(null);
		btnM.setBackground(SystemColor.menu);
		btnM.setBounds(394, 310, 69, 58);
		frame.getContentPane().add(btnM);
        //Give it the windows 10 feel of having options
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBorderPainted(false);
		menuBar.setBackground(SystemColor.controlHighlight);
		menuBar.setBounds(11, 10, 29, 26);
		frame.getContentPane().add(menuBar);

		JMenu mnFile = new JMenu("");
		mnFile.setHorizontalTextPosition(SwingConstants.CENTER);
		mnFile.setHorizontalAlignment(SwingConstants.CENTER);
		mnFile.setBackground(SystemColor.controlHighlight);
		mnFile.setBorder(null);
		mnFile.setIcon(new ImageIcon(
				Calculator.class.getResource("/com/sun/javafx/scene/web/skin/AlignJustified_16x16_JFX.png")));
		mnFile.setFont(new Font("Segoe UI", Font.BOLD, 7));
		menuBar.add(mnFile);

		JMenuItem mntmNewMenuItem = new JMenuItem("Standard");
		mntmNewMenuItem.setHorizontalTextPosition(SwingConstants.CENTER);
		mntmNewMenuItem.setHorizontalAlignment(SwingConstants.CENTER);
		mntmNewMenuItem.setAlignmentX(Component.LEFT_ALIGNMENT);
		mntmNewMenuItem.setMaximumSize(new Dimension(300, 300));
		mntmNewMenuItem.setPreferredSize(new Dimension(80, 30));
		mntmNewMenuItem.setFont(new Font("Segoe UI", Font.BOLD, 9));
		mnFile.add(mntmNewMenuItem);

		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Scientific");
		mntmNewMenuItem_1.setIconTextGap(1);
		mntmNewMenuItem_1.setHorizontalTextPosition(SwingConstants.CENTER);
		mntmNewMenuItem_1.setHorizontalAlignment(SwingConstants.CENTER);
		mntmNewMenuItem_1.setPreferredSize(new Dimension(60, 30));
		mntmNewMenuItem_1.setMaximumSize(new Dimension(32700, 32700));
		mntmNewMenuItem_1.setFont(new Font("Segoe UI", Font.BOLD, 9));
		mnFile.add(mntmNewMenuItem_1);
	}
}
