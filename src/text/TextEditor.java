package text;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;

public class TextEditor {

	private JFrame frmRichText;
	private JTextField lblTxt;
	private Font boldFont;
	private Font italicFont;
	private JRadioButton rdbtnPlain;
	private JRadioButton rdbtnBoldItalic;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TextEditor window = new TextEditor();
					window.frmRichText.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TextEditor() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmRichText = new JFrame();
		frmRichText.setResizable(false);
		frmRichText.setTitle("Rich Text");
		frmRichText.setBounds(100, 100, 368, 120);
		frmRichText.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmRichText.getContentPane().setLayout(null);
		CenteredFrame(frmRichText);
		
		lblTxt = new JTextField();
		lblTxt.setText("Digite seu texto");
		lblTxt.setFont(new Font("Arial", Font.PLAIN, 14));
		lblTxt.setBounds(10, 11, 271, 23);
		frmRichText.getContentPane().add(lblTxt);
		lblTxt.setColumns(10);
		
		JRadioButton rdbtnItalic = new JRadioButton("Italic");
		rdbtnItalic.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblTxt.setFont(new Font("Arial",Font.ITALIC, 14));
			}
		});
		rdbtnItalic.setFont(new Font("Tahoma", Font.PLAIN, 11));
		rdbtnItalic.setBounds(10, 51, 59, 23);
		frmRichText.getContentPane().add(rdbtnItalic);
		
		JRadioButton rdbtnBold = new JRadioButton("Bold");
		rdbtnBold.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblTxt.setFont(new Font("Arial",Font.BOLD, 14));
			}
		});
		rdbtnBold.setBounds(71, 51, 51, 23);
		frmRichText.getContentPane().add(rdbtnBold);
		
		rdbtnPlain = new JRadioButton("Plain");
		rdbtnPlain.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblTxt.setFont(new Font("Arial",Font.PLAIN, 14));
			}
		});
		rdbtnPlain.setBounds(124, 51, 59, 23);
		frmRichText.getContentPane().add(rdbtnPlain);
		
		rdbtnBoldItalic = new JRadioButton("Bold Italic");
		rdbtnBoldItalic.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblTxt.setFont(new Font("Arial",Font.BOLD + Font.ITALIC, 14));
			}
		});
		rdbtnBoldItalic.setBounds(185, 51, 81, 23);
		frmRichText.getContentPane().add(rdbtnBoldItalic);
		
		ButtonGroup radioGroup = new ButtonGroup();
		radioGroup.add(rdbtnBold);
		radioGroup.add(rdbtnBoldItalic);
		radioGroup.add(rdbtnPlain);
		radioGroup.add(rdbtnItalic);
	}
	
	public void CenteredFrame(javax.swing.JFrame frmStandart) {
		Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
	    int x = (int) ((dimension.getWidth() - frmStandart.getWidth()) / 2);
	    int y = (int) ((dimension.getHeight() - frmStandart.getHeight()) / 2);
	    frmStandart.setLocation(x, y);
	}
}
