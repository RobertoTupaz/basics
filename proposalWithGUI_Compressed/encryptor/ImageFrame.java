package encryptor;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import main.Main;

public class ImageFrame {
	private String[] toDisplayText = {"Encrypt SuccessFully", "Error", "All Data Deleted Sucessfully"};
	private JTextField imageNameField;
	private JFrame frame;
	private JPanel panelC, panelN, panelS, panelE, panelW, panelInPanelC, panelInPanelS1, panelInPanelS2;
	private JButton encryptImageButton, goBackButton, proceedButton, deleteButton;
	private JLabel successLabel, failedLabel, titleLabel, inputNameLabel;
	private ImageIcon image = new ImageIcon("proposalLogo.png");
	
	//The Image Encryption Constructor
	public ImageFrame() {
		TextField();
		labels();
		buttons();
		panels();
		myFrame();
	}
	
	//The Image Encryption ActionListener
	ActionListener listener = new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent event) {
			if(event.getSource() == encryptImageButton) {
				panelInPanelC.setVisible(true);
				proceedButton.setVisible(true);
				inputNameLabel.setVisible(true);
				imageNameField.setVisible(true);
				successLabel.setVisible(false);
				
			} else if (event.getSource() == goBackButton) {
				new Main();
				frame.dispose();
				
			} else if(event.getSource() == proceedButton) {
				successLabel.setVisible(false);
				JFileChooser chooseFile = new JFileChooser();
				int response = chooseFile.showOpenDialog(null);
				if(response == JFileChooser.APPROVE_OPTION) {
					File file = new File(chooseFile.getSelectedFile().getAbsolutePath());
					
					try {
						new EncryptImage(file, imageNameField.getText());
						successLabel.setFont(new Font("ALGERIAN", Font.BOLD, 60));
						successLabel.setText(toDisplayText[0]);
						successLabel.setVisible(true);
					} catch (IOException e) {
						successLabel.setFont(new Font("ALGERIAN", Font.BOLD, 60));
						successLabel.setText(toDisplayText[1]);
						successLabel.setVisible(true);
					}
					
				}
				
				panelInPanelC.setVisible(false);
				proceedButton.setVisible(false);
				inputNameLabel.setVisible(false);
				imageNameField.setVisible(false);
				
			} else if(event.getSource() == deleteButton) {
				EncryptImage encryptImageObject = new EncryptImage();
				successLabel.setFont(new Font("ALGERIAN", Font.BOLD, 40));
				successLabel.setText(encryptImageObject.deleteFolder());
				successLabel.setVisible(true);
				
				panelInPanelC.setVisible(false);
				proceedButton.setVisible(false);
				inputNameLabel.setVisible(false);
				imageNameField.setVisible(false);
			}
		}
	};

	//The Image Encryption JFrame
	public void myFrame() {
		frame = new JFrame("ProjectProposal");
		frame.setIconImage(image.getImage());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(1000, 700);
		frame.setLayout(new BorderLayout());
		frame.add(panelN, BorderLayout.NORTH);
		frame.add(panelS, BorderLayout.SOUTH);
		frame.add(panelE, BorderLayout.EAST);
		frame.add(panelW, BorderLayout.WEST);
		frame.add(panelC, BorderLayout.CENTER);
		frame.setVisible(true);
	}
	
	//The Image Encryption JLabels
	public void labels() {
		successLabel = new JLabel();
		successLabel.setVisible(false);
		successLabel.setHorizontalAlignment(JLabel.CENTER);
		
		failedLabel = new JLabel("Error!");
		failedLabel.setVisible(false);
		failedLabel.setFont(new Font("ALGERIAN", Font.BOLD, 100));
		
		titleLabel = new JLabel("Cryptic Missive");
		titleLabel.setFont(new Font("ALGERIAN", Font.ITALIC, 80));
		
		inputNameLabel = new JLabel("Input Name : ");
		inputNameLabel.setFont(new Font("ALGERIAN", Font.PLAIN, 25));
	}
	
	//The Image Encryption JButtons
	public void buttons() {
		encryptImageButton = new JButton("Select Image to Encrypt");
		encryptImageButton.setFocusable(false);
		encryptImageButton.addActionListener(listener);
		encryptImageButton.setBackground(Color.LIGHT_GRAY);
		encryptImageButton.setFont(new Font("ALGERIAN", Font.ITALIC, 30));
		
		goBackButton = new JButton("Go Back");
		goBackButton.setFocusable(false);
		goBackButton.addActionListener(listener);
		goBackButton.setBackground(Color.LIGHT_GRAY);
		goBackButton.setFont(new Font("ALGERIAN", Font.ITALIC, 30));
		
		proceedButton = new JButton("Proceed");
		proceedButton.setFocusable(false);
		proceedButton.addActionListener(listener);
		proceedButton.setBackground(Color.LIGHT_GRAY);
		proceedButton.setFont(new Font("ALGERIAN", Font.ITALIC, 30));
		
		deleteButton = new JButton("Delete All Encrypted Image");
		deleteButton.setFocusable(false);
		deleteButton.addActionListener(listener);
		deleteButton.setBackground(Color.LIGHT_GRAY);
		deleteButton.setFont(new Font("ALGERIAN", Font.ITALIC, 30));
	}
	
	//The Image Encryption JPanels
	public void panels() {
		panelInPanelS1 = new JPanel();
		panelInPanelS1.setLayout(new GridLayout());
		panelInPanelS1.add(encryptImageButton);
		
		panelInPanelS2 = new JPanel();
		panelInPanelS2.setLayout(new GridLayout(0, 2));
		panelInPanelS2.add(goBackButton);
		panelInPanelS2.add(deleteButton);
		
		panelN = new JPanel();
		panelN.setPreferredSize(new Dimension(300, 100));
		panelN.setBackground(Color.gray);
		panelN.add(titleLabel);
		
		panelS = new JPanel();
		panelS.setPreferredSize(new Dimension(300, 100));
		panelS.setBackground(Color.gray);
		panelS.setLayout(new GridLayout(2, 0));
		panelS.add(panelInPanelS1);
		panelS.add(panelInPanelS2);
		
		panelE = new JPanel();
		panelE.setPreferredSize(new Dimension(100, 300));
		panelE.setBackground(Color.gray);
		
		panelW = new JPanel();
		panelW.setPreferredSize(new Dimension(100, 300));
		panelW.setBackground(Color.gray);
		
		panelInPanelC = new JPanel();
		panelInPanelC.setLayout(new BorderLayout());
		panelInPanelC.setBackground(Color.LIGHT_GRAY);
		panelInPanelC.setVisible(false);
		panelInPanelC.add(inputNameLabel, BorderLayout.WEST);
		panelInPanelC.add(imageNameField, BorderLayout.CENTER);
		panelInPanelC.add(proceedButton, BorderLayout.EAST);
		
		panelC = new JPanel();
		panelC.setPreferredSize(new Dimension(300, 300));
		panelC.setBackground(Color.LIGHT_GRAY);
		panelC.setLayout(new BorderLayout());
		panelC.add(panelInPanelC, BorderLayout.NORTH);
		panelC.add(successLabel);
	}
	
	//The Image Encryption JTextField
	public void TextField() {
		imageNameField = new JTextField();
		imageNameField.setFont(new Font("CALIBRI", Font.PLAIN, 25));
		
	}
}
