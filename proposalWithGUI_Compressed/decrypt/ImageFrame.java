package decryptor;

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

import main.Main;

public class ImageFrame {
	String str1 = "Decrypt SuccessFully", str2 = "Error";
	private JFrame frame;
	private JPanel panelC, panelN, panelS, panelE, panelW;
	private JButton decryptImageButton, goBackButton;
	private JLabel successLabel, failedLabel, titleLabel;
	ImageIcon image = new ImageIcon("proposalLogo.png");
	
	public void run() {
		labels();
		buttons();
		panels();
		myFrame();
	}
	
	ActionListener listener = new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent event) {
			if(event.getSource() == decryptImageButton) {
				successLabel.setVisible(false);
				JFileChooser chooseFile = new JFileChooser();
				int response = chooseFile.showOpenDialog(null);
				if(response == JFileChooser.APPROVE_OPTION) {
					File file = new File(chooseFile.getSelectedFile().getAbsolutePath());
					try {
						new DecryptImage(file);
						successLabel.setText(str1);
						successLabel.setVisible(true);
					} catch (IOException e) {
						successLabel.setText(str2);
						successLabel.setVisible(true);
					}	
				}
		
			} else if (event.getSource() == goBackButton) {
				new Main();
				frame.dispose();
			}
		}
	};

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
	
	public void labels() {
		successLabel = new JLabel();
		successLabel.setVisible(false);
		successLabel.setFont(new Font("ALGERIAN", Font.BOLD, 60));
		successLabel.setHorizontalAlignment(JLabel.CENTER);
		
		failedLabel = new JLabel("Error!");
		failedLabel.setVisible(false);
		failedLabel.setFont(new Font("ALGERIAN", Font.BOLD, 100));
		
		titleLabel = new JLabel("Cryptic Missive");
		titleLabel.setFont(new Font("ALGERIAN", Font.ITALIC, 80));
	}
	
	public void buttons() {
		decryptImageButton = new JButton("Select Image to Decrypt");
		decryptImageButton.setFocusable(false);
		decryptImageButton.addActionListener(listener);
		decryptImageButton.setBackground(Color.LIGHT_GRAY);
		decryptImageButton.setFont(new Font("ALGERIAN", Font.ITALIC, 30));
		
		goBackButton = new JButton("Go Back");
		goBackButton.setFocusable(false);
		goBackButton.addActionListener(listener);
		goBackButton.setBackground(Color.LIGHT_GRAY);
		goBackButton.setFont(new Font("ALGERIAN", Font.ITALIC, 30));
	}
	
	public void panels() {
		panelN = new JPanel();
		panelN.setPreferredSize(new Dimension(300, 100));
		panelN.setBackground(Color.gray);
		panelN.add(titleLabel);
		
		panelS = new JPanel();
		panelS.setPreferredSize(new Dimension(300, 100));
		panelS.setBackground(Color.gray);
		panelS.setLayout(new GridLayout(0, 2));
		panelS.add(goBackButton);
		panelS.add(decryptImageButton);
		
		panelE = new JPanel();
		panelE.setPreferredSize(new Dimension(100, 300));
		panelE.setBackground(Color.gray);
		
		panelW = new JPanel();
		panelW.setPreferredSize(new Dimension(100, 300));
		panelW.setBackground(Color.gray);
		
		panelC = new JPanel();
		panelC.setPreferredSize(new Dimension(300, 300));
		panelC.setBackground(Color.LIGHT_GRAY);
		panelC.setLayout(new GridLayout());
		panelC.add(successLabel);
		
	}
}
