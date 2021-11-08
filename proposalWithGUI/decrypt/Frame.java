package decryptor;

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
import javax.swing.JPanel;

public class Frame {
	private JFrame frame;
	private JPanel panelC, panelN, panelS, panelE, panelW;
	private JButton decryptImageButton, decryptTextButton;
	ImageIcon image = new ImageIcon("proposalLogo.png");
	
	ActionListener listener = new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent event) {
			if(event.getSource() == decryptImageButton) {
				ImageFrame imageFrame = new ImageFrame();
				imageFrame.run();
				frame.dispose();
			} else if (event.getSource() == decryptTextButton) {
				TextFrame txtFrame = new TextFrame();
				txtFrame.run();
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
	
	public void buttons() {
		decryptImageButton = new JButton("Decrypt Image");
		decryptImageButton.setFocusable(false);
		decryptImageButton.addActionListener(listener);
		decryptImageButton.setBackground(Color.LIGHT_GRAY);
		decryptImageButton.setFont(new Font("Castellar", Font.PLAIN, 50));
		
		decryptTextButton = new JButton("Decrypt Text");
		decryptTextButton.setFocusable(false);
		decryptTextButton.addActionListener(listener);
		decryptTextButton.setBackground(Color.LIGHT_GRAY);
		decryptTextButton.setFont(new Font("Castellar", Font.PLAIN, 50));
	}
	
	public void panels() {
		panelN = new JPanel();
		panelN.setPreferredSize(new Dimension(300, 100));
		panelN.setBackground(Color.gray);
		
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
		panelC.add(decryptImageButton);
		panelC.add(decryptTextButton);
	}
}
