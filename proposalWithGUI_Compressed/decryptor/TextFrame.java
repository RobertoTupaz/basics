package decryptor;

import main.Main;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class TextFrame {
	private JFrame frame;
	private JPanel panel1, panel2, panelC, panelN, panelS, panelE, panelInPanelE;
	private JButton decryptButton, goBackButton, showAllButton, closeShowAllArea, deletButton;
	private JLabel inputLabel, decryptedLabel, instructionLabel;
	private JTextArea inputArea, decryptedArea, showAllArea;
	private ImageIcon image = new ImageIcon("proposalLogo.png");
	
	//The Text Decryption Constructor
	public void run() {
		labels();
		textArea();
		buttons();
		panels();
		myFrame();
	}
	
	//The Text Decryption Actions Listener
	ActionListener listener = new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent event) {
			if(event.getSource() == decryptButton) {
				Decrypt decryptObject = new Decrypt();
				decryptObject.insertText(inputArea.getText());
				decryptedArea.setText(decryptObject.getDecryptedText());
				decryptObject.storeData();
			} else if (event.getSource() == goBackButton) {
				new Main();
				frame.dispose();
			} else if (event.getSource() == showAllButton) {
				panelE.setVisible(true);
				panelInPanelE.setVisible(true);
				showAllArea.setVisible(true);
				Decrypt decryptObject = new Decrypt();
				showAllArea.setText(decryptObject.getData());
			} else if(event.getSource() == closeShowAllArea) {
				panelE.setVisible(false);
				panelInPanelE.setVisible(false);
				showAllArea.setVisible(false);
			} else if(event.getSource() == deletButton) {
				Decrypt decryptObject = new Decrypt();
				decryptObject.deleteFile();
				inputArea.setText("File Deleted Sucessfully");
				decryptedArea.setText("File Deleted Sucessfully");
				panelE.setVisible(false);
				panelInPanelE.setVisible(false);
				showAllArea.setVisible(false);
			}
		}
	};

	//The Text Decryption JFrame
	public void myFrame() {
		frame = new JFrame("ProjectProposal");
		frame.setIconImage(image.getImage());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(1000, 700);
		frame.setLayout(new BorderLayout(10, 10));
		frame.add(panelN, BorderLayout.NORTH);
		frame.add(panelS, BorderLayout.SOUTH);
		frame.add(panelC, BorderLayout.CENTER);
		frame.add(panelE, BorderLayout.EAST);
		frame.setVisible(true);
	}
	
	//The Text Decryption Buttons
	public void buttons() {
		decryptButton = new JButton("Decrypt Text");
		decryptButton.setFocusable(false);
		decryptButton.addActionListener(listener);
		decryptButton.setFont(new Font("Lucida Calligraphy", Font.ITALIC, 30));
		decryptButton.setBackground(Color.LIGHT_GRAY);
		
		goBackButton = new JButton("Go back");
		goBackButton.setFocusable(false);
		goBackButton.addActionListener(listener);
		goBackButton.setFont(new Font("Lucida Calligraphy", Font.ITALIC, 30));
		goBackButton.setBackground(Color.LIGHT_GRAY);
		
		showAllButton = new JButton("Show All Data");
		showAllButton.setFocusable(false);
		showAllButton.addActionListener(listener);
		showAllButton.setFont(new Font("Lucida Calligraphy", Font.ITALIC, 30));
		showAllButton.setBackground(Color.LIGHT_GRAY);
		
		deletButton = new JButton("Delete All Data");
		deletButton.setFocusable(false);
		deletButton.addActionListener(listener);
		deletButton.setFont(new Font("Lucida Calligraphy", Font.ITALIC, 30));
		deletButton.setBackground(Color.LIGHT_GRAY);
		
		closeShowAllArea = new JButton("x");
		closeShowAllArea.addActionListener(listener);
	}
	
	//The Text Decryption JPanels
	public void panels() {
		panel1 = new JPanel();
		panel1.setLayout(new BorderLayout(2, 2));
		panel1.add(inputLabel, BorderLayout.NORTH);
		panel1.add(inputArea, BorderLayout.SOUTH);
		
		panel2 = new JPanel();
		panel2.setLayout(new BorderLayout(2, 2));
		panel2.add(decryptedLabel, BorderLayout.NORTH);
		panel2.add(decryptedArea, BorderLayout.SOUTH);
		
		
		panelN = new JPanel();
		panelN.setPreferredSize(new Dimension(300, 100));
		panelN.setBackground(Color.gray);
		panelN.add(instructionLabel);
		
		panelS = new JPanel();
		panelS.setPreferredSize(new Dimension(300, 100));
		panelS.setBackground(Color.pink);
		panelS.setLayout(new GridLayout(2, 2));
		panelS.add(goBackButton);
		panelS.add(showAllButton);
		panelS.add(deletButton);
		panelS.add(decryptButton);
		
		panelC = new JPanel();
		panelC.setPreferredSize(new Dimension(300, 300));
		panelC.setBackground(Color.LIGHT_GRAY);
		panelC.setLayout(new GridLayout(2, 0));
		panelC.add(panel1);
		panelC.add(panel2);
		
		panelInPanelE = new JPanel();
		panelInPanelE.setPreferredSize(new Dimension(0, 20));
		panelInPanelE.setBackground(Color.lightGray);
		panelInPanelE.setLayout(new BorderLayout());
		panelInPanelE.add(closeShowAllArea, BorderLayout.EAST);
		
		panelE = new JPanel();
		panelE.setBackground(Color.LIGHT_GRAY);
		panelE.setVisible(false);
		panelE.setLayout(new BorderLayout());
		panelE.setPreferredSize(new Dimension(700, 300));
		panelE.add(panelInPanelE, BorderLayout.NORTH);
		panelE.add(showAllArea, BorderLayout.CENTER);
	}
	
	//The Text Decryption JLabels
	public void labels() {
		inputLabel = new JLabel("Input Text");
		
		decryptedLabel = new JLabel("Decrypted Text");
		
		instructionLabel = new JLabel("Input Text and Click Decrypt");
		instructionLabel.setFont(new Font("ALGERIAN", Font.BOLD, 50));
	}
	
	//The Text Decryption JTextArea
	public void textArea() {
		inputArea = new JTextArea();
		inputArea.setPreferredSize(new Dimension(200, 200));
		
		decryptedArea = new JTextArea();
		decryptedArea.setPreferredSize(new Dimension(200, 200));
		
		showAllArea = new JTextArea();
		showAllArea.setPreferredSize(new Dimension(400, 400));
	}
	
	
}
