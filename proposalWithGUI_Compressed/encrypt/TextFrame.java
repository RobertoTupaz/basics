package encryptor;

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
	private JButton encryptButton, goBackButton, showAllButton, closeShowAllArea, deletButton;
	private JLabel inputLabel, encryptedLabel, instructionLabel;
	private JTextArea inputArea, encryptedArea, showAllArea;
	ImageIcon image = new ImageIcon("proposalLogo.png");
	
	public void run() {
		labels();
		textArea();
		buttons();
		panels();
		myFrame();
	}
	
	ActionListener listener = new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent event) {
			if(event.getSource() == encryptButton) {
				Encrypt encryptObject = new Encrypt();
				String text = inputArea.getText();
				encryptObject.insertText(text);
				encryptedArea.setText(encryptObject.getEncrypted());
				encryptObject.storeData();
			} else if (event.getSource() == goBackButton) {
				new Main();
				frame.dispose();
			} else if (event.getSource() == showAllButton) {
				panelE.setVisible(true);
				panelInPanelE.setVisible(true);
				showAllArea.setVisible(true);
				Encrypt encryptObject = new Encrypt();
				showAllArea.setText(encryptObject.getData());
			} else if(event.getSource() == closeShowAllArea) {
				panelE.setVisible(false);
				panelInPanelE.setVisible(false);
				showAllArea.setVisible(false);
			} else if(event.getSource() == deletButton) {
				Encrypt encryptObject = new Encrypt();
				encryptObject.deleteFile();
				inputArea.setText("File Deleted Sucessfully");
				encryptedArea.setText("File Deleted Sucessfully");
				panelE.setVisible(false);
				panelInPanelE.setVisible(false);
				showAllArea.setVisible(false);
			}
		}
	};

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
	
	public void buttons() {
		encryptButton = new JButton("Encrypt Text");
		encryptButton.setFocusable(false);
		encryptButton.addActionListener(listener);
		encryptButton.setFont(new Font("Lucida Calligraphy", Font.ITALIC, 30));
		encryptButton.setBackground(Color.LIGHT_GRAY);
		
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
		
		deletButton = new JButton("Delete");
		deletButton.setFocusable(false);
		deletButton.addActionListener(listener);
		deletButton.setFont(new Font("Lucida Calligraphy", Font.ITALIC, 30));
		deletButton.setBackground(Color.LIGHT_GRAY);
		
		closeShowAllArea = new JButton("x");
		closeShowAllArea.addActionListener(listener);
	}
	
	public void panels() {
		panel1 = new JPanel();
		panel1.setLayout(new BorderLayout(2, 2));
		panel1.add(inputLabel, BorderLayout.NORTH);
		panel1.add(inputArea, BorderLayout.SOUTH);
		
		panel2 = new JPanel();
		panel2.setLayout(new BorderLayout(2, 2));
		panel2.add(encryptedLabel, BorderLayout.NORTH);
		panel2.add(encryptedArea, BorderLayout.SOUTH);
		
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
		panelS.add(encryptButton);
		
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
	
	public void labels() {
		inputLabel = new JLabel("Input Text");
		
		encryptedLabel = new JLabel("Encrypted Text");
		
		instructionLabel = new JLabel("Input Text and Click Encrypt");
		instructionLabel.setFont(new Font("ALGERIAN", Font.BOLD, 50));
	}
	
	public void textArea() {
		inputArea = new JTextArea();
		inputArea.setPreferredSize(new Dimension(200, 200));
		
		encryptedArea = new JTextArea();
		encryptedArea.setPreferredSize(new Dimension(200, 200));
		
		showAllArea = new JTextArea();
		showAllArea.setPreferredSize(new Dimension(400, 400));
	}
	
	
}
