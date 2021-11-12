package main;

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

import decryptor.DFrame;
import encryptor.EFrame;

public class HomeFrame {
		private JFrame frame;
		private JPanel panelC, panelN, panelS, panelE, panelW;
		private JButton encryptButton, decryptButton;
		private JLabel label;
		private ImageIcon image = new ImageIcon("proposalLogo.png");
		private ImageIcon image2 = new ImageIcon("proposalLogo2.png");
	
	//The Action Listener
	ActionListener listener = new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent event) {
			if(event.getSource() == encryptButton) {
				new EFrame();
				frame.dispose();
			} else if (event.getSource() == decryptButton) {
				new DFrame();
				frame.dispose();
			}
		}
	};
	
	//The Home Frame
	public void myFrame() {
		frame = new JFrame("ProjectProposal");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(1000, 700);
		frame.setLayout(new BorderLayout());
		frame.setIconImage(image.getImage());
		frame.add(panelN, BorderLayout.NORTH);
		frame.add(panelS, BorderLayout.SOUTH);
		frame.add(panelE, BorderLayout.EAST);
		frame.add(panelW, BorderLayout.WEST);
		frame.add(panelC, BorderLayout.CENTER);
		frame.setVisible(true);
	}
	
	//The Buttons
	public void buttons() {
		encryptButton = new JButton("Encrypt");
		encryptButton.setFocusable(false);
		encryptButton.addActionListener(listener);
		encryptButton.setBackground(Color.LIGHT_GRAY);
		encryptButton.setFont(new Font("Lucida Calligraphy", Font.PLAIN, 100));
		
		decryptButton = new JButton("Decrypt");
		decryptButton.setFocusable(false);
		decryptButton.addActionListener(listener);
		decryptButton.setBackground(Color.LIGHT_GRAY);
		decryptButton.setFont(new Font("Lucida Calligraphy", Font.PLAIN, 100));
	}
	
	//The Panels
	public void panels() {
		panelN = new JPanel();
		panelN.setPreferredSize(new Dimension(300, 100));
		panelN.setBackground(Color.gray);
		panelN.add(label);
		
		panelS = new JPanel();
		panelS.setPreferredSize(new Dimension(300, 100));
		panelS.setBackground(Color.gray);
		
		panelE = new JPanel();
		panelE.setPreferredSize(new Dimension(100, 300));
		panelE.setBackground(Color.gray);
		
		panelW = new JPanel();
		panelW.setPreferredSize(new Dimension(100, 300));
		panelW.setBackground(Color.gray);
		
		panelC = new JPanel();
		panelC.setPreferredSize(new Dimension(300, 300));
		panelC.setBackground(Color.LIGHT_GRAY);
		panelC.setLayout(new GridLayout(2, 0));
		panelC.add(encryptButton);
		panelC.add(decryptButton);
	}
	
	//The Labels
	public void labels() {
		label = new JLabel();
		label.setText("Crytic Missive");
		label.setFocusable(false);
		label.setIcon(image2);
		label.setFont(new Font("ALGERIAN", Font.ITALIC, 50));
	}
}
