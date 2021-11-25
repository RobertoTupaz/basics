package q_and_a;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JavaSwing{
	
	JFrame frame;
	
	public JavaSwing() {
		frame2();
		frame();
	}
	
	
	ActionListener actionListener = new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent event) {
			if(event.getSource() == playButton) {
				Q25Frame();
				panelFrame.setVisible(false);
				frame.add(frameQ25);
				frame.setVisible(true);
			} else if(event.getSource() == resetButton) {
				resetGame();
				frame.setVisible(false);
				frame2();
				frame();
				frame.setVisible(true);
			}
		}	
	};

	
	public void frame() {
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new BorderLayout());
		frame.setSize(1200, 700);
		
		frame.add(panelFrame);
		
		frame.setVisible(true);
	}

	
	
	
	public void addScore2() {
		this.score += 1;
		System.out.println(this.score);
	}
	
	public void resetScore() {
		score = 0;
	}
	
	public void resetGame() {
		list.deleteAllData();
		round = 0;
	}
	
	
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	
	
	JButton playButton, resetButton;
	JTextField nameField;
	JLabel titleLabel, inputNameLabel, playerStandingLabel;
	JLabel place1, place2, place3, place4, place5, place6, place7, place8, place9, place10;
	JPanel panelFrame, panelN, panelS, panelE, panelW, panelC, panelInsideWest, panelInsidePanelC;
	int score = 0, round = 0;
	String name;
	ListClass list = new ListClass();
	
	int[] arr1 = new int[100];
	String[] arr2 = new String[100];
	
	public void frame2() {
		buttons2();
		JTextField2();
		labels2();
		panels2();
		panelFrame2();
	}
	
	public void storeData() {
		list.storeLast(name, score);
		list.sortData();
		if(round == 1) {
			place1.setText(list.getData(round));
		} else if(round == 2) {
			place1.setText(list.getData(1));
			place2.setText(list.getData(2));
		} else if(round == 3) {
			place1.setText(list.getData(1));
			place2.setText(list.getData(2));
			place3.setText(list.getData(3));
		} else if(round == 4) {
			place1.setText(list.getData(1));
			place2.setText(list.getData(2));
			place3.setText(list.getData(3));
			place4.setText(list.getData(4));
		} else if(round == 5) {
			place1.setText(list.getData(1));
			place2.setText(list.getData(2));
			place3.setText(list.getData(3));
			place4.setText(list.getData(4));
			place5.setText(list.getData(5));
		}
	}
	
	
	public void panelFrame2() {
		panelFrame = new JPanel();
		panelFrame.setSize(1200, 700);
		panelFrame.setLayout(new BorderLayout(10, 10));
		
		panelFrame.add(panelN, BorderLayout.NORTH);
		panelFrame.add(panelS, BorderLayout.SOUTH);
		panelFrame.add(panelE, BorderLayout.EAST);
		panelFrame.add(panelW, BorderLayout.WEST);
		panelFrame.add(panelC, BorderLayout.CENTER);
		
		panelFrame.setVisible(true);
	}
	
	public void panels2() {
		panelN = new JPanel();
		panelN.setBackground(Color.LIGHT_GRAY);
		panelN.add(titleLabel);
		
		panelS = new JPanel();
		panelS.setBackground(Color.LIGHT_GRAY);
		
		panelE = new JPanel();
		panelE.setBackground(Color.LIGHT_GRAY);
		
		panelInsideWest = new JPanel();
		panelInsideWest.setBackground(Color.gray);
		panelInsideWest.setPreferredSize(new Dimension(200, 120));
		panelInsideWest.setLayout(new BorderLayout());
		panelInsideWest.add(inputNameLabel, BorderLayout.NORTH);
		panelInsideWest.add(nameField, BorderLayout.CENTER);
		panelInsideWest.add(playButton, BorderLayout.SOUTH);
		
		panelW = new JPanel();
		panelW.setBackground(Color.LIGHT_GRAY);
		panelW.setLayout(new BorderLayout());
		panelW.add(panelInsideWest, BorderLayout.NORTH);
		panelW.add(resetButton, BorderLayout.SOUTH);
		
		panelInsidePanelC = new JPanel();
		panelInsidePanelC.setBackground(Color.LIGHT_GRAY);
		panelInsidePanelC.setLayout(new GridLayout(10, 0));
		panelInsidePanelC.add(place1);
		panelInsidePanelC.add(place2);
		panelInsidePanelC.add(place3);
		panelInsidePanelC.add(place4);
		panelInsidePanelC.add(place5);
		panelInsidePanelC.add(place6);
		panelInsidePanelC.add(place7);
		panelInsidePanelC.add(place8);
		panelInsidePanelC.add(place9);
		panelInsidePanelC.add(place10);
		
		panelC = new JPanel();
		panelC.setBackground(Color.LIGHT_GRAY);
		panelC.setLayout(new BorderLayout());
		panelC.add(playerStandingLabel, BorderLayout.NORTH);
		panelC.add(panelInsidePanelC, BorderLayout.CENTER);
	}
	
	public void labels2() {
		titleLabel = new JLabel("Philippine Antiquity Quiz");
		titleLabel.setFont(new Font("ALGERIAN", Font.ITALIC, 30));
		
		inputNameLabel = new JLabel("Input Name");
		inputNameLabel.setFont(new Font("BOOK ANTIQUA", Font.ITALIC, 25));
		inputNameLabel.setHorizontalAlignment(JLabel.CENTER);
		inputNameLabel.setVerticalAlignment(JLabel.CENTER);
		
		playerStandingLabel = new JLabel("Player Standing");
		playerStandingLabel.setFont(new Font("Curlz MT", Font.PLAIN, 50));
		playerStandingLabel.setHorizontalAlignment(JLabel.CENTER);
		playerStandingLabel.setVerticalAlignment(JLabel.CENTER);
		
		place1 = new JLabel();
		place1.setFont(new Font("CALIBRI", Font.PLAIN, 30));
		place1.setHorizontalAlignment(JLabel.LEFT);
		place1.setVerticalAlignment(JLabel.CENTER);
		place1.setVisible(true);
		
		place2 = new JLabel();
		place2.setFont(new Font("CALIBRI", Font.PLAIN, 30));
		place2.setHorizontalAlignment(JLabel.LEFT);
		place2.setVerticalAlignment(JLabel.CENTER);
		place2.setVisible(true);
		
		place3 = new JLabel();
		place3.setFont(new Font("CALIBRI", Font.PLAIN, 30));
		place3.setHorizontalAlignment(JLabel.LEFT);
		place3.setVerticalAlignment(JLabel.CENTER);
		place3.setVisible(true);
		
		place4 = new JLabel();
		place4.setFont(new Font("CALIBRI", Font.PLAIN, 30));
		place4.setHorizontalAlignment(JLabel.LEFT);
		place4.setVerticalAlignment(JLabel.CENTER);
		place4.setVisible(true);
		
		place5 = new JLabel();
		place5.setFont(new Font("CALIBRI", Font.PLAIN, 30));
		place5.setHorizontalAlignment(JLabel.LEFT);
		place5.setVerticalAlignment(JLabel.CENTER);
		place5.setVisible(true);
		
		place6 = new JLabel();
		place6.setFont(new Font("CALIBRI", Font.PLAIN, 30));
		place6.setHorizontalAlignment(JLabel.LEFT);
		place6.setVerticalAlignment(JLabel.CENTER);
		place6.setVisible(true);
		
		place7 = new JLabel();
		place7.setFont(new Font("CALIBRI", Font.PLAIN, 30));
		place7.setHorizontalAlignment(JLabel.LEFT);
		place7.setVerticalAlignment(JLabel.CENTER);
		place7.setVisible(true);
	
		place8 = new JLabel();
		place8.setFont(new Font("CALIBRI", Font.PLAIN, 30));
		place8.setHorizontalAlignment(JLabel.LEFT);
		place8.setVerticalAlignment(JLabel.CENTER);
		place8.setVisible(true);
		
		place9 = new JLabel();
		place9.setFont(new Font("CALIBRI", Font.PLAIN, 30));
		place9.setHorizontalAlignment(JLabel.LEFT);
		place9.setVerticalAlignment(JLabel.CENTER);
		place9.setVisible(true);
		
		place10 = new JLabel();
		place10.setFont(new Font("CALIBRI", Font.PLAIN, 30));
		place10.setHorizontalAlignment(JLabel.LEFT);
		place10.setVerticalAlignment(JLabel.CENTER);
		place10.setVisible(true);
	}
	
	public void JTextField2() {
		nameField = new JTextField();
		nameField.setFont(new Font("BOOK ANTIQUA", Font.PLAIN, 20));
	}
	
	public void buttons2() {
		playButton = new JButton("Play");
		playButton.setPreferredSize(new Dimension(100, 40));
		playButton.setFont(new Font("CALIBRI", Font.PLAIN, 20));
		playButton.addActionListener(actionListener);
		
		resetButton = new JButton("Reset Game");
		resetButton.setPreferredSize(new Dimension(100, 40));
		resetButton.setFont(new Font("CALIBRI", Font.PLAIN, 20));
		resetButton.addActionListener(actionListener);
	}
	
	
	
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	
	String[] answerQ1 = {"Congrats! You got the right answer", "c. José Protasio Rizal Mercado y Alonso Realonda"};
	String[] answerChecking = {"Correct", "Wrong"};
	JPanel frameQ1;
	JPanel panelNQ1, panelSQ1, panelEQ1, panelWQ1, panelCQ1, panelInPanelCQ1, answerPanelQ1, panelInCQ1;
	JLabel qLabelQ1, answerLabelQ1, infoLabelQ1, rightAnsLabelQ1;
	JButton button1Q1, button2Q1, button3Q1, button4Q1, nextButtonQ1;
	JLayeredPane newLayeredPaneQ1;
	
	ImageIcon imageQ1 = new ImageIcon("Inked111.jpg");
	
	public void Q1Frame() {
		buttonsQ1();
		labelsQ1();
		panelsQ1();
		layeredPaneQ1();
		frameQ1();
	}
	
	ActionListener ActionListenerQ1 = new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == button3Q1) {
				addScore2();
				panelCQ1.setVisible(false);
				rightAnsLabelQ1.setVisible(false);
				nextButtonQ1.setVisible(true);
				infoLabelQ1.setFont(new Font("ALGERIAN", Font.BOLD, 50));
				infoLabelQ1.setVerticalAlignment(JLabel.CENTER);
				answerLabelQ1.setText(answerChecking[0]);
				infoLabelQ1.setText(answerQ1[0]);
				newLayeredPaneQ1.add(answerPanelQ1, Integer.valueOf(2));
				
			} else if(e.getSource() == button2Q1 || e.getSource() == button1Q1 || e.getSource() == button4Q1) {
				panelCQ1.setVisible(false);
				nextButtonQ1.setVisible(true);
				answerLabelQ1.setText(answerChecking[1]);
				infoLabelQ1.setText(answerQ1[1]);
				newLayeredPaneQ1.add(answerPanelQ1, Integer.valueOf(1));
				
			} else if(e.getSource() == nextButtonQ1) {
				Q2Frame();
				frame.remove(frameQ1);
				frame.add(frameQ2);
				frame.setVisible(true);
			}
		}
	};
	
	
	public void frameQ1() {
		frameQ1 = new JPanel();
		frameQ1.setLayout(new BorderLayout(10, 10));
		frameQ1.setSize(1200, 700);
		
		frameQ1.add(panelNQ1, BorderLayout.NORTH);
		frameQ1.add(panelSQ1, BorderLayout.SOUTH);
		frameQ1.add(panelEQ1, BorderLayout.EAST);
		frameQ1.add(panelWQ1, BorderLayout.WEST);
		frameQ1.add(newLayeredPaneQ1, BorderLayout.CENTER);
		
		frameQ1.setVisible(true);
	}
	
	public void panelsQ1() {
		panelNQ1 = new JPanel();
		panelNQ1.setBackground(Color.LIGHT_GRAY);
		
		panelSQ1 = new JPanel();
		panelSQ1.setBackground(Color.LIGHT_GRAY);
		panelSQ1.setLayout(new BorderLayout());
		panelSQ1.add(nextButtonQ1, BorderLayout.CENTER);
		
		panelEQ1 = new JPanel();
		panelEQ1.setBackground(Color.LIGHT_GRAY);
		
		panelWQ1 = new JPanel();
		panelWQ1.setBackground(Color.LIGHT_GRAY);
		
		panelInPanelCQ1 = new JPanel();
		panelInPanelCQ1.setLayout(new GridLayout(4, 0));
		panelInPanelCQ1.add(button1Q1);
		panelInPanelCQ1.add(button2Q1);
		panelInPanelCQ1.add(button3Q1);
		panelInPanelCQ1.add(button4Q1);
		
		panelInCQ1 = new JPanel();
		panelInCQ1.setLayout(new BorderLayout());
		panelInCQ1.add(rightAnsLabelQ1, BorderLayout.NORTH);
		panelInCQ1.add(infoLabelQ1, BorderLayout.CENTER);
		
		panelCQ1 = new JPanel();
		panelCQ1.setOpaque(true);
		panelCQ1.setBackground(Color.LIGHT_GRAY);
		panelCQ1.setLayout(new BorderLayout());
		panelCQ1.add(qLabelQ1, BorderLayout.NORTH);
		panelCQ1.add(panelInPanelCQ1, BorderLayout.CENTER);
		panelCQ1.setSize(1142, 620);
		
		answerPanelQ1 = new JPanel();
		answerPanelQ1.setOpaque(true);
		answerPanelQ1.setSize(1142, 620);
		answerPanelQ1.setLayout(new BorderLayout());
		answerPanelQ1.add(answerLabelQ1, BorderLayout.NORTH);
		answerPanelQ1.add(panelInCQ1, BorderLayout.CENTER);
		
	}
	
	public void labelsQ1() {
		qLabelQ1 = new JLabel("1. What is Dr. Rizal’s full name?");
		qLabelQ1.setFont(new Font("Book Antiqua", Font.PLAIN, 55));
		
		answerLabelQ1 = new JLabel();
		answerLabelQ1.setFont(new Font("ALGERIAN", Font.BOLD, 150));
		answerLabelQ1.setHorizontalAlignment(JLabel.CENTER);
		answerLabelQ1.setVerticalAlignment(JLabel.CENTER);
		
		infoLabelQ1 = new JLabel();
		infoLabelQ1.setFont(new Font("ALGERIAN", Font.BOLD, 35));
		infoLabelQ1.setVerticalAlignment(JLabel.TOP);
		infoLabelQ1.setHorizontalAlignment(JLabel.CENTER);
		
		rightAnsLabelQ1 = new JLabel("Correct Answer : ");
		rightAnsLabelQ1.setFont(new Font("ALGERIAN", Font.PLAIN, 50));
		rightAnsLabelQ1.setHorizontalAlignment(JLabel.CENTER);
		rightAnsLabelQ1.setVerticalAlignment(JLabel.BOTTOM);
		rightAnsLabelQ1.setPreferredSize(new Dimension(0, 100));
	}
	
	public void buttonsQ1() {
		button1Q1 = new JButton("a. José Protasio Rizal y Alonso Mercado Realonda");
		button1Q1.setFocusable(false);
		button1Q1.addActionListener(ActionListenerQ1);
		button1Q1.setFont(new Font("Bookman Old Style", Font.PLAIN, 40));
		
		button2Q1 = new JButton("b. José Rizal Protasio Mercado y Alonso Realonda");
		button2Q1.setFocusable(false);
		button2Q1.addActionListener(ActionListenerQ1);
		button2Q1.setFont(new Font("Bookman Old Style", Font.PLAIN, 40));
		
		button3Q1 = new JButton("c. José Protasio Rizal Mercado y Alonso Realonda");
		button3Q1.setFocusable(false);
		button3Q1.addActionListener(ActionListenerQ1);
		button3Q1.setFont(new Font("Bookman Old Style", Font.PLAIN, 40));
		
		button4Q1 = new JButton("d. José Protasio Rizal y Mercado Alonso Realonda");
		button4Q1.setFocusable(false);
		button4Q1.addActionListener(ActionListenerQ1);
		button4Q1.setFont(new Font("Bookman Old Style", Font.PLAIN, 40));
		
		nextButtonQ1 = new JButton("Next");
		nextButtonQ1.setFont(new Font("nextButton", Font.PLAIN, 30));
		nextButtonQ1.setVisible(false);
		nextButtonQ1.addActionListener(ActionListenerQ1);
	}
	
	public void layeredPaneQ1() {
		newLayeredPaneQ1 = new JLayeredPane();
		newLayeredPaneQ1.setBackground(Color.black);
		newLayeredPaneQ1.setSize(1200, 700);
		newLayeredPaneQ1.add(panelCQ1, Integer.valueOf(0));
		
	}
	
	
	
	
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	
	String[] answerQ2 = {"Congrats! You got the right answer", "b. Dr. Jose Rizal"};
	JPanel frameQ2;
	JPanel panelNQ2, panelSQ2, panelEQ2, panelWQ2, panelCQ2, panelInPanelCQ2, answerPanelQ2, panelInCQ2;
	JLabel qLabelQ2, answerLabelQ2, infoLabelQ2, rightAnsLabelQ2;
	JButton button1Q2, button2Q2, button3Q2, button4Q2, nextButtonQ2;
	JLayeredPane newLayeredPaneQ2;
	
	ImageIcon imageQ2 = new ImageIcon("Inked111.jpg");
	
	public void Q2Frame() {
		buttonsQ2();
		labelsQ2();
		panelsQ2();
		layeredPaneQ2();
		frameQ2();
	}
	
	ActionListener ActionListenerQ2 = new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == button2Q2) {
				addScore2();
				panelCQ2.setVisible(false);
				rightAnsLabelQ2.setVisible(false);
				nextButtonQ2.setVisible(true);
				infoLabelQ2.setFont(new Font("ALGERIAN", Font.BOLD, 50));
				infoLabelQ2.setVerticalAlignment(JLabel.CENTER);
				answerLabelQ2.setText(answerChecking[0]);
				infoLabelQ2.setText(answerQ2[0]);
				newLayeredPaneQ2.add(answerPanelQ2, Integer.valueOf(2));
				
			} else if(e.getSource() == button3Q2 || e.getSource() == button1Q2 || e.getSource() == button4Q2) {
				panelCQ2.setVisible(false);
				nextButtonQ2.setVisible(true);
				answerLabelQ2.setText(answerChecking[1]);
				infoLabelQ2.setText(answerQ2[1]);
				newLayeredPaneQ2.add(answerPanelQ2, Integer.valueOf(1));
				
			} else if(e.getSource() == nextButtonQ2) {
				Q3Frame();
				frame.remove(frameQ2);
				frame.add(frameQ3);
				frame.setVisible(true);
			}
		}
	};
	
	
	public void frameQ2() {
		frameQ2 = new JPanel();
		frameQ2.setLayout(new BorderLayout(10, 10));
		frameQ2.setSize(1200, 700);
		
		frameQ2.add(panelNQ2, BorderLayout.NORTH);
		frameQ2.add(panelSQ2, BorderLayout.SOUTH);
		frameQ2.add(panelEQ2, BorderLayout.EAST);
		frameQ2.add(panelWQ2, BorderLayout.WEST);
		frameQ2.add(newLayeredPaneQ2, BorderLayout.CENTER);
		
		frameQ2.setVisible(true);
	}
	
	public void panelsQ2() {
		panelNQ2 = new JPanel();
		panelNQ2.setBackground(Color.LIGHT_GRAY);
		
		panelSQ2 = new JPanel();
		panelSQ2.setBackground(Color.LIGHT_GRAY);
		panelSQ2.setLayout(new BorderLayout());
		panelSQ2.add(nextButtonQ2, BorderLayout.CENTER);
		
		panelEQ2 = new JPanel();
		panelEQ2.setBackground(Color.LIGHT_GRAY);
		
		panelWQ2 = new JPanel();
		panelWQ2.setBackground(Color.LIGHT_GRAY);
		
		panelInPanelCQ2 = new JPanel();
		panelInPanelCQ2.setLayout(new GridLayout(4, 0));
		panelInPanelCQ2.add(button1Q2);
		panelInPanelCQ2.add(button2Q2);
		panelInPanelCQ2.add(button3Q2);
		panelInPanelCQ2.add(button4Q2);
		
		panelInCQ2 = new JPanel();
		panelInCQ2.setLayout(new BorderLayout());
		panelInCQ2.add(rightAnsLabelQ2, BorderLayout.NORTH);
		panelInCQ2.add(infoLabelQ2, BorderLayout.CENTER);
		
		panelCQ2 = new JPanel();
		panelCQ2.setOpaque(true);
		panelCQ2.setBackground(Color.LIGHT_GRAY);
		panelCQ2.setLayout(new BorderLayout());
		panelCQ2.add(qLabelQ2, BorderLayout.NORTH);
		panelCQ2.add(panelInPanelCQ2, BorderLayout.CENTER);
		panelCQ2.setSize(1142, 620);
		
		answerPanelQ2 = new JPanel();
		answerPanelQ2.setOpaque(true);
		answerPanelQ2.setSize(1142, 620);
		answerPanelQ2.setLayout(new BorderLayout());
		answerPanelQ2.add(answerLabelQ2, BorderLayout.NORTH);
		answerPanelQ2.add(panelInCQ2, BorderLayout.CENTER);
		
	}
	
	public void labelsQ2() {
		qLabelQ2 = new JLabel("2. Who wrote the Noli Me Tángere and El Filibusterismo?");
		qLabelQ2.setFont(new Font("Book Antiqua", Font.PLAIN, 40));
		
		answerLabelQ2 = new JLabel();
		answerLabelQ2.setFont(new Font("ALGERIAN", Font.BOLD, 150));
		answerLabelQ2.setHorizontalAlignment(JLabel.CENTER);
		answerLabelQ2.setVerticalAlignment(JLabel.CENTER);
		
		infoLabelQ2 = new JLabel();
		infoLabelQ2.setFont(new Font("ALGERIAN", Font.BOLD, 35));
		infoLabelQ2.setVerticalAlignment(JLabel.TOP);
		infoLabelQ2.setHorizontalAlignment(JLabel.CENTER);
		
		rightAnsLabelQ2 = new JLabel("Correct Answer : ");
		rightAnsLabelQ2.setFont(new Font("ALGERIAN", Font.PLAIN, 50));
		rightAnsLabelQ2.setHorizontalAlignment(JLabel.CENTER);
		rightAnsLabelQ2.setVerticalAlignment(JLabel.BOTTOM);
		rightAnsLabelQ2.setPreferredSize(new Dimension(0, 100));
	}
	
	public void buttonsQ2() {
		button1Q2 = new JButton("a. Apolinario Mabini");
		button1Q2.setFocusable(false);
		button1Q2.addActionListener(ActionListenerQ2);
		button1Q2.setFont(new Font("Bookman Old Style", Font.PLAIN, 40));
		
		button2Q2 = new JButton("b. Dr. Jose Rizal");
		button2Q2.setFocusable(false);
		button2Q2.addActionListener(ActionListenerQ2);
		button2Q2.setFont(new Font("Bookman Old Style", Font.PLAIN, 40));
		
		button3Q2 = new JButton("c. Andress Bonifacio");
		button3Q2.setFocusable(false);
		button3Q2.addActionListener(ActionListenerQ2);
		button3Q2.setFont(new Font("Bookman Old Style", Font.PLAIN, 40));
		
		button4Q2 = new JButton("d. Lapu- Lapu");
		button4Q2.setFocusable(false);
		button4Q2.addActionListener(ActionListenerQ2);
		button4Q2.setFont(new Font("Bookman Old Style", Font.PLAIN, 40));
		
		nextButtonQ2 = new JButton("Next");
		nextButtonQ2.setFont(new Font("nextButton", Font.PLAIN, 30));
		nextButtonQ2.setVisible(false);
		nextButtonQ2.addActionListener(ActionListenerQ2);
	}
	
	public void layeredPaneQ2() {
		newLayeredPaneQ2 = new JLayeredPane();
		newLayeredPaneQ2.setBackground(Color.black);
		newLayeredPaneQ2.setSize(1200, 700);
		newLayeredPaneQ2.add(panelCQ2, Integer.valueOf(0));
		
	}
	
	
	
	
	
	
	
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	
	
	
	
	String[] answerQ3 = {"Congrats! You got the right answer", "c. Dr. Jose Rizal"};
	JPanel frameQ3;
	JPanel panelNQ3, panelSQ3, panelEQ3, panelWQ3, panelCQ3, panelInPanelCQ3, answerPanelQ3, panelInCQ3;
	JLabel qLabelQ3, answerLabelQ3, infoLabelQ3, rightAnsLabelQ3;
	JButton button1Q3, button2Q3, button3Q3, button4Q3, nextButtonQ3;
	JLayeredPane newLayeredPaneQ3;
	
	ImageIcon imageQ3 = new ImageIcon("Inked111.jpg");
	
	public void Q3Frame() {
		buttonsQ3();
		labelsQ3();
		panelsQ3();
		layeredPaneQ3();
		frameQ3();
	}
	
	ActionListener ActionListenerQ3 = new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == button3Q3) {
				addScore2();
				panelCQ3.setVisible(false);
				rightAnsLabelQ3.setVisible(false);
				nextButtonQ3.setVisible(true);
				infoLabelQ3.setFont(new Font("ALGERIAN", Font.BOLD, 50));
				infoLabelQ3.setVerticalAlignment(JLabel.CENTER);
				answerLabelQ3.setText(answerChecking[0]);
				infoLabelQ3.setText(answerQ3[0]);
				newLayeredPaneQ3.add(answerPanelQ3, Integer.valueOf(2));
				
			} else if(e.getSource() == button2Q3 || e.getSource() == button1Q3 || e.getSource() == button4Q3) {
				panelCQ3.setVisible(false);
				nextButtonQ3.setVisible(true);
				answerLabelQ3.setText(answerChecking[1]);
				infoLabelQ3.setText(answerQ3[1]);
				newLayeredPaneQ3.add(answerPanelQ3, Integer.valueOf(1));
				
			} else if(e.getSource() == nextButtonQ3) {
				Q4Frame();
				frame.remove(frameQ3);
				frame.add(frameQ4);
				frame.setVisible(true);
			}
		}
	};
	
	
	public void frameQ3() {
		frameQ3 = new JPanel();
		frameQ3.setLayout(new BorderLayout(10, 10));
		frameQ3.setSize(1200, 700);
		
		frameQ3.add(panelNQ3, BorderLayout.NORTH);
		frameQ3.add(panelSQ3, BorderLayout.SOUTH);
		frameQ3.add(panelEQ3, BorderLayout.EAST);
		frameQ3.add(panelWQ3, BorderLayout.WEST);
		frameQ3.add(newLayeredPaneQ3, BorderLayout.CENTER);
		
		frameQ3.setVisible(true);
	}
	
	public void panelsQ3() {
		panelNQ3 = new JPanel();
		panelNQ3.setBackground(Color.LIGHT_GRAY);
		
		panelSQ3 = new JPanel();
		panelSQ3.setBackground(Color.LIGHT_GRAY);
		panelSQ3.setLayout(new BorderLayout());
		panelSQ3.add(nextButtonQ3, BorderLayout.CENTER);
		
		panelEQ3 = new JPanel();
		panelEQ3.setBackground(Color.LIGHT_GRAY);
		
		panelWQ3 = new JPanel();
		panelWQ3.setBackground(Color.LIGHT_GRAY);
		
		panelInPanelCQ3 = new JPanel();
		panelInPanelCQ3.setLayout(new GridLayout(4, 0));
		panelInPanelCQ3.add(button1Q3);
		panelInPanelCQ3.add(button2Q3);
		panelInPanelCQ3.add(button3Q3);
		panelInPanelCQ3.add(button4Q3);
		
		panelInCQ3 = new JPanel();
		panelInCQ3.setLayout(new BorderLayout());
		panelInCQ3.add(rightAnsLabelQ3, BorderLayout.NORTH);
		panelInCQ3.add(infoLabelQ3, BorderLayout.CENTER);
		
		panelCQ3 = new JPanel();
		panelCQ3.setOpaque(true);
		panelCQ3.setBackground(Color.LIGHT_GRAY);
		panelCQ3.setLayout(new BorderLayout());
		panelCQ3.add(qLabelQ3, BorderLayout.NORTH);
		panelCQ3.add(panelInPanelCQ3, BorderLayout.CENTER);
		panelCQ3.setSize(1142, 620);
		
		answerPanelQ3 = new JPanel();
		answerPanelQ3.setOpaque(true);
		answerPanelQ3.setSize(1142, 620);
		answerPanelQ3.setLayout(new BorderLayout());
		answerPanelQ3.add(answerLabelQ3, BorderLayout.NORTH);
		answerPanelQ3.add(panelInCQ3, BorderLayout.CENTER);
		
	}
	
	public void labelsQ3() {
		qLabelQ3 = new JLabel("3. Who is the national hero?");
		qLabelQ3.setFont(new Font("Book Antiqua", Font.PLAIN, 55));
		
		answerLabelQ3 = new JLabel();
		answerLabelQ3.setFont(new Font("ALGERIAN", Font.BOLD, 150));
		answerLabelQ3.setHorizontalAlignment(JLabel.CENTER);
		answerLabelQ3.setVerticalAlignment(JLabel.CENTER);
		
		infoLabelQ3 = new JLabel();
		infoLabelQ3.setFont(new Font("ALGERIAN", Font.BOLD, 35));
		infoLabelQ3.setVerticalAlignment(JLabel.TOP);
		infoLabelQ3.setHorizontalAlignment(JLabel.CENTER);
		
		rightAnsLabelQ3 = new JLabel("Correct Answer : ");
		rightAnsLabelQ3.setFont(new Font("ALGERIAN", Font.PLAIN, 50));
		rightAnsLabelQ3.setHorizontalAlignment(JLabel.CENTER);
		rightAnsLabelQ3.setVerticalAlignment(JLabel.BOTTOM);
		rightAnsLabelQ3.setPreferredSize(new Dimension(0, 100));
	}
	
	public void buttonsQ3() {
		button1Q3 = new JButton("a. Apolinario Mabini");
		button1Q3.setFocusable(false);
		button1Q3.addActionListener(ActionListenerQ3);
		button1Q3.setFont(new Font("Bookman Old Style", Font.PLAIN, 40));
		
		button2Q3 = new JButton("b. Andress Bonifacio");
		button2Q3.setFocusable(false);
		button2Q3.addActionListener(ActionListenerQ3);
		button2Q3.setFont(new Font("Bookman Old Style", Font.PLAIN, 40));
		
		button3Q3 = new JButton("c. Dr. Jose Rizal");
		button3Q3.setFocusable(false);
		button3Q3.addActionListener(ActionListenerQ3);
		button3Q3.setFont(new Font("Bookman Old Style", Font.PLAIN, 40));
		
		button4Q3 = new JButton("d. Lapu- Lapu");
		button4Q3.setFocusable(false);
		button4Q3.addActionListener(ActionListenerQ3);
		button4Q3.setFont(new Font("Bookman Old Style", Font.PLAIN, 40));
		
		nextButtonQ3 = new JButton("Next");
		nextButtonQ3.setFont(new Font("nextButton", Font.PLAIN, 30));
		nextButtonQ3.setVisible(false);
		nextButtonQ3.addActionListener(ActionListenerQ3);
	}
	
	public void layeredPaneQ3() {
		newLayeredPaneQ3 = new JLayeredPane();
		newLayeredPaneQ3.setBackground(Color.black);
		newLayeredPaneQ3.setSize(1200, 700);
		newLayeredPaneQ3.add(panelCQ3, Integer.valueOf(0));
		
	}
	
	
	
	
	
	
	
	
	
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	
	
	
	
	String[] answerQ4 = {"Congrats! You got the right answer", "c. Bagumbayan"};
	JPanel frameQ4;
	JPanel panelNQ4, panelSQ4, panelEQ4, panelWQ4, panelCQ4, panelInPanelCQ4, answerPanelQ4, panelInCQ4;
	JLabel qLabelQ4, answerLabelQ4, infoLabelQ4, rightAnsLabelQ4;
	JButton button1Q4, button2Q4, button3Q4, button4Q4, nextButtonQ4;
	JLayeredPane newLayeredPaneQ4;
	
	ImageIcon imageQ4 = new ImageIcon("Inked111.jpg");
	
	public void Q4Frame() {
		buttonsQ4();
		labelsQ4();
		panelsQ4();
		layeredPaneQ4();
		frameQ4();
	}
	
	ActionListener ActionListenerQ4 = new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == button3Q4) {
				addScore2();
				panelCQ4.setVisible(false);
				rightAnsLabelQ4.setVisible(false);
				nextButtonQ4.setVisible(true);
				infoLabelQ4.setFont(new Font("ALGERIAN", Font.BOLD, 50));
				infoLabelQ4.setVerticalAlignment(JLabel.CENTER);
				answerLabelQ4.setText(answerChecking[0]);
				infoLabelQ4.setText(answerQ4[0]);
				newLayeredPaneQ4.add(answerPanelQ4, Integer.valueOf(2));
				
			} else if(e.getSource() == button2Q4 || e.getSource() == button1Q4 || e.getSource() == button4Q4) {
				panelCQ4.setVisible(false);
				nextButtonQ4.setVisible(true);
				answerLabelQ4.setText(answerChecking[1]);
				infoLabelQ4.setText(answerQ4[1]);
				newLayeredPaneQ4.add(answerPanelQ4, Integer.valueOf(1));
				
			} else if(e.getSource() == nextButtonQ4) {
				Q5Frame();
				frame.remove(frameQ4);
				frame.add(frameQ5);
				frame.setVisible(true);
			}
		}
	};
	
	
	public void frameQ4() {
		frameQ4 = new JPanel();
		frameQ4.setLayout(new BorderLayout(10, 10));
		frameQ4.setSize(1200, 700);
		
		frameQ4.add(panelNQ4, BorderLayout.NORTH);
		frameQ4.add(panelSQ4, BorderLayout.SOUTH);
		frameQ4.add(panelEQ4, BorderLayout.EAST);
		frameQ4.add(panelWQ4, BorderLayout.WEST);
		frameQ4.add(newLayeredPaneQ4, BorderLayout.CENTER);
		
		frameQ4.setVisible(true);
	}
	
	public void panelsQ4() {
		panelNQ4 = new JPanel();
		panelNQ4.setBackground(Color.LIGHT_GRAY);
		
		panelSQ4 = new JPanel();
		panelSQ4.setBackground(Color.LIGHT_GRAY);
		panelSQ4.setLayout(new BorderLayout());
		panelSQ4.add(nextButtonQ4, BorderLayout.CENTER);
		
		panelEQ4 = new JPanel();
		panelEQ4.setBackground(Color.LIGHT_GRAY);
		
		panelWQ4 = new JPanel();
		panelWQ4.setBackground(Color.LIGHT_GRAY);
		
		panelInPanelCQ4 = new JPanel();
		panelInPanelCQ4.setLayout(new GridLayout(4, 0));
		panelInPanelCQ4.add(button1Q4);
		panelInPanelCQ4.add(button2Q4);
		panelInPanelCQ4.add(button3Q4);
		panelInPanelCQ4.add(button4Q4);
		
		panelInCQ4 = new JPanel();
		panelInCQ4.setLayout(new BorderLayout());
		panelInCQ4.add(rightAnsLabelQ4, BorderLayout.NORTH);
		panelInCQ4.add(infoLabelQ4, BorderLayout.CENTER);
		
		panelCQ4 = new JPanel();
		panelCQ4.setOpaque(true);
		panelCQ4.setBackground(Color.LIGHT_GRAY);
		panelCQ4.setLayout(new BorderLayout());
		panelCQ4.add(qLabelQ4, BorderLayout.NORTH);
		panelCQ4.add(panelInPanelCQ4, BorderLayout.CENTER);
		panelCQ4.setSize(1142, 620);
		
		answerPanelQ4 = new JPanel();
		answerPanelQ4.setOpaque(true);
		answerPanelQ4.setSize(1142, 620);
		answerPanelQ4.setLayout(new BorderLayout());
		answerPanelQ4.add(answerLabelQ4, BorderLayout.NORTH);
		answerPanelQ4.add(panelInCQ4, BorderLayout.CENTER);
		
	}
	
	public void labelsQ4() {
		qLabelQ4 = new JLabel("4. Where did Dr. Rizal died?");
		qLabelQ4.setFont(new Font("Book Antiqua", Font.PLAIN, 55));
		
		answerLabelQ4 = new JLabel();
		answerLabelQ4.setFont(new Font("ALGERIAN", Font.BOLD, 150));
		answerLabelQ4.setHorizontalAlignment(JLabel.CENTER);
		answerLabelQ4.setVerticalAlignment(JLabel.CENTER);
		
		infoLabelQ4 = new JLabel();
		infoLabelQ4.setFont(new Font("ALGERIAN", Font.BOLD, 35));
		infoLabelQ4.setVerticalAlignment(JLabel.TOP);
		infoLabelQ4.setHorizontalAlignment(JLabel.CENTER);
		
		rightAnsLabelQ4 = new JLabel("Correct Answer : ");
		rightAnsLabelQ4.setFont(new Font("ALGERIAN", Font.PLAIN, 50));
		rightAnsLabelQ4.setHorizontalAlignment(JLabel.CENTER);
		rightAnsLabelQ4.setVerticalAlignment(JLabel.BOTTOM);
		rightAnsLabelQ4.setPreferredSize(new Dimension(0, 100));
	}
	
	public void buttonsQ4() {
		button1Q4 = new JButton("a. Calamba");
		button1Q4.setFocusable(false);
		button1Q4.addActionListener(ActionListenerQ4);
		button1Q4.setFont(new Font("Bookman Old Style", Font.PLAIN, 40));
		
		button2Q4 = new JButton("b. Maktan");
		button2Q4.setFocusable(false);
		button2Q4.addActionListener(ActionListenerQ4);
		button2Q4.setFont(new Font("Bookman Old Style", Font.PLAIN, 40));
		
		button3Q4 = new JButton("c. Bagumbayan");
		button3Q4.setFocusable(false);
		button3Q4.addActionListener(ActionListenerQ4);
		button3Q4.setFont(new Font("Bookman Old Style", Font.PLAIN, 40));
		
		button4Q4 = new JButton("d. Tondo");
		button4Q4.setFocusable(false);
		button4Q4.addActionListener(ActionListenerQ4);
		button4Q4.setFont(new Font("Bookman Old Style", Font.PLAIN, 40));
		
		nextButtonQ4 = new JButton("Next");
		nextButtonQ4.setFont(new Font("nextButton", Font.PLAIN, 30));
		nextButtonQ4.setVisible(false);
		nextButtonQ4.addActionListener(ActionListenerQ4);
	}
	
	public void layeredPaneQ4() {
		newLayeredPaneQ4 = new JLayeredPane();
		newLayeredPaneQ4.setBackground(Color.black);
		newLayeredPaneQ4.setSize(1200, 700);
		newLayeredPaneQ4.add(panelCQ4, Integer.valueOf(0));
		
	}
	
	
	
	
	
	
	
	
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	
	
	
	
	String[] answerQ5 = {"Congrats! You got the right answer", "a. 1887"};
	JPanel frameQ5;
	JPanel panelNQ5, panelSQ5, panelEQ5, panelWQ5, panelCQ5, panelInPanelCQ5, answerPanelQ5, panelInCQ5;
	JLabel qLabelQ5, answerLabelQ5, infoLabelQ5, rightAnsLabelQ5;
	JButton button1Q5, button2Q5, button3Q5, button4Q5, nextButtonQ5;
	JLayeredPane newLayeredPaneQ5;
	
	ImageIcon imageQ5 = new ImageIcon("Inked111.jpg");
	
	public void Q5Frame() {
		buttonsQ5();
		labelsQ5();
		panelsQ5();
		layeredPaneQ5();
		frameQ5();
	}
	
	ActionListener ActionListenerQ5 = new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == button1Q5) {
				addScore2();
				panelCQ5.setVisible(false);
				rightAnsLabelQ5.setVisible(false);
				nextButtonQ5.setVisible(true);
				infoLabelQ5.setFont(new Font("ALGERIAN", Font.BOLD, 50));
				infoLabelQ5.setVerticalAlignment(JLabel.CENTER);
				answerLabelQ5.setText(answerChecking[0]);
				infoLabelQ5.setText(answerQ5[0]);
				newLayeredPaneQ5.add(answerPanelQ5, Integer.valueOf(2));
				
			} else if(e.getSource() == button2Q5 || e.getSource() == button3Q5 || e.getSource() == button4Q5) {
				panelCQ5.setVisible(false);
				nextButtonQ5.setVisible(true);
				answerLabelQ5.setText(answerChecking[1]);
				infoLabelQ5.setText(answerQ5[1]);
				newLayeredPaneQ5.add(answerPanelQ5, Integer.valueOf(1));
				
			} else if(e.getSource() == nextButtonQ5) {
				Q6Frame();
				frame.remove(frameQ5);
				frame.add(frameQ6);
				frame.setVisible(true);
			}
		}
	};
	
	
	public void frameQ5() {
		frameQ5 = new JPanel();
		frameQ5.setLayout(new BorderLayout(10, 10));
		frameQ5.setSize(1200, 700);
		
		frameQ5.add(panelNQ5, BorderLayout.NORTH);
		frameQ5.add(panelSQ5, BorderLayout.SOUTH);
		frameQ5.add(panelEQ5, BorderLayout.EAST);
		frameQ5.add(panelWQ5, BorderLayout.WEST);
		frameQ5.add(newLayeredPaneQ5, BorderLayout.CENTER);
		
		frameQ5.setVisible(true);
	}
	
	public void panelsQ5() {
		panelNQ5 = new JPanel();
		panelNQ5.setBackground(Color.LIGHT_GRAY);
		
		panelSQ5 = new JPanel();
		panelSQ5.setBackground(Color.LIGHT_GRAY);
		panelSQ5.setLayout(new BorderLayout());
		panelSQ5.add(nextButtonQ5, BorderLayout.CENTER);
		
		panelEQ5 = new JPanel();
		panelEQ5.setBackground(Color.LIGHT_GRAY);
		
		panelWQ5 = new JPanel();
		panelWQ5.setBackground(Color.LIGHT_GRAY);
		
		panelInPanelCQ5 = new JPanel();
		panelInPanelCQ5.setLayout(new GridLayout(4, 0));
		panelInPanelCQ5.add(button1Q5);
		panelInPanelCQ5.add(button2Q5);
		panelInPanelCQ5.add(button3Q5);
		panelInPanelCQ5.add(button4Q5);
		
		panelInCQ5 = new JPanel();
		panelInCQ5.setLayout(new BorderLayout());
		panelInCQ5.add(rightAnsLabelQ5, BorderLayout.NORTH);
		panelInCQ5.add(infoLabelQ5, BorderLayout.CENTER);
		
		panelCQ5 = new JPanel();
		panelCQ5.setOpaque(true);
		panelCQ5.setBackground(Color.LIGHT_GRAY);
		panelCQ5.setLayout(new BorderLayout());
		panelCQ5.add(qLabelQ5, BorderLayout.NORTH);
		panelCQ5.add(panelInPanelCQ5, BorderLayout.CENTER);
		panelCQ5.setSize(1142, 620);
		
		answerPanelQ5 = new JPanel();
		answerPanelQ5.setOpaque(true);
		answerPanelQ5.setSize(1142, 620);
		answerPanelQ5.setLayout(new BorderLayout());
		answerPanelQ5.add(answerLabelQ5, BorderLayout.NORTH);
		answerPanelQ5.add(panelInCQ5, BorderLayout.CENTER);
		
	}
	
	public void labelsQ5() {
		qLabelQ5 = new JLabel("5. In what year did Dr.Rizal wrote the Noli Me Tángere?");
		qLabelQ5.setFont(new Font("Book Antiqua", Font.PLAIN, 40));
		
		answerLabelQ5 = new JLabel();
		answerLabelQ5.setFont(new Font("ALGERIAN", Font.BOLD, 150));
		answerLabelQ5.setHorizontalAlignment(JLabel.CENTER);
		answerLabelQ5.setVerticalAlignment(JLabel.CENTER);
		
		infoLabelQ5 = new JLabel();
		infoLabelQ5.setFont(new Font("ALGERIAN", Font.BOLD, 35));
		infoLabelQ5.setVerticalAlignment(JLabel.TOP);
		infoLabelQ5.setHorizontalAlignment(JLabel.CENTER);
		
		rightAnsLabelQ5 = new JLabel("Correct Answer : ");
		rightAnsLabelQ5.setFont(new Font("ALGERIAN", Font.PLAIN, 50));
		rightAnsLabelQ5.setHorizontalAlignment(JLabel.CENTER);
		rightAnsLabelQ5.setVerticalAlignment(JLabel.BOTTOM);
		rightAnsLabelQ5.setPreferredSize(new Dimension(0, 100));
	}
	
	public void buttonsQ5() {
		button1Q5 = new JButton("a. 1887");
		button1Q5.setFocusable(false);
		button1Q5.addActionListener(ActionListenerQ5);
		button1Q5.setFont(new Font("Bookman Old Style", Font.PLAIN, 40));
		
		button2Q5 = new JButton("b. 1886");
		button2Q5.setFocusable(false);
		button2Q5.addActionListener(ActionListenerQ5);
		button2Q5.setFont(new Font("Bookman Old Style", Font.PLAIN, 40));
		
		button3Q5 = new JButton("c. 1885");
		button3Q5.setFocusable(false);
		button3Q5.addActionListener(ActionListenerQ5);
		button3Q5.setFont(new Font("Bookman Old Style", Font.PLAIN, 40));
		
		button4Q5 = new JButton("d. 1888");
		button4Q5.setFocusable(false);
		button4Q5.addActionListener(ActionListenerQ5);
		button4Q5.setFont(new Font("Bookman Old Style", Font.PLAIN, 40));
		
		nextButtonQ5 = new JButton("Next");
		nextButtonQ5.setFont(new Font("nextButton", Font.PLAIN, 30));
		nextButtonQ5.setVisible(false);
		nextButtonQ5.addActionListener(ActionListenerQ5);
	}
	
	public void layeredPaneQ5() {
		newLayeredPaneQ5 = new JLayeredPane();
		newLayeredPaneQ5.setBackground(Color.black);
		newLayeredPaneQ5.setSize(1200, 700);
		newLayeredPaneQ5.add(panelCQ5, Integer.valueOf(0));
		
	}
	
	
	
	
	
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	
	
	
	String[] answerQ6 = {"Congrats! You got the right answer", "c. Lapu-Lapu"};
	JPanel frameQ6;
	JPanel panelNQ6, panelSQ6, panelEQ6, panelWQ6, panelCQ6, panelInPanelCQ6, answerPanelQ6, panelInCQ6;
	JLabel qLabelQ6, answerLabelQ6, infoLabelQ6, rightAnsLabelQ6;
	JButton button1Q6, button2Q6, button3Q6, button4Q6, nextButtonQ6;
	JLayeredPane newLayeredPaneQ6;
	
	ImageIcon imageQ6 = new ImageIcon("Inked111.jpg");
	
	public void Q6Frame() {
		buttonsQ6();
		labelsQ6();
		panelsQ6();
		layeredPaneQ6();
		frameQ6();
	}
	
	ActionListener ActionListenerQ6 = new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == button3Q6) {
				addScore2();
				panelCQ6.setVisible(false);
				rightAnsLabelQ6.setVisible(false);
				nextButtonQ6.setVisible(true);
				infoLabelQ6.setFont(new Font("ALGERIAN", Font.BOLD, 50));
				infoLabelQ6.setVerticalAlignment(JLabel.CENTER);
				answerLabelQ6.setText(answerChecking[0]);
				infoLabelQ6.setText(answerQ6[0]);
				newLayeredPaneQ6.add(answerPanelQ6, Integer.valueOf(2));
				
			} else if(e.getSource() == button2Q6 || e.getSource() == button1Q6 || e.getSource() == button4Q6) {
				panelCQ6.setVisible(false);
				nextButtonQ6.setVisible(true);
				answerLabelQ6.setText(answerChecking[1]);
				infoLabelQ6.setText(answerQ6[1]);
				newLayeredPaneQ6.add(answerPanelQ6, Integer.valueOf(1));
				
			} else if(e.getSource() == nextButtonQ6) {
				Q7Frame();
				frame.remove(frameQ6);
				frame.add(frameQ7);
				frame.setVisible(true);
			}
		}
	};
	
	
	public void frameQ6() {
		frameQ6 = new JPanel();
		frameQ6.setLayout(new BorderLayout(10, 10));
		frameQ6.setSize(1200, 700);
		
		frameQ6.add(panelNQ6, BorderLayout.NORTH);
		frameQ6.add(panelSQ6, BorderLayout.SOUTH);
		frameQ6.add(panelEQ6, BorderLayout.EAST);
		frameQ6.add(panelWQ6, BorderLayout.WEST);
		frameQ6.add(newLayeredPaneQ6, BorderLayout.CENTER);
		
		frameQ6.setVisible(true);
	}
	
	public void panelsQ6() {
		panelNQ6 = new JPanel();
		panelNQ6.setBackground(Color.LIGHT_GRAY);
		
		panelSQ6 = new JPanel();
		panelSQ6.setBackground(Color.LIGHT_GRAY);
		panelSQ6.setLayout(new BorderLayout());
		panelSQ6.add(nextButtonQ6, BorderLayout.CENTER);
		
		panelEQ6 = new JPanel();
		panelEQ6.setBackground(Color.LIGHT_GRAY);
		
		panelWQ6 = new JPanel();
		panelWQ6.setBackground(Color.LIGHT_GRAY);
		
		panelInPanelCQ6 = new JPanel();
		panelInPanelCQ6.setLayout(new GridLayout(4, 0));
		panelInPanelCQ6.add(button1Q6);
		panelInPanelCQ6.add(button2Q6);
		panelInPanelCQ6.add(button3Q6);
		panelInPanelCQ6.add(button4Q6);
		
		panelInCQ6 = new JPanel();
		panelInCQ6.setLayout(new BorderLayout());
		panelInCQ6.add(rightAnsLabelQ6, BorderLayout.NORTH);
		panelInCQ6.add(infoLabelQ6, BorderLayout.CENTER);
		
		panelCQ6 = new JPanel();
		panelCQ6.setOpaque(true);
		panelCQ6.setBackground(Color.LIGHT_GRAY);
		panelCQ6.setLayout(new BorderLayout());
		panelCQ6.add(qLabelQ6, BorderLayout.NORTH);
		panelCQ6.add(panelInPanelCQ6, BorderLayout.CENTER);
		panelCQ6.setSize(1142, 620);
		
		answerPanelQ6 = new JPanel();
		answerPanelQ6.setOpaque(true);
		answerPanelQ6.setSize(1142, 620);
		answerPanelQ6.setLayout(new BorderLayout());
		answerPanelQ6.add(answerLabelQ6, BorderLayout.NORTH);
		answerPanelQ6.add(panelInCQ6, BorderLayout.CENTER);
		
	}
	
	public void labelsQ6() {
		qLabelQ6 = new JLabel("6. Who is the Datu of Mactan ?");
		qLabelQ6.setFont(new Font("Book Antiqua", Font.PLAIN, 55));
		
		answerLabelQ6 = new JLabel();
		answerLabelQ6.setFont(new Font("ALGERIAN", Font.BOLD, 150));
		answerLabelQ6.setHorizontalAlignment(JLabel.CENTER);
		answerLabelQ6.setVerticalAlignment(JLabel.CENTER);
		
		infoLabelQ6 = new JLabel();
		infoLabelQ6.setFont(new Font("ALGERIAN", Font.BOLD, 35));
		infoLabelQ6.setVerticalAlignment(JLabel.TOP);
		infoLabelQ6.setHorizontalAlignment(JLabel.CENTER);
		
		rightAnsLabelQ6 = new JLabel("Correct Answer : ");
		rightAnsLabelQ6.setFont(new Font("ALGERIAN", Font.PLAIN, 50));
		rightAnsLabelQ6.setHorizontalAlignment(JLabel.CENTER);
		rightAnsLabelQ6.setVerticalAlignment(JLabel.BOTTOM);
		rightAnsLabelQ6.setPreferredSize(new Dimension(0, 100));
	}
	
	public void buttonsQ6() {
		button1Q6 = new JButton("a. Humabon");
		button1Q6.setFocusable(false);
		button1Q6.addActionListener(ActionListenerQ6);
		button1Q6.setFont(new Font("Bookman Old Style", Font.PLAIN, 40));
		
		button2Q6 = new JButton("b. Magellan");
		button2Q6.setFocusable(false);
		button2Q6.addActionListener(ActionListenerQ6);
		button2Q6.setFont(new Font("Bookman Old Style", Font.PLAIN, 40));
		
		button3Q6 = new JButton("c. Lapu-Lapu");
		button3Q6.setFocusable(false);
		button3Q6.addActionListener(ActionListenerQ6);
		button3Q6.setFont(new Font("Bookman Old Style", Font.PLAIN, 40));
		
		button4Q6 = new JButton("d. Luna");
		button4Q6.setFocusable(false);
		button4Q6.addActionListener(ActionListenerQ6);
		button4Q6.setFont(new Font("Bookman Old Style", Font.PLAIN, 40));
		
		nextButtonQ6 = new JButton("Next");
		nextButtonQ6.setFont(new Font("nextButton", Font.PLAIN, 30));
		nextButtonQ6.setVisible(false);
		nextButtonQ6.addActionListener(ActionListenerQ6);
	}
	
	public void layeredPaneQ6() {
		newLayeredPaneQ6 = new JLayeredPane();
		newLayeredPaneQ6.setBackground(Color.black);
		newLayeredPaneQ6.setSize(1200, 700);
		newLayeredPaneQ6.add(panelCQ6, Integer.valueOf(0));
		
	}
	
	
	
	
	
	
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	
	
	
	String[] answerQ7 = {"Congrats! You got the right answer", "c. 1542"};
	JPanel frameQ7;
	JPanel panelNQ7, panelSQ7, panelEQ7, panelWQ7, panelCQ7, panelInPanelCQ7, answerPanelQ7, panelInCQ7;
	JLabel qLabelQ7, answerLabelQ7, infoLabelQ7, rightAnsLabelQ7;
	JButton button1Q7, button2Q7, button3Q7, button4Q7, nextButtonQ7;
	JLayeredPane newLayeredPaneQ7;
	
	ImageIcon imageQ7 = new ImageIcon("Inked111.jpg");
	
	public void Q7Frame() {
		buttonsQ7();
		labelsQ7();
		panelsQ7();
		layeredPaneQ7();
		frameQ7();
	}
	
	ActionListener ActionListenerQ7 = new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == button3Q7) {
				addScore2();
				panelCQ7.setVisible(false);
				rightAnsLabelQ7.setVisible(false);
				nextButtonQ7.setVisible(true);
				infoLabelQ7.setFont(new Font("ALGERIAN", Font.BOLD, 50));
				infoLabelQ7.setVerticalAlignment(JLabel.CENTER);
				answerLabelQ7.setText(answerChecking[0]);
				infoLabelQ7.setText(answerQ7[0]);
				newLayeredPaneQ7.add(answerPanelQ7, Integer.valueOf(2));
				
			} else if(e.getSource() == button2Q7 || e.getSource() == button1Q7 || e.getSource() == button4Q7) {
				panelCQ7.setVisible(false);
				nextButtonQ7.setVisible(true);
				answerLabelQ7.setText(answerChecking[1]);
				infoLabelQ7.setText(answerQ7[1]);
				newLayeredPaneQ7.add(answerPanelQ7, Integer.valueOf(1));
				
			} else if(e.getSource() == nextButtonQ7) {
				Q8Frame();
				frame.remove(frameQ7);
				frame.add(frameQ8);
				frame.setVisible(true);
			}
		}
	};
	
	
	public void frameQ7() {
		frameQ7 = new JPanel();
		frameQ7.setLayout(new BorderLayout(10, 10));
		frameQ7.setSize(1200, 700);
		
		frameQ7.add(panelNQ7, BorderLayout.NORTH);
		frameQ7.add(panelSQ7, BorderLayout.SOUTH);
		frameQ7.add(panelEQ7, BorderLayout.EAST);
		frameQ7.add(panelWQ7, BorderLayout.WEST);
		frameQ7.add(newLayeredPaneQ7, BorderLayout.CENTER);
		
		frameQ7.setVisible(true);
	}
	
	public void panelsQ7() {
		panelNQ7 = new JPanel();
		panelNQ7.setBackground(Color.LIGHT_GRAY);
		
		panelSQ7 = new JPanel();
		panelSQ7.setBackground(Color.LIGHT_GRAY);
		panelSQ7.setLayout(new BorderLayout());
		panelSQ7.add(nextButtonQ7, BorderLayout.CENTER);
		
		panelEQ7 = new JPanel();
		panelEQ7.setBackground(Color.LIGHT_GRAY);
		
		panelWQ7 = new JPanel();
		panelWQ7.setBackground(Color.LIGHT_GRAY);
		
		panelInPanelCQ7 = new JPanel();
		panelInPanelCQ7.setLayout(new GridLayout(4, 0));
		panelInPanelCQ7.add(button1Q7);
		panelInPanelCQ7.add(button2Q7);
		panelInPanelCQ7.add(button3Q7);
		panelInPanelCQ7.add(button4Q7);
		
		panelInCQ7 = new JPanel();
		panelInCQ7.setLayout(new BorderLayout());
		panelInCQ7.add(rightAnsLabelQ7, BorderLayout.NORTH);
		panelInCQ7.add(infoLabelQ7, BorderLayout.CENTER);
		
		panelCQ7 = new JPanel();
		panelCQ7.setOpaque(true);
		panelCQ7.setBackground(Color.LIGHT_GRAY);
		panelCQ7.setLayout(new BorderLayout());
		panelCQ7.add(qLabelQ7, BorderLayout.NORTH);
		panelCQ7.add(panelInPanelCQ7, BorderLayout.CENTER);
		panelCQ7.setSize(1142, 620);
		
		answerPanelQ7 = new JPanel();
		answerPanelQ7.setOpaque(true);
		answerPanelQ7.setSize(1142, 620);
		answerPanelQ7.setLayout(new BorderLayout());
		answerPanelQ7.add(answerLabelQ7, BorderLayout.NORTH);
		answerPanelQ7.add(panelInCQ7, BorderLayout.CENTER);
		
	}
	
	public void labelsQ7() {
		qLabelQ7 = new JLabel("7. When did Lapu-Lapu Died?");
		qLabelQ7.setFont(new Font("Book Antiqua", Font.PLAIN, 55));
		
		answerLabelQ7 = new JLabel();
		answerLabelQ7.setFont(new Font("ALGERIAN", Font.BOLD, 150));
		answerLabelQ7.setHorizontalAlignment(JLabel.CENTER);
		answerLabelQ7.setVerticalAlignment(JLabel.CENTER);
		
		infoLabelQ7 = new JLabel();
		infoLabelQ7.setFont(new Font("ALGERIAN", Font.BOLD, 35));
		infoLabelQ7.setVerticalAlignment(JLabel.TOP);
		infoLabelQ7.setHorizontalAlignment(JLabel.CENTER);
		
		rightAnsLabelQ7 = new JLabel("Correct Answer : ");
		rightAnsLabelQ7.setFont(new Font("ALGERIAN", Font.PLAIN, 50));
		rightAnsLabelQ7.setHorizontalAlignment(JLabel.CENTER);
		rightAnsLabelQ7.setVerticalAlignment(JLabel.BOTTOM);
		rightAnsLabelQ7.setPreferredSize(new Dimension(0, 100));
	}
	
	public void buttonsQ7() {
		button1Q7 = new JButton("a. 1540");
		button1Q7.setFocusable(false);
		button1Q7.addActionListener(ActionListenerQ7);
		button1Q7.setFont(new Font("Bookman Old Style", Font.PLAIN, 40));
		
		button2Q7 = new JButton("b. 1541");
		button2Q7.setFocusable(false);
		button2Q7.addActionListener(ActionListenerQ7);
		button2Q7.setFont(new Font("Bookman Old Style", Font.PLAIN, 40));
		
		button3Q7 = new JButton("c. 1542");
		button3Q7.setFocusable(false);
		button3Q7.addActionListener(ActionListenerQ7);
		button3Q7.setFont(new Font("Bookman Old Style", Font.PLAIN, 40));
		
		button4Q7 = new JButton("d. 1543");
		button4Q7.setFocusable(false);
		button4Q7.addActionListener(ActionListenerQ7);
		button4Q7.setFont(new Font("Bookman Old Style", Font.PLAIN, 40));
		
		nextButtonQ7 = new JButton("Next");
		nextButtonQ7.setFont(new Font("nextButton", Font.PLAIN, 30));
		nextButtonQ7.setVisible(false);
		nextButtonQ7.addActionListener(ActionListenerQ7);
	}
	
	public void layeredPaneQ7() {
		newLayeredPaneQ7 = new JLayeredPane();
		newLayeredPaneQ7.setBackground(Color.black);
		newLayeredPaneQ7.setSize(1200, 700);
		newLayeredPaneQ7.add(panelCQ7, Integer.valueOf(0));
		
	}
	
	
	
	
	
	
	
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	
	
	
	String[] answerQ8 = {"Congrats! You got the right answer", "d. Lapu-Lapu"};
	JPanel frameQ8;
	JPanel panelNQ8, panelSQ8, panelEQ8, panelWQ8, panelCQ8, panelInPanelCQ8, answerPanelQ8, panelInCQ8;
	JLabel qLabelQ8, answerLabelQ8, infoLabelQ8, rightAnsLabelQ8;
	JButton button1Q8, button2Q8, button3Q8, button4Q8, nextButtonQ8;
	JLayeredPane newLayeredPaneQ8;
	
	ImageIcon imageQ8 = new ImageIcon("Inked111.jpg");
	
	public void Q8Frame() {
		buttonsQ8();
		labelsQ8();
		panelsQ8();
		layeredPaneQ8();
		frameQ8();
	}
	
	ActionListener ActionListenerQ8 = new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == button4Q8) {
				addScore2();
				panelCQ8.setVisible(false);
				rightAnsLabelQ8.setVisible(false);
				nextButtonQ8.setVisible(true);
				infoLabelQ8.setFont(new Font("ALGERIAN", Font.BOLD, 50));
				infoLabelQ8.setVerticalAlignment(JLabel.CENTER);
				answerLabelQ8.setText(answerChecking[0]);
				infoLabelQ8.setText(answerQ8[0]);
				newLayeredPaneQ8.add(answerPanelQ8, Integer.valueOf(2));
				
			} else if(e.getSource() == button2Q8 || e.getSource() == button1Q8 || e.getSource() == button3Q8) {
				panelCQ8.setVisible(false);
				nextButtonQ8.setVisible(true);
				answerLabelQ8.setText(answerChecking[1]);
				infoLabelQ8.setText(answerQ8[1]);
				newLayeredPaneQ8.add(answerPanelQ8, Integer.valueOf(1));
				
			} else if(e.getSource() == nextButtonQ8) {
				Q9Frame();
				frame.remove(frameQ8);
				frame.add(frameQ9);
				frame.setVisible(true);
			}
		}
	};
	
	
	public void frameQ8() {
		frameQ8 = new JPanel();
		frameQ8.setLayout(new BorderLayout(10, 10));
		frameQ8.setSize(1200, 700);
		
		frameQ8.add(panelNQ8, BorderLayout.NORTH);
		frameQ8.add(panelSQ8, BorderLayout.SOUTH);
		frameQ8.add(panelEQ8, BorderLayout.EAST);
		frameQ8.add(panelWQ8, BorderLayout.WEST);
		frameQ8.add(newLayeredPaneQ8, BorderLayout.CENTER);
		
		frameQ8.setVisible(true);
	}
	
	public void panelsQ8() {
		panelNQ8 = new JPanel();
		panelNQ8.setBackground(Color.LIGHT_GRAY);
		
		panelSQ8 = new JPanel();
		panelSQ8.setBackground(Color.LIGHT_GRAY);
		panelSQ8.setLayout(new BorderLayout());
		panelSQ8.add(nextButtonQ8, BorderLayout.CENTER);
		
		panelEQ8 = new JPanel();
		panelEQ8.setBackground(Color.LIGHT_GRAY);
		
		panelWQ8 = new JPanel();
		panelWQ8.setBackground(Color.LIGHT_GRAY);
		
		panelInPanelCQ8 = new JPanel();
		panelInPanelCQ8.setLayout(new GridLayout(4, 0));
		panelInPanelCQ8.add(button1Q8);
		panelInPanelCQ8.add(button2Q8);
		panelInPanelCQ8.add(button3Q8);
		panelInPanelCQ8.add(button4Q8);
		
		panelInCQ8 = new JPanel();
		panelInCQ8.setLayout(new BorderLayout());
		panelInCQ8.add(rightAnsLabelQ8, BorderLayout.NORTH);
		panelInCQ8.add(infoLabelQ8, BorderLayout.CENTER);
		
		panelCQ8 = new JPanel();
		panelCQ8.setOpaque(true);
		panelCQ8.setBackground(Color.LIGHT_GRAY);
		panelCQ8.setLayout(new BorderLayout());
		panelCQ8.add(qLabelQ8, BorderLayout.NORTH);
		panelCQ8.add(panelInPanelCQ8, BorderLayout.CENTER);
		panelCQ8.setSize(1142, 620);
		
		answerPanelQ8 = new JPanel();
		answerPanelQ8.setOpaque(true);
		answerPanelQ8.setSize(1142, 620);
		answerPanelQ8.setLayout(new BorderLayout());
		answerPanelQ8.add(answerLabelQ8, BorderLayout.NORTH);
		answerPanelQ8.add(panelInCQ8, BorderLayout.CENTER);
		
	}
	
	public void labelsQ8() {
		qLabelQ8 = new JLabel("8. Who killed Ferdinand Magellan?");
		qLabelQ8.setFont(new Font("Book Antiqua", Font.PLAIN, 55));
		
		answerLabelQ8 = new JLabel();
		answerLabelQ8.setFont(new Font("ALGERIAN", Font.BOLD, 150));
		answerLabelQ8.setHorizontalAlignment(JLabel.CENTER);
		answerLabelQ8.setVerticalAlignment(JLabel.CENTER);
		
		infoLabelQ8 = new JLabel();
		infoLabelQ8.setFont(new Font("ALGERIAN", Font.BOLD, 35));
		infoLabelQ8.setVerticalAlignment(JLabel.TOP);
		infoLabelQ8.setHorizontalAlignment(JLabel.CENTER);
		
		rightAnsLabelQ8 = new JLabel("Correct Answer : ");
		rightAnsLabelQ8.setFont(new Font("ALGERIAN", Font.PLAIN, 50));
		rightAnsLabelQ8.setHorizontalAlignment(JLabel.CENTER);
		rightAnsLabelQ8.setVerticalAlignment(JLabel.BOTTOM);
		rightAnsLabelQ8.setPreferredSize(new Dimension(0, 100));
	}
	
	public void buttonsQ8() {
		button1Q8 = new JButton("a. Luna");
		button1Q8.setFocusable(false);
		button1Q8.addActionListener(ActionListenerQ8);
		button1Q8.setFont(new Font("Bookman Old Style", Font.PLAIN, 40));
		
		button2Q8 = new JButton("b. Bonifacio");
		button2Q8.setFocusable(false);
		button2Q8.addActionListener(ActionListenerQ8);
		button2Q8.setFont(new Font("Bookman Old Style", Font.PLAIN, 40));
		
		button3Q8 = new JButton("c. Duterte");
		button3Q8.setFocusable(false);
		button3Q8.addActionListener(ActionListenerQ8);
		button3Q8.setFont(new Font("Bookman Old Style", Font.PLAIN, 40));
		
		button4Q8 = new JButton("d. Lapu-Lapu");
		button4Q8.setFocusable(false);
		button4Q8.addActionListener(ActionListenerQ8);
		button4Q8.setFont(new Font("Bookman Old Style", Font.PLAIN, 40));
		
		nextButtonQ8 = new JButton("Next");
		nextButtonQ8.setFont(new Font("nextButton", Font.PLAIN, 30));
		nextButtonQ8.setVisible(false);
		nextButtonQ8.addActionListener(ActionListenerQ8);
	}
	
	public void layeredPaneQ8() {
		newLayeredPaneQ8 = new JLayeredPane();
		newLayeredPaneQ8.setBackground(Color.black);
		newLayeredPaneQ8.setSize(1200, 700);
		newLayeredPaneQ8.add(panelCQ8, Integer.valueOf(0));
		
	}
	
	
	
	
	
	
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	
	
	
	String[] answerQ9 = {"Congrats! You got the right answer", "b. Consummatum Est!"};
	JPanel frameQ9;
	JPanel panelNQ9, panelSQ9, panelEQ9, panelWQ9, panelCQ9, panelInPanelCQ9, answerPanelQ9, panelInCQ9;
	JLabel qLabelQ9, answerLabelQ9, infoLabelQ9, rightAnsLabelQ9;
	JButton button1Q9, button2Q9, button3Q9, button4Q9, nextButtonQ9;
	JLayeredPane newLayeredPaneQ9;
	
	ImageIcon imageQ9 = new ImageIcon("Inked111.jpg");
	
	public void Q9Frame() {
		buttonsQ9();
		labelsQ9();
		panelsQ9();
		layeredPaneQ9();
		frameQ9();
	}
	
	ActionListener ActionListenerQ9 = new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == button2Q9) {
				addScore2();
				panelCQ9.setVisible(false);
				rightAnsLabelQ9.setVisible(false);
				nextButtonQ9.setVisible(true);
				infoLabelQ9.setFont(new Font("ALGERIAN", Font.BOLD, 50));
				infoLabelQ9.setVerticalAlignment(JLabel.CENTER);
				answerLabelQ9.setText(answerChecking[0]);
				infoLabelQ9.setText(answerQ9[0]);
				newLayeredPaneQ9.add(answerPanelQ9, Integer.valueOf(2));
				
			} else if(e.getSource() == button4Q9 || e.getSource() == button1Q9 || e.getSource() == button3Q9) {
				panelCQ9.setVisible(false);
				nextButtonQ9.setVisible(true);
				answerLabelQ9.setText(answerChecking[1]);
				infoLabelQ9.setText(answerQ9[1]);
				newLayeredPaneQ9.add(answerPanelQ9, Integer.valueOf(1));
				
			} else if(e.getSource() == nextButtonQ9) {
				Q10Frame();
				frame.remove(frameQ9);
				frame.add(frameQ10);
				frame.setVisible(true);
			}
		}
	};
	
	
	public void frameQ9() {
		frameQ9 = new JPanel();
		frameQ9.setLayout(new BorderLayout(10, 10));
		frameQ9.setSize(1200, 700);
		
		frameQ9.add(panelNQ9, BorderLayout.NORTH);
		frameQ9.add(panelSQ9, BorderLayout.SOUTH);
		frameQ9.add(panelEQ9, BorderLayout.EAST);
		frameQ9.add(panelWQ9, BorderLayout.WEST);
		frameQ9.add(newLayeredPaneQ9, BorderLayout.CENTER);
		
		frameQ9.setVisible(true);
	}
	
	public void panelsQ9() {
		panelNQ9 = new JPanel();
		panelNQ9.setBackground(Color.LIGHT_GRAY);
		
		panelSQ9 = new JPanel();
		panelSQ9.setBackground(Color.LIGHT_GRAY);
		panelSQ9.setLayout(new BorderLayout());
		panelSQ9.add(nextButtonQ9, BorderLayout.CENTER);
		
		panelEQ9 = new JPanel();
		panelEQ9.setBackground(Color.LIGHT_GRAY);
		
		panelWQ9 = new JPanel();
		panelWQ9.setBackground(Color.LIGHT_GRAY);
		
		panelInPanelCQ9 = new JPanel();
		panelInPanelCQ9.setLayout(new GridLayout(4, 0));
		panelInPanelCQ9.add(button1Q9);
		panelInPanelCQ9.add(button2Q9);
		panelInPanelCQ9.add(button3Q9);
		panelInPanelCQ9.add(button4Q9);
		
		panelInCQ9 = new JPanel();
		panelInCQ9.setLayout(new BorderLayout());
		panelInCQ9.add(rightAnsLabelQ9, BorderLayout.NORTH);
		panelInCQ9.add(infoLabelQ9, BorderLayout.CENTER);
		
		panelCQ9 = new JPanel();
		panelCQ9.setOpaque(true);
		panelCQ9.setBackground(Color.LIGHT_GRAY);
		panelCQ9.setLayout(new BorderLayout());
		panelCQ9.add(qLabelQ9, BorderLayout.NORTH);
		panelCQ9.add(panelInPanelCQ9, BorderLayout.CENTER);
		panelCQ9.setSize(1142, 620);
		
		answerPanelQ9 = new JPanel();
		answerPanelQ9.setOpaque(true);
		answerPanelQ9.setSize(1142, 620);
		answerPanelQ9.setLayout(new BorderLayout());
		answerPanelQ9.add(answerLabelQ9, BorderLayout.NORTH);
		answerPanelQ9.add(panelInCQ9, BorderLayout.CENTER);
		
	}
	
	public void labelsQ9() {
		qLabelQ9 = new JLabel("9. What is Dr. Rizal's last words before he died?");
		qLabelQ9.setFont(new Font("Book Antiqua", Font.PLAIN, 40));

		answerLabelQ9 = new JLabel();
		answerLabelQ9.setFont(new Font("ALGERIAN", Font.BOLD, 150));
		answerLabelQ9.setHorizontalAlignment(JLabel.CENTER);
		answerLabelQ9.setVerticalAlignment(JLabel.CENTER);
		
		infoLabelQ9 = new JLabel();
		infoLabelQ9.setFont(new Font("ALGERIAN", Font.BOLD, 35));
		infoLabelQ9.setVerticalAlignment(JLabel.TOP);
		infoLabelQ9.setHorizontalAlignment(JLabel.CENTER);
		
		rightAnsLabelQ9 = new JLabel("Correct Answer : ");
		rightAnsLabelQ9.setFont(new Font("ALGERIAN", Font.PLAIN, 50));
		rightAnsLabelQ9.setHorizontalAlignment(JLabel.CENTER);
		rightAnsLabelQ9.setVerticalAlignment(JLabel.BOTTOM);
		rightAnsLabelQ9.setPreferredSize(new Dimension(0, 100));
	}
	
	public void buttonsQ9() {
		button1Q9 = new JButton("a. Mi último adios!");
		button1Q9.setFocusable(false);
		button1Q9.addActionListener(ActionListenerQ9);
		button1Q9.setFont(new Font("Bookman Old Style", Font.PLAIN, 40));
		
		button2Q9 = new JButton("b. Consummatum Est!");
		button2Q9.setFocusable(false);
		button2Q9.addActionListener(ActionListenerQ9);
		button2Q9.setFont(new Font("Bookman Old Style", Font.PLAIN, 40));
		
		button3Q9 = new JButton("c. Touch me not");
		button3Q9.setFocusable(false);
		button3Q9.addActionListener(ActionListenerQ9);
		button3Q9.setFont(new Font("Bookman Old Style", Font.PLAIN, 40));
		
		button4Q9 = new JButton("d. Adios!! ");
		button4Q9.setFocusable(false);
		button4Q9.addActionListener(ActionListenerQ9);
		button4Q9.setFont(new Font("Bookman Old Style", Font.PLAIN, 40));
		
		nextButtonQ9 = new JButton("Next");
		nextButtonQ9.setFont(new Font("nextButton", Font.PLAIN, 30));
		nextButtonQ9.setVisible(false);
		nextButtonQ9.addActionListener(ActionListenerQ9);
	}
	
	public void layeredPaneQ9() {
		newLayeredPaneQ9 = new JLayeredPane();
		newLayeredPaneQ9.setBackground(Color.black);
		newLayeredPaneQ9.setSize(1200, 700);
		newLayeredPaneQ9.add(panelCQ9, Integer.valueOf(0));
		
	}
	
	
	
	
	
	
	
	
	
	
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	
	
	
	String[] answerQ10 = {"Congrats! You got the right answer", "b. Andres Bonifacio"};
	JPanel frameQ10;
	JPanel panelNQ10, panelSQ10, panelEQ10, panelWQ10, panelCQ10, panelInPanelCQ10, answerPanelQ10, panelInCQ10;
	JLabel qLabelQ10, answerLabelQ10, infoLabelQ10, rightAnsLabelQ10;
	JButton button1Q10, button2Q10, button3Q10, button4Q10, nextButtonQ10;
	JLayeredPane newLayeredPaneQ10;
	
	ImageIcon imageQ10 = new ImageIcon("Inked111.jpg");
	
	public void Q10Frame() {
		buttonsQ10();
		labelsQ10();
		panelsQ10();
		layeredPaneQ10();
		frameQ10();
	}
	
	ActionListener ActionListenerQ10 = new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == button2Q10) {
				addScore2();
				panelCQ10.setVisible(false);
				rightAnsLabelQ10.setVisible(false);
				nextButtonQ10.setVisible(true);
				infoLabelQ10.setFont(new Font("ALGERIAN", Font.BOLD, 50));
				infoLabelQ10.setVerticalAlignment(JLabel.CENTER);
				answerLabelQ10.setText(answerChecking[0]);
				infoLabelQ10.setText(answerQ10[0]);
				newLayeredPaneQ10.add(answerPanelQ10, Integer.valueOf(2));
				
			} else if(e.getSource() == button4Q10 || e.getSource() == button1Q10 || e.getSource() == button3Q10) {
				panelCQ10.setVisible(false);
				nextButtonQ10.setVisible(true);
				answerLabelQ10.setText(answerChecking[1]);
				infoLabelQ10.setText(answerQ10[1]);
				newLayeredPaneQ10.add(answerPanelQ10, Integer.valueOf(1));
				
			} else if(e.getSource() == nextButtonQ10) {
				Q11Frame();
				frame.remove(frameQ10);
				frame.add(frameQ11);
				frame.setVisible(true);
			}
		}
	};
	
	
	public void frameQ10() {
		frameQ10 = new JPanel();
		frameQ10.setLayout(new BorderLayout(10, 10));
		frameQ10.setSize(1200, 700);
		
		frameQ10.add(panelNQ10, BorderLayout.NORTH);
		frameQ10.add(panelSQ10, BorderLayout.SOUTH);
		frameQ10.add(panelEQ10, BorderLayout.EAST);
		frameQ10.add(panelWQ10, BorderLayout.WEST);
		frameQ10.add(newLayeredPaneQ10, BorderLayout.CENTER);
		
		frameQ10.setVisible(true);
	}
	
	public void panelsQ10() {
		panelNQ10 = new JPanel();
		panelNQ10.setBackground(Color.LIGHT_GRAY);
		
		panelSQ10 = new JPanel();
		panelSQ10.setBackground(Color.LIGHT_GRAY);
		panelSQ10.setLayout(new BorderLayout());
		panelSQ10.add(nextButtonQ10, BorderLayout.CENTER);
		
		panelEQ10 = new JPanel();
		panelEQ10.setBackground(Color.LIGHT_GRAY);
		
		panelWQ10 = new JPanel();
		panelWQ10.setBackground(Color.LIGHT_GRAY);
		
		panelInPanelCQ10 = new JPanel();
		panelInPanelCQ10.setLayout(new GridLayout(4, 0));
		panelInPanelCQ10.add(button1Q10);
		panelInPanelCQ10.add(button2Q10);
		panelInPanelCQ10.add(button3Q10);
		panelInPanelCQ10.add(button4Q10);
		
		panelInCQ10 = new JPanel();
		panelInCQ10.setLayout(new BorderLayout());
		panelInCQ10.add(rightAnsLabelQ10, BorderLayout.NORTH);
		panelInCQ10.add(infoLabelQ10, BorderLayout.CENTER);
		
		panelCQ10 = new JPanel();
		panelCQ10.setOpaque(true);
		panelCQ10.setBackground(Color.LIGHT_GRAY);
		panelCQ10.setLayout(new BorderLayout());
		panelCQ10.add(qLabelQ10, BorderLayout.NORTH);
		panelCQ10.add(panelInPanelCQ10, BorderLayout.CENTER);
		panelCQ10.setSize(1142, 620);
		
		answerPanelQ10 = new JPanel();
		answerPanelQ10.setOpaque(true);
		answerPanelQ10.setSize(1142, 620);
		answerPanelQ10.setLayout(new BorderLayout());
		answerPanelQ10.add(answerLabelQ10, BorderLayout.NORTH);
		answerPanelQ10.add(panelInCQ10, BorderLayout.CENTER);
		
	}
	
	public void labelsQ10() {
		qLabelQ10 = new JLabel("10. Who is known as Supremo?");
		qLabelQ10.setFont(new Font("Book Antiqua", Font.PLAIN, 55));

		answerLabelQ10 = new JLabel();
		answerLabelQ10.setFont(new Font("ALGERIAN", Font.BOLD, 150));
		answerLabelQ10.setHorizontalAlignment(JLabel.CENTER);
		answerLabelQ10.setVerticalAlignment(JLabel.CENTER);
		
		infoLabelQ10 = new JLabel();
		infoLabelQ10.setFont(new Font("ALGERIAN", Font.BOLD, 35));
		infoLabelQ10.setVerticalAlignment(JLabel.TOP);
		infoLabelQ10.setHorizontalAlignment(JLabel.CENTER);
		
		rightAnsLabelQ10 = new JLabel("Correct Answer : ");
		rightAnsLabelQ10.setFont(new Font("ALGERIAN", Font.PLAIN, 50));
		rightAnsLabelQ10.setHorizontalAlignment(JLabel.CENTER);
		rightAnsLabelQ10.setVerticalAlignment(JLabel.BOTTOM);
		rightAnsLabelQ10.setPreferredSize(new Dimension(0, 100));
	}
	
	public void buttonsQ10() {
		button1Q10 = new JButton("a. Genral Luna");
		button1Q10.setFocusable(false);
		button1Q10.addActionListener(ActionListenerQ10);
		button1Q10.setFont(new Font("Bookman Old Style", Font.PLAIN, 40));
		
		button2Q10 = new JButton("b. Andres Bonifacio");
		button2Q10.setFocusable(false);
		button2Q10.addActionListener(ActionListenerQ10);
		button2Q10.setFont(new Font("Bookman Old Style", Font.PLAIN, 40));
		
		button3Q10 = new JButton("c. Dr. Jose Rizal");
		button3Q10.setFocusable(false);
		button3Q10.addActionListener(ActionListenerQ10);
		button3Q10.setFont(new Font("Bookman Old Style", Font.PLAIN, 40));
		
		button4Q10 = new JButton("d. Apolinario Mabini");
		button4Q10.setFocusable(false);
		button4Q10.addActionListener(ActionListenerQ10);
		button4Q10.setFont(new Font("Bookman Old Style", Font.PLAIN, 40));
		
		nextButtonQ10 = new JButton("Next");
		nextButtonQ10.setFont(new Font("nextButton", Font.PLAIN, 30));
		nextButtonQ10.setVisible(false);
		nextButtonQ10.addActionListener(ActionListenerQ10);
	}
	
	public void layeredPaneQ10() {
		newLayeredPaneQ10 = new JLayeredPane();
		newLayeredPaneQ10.setBackground(Color.black);
		newLayeredPaneQ10.setSize(1200, 700);
		newLayeredPaneQ10.add(panelCQ10, Integer.valueOf(0));
		
	}
	
	
	
	
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	
	

	String[] answerQ11 = {"Congrats! You got the right answer", "c. Andrés Bonifacio y de Castro"};
	JPanel frameQ11;
	JPanel panelNQ11, panelSQ11, panelEQ11, panelWQ11, panelCQ11, panelInPanelCQ11, answerPanelQ11, panelInCQ11;
	JLabel qLabelQ11, answerLabelQ11, infoLabelQ11, rightAnsLabelQ11;
	JButton button1Q11, button2Q11, button3Q11, button4Q11, nextButtonQ11;
	JLayeredPane newLayeredPaneQ11;
	
	ImageIcon imageQ11 = new ImageIcon("Inked111.jpg");
	
	public void Q11Frame() {
		buttonsQ11();
		labelsQ11();
		panelsQ11();
		layeredPaneQ11();
		frameQ11();
	}
	
	ActionListener ActionListenerQ11 = new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == button3Q11) {
				addScore2();
				panelCQ11.setVisible(false);
				rightAnsLabelQ11.setVisible(false);
				nextButtonQ11.setVisible(true);
				infoLabelQ11.setFont(new Font("ALGERIAN", Font.BOLD, 50));
				infoLabelQ11.setVerticalAlignment(JLabel.CENTER);
				answerLabelQ11.setText(answerChecking[0]);
				infoLabelQ11.setText(answerQ11[0]);
				newLayeredPaneQ11.add(answerPanelQ11, Integer.valueOf(2));
				
			} else if(e.getSource() == button4Q11 || e.getSource() == button1Q11 || e.getSource() == button2Q11) {
				panelCQ11.setVisible(false);
				nextButtonQ11.setVisible(true);
				answerLabelQ11.setText(answerChecking[1]);
				infoLabelQ11.setText(answerQ11[1]);
				newLayeredPaneQ11.add(answerPanelQ11, Integer.valueOf(1));
				
			} else if(e.getSource() == nextButtonQ11) {
				Q12Frame();
				frame.remove(frameQ11);
				frame.add(frameQ12);
				frame.setVisible(true);
			}
		}
	};
	
	
	public void frameQ11() {
		frameQ11 = new JPanel();
		frameQ11.setLayout(new BorderLayout(11, 11));
		frameQ11.setSize(1200, 700);
		
		frameQ11.add(panelNQ11, BorderLayout.NORTH);
		frameQ11.add(panelSQ11, BorderLayout.SOUTH);
		frameQ11.add(panelEQ11, BorderLayout.EAST);
		frameQ11.add(panelWQ11, BorderLayout.WEST);
		frameQ11.add(newLayeredPaneQ11, BorderLayout.CENTER);
		
		frameQ11.setVisible(true);
	}
	
	public void panelsQ11() {
		panelNQ11 = new JPanel();
		panelNQ11.setBackground(Color.LIGHT_GRAY);
		
		panelSQ11 = new JPanel();
		panelSQ11.setBackground(Color.LIGHT_GRAY);
		panelSQ11.setLayout(new BorderLayout());
		panelSQ11.add(nextButtonQ11, BorderLayout.CENTER);
		
		panelEQ11 = new JPanel();
		panelEQ11.setBackground(Color.LIGHT_GRAY);
		
		panelWQ11 = new JPanel();
		panelWQ11.setBackground(Color.LIGHT_GRAY);
		
		panelInPanelCQ11 = new JPanel();
		panelInPanelCQ11.setLayout(new GridLayout(4, 0));
		panelInPanelCQ11.add(button1Q11);
		panelInPanelCQ11.add(button2Q11);
		panelInPanelCQ11.add(button3Q11);
		panelInPanelCQ11.add(button4Q11);
		
		panelInCQ11 = new JPanel();
		panelInCQ11.setLayout(new BorderLayout());
		panelInCQ11.add(rightAnsLabelQ11, BorderLayout.NORTH);
		panelInCQ11.add(infoLabelQ11, BorderLayout.CENTER);
		
		panelCQ11 = new JPanel();
		panelCQ11.setOpaque(true);
		panelCQ11.setBackground(Color.LIGHT_GRAY);
		panelCQ11.setLayout(new BorderLayout());
		panelCQ11.add(qLabelQ11, BorderLayout.NORTH);
		panelCQ11.add(panelInPanelCQ11, BorderLayout.CENTER);
		panelCQ11.setSize(1142, 620);
		
		answerPanelQ11 = new JPanel();
		answerPanelQ11.setOpaque(true);
		answerPanelQ11.setSize(1142, 620);
		answerPanelQ11.setLayout(new BorderLayout());
		answerPanelQ11.add(answerLabelQ11, BorderLayout.NORTH);
		answerPanelQ11.add(panelInCQ11, BorderLayout.CENTER);
		
	}
	
	public void labelsQ11() {
		qLabelQ11 = new JLabel("11. What is Andres Bonifacio's fullname?");
		qLabelQ11.setFont(new Font("Book Antiqua", Font.PLAIN, 55));

		answerLabelQ11 = new JLabel();
		answerLabelQ11.setFont(new Font("ALGERIAN", Font.BOLD, 150));
		answerLabelQ11.setHorizontalAlignment(JLabel.CENTER);
		answerLabelQ11.setVerticalAlignment(JLabel.CENTER);
		
		infoLabelQ11 = new JLabel();
		infoLabelQ11.setFont(new Font("ALGERIAN", Font.BOLD, 35));
		infoLabelQ11.setVerticalAlignment(JLabel.TOP);
		infoLabelQ11.setHorizontalAlignment(JLabel.CENTER);
		
		rightAnsLabelQ11 = new JLabel("Correct Answer : ");
		rightAnsLabelQ11.setFont(new Font("ALGERIAN", Font.PLAIN, 50));
		rightAnsLabelQ11.setHorizontalAlignment(JLabel.CENTER);
		rightAnsLabelQ11.setVerticalAlignment(JLabel.BOTTOM);
		rightAnsLabelQ11.setPreferredSize(new Dimension(0, 110));
	}
	
	public void buttonsQ11() {
		button1Q11 = new JButton("a. Andrés y Bonifacio de Castro");
		button1Q11.setFocusable(false);
		button1Q11.addActionListener(ActionListenerQ11);
		button1Q11.setFont(new Font("Bookman Old Style", Font.PLAIN, 40));
		
		button2Q11 = new JButton("b. Andrés de Castro y Bonifacio");
		button2Q11.setFocusable(false);
		button2Q11.addActionListener(ActionListenerQ11);
		button2Q11.setFont(new Font("Bookman Old Style", Font.PLAIN, 40));
		
		button3Q11 = new JButton("c. Andrés Bonifacio y de Castro");
		button3Q11.setFocusable(false);
		button3Q11.addActionListener(ActionListenerQ11);
		button3Q11.setFont(new Font("Bookman Old Style", Font.PLAIN, 40));
		
		button4Q11 = new JButton("d. Andrés y Bonifacio de Castro");
		button4Q11.setFocusable(false);
		button4Q11.addActionListener(ActionListenerQ11);
		button4Q11.setFont(new Font("Bookman Old Style", Font.PLAIN, 40));
		
		nextButtonQ11 = new JButton("Next");
		nextButtonQ11.setFont(new Font("nextButton", Font.PLAIN, 30));
		nextButtonQ11.setVisible(false);
		nextButtonQ11.addActionListener(ActionListenerQ11);
	}
	
	public void layeredPaneQ11() {
		newLayeredPaneQ11 = new JLayeredPane();
		newLayeredPaneQ11.setBackground(Color.black);
		newLayeredPaneQ11.setSize(1200, 700);
		newLayeredPaneQ11.add(panelCQ11, Integer.valueOf(0));
		
	}
	
	
	
	
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	
	

	String[] answerQ12 = {"Congrats! You got the right answer", "b. Andres Bonifacio"};
	JPanel frameQ12;
	JPanel panelNQ12, panelSQ12, panelEQ12, panelWQ12, panelCQ12, panelInPanelCQ12, answerPanelQ12, panelInCQ12;
	JLabel qLabelQ12, answerLabelQ12, infoLabelQ12, rightAnsLabelQ12;
	JButton button1Q12, button2Q12, button3Q12, button4Q12, nextButtonQ12;
	JLayeredPane newLayeredPaneQ12;
	
	ImageIcon imageQ12 = new ImageIcon("Inked111.jpg");
	
	public void Q12Frame() {
		buttonsQ12();
		labelsQ12();
		panelsQ12();
		layeredPaneQ12();
		frameQ12();
	}
	
	ActionListener ActionListenerQ12 = new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == button2Q12) {
				addScore2();
				panelCQ12.setVisible(false);
				rightAnsLabelQ12.setVisible(false);
				nextButtonQ12.setVisible(true);
				infoLabelQ12.setFont(new Font("ALGERIAN", Font.BOLD, 50));
				infoLabelQ12.setVerticalAlignment(JLabel.CENTER);
				answerLabelQ12.setText(answerChecking[0]);
				infoLabelQ12.setText(answerQ12[0]);
				newLayeredPaneQ12.add(answerPanelQ12, Integer.valueOf(2));
				
			} else if(e.getSource() == button4Q12 || e.getSource() == button1Q12 || e.getSource() == button3Q12) {
				panelCQ12.setVisible(false);
				nextButtonQ12.setVisible(true);
				answerLabelQ12.setText(answerChecking[1]);
				infoLabelQ12.setText(answerQ12[1]);
				newLayeredPaneQ12.add(answerPanelQ12, Integer.valueOf(1));
				
			} else if(e.getSource() == nextButtonQ12) {
				Q13Frame();
				frame.remove(frameQ12);
				frame.add(frameQ13);
				frame.setVisible(true);
			}
		}
	};
	
	
	public void frameQ12() {
		frameQ12 = new JPanel();
		frameQ12.setLayout(new BorderLayout(11, 11));
		frameQ12.setSize(1200, 700);
		
		frameQ12.add(panelNQ12, BorderLayout.NORTH);
		frameQ12.add(panelSQ12, BorderLayout.SOUTH);
		frameQ12.add(panelEQ12, BorderLayout.EAST);
		frameQ12.add(panelWQ12, BorderLayout.WEST);
		frameQ12.add(newLayeredPaneQ12, BorderLayout.CENTER);
		
		frameQ12.setVisible(true);
	}
	
	public void panelsQ12() {
		panelNQ12 = new JPanel();
		panelNQ12.setBackground(Color.LIGHT_GRAY);
		
		panelSQ12 = new JPanel();
		panelSQ12.setBackground(Color.LIGHT_GRAY);
		panelSQ12.setLayout(new BorderLayout());
		panelSQ12.add(nextButtonQ12, BorderLayout.CENTER);
		
		panelEQ12 = new JPanel();
		panelEQ12.setBackground(Color.LIGHT_GRAY);
		
		panelWQ12 = new JPanel();
		panelWQ12.setBackground(Color.LIGHT_GRAY);
		
		panelInPanelCQ12 = new JPanel();
		panelInPanelCQ12.setLayout(new GridLayout(4, 0));
		panelInPanelCQ12.add(button1Q12);
		panelInPanelCQ12.add(button2Q12);
		panelInPanelCQ12.add(button3Q12);
		panelInPanelCQ12.add(button4Q12);
		
		panelInCQ12 = new JPanel();
		panelInCQ12.setLayout(new BorderLayout());
		panelInCQ12.add(rightAnsLabelQ12, BorderLayout.NORTH);
		panelInCQ12.add(infoLabelQ12, BorderLayout.CENTER);
		
		panelCQ12 = new JPanel();
		panelCQ12.setOpaque(true);
		panelCQ12.setBackground(Color.LIGHT_GRAY);
		panelCQ12.setLayout(new BorderLayout());
		panelCQ12.add(qLabelQ12, BorderLayout.NORTH);
		panelCQ12.add(panelInPanelCQ12, BorderLayout.CENTER);
		panelCQ12.setSize(1142, 620);
		
		answerPanelQ12 = new JPanel();
		answerPanelQ12.setOpaque(true);
		answerPanelQ12.setSize(1142, 620);
		answerPanelQ12.setLayout(new BorderLayout());
		answerPanelQ12.add(answerLabelQ12, BorderLayout.NORTH);
		answerPanelQ12.add(panelInCQ12, BorderLayout.CENTER);
		
	}
	
	public void labelsQ12() {
		qLabelQ12 = new JLabel("12. Who is the Faher of The Phlippine Revolution?");
		qLabelQ12.setFont(new Font("Book Antiqua", Font.PLAIN, 55));

		answerLabelQ12 = new JLabel();
		answerLabelQ12.setFont(new Font("ALGERIAN", Font.BOLD, 150));
		answerLabelQ12.setHorizontalAlignment(JLabel.CENTER);
		answerLabelQ12.setVerticalAlignment(JLabel.CENTER);
		
		infoLabelQ12 = new JLabel();
		infoLabelQ12.setFont(new Font("ALGERIAN", Font.BOLD, 35));
		infoLabelQ12.setVerticalAlignment(JLabel.TOP);
		infoLabelQ12.setHorizontalAlignment(JLabel.CENTER);
		
		rightAnsLabelQ12 = new JLabel("Correct Answer : ");
		rightAnsLabelQ12.setFont(new Font("ALGERIAN", Font.PLAIN, 50));
		rightAnsLabelQ12.setHorizontalAlignment(JLabel.CENTER);
		rightAnsLabelQ12.setVerticalAlignment(JLabel.BOTTOM);
		rightAnsLabelQ12.setPreferredSize(new Dimension(0, 110));
	}
	
	public void buttonsQ12() {
		button1Q12 = new JButton("a. Genral Luna");
		button1Q12.setFocusable(false);
		button1Q12.addActionListener(ActionListenerQ12);
		button1Q12.setFont(new Font("Bookman Old Style", Font.PLAIN, 40));
		
		button2Q12 = new JButton("b. Andres Bonifacio");
		button2Q12.setFocusable(false);
		button2Q12.addActionListener(ActionListenerQ12);
		button2Q12.setFont(new Font("Bookman Old Style", Font.PLAIN, 40));
		
		button3Q12 = new JButton("c. Dr. Jose Rizal ");
		button3Q12.setFocusable(false);
		button3Q12.addActionListener(ActionListenerQ12);
		button3Q12.setFont(new Font("Bookman Old Style", Font.PLAIN, 40));
		
		button4Q12 = new JButton("d. Apolinario Mabini ");
		button4Q12.setFocusable(false);
		button4Q12.addActionListener(ActionListenerQ12);
		button4Q12.setFont(new Font("Bookman Old Style", Font.PLAIN, 40));
		
		nextButtonQ12 = new JButton("Next");
		nextButtonQ12.setFont(new Font("nextButton", Font.PLAIN, 30));
		nextButtonQ12.setVisible(false);
		nextButtonQ12.addActionListener(ActionListenerQ12);
	}
	
	public void layeredPaneQ12() {
		newLayeredPaneQ12 = new JLayeredPane();
		newLayeredPaneQ12.setBackground(Color.black);
		newLayeredPaneQ12.setSize(1200, 700);
		newLayeredPaneQ12.add(panelCQ12, Integer.valueOf(0));
		
	}
	
	
	
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	
	

	String[] answerQ13 = {"Congrats! You got the right answer", "a. 1863"};
	JPanel frameQ13;
	JPanel panelNQ13, panelSQ13, panelEQ13, panelWQ13, panelCQ13, panelInPanelCQ13, answerPanelQ13, panelInCQ13;
	JLabel qLabelQ13, answerLabelQ13, infoLabelQ13, rightAnsLabelQ13;
	JButton button1Q13, button2Q13, button3Q13, button4Q13, nextButtonQ13;
	JLayeredPane newLayeredPaneQ13;
	
	ImageIcon imageQ13 = new ImageIcon("Inked111.jpg");
	
	public void Q13Frame() {
		buttonsQ13();
		labelsQ13();
		panelsQ13();
		layeredPaneQ13();
		frameQ13();
	}
	
	ActionListener ActionListenerQ13 = new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == button1Q13) {
				addScore2();
				panelCQ13.setVisible(false);
				rightAnsLabelQ13.setVisible(false);
				nextButtonQ13.setVisible(true);
				infoLabelQ13.setFont(new Font("ALGERIAN", Font.BOLD, 50));
				infoLabelQ13.setVerticalAlignment(JLabel.CENTER);
				answerLabelQ13.setText(answerChecking[0]);
				infoLabelQ13.setText(answerQ13[0]);
				newLayeredPaneQ13.add(answerPanelQ13, Integer.valueOf(2));
				
			} else if(e.getSource() == button4Q13 || e.getSource() == button2Q13 || e.getSource() == button3Q13) {
				panelCQ13.setVisible(false);
				nextButtonQ13.setVisible(true);
				answerLabelQ13.setText(answerChecking[1]);
				infoLabelQ13.setText(answerQ13[1]);
				newLayeredPaneQ13.add(answerPanelQ13, Integer.valueOf(1));
				
			} else if(e.getSource() == nextButtonQ13) {
				Q14Frame();
				frame.remove(frameQ13);
				frame.add(frameQ14);
				frame.setVisible(true);
			}
		}
	};
	
	
	public void frameQ13() {
		frameQ13 = new JPanel();
		frameQ13.setLayout(new BorderLayout(11, 11));
		frameQ13.setSize(1200, 700);
		
		frameQ13.add(panelNQ13, BorderLayout.NORTH);
		frameQ13.add(panelSQ13, BorderLayout.SOUTH);
		frameQ13.add(panelEQ13, BorderLayout.EAST);
		frameQ13.add(panelWQ13, BorderLayout.WEST);
		frameQ13.add(newLayeredPaneQ13, BorderLayout.CENTER);
		
		frameQ13.setVisible(true);
	}
	
	public void panelsQ13() {
		panelNQ13 = new JPanel();
		panelNQ13.setBackground(Color.LIGHT_GRAY);
		
		panelSQ13 = new JPanel();
		panelSQ13.setBackground(Color.LIGHT_GRAY);
		panelSQ13.setLayout(new BorderLayout());
		panelSQ13.add(nextButtonQ13, BorderLayout.CENTER);
		
		panelEQ13 = new JPanel();
		panelEQ13.setBackground(Color.LIGHT_GRAY);
		
		panelWQ13 = new JPanel();
		panelWQ13.setBackground(Color.LIGHT_GRAY);
		
		panelInPanelCQ13 = new JPanel();
		panelInPanelCQ13.setLayout(new GridLayout(4, 0));
		panelInPanelCQ13.add(button1Q13);
		panelInPanelCQ13.add(button2Q13);
		panelInPanelCQ13.add(button3Q13);
		panelInPanelCQ13.add(button4Q13);
		
		panelInCQ13 = new JPanel();
		panelInCQ13.setLayout(new BorderLayout());
		panelInCQ13.add(rightAnsLabelQ13, BorderLayout.NORTH);
		panelInCQ13.add(infoLabelQ13, BorderLayout.CENTER);
		
		panelCQ13 = new JPanel();
		panelCQ13.setOpaque(true);
		panelCQ13.setBackground(Color.LIGHT_GRAY);
		panelCQ13.setLayout(new BorderLayout());
		panelCQ13.add(qLabelQ13, BorderLayout.NORTH);
		panelCQ13.add(panelInPanelCQ13, BorderLayout.CENTER);
		panelCQ13.setSize(1142, 620);
		
		answerPanelQ13 = new JPanel();
		answerPanelQ13.setOpaque(true);
		answerPanelQ13.setSize(1142, 620);
		answerPanelQ13.setLayout(new BorderLayout());
		answerPanelQ13.add(answerLabelQ13, BorderLayout.NORTH);
		answerPanelQ13.add(panelInCQ13, BorderLayout.CENTER);
		
	}
	
	public void labelsQ13() {
		qLabelQ13 = new JLabel("13. On what year Andres Bonifacio was born?");
		qLabelQ13.setFont(new Font("Book Antiqua", Font.PLAIN, 55));

		answerLabelQ13 = new JLabel();
		answerLabelQ13.setFont(new Font("ALGERIAN", Font.BOLD, 150));
		answerLabelQ13.setHorizontalAlignment(JLabel.CENTER);
		answerLabelQ13.setVerticalAlignment(JLabel.CENTER);
		
		infoLabelQ13 = new JLabel();
		infoLabelQ13.setFont(new Font("ALGERIAN", Font.BOLD, 35));
		infoLabelQ13.setVerticalAlignment(JLabel.TOP);
		infoLabelQ13.setHorizontalAlignment(JLabel.CENTER);
		
		rightAnsLabelQ13 = new JLabel("Correct Answer : ");
		rightAnsLabelQ13.setFont(new Font("ALGERIAN", Font.PLAIN, 50));
		rightAnsLabelQ13.setHorizontalAlignment(JLabel.CENTER);
		rightAnsLabelQ13.setVerticalAlignment(JLabel.BOTTOM);
		rightAnsLabelQ13.setPreferredSize(new Dimension(0, 110));
	}
	
	public void buttonsQ13() {
		button1Q13 = new JButton("a. 1863");
		button1Q13.setFocusable(false);
		button1Q13.addActionListener(ActionListenerQ13);
		button1Q13.setFont(new Font("Bookman Old Style", Font.PLAIN, 40));
		
		button2Q13 = new JButton("b. 1864");
		button2Q13.setFocusable(false);
		button2Q13.addActionListener(ActionListenerQ13);
		button2Q13.setFont(new Font("Bookman Old Style", Font.PLAIN, 40));
		
		button3Q13 = new JButton("c. 1865");
		button3Q13.setFocusable(false);
		button3Q13.addActionListener(ActionListenerQ13);
		button3Q13.setFont(new Font("Bookman Old Style", Font.PLAIN, 40));
		
		button4Q13 = new JButton("d. 1866");
		button4Q13.setFocusable(false);
		button4Q13.addActionListener(ActionListenerQ13);
		button4Q13.setFont(new Font("Bookman Old Style", Font.PLAIN, 40));
		
		nextButtonQ13 = new JButton("Next");
		nextButtonQ13.setFont(new Font("nextButton", Font.PLAIN, 30));
		nextButtonQ13.setVisible(false);
		nextButtonQ13.addActionListener(ActionListenerQ13);
	}
	
	public void layeredPaneQ13() {
		newLayeredPaneQ13 = new JLayeredPane();
		newLayeredPaneQ13.setBackground(Color.black);
		newLayeredPaneQ13.setSize(1200, 700);
		newLayeredPaneQ13.add(panelCQ13, Integer.valueOf(0));
		
	}
	
	
	
	
	
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	
	

	String[] answerQ14 = {"Congrats! You got the right answer", "c. 1897"};
	JPanel frameQ14;
	JPanel panelNQ14, panelSQ14, panelEQ14, panelWQ14, panelCQ14, panelInPanelCQ14, answerPanelQ14, panelInCQ14;
	JLabel qLabelQ14, answerLabelQ14, infoLabelQ14, rightAnsLabelQ14;
	JButton button1Q14, button2Q14, button3Q14, button4Q14, nextButtonQ14;
	JLayeredPane newLayeredPaneQ14;
	
	ImageIcon imageQ14 = new ImageIcon("Inked111.jpg");
	
	public void Q14Frame() {
		buttonsQ14();
		labelsQ14();
		panelsQ14();
		layeredPaneQ14();
		frameQ14();
	}
	
	ActionListener ActionListenerQ14 = new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == button3Q14) {
				addScore2();
				panelCQ14.setVisible(false);
				rightAnsLabelQ14.setVisible(false);
				nextButtonQ14.setVisible(true);
				infoLabelQ14.setFont(new Font("ALGERIAN", Font.BOLD, 50));
				infoLabelQ14.setVerticalAlignment(JLabel.CENTER);
				answerLabelQ14.setText(answerChecking[0]);
				infoLabelQ14.setText(answerQ14[0]);
				newLayeredPaneQ14.add(answerPanelQ14, Integer.valueOf(2));
				
			} else if(e.getSource() == button4Q14 || e.getSource() == button2Q14 || e.getSource() == button1Q14) {
				panelCQ14.setVisible(false);
				nextButtonQ14.setVisible(true);
				answerLabelQ14.setText(answerChecking[1]);
				infoLabelQ14.setText(answerQ14[1]);
				newLayeredPaneQ14.add(answerPanelQ14, Integer.valueOf(1));
				
			} else if(e.getSource() == nextButtonQ14) {
				Q15Frame();
				frame.remove(frameQ14);
				frame.add(frameQ15);
				frame.setVisible(true);
			}
		}
	};
	
	
	public void frameQ14() {
		frameQ14 = new JPanel();
		frameQ14.setLayout(new BorderLayout(11, 11));
		frameQ14.setSize(1200, 700);
		
		frameQ14.add(panelNQ14, BorderLayout.NORTH);
		frameQ14.add(panelSQ14, BorderLayout.SOUTH);
		frameQ14.add(panelEQ14, BorderLayout.EAST);
		frameQ14.add(panelWQ14, BorderLayout.WEST);
		frameQ14.add(newLayeredPaneQ14, BorderLayout.CENTER);
		
		frameQ14.setVisible(true);
	}
	
	public void panelsQ14() {
		panelNQ14 = new JPanel();
		panelNQ14.setBackground(Color.LIGHT_GRAY);
		
		panelSQ14 = new JPanel();
		panelSQ14.setBackground(Color.LIGHT_GRAY);
		panelSQ14.setLayout(new BorderLayout());
		panelSQ14.add(nextButtonQ14, BorderLayout.CENTER);
		
		panelEQ14 = new JPanel();
		panelEQ14.setBackground(Color.LIGHT_GRAY);
		
		panelWQ14 = new JPanel();
		panelWQ14.setBackground(Color.LIGHT_GRAY);
		
		panelInPanelCQ14 = new JPanel();
		panelInPanelCQ14.setLayout(new GridLayout(4, 0));
		panelInPanelCQ14.add(button1Q14);
		panelInPanelCQ14.add(button2Q14);
		panelInPanelCQ14.add(button3Q14);
		panelInPanelCQ14.add(button4Q14);
		
		panelInCQ14 = new JPanel();
		panelInCQ14.setLayout(new BorderLayout());
		panelInCQ14.add(rightAnsLabelQ14, BorderLayout.NORTH);
		panelInCQ14.add(infoLabelQ14, BorderLayout.CENTER);
		
		panelCQ14 = new JPanel();
		panelCQ14.setOpaque(true);
		panelCQ14.setBackground(Color.LIGHT_GRAY);
		panelCQ14.setLayout(new BorderLayout());
		panelCQ14.add(qLabelQ14, BorderLayout.NORTH);
		panelCQ14.add(panelInPanelCQ14, BorderLayout.CENTER);
		panelCQ14.setSize(1142, 620);
		
		answerPanelQ14 = new JPanel();
		answerPanelQ14.setOpaque(true);
		answerPanelQ14.setSize(1142, 620);
		answerPanelQ14.setLayout(new BorderLayout());
		answerPanelQ14.add(answerLabelQ14, BorderLayout.NORTH);
		answerPanelQ14.add(panelInCQ14, BorderLayout.CENTER);
		
	}
	
	public void labelsQ14() {
		qLabelQ14 = new JLabel("14. Andres Bonifacio died on year?");
		qLabelQ14.setFont(new Font("Book Antiqua", Font.PLAIN, 55));

		answerLabelQ14 = new JLabel();
		answerLabelQ14.setFont(new Font("ALGERIAN", Font.BOLD, 150));
		answerLabelQ14.setHorizontalAlignment(JLabel.CENTER);
		answerLabelQ14.setVerticalAlignment(JLabel.CENTER);
		
		infoLabelQ14 = new JLabel();
		infoLabelQ14.setFont(new Font("ALGERIAN", Font.BOLD, 35));
		infoLabelQ14.setVerticalAlignment(JLabel.TOP);
		infoLabelQ14.setHorizontalAlignment(JLabel.CENTER);
		
		rightAnsLabelQ14 = new JLabel("Correct Answer : ");
		rightAnsLabelQ14.setFont(new Font("ALGERIAN", Font.PLAIN, 50));
		rightAnsLabelQ14.setHorizontalAlignment(JLabel.CENTER);
		rightAnsLabelQ14.setVerticalAlignment(JLabel.BOTTOM);
		rightAnsLabelQ14.setPreferredSize(new Dimension(0, 110));
	}
	
	public void buttonsQ14() {
		button1Q14 = new JButton("a. 1895");
		button1Q14.setFocusable(false);
		button1Q14.addActionListener(ActionListenerQ14);
		button1Q14.setFont(new Font("Bookman Old Style", Font.PLAIN, 40));
		
		button2Q14 = new JButton("b. 1896");
		button2Q14.setFocusable(false);
		button2Q14.addActionListener(ActionListenerQ14);
		button2Q14.setFont(new Font("Bookman Old Style", Font.PLAIN, 40));
		
		button3Q14 = new JButton("c. 1897");
		button3Q14.setFocusable(false);
		button3Q14.addActionListener(ActionListenerQ14);
		button3Q14.setFont(new Font("Bookman Old Style", Font.PLAIN, 40));
		
		button4Q14 = new JButton("d. 1898");
		button4Q14.setFocusable(false);
		button4Q14.addActionListener(ActionListenerQ14);
		button4Q14.setFont(new Font("Bookman Old Style", Font.PLAIN, 40));
		
		nextButtonQ14 = new JButton("Next");
		nextButtonQ14.setFont(new Font("nextButton", Font.PLAIN, 30));
		nextButtonQ14.setVisible(false);
		nextButtonQ14.addActionListener(ActionListenerQ14);
	}
	
	public void layeredPaneQ14() {
		newLayeredPaneQ14 = new JLayeredPane();
		newLayeredPaneQ14.setBackground(Color.black);
		newLayeredPaneQ14.setSize(1200, 700);
		newLayeredPaneQ14.add(panelCQ14, Integer.valueOf(0));
		
	}
	
	
	
	
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	
	

	String[] answerQ15 = {"Congrats! You got the right answer", "a. Doña Marcela Mariño Agoncillo"};
	JPanel frameQ15;
	JPanel panelNQ15, panelSQ15, panelEQ15, panelWQ15, panelCQ15, panelInPanelCQ15, answerPanelQ15, panelInCQ15;
	JLabel qLabelQ15, answerLabelQ15, infoLabelQ15, rightAnsLabelQ15;
	JButton button1Q15, button2Q15, button3Q15, button4Q15, nextButtonQ15;
	JLayeredPane newLayeredPaneQ15;
	
	ImageIcon imageQ15 = new ImageIcon("Inked111.jpg");
	
	public void Q15Frame() {
		buttonsQ15();
		labelsQ15();
		panelsQ15();
		layeredPaneQ15();
		frameQ15();
	}
	
	ActionListener ActionListenerQ15 = new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == button1Q15) {
				addScore2();
				panelCQ15.setVisible(false);
				rightAnsLabelQ15.setVisible(false);
				nextButtonQ15.setVisible(true);
				infoLabelQ15.setFont(new Font("ALGERIAN", Font.BOLD, 50));
				infoLabelQ15.setVerticalAlignment(JLabel.CENTER);
				answerLabelQ15.setText(answerChecking[0]);
				infoLabelQ15.setText(answerQ15[0]);
				newLayeredPaneQ15.add(answerPanelQ15, Integer.valueOf(2));
				
			} else if(e.getSource() == button4Q15 || e.getSource() == button2Q15 || e.getSource() == button3Q15) {
				panelCQ15.setVisible(false);
				nextButtonQ15.setVisible(true);
				answerLabelQ15.setText(answerChecking[1]);
				infoLabelQ15.setText(answerQ15[1]);
				newLayeredPaneQ15.add(answerPanelQ15, Integer.valueOf(1));
				
			} else if(e.getSource() == nextButtonQ15) {
				Q16Frame();
				frame.remove(frameQ15);
				frame.add(frameQ16);
				frame.setVisible(true);
			}
		}
	};
	
	
	public void frameQ15() {
		frameQ15 = new JPanel();
		frameQ15.setLayout(new BorderLayout(11, 11));
		frameQ15.setSize(1200, 700);
		
		frameQ15.add(panelNQ15, BorderLayout.NORTH);
		frameQ15.add(panelSQ15, BorderLayout.SOUTH);
		frameQ15.add(panelEQ15, BorderLayout.EAST);
		frameQ15.add(panelWQ15, BorderLayout.WEST);
		frameQ15.add(newLayeredPaneQ15, BorderLayout.CENTER);
		
		frameQ15.setVisible(true);
	}
	
	public void panelsQ15() {
		panelNQ15 = new JPanel();
		panelNQ15.setBackground(Color.LIGHT_GRAY);
		
		panelSQ15 = new JPanel();
		panelSQ15.setBackground(Color.LIGHT_GRAY);
		panelSQ15.setLayout(new BorderLayout());
		panelSQ15.add(nextButtonQ15, BorderLayout.CENTER);
		
		panelEQ15 = new JPanel();
		panelEQ15.setBackground(Color.LIGHT_GRAY);
		
		panelWQ15 = new JPanel();
		panelWQ15.setBackground(Color.LIGHT_GRAY);
		
		panelInPanelCQ15 = new JPanel();
		panelInPanelCQ15.setLayout(new GridLayout(4, 0));
		panelInPanelCQ15.add(button1Q15);
		panelInPanelCQ15.add(button2Q15);
		panelInPanelCQ15.add(button3Q15);
		panelInPanelCQ15.add(button4Q15);
		
		panelInCQ15 = new JPanel();
		panelInCQ15.setLayout(new BorderLayout());
		panelInCQ15.add(rightAnsLabelQ15, BorderLayout.NORTH);
		panelInCQ15.add(infoLabelQ15, BorderLayout.CENTER);
		
		panelCQ15 = new JPanel();
		panelCQ15.setOpaque(true);
		panelCQ15.setBackground(Color.LIGHT_GRAY);
		panelCQ15.setLayout(new BorderLayout());
		panelCQ15.add(qLabelQ15, BorderLayout.NORTH);
		panelCQ15.add(panelInPanelCQ15, BorderLayout.CENTER);
		panelCQ15.setSize(1142, 620);
		
		answerPanelQ15 = new JPanel();
		answerPanelQ15.setOpaque(true);
		answerPanelQ15.setSize(1142, 620);
		answerPanelQ15.setLayout(new BorderLayout());
		answerPanelQ15.add(answerLabelQ15, BorderLayout.NORTH);
		answerPanelQ15.add(panelInCQ15, BorderLayout.CENTER);
		
	}
	
	public void labelsQ15() {
		qLabelQ15 = new JLabel("15. What is Marcella Agoncillo's fullname?");
		qLabelQ15.setFont(new Font("Book Antiqua", Font.PLAIN, 55));

		answerLabelQ15 = new JLabel();
		answerLabelQ15.setFont(new Font("ALGERIAN", Font.BOLD, 150));
		answerLabelQ15.setHorizontalAlignment(JLabel.CENTER);
		answerLabelQ15.setVerticalAlignment(JLabel.CENTER);
		
		infoLabelQ15 = new JLabel();
		infoLabelQ15.setFont(new Font("ALGERIAN", Font.BOLD, 35));
		infoLabelQ15.setVerticalAlignment(JLabel.TOP);
		infoLabelQ15.setHorizontalAlignment(JLabel.CENTER);
		
		rightAnsLabelQ15 = new JLabel("Correct Answer : ");
		rightAnsLabelQ15.setFont(new Font("ALGERIAN", Font.PLAIN, 50));
		rightAnsLabelQ15.setHorizontalAlignment(JLabel.CENTER);
		rightAnsLabelQ15.setVerticalAlignment(JLabel.BOTTOM);
		rightAnsLabelQ15.setPreferredSize(new Dimension(0, 110));
	}
	
	public void buttonsQ15() {
		button1Q15 = new JButton("a. Doña Marcela Mariño Agoncillo");
		button1Q15.setFocusable(false);
		button1Q15.addActionListener(ActionListenerQ15);
		button1Q15.setFont(new Font("Bookman Old Style", Font.PLAIN, 40));
		
		button2Q15 = new JButton("b. Marcela Mariño Agoncillo");
		button2Q15.setFocusable(false);
		button2Q15.addActionListener(ActionListenerQ15);
		button2Q15.setFont(new Font("Bookman Old Style", Font.PLAIN, 40));
		
		button3Q15 = new JButton("c. Doña Marcela Agoncillo Mariño ");
		button3Q15.setFocusable(false);
		button3Q15.addActionListener(ActionListenerQ15);
		button3Q15.setFont(new Font("Bookman Old Style", Font.PLAIN, 40));
		
		button4Q15 = new JButton("d. Doña Marcela Mariño y Agoncillo");
		button4Q15.setFocusable(false);
		button4Q15.addActionListener(ActionListenerQ15);
		button4Q15.setFont(new Font("Bookman Old Style", Font.PLAIN, 40));
		
		nextButtonQ15 = new JButton("Next");
		nextButtonQ15.setFont(new Font("nextButton", Font.PLAIN, 30));
		nextButtonQ15.setVisible(false);
		nextButtonQ15.addActionListener(ActionListenerQ15);
	}
	
	public void layeredPaneQ15() {
		newLayeredPaneQ15 = new JLayeredPane();
		newLayeredPaneQ15.setBackground(Color.black);
		newLayeredPaneQ15.setSize(1200, 700);
		newLayeredPaneQ15.add(panelCQ15, Integer.valueOf(0));
		
	}
	
	
	
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	
	

	String[] answerQ16 = {"Congrats! You got the right answer", "b. Marcela Agoncillo"};
	JPanel frameQ16;
	JPanel panelNQ16, panelSQ16, panelEQ16, panelWQ16, panelCQ16, panelInPanelCQ16, answerPanelQ16, panelInCQ16;
	JLabel qLabelQ16, answerLabelQ16, infoLabelQ16, rightAnsLabelQ16;
	JButton button1Q16, button2Q16, button3Q16, button4Q16, nextButtonQ16;
	JLayeredPane newLayeredPaneQ16;
	
	ImageIcon imageQ16 = new ImageIcon("Inked111.jpg");
	
	public void Q16Frame() {
		buttonsQ16();
		labelsQ16();
		panelsQ16();
		layeredPaneQ16();
		frameQ16();
	}
	
	ActionListener ActionListenerQ16 = new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == button2Q16) {
				addScore2();
				panelCQ16.setVisible(false);
				rightAnsLabelQ16.setVisible(false);
				nextButtonQ16.setVisible(true);
				infoLabelQ16.setFont(new Font("ALGERIAN", Font.BOLD, 50));
				infoLabelQ16.setVerticalAlignment(JLabel.CENTER);
				answerLabelQ16.setText(answerChecking[0]);
				infoLabelQ16.setText(answerQ16[0]);
				newLayeredPaneQ16.add(answerPanelQ16, Integer.valueOf(2));
				
			} else if(e.getSource() == button4Q16 || e.getSource() == button1Q16 || e.getSource() == button3Q16) {
				panelCQ16.setVisible(false);
				nextButtonQ16.setVisible(true);
				answerLabelQ16.setText(answerChecking[1]);
				infoLabelQ16.setText(answerQ16[1]);
				newLayeredPaneQ16.add(answerPanelQ16, Integer.valueOf(1));
				
			} else if(e.getSource() == nextButtonQ16) {
				Q17Frame();
				frame.remove(frameQ16);
				frame.add(frameQ17);
				frame.setVisible(true);
			}
		}
	};
	
	
	public void frameQ16() {
		frameQ16 = new JPanel();
		frameQ16.setLayout(new BorderLayout(11, 11));
		frameQ16.setSize(1200, 700);
		
		frameQ16.add(panelNQ16, BorderLayout.NORTH);
		frameQ16.add(panelSQ16, BorderLayout.SOUTH);
		frameQ16.add(panelEQ16, BorderLayout.EAST);
		frameQ16.add(panelWQ16, BorderLayout.WEST);
		frameQ16.add(newLayeredPaneQ16, BorderLayout.CENTER);
		
		frameQ16.setVisible(true);
	}
	
	public void panelsQ16() {
		panelNQ16 = new JPanel();
		panelNQ16.setBackground(Color.LIGHT_GRAY);
		
		panelSQ16 = new JPanel();
		panelSQ16.setBackground(Color.LIGHT_GRAY);
		panelSQ16.setLayout(new BorderLayout());
		panelSQ16.add(nextButtonQ16, BorderLayout.CENTER);
		
		panelEQ16 = new JPanel();
		panelEQ16.setBackground(Color.LIGHT_GRAY);
		
		panelWQ16 = new JPanel();
		panelWQ16.setBackground(Color.LIGHT_GRAY);
		
		panelInPanelCQ16 = new JPanel();
		panelInPanelCQ16.setLayout(new GridLayout(4, 0));
		panelInPanelCQ16.add(button1Q16);
		panelInPanelCQ16.add(button2Q16);
		panelInPanelCQ16.add(button3Q16);
		panelInPanelCQ16.add(button4Q16);
		
		panelInCQ16 = new JPanel();
		panelInCQ16.setLayout(new BorderLayout());
		panelInCQ16.add(rightAnsLabelQ16, BorderLayout.NORTH);
		panelInCQ16.add(infoLabelQ16, BorderLayout.CENTER);
		
		panelCQ16 = new JPanel();
		panelCQ16.setOpaque(true);
		panelCQ16.setBackground(Color.LIGHT_GRAY);
		panelCQ16.setLayout(new BorderLayout());
		panelCQ16.add(qLabelQ16, BorderLayout.NORTH);
		panelCQ16.add(panelInPanelCQ16, BorderLayout.CENTER);
		panelCQ16.setSize(1142, 620);
		
		answerPanelQ16 = new JPanel();
		answerPanelQ16.setOpaque(true);
		answerPanelQ16.setSize(1142, 620);
		answerPanelQ16.setLayout(new BorderLayout());
		answerPanelQ16.add(answerLabelQ16, BorderLayout.NORTH);
		answerPanelQ16.add(panelInCQ16, BorderLayout.CENTER);
		
	}
	
	public void labelsQ16() {
		qLabelQ16 = new JLabel("16. She in Known as the Mother of the Philippine Flag.");
		qLabelQ16.setFont(new Font("Book Antiqua", Font.PLAIN, 55));

		answerLabelQ16 = new JLabel();
		answerLabelQ16.setFont(new Font("ALGERIAN", Font.BOLD, 150));
		answerLabelQ16.setHorizontalAlignment(JLabel.CENTER);
		answerLabelQ16.setVerticalAlignment(JLabel.CENTER);
		
		infoLabelQ16 = new JLabel();
		infoLabelQ16.setFont(new Font("ALGERIAN", Font.BOLD, 35));
		infoLabelQ16.setVerticalAlignment(JLabel.TOP);
		infoLabelQ16.setHorizontalAlignment(JLabel.CENTER);
		
		rightAnsLabelQ16 = new JLabel("Correct Answer : ");
		rightAnsLabelQ16.setFont(new Font("ALGERIAN", Font.PLAIN, 50));
		rightAnsLabelQ16.setHorizontalAlignment(JLabel.CENTER);
		rightAnsLabelQ16.setVerticalAlignment(JLabel.BOTTOM);
		rightAnsLabelQ16.setPreferredSize(new Dimension(0, 110));
	}
	
	public void buttonsQ16() {

		button1Q16 = new JButton("a. Marcela del Pilar");
		button1Q16.setFocusable(false);
		button1Q16.addActionListener(ActionListenerQ16);
		button1Q16.setFont(new Font("Bookman Old Style", Font.PLAIN, 40));
		
		button2Q16 = new JButton("b. Marcela Agoncillo");
		button2Q16.setFocusable(false);
		button2Q16.addActionListener(ActionListenerQ16);
		button2Q16.setFont(new Font("Bookman Old Style", Font.PLAIN, 40));
		
		button3Q16 = new JButton("c. Marcella Mabini ");
		button3Q16.setFocusable(false);
		button3Q16.addActionListener(ActionListenerQ16);
		button3Q16.setFont(new Font("Bookman Old Style", Font.PLAIN, 40));
		
		button4Q16 = new JButton("d. Tandang Sora ");
		button4Q16.setFocusable(false);
		button4Q16.addActionListener(ActionListenerQ16);
		button4Q16.setFont(new Font("Bookman Old Style", Font.PLAIN, 40));
		
		nextButtonQ16 = new JButton("Next");
		nextButtonQ16.setFont(new Font("nextButton", Font.PLAIN, 30));
		nextButtonQ16.setVisible(false);
		nextButtonQ16.addActionListener(ActionListenerQ16);
	}
	
	public void layeredPaneQ16() {
		newLayeredPaneQ16 = new JLayeredPane();
		newLayeredPaneQ16.setBackground(Color.black);
		newLayeredPaneQ16.setSize(1200, 700);
		newLayeredPaneQ16.add(panelCQ16, Integer.valueOf(0));
		
	}
	
	
	
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	
	

	String[] answerQ17 = {"Congrats! You got the right answer", "a. May 1898"};
	JPanel frameQ17;
	JPanel panelNQ17, panelSQ17, panelEQ17, panelWQ17, panelCQ17, panelInPanelCQ17, answerPanelQ17, panelInCQ17;
	JLabel qLabelQ17, answerLabelQ17, infoLabelQ17, rightAnsLabelQ17;
	JButton button1Q17, button2Q17, button3Q17, button4Q17, nextButtonQ17;
	JLayeredPane newLayeredPaneQ17;
	
	ImageIcon imageQ17 = new ImageIcon("Inked111.jpg");
	
	public void Q17Frame() {
		buttonsQ17();
		labelsQ17();
		panelsQ17();
		layeredPaneQ17();
		frameQ17();
	}
	
	ActionListener ActionListenerQ17 = new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == button1Q17) {
				addScore2();
				panelCQ17.setVisible(false);
				rightAnsLabelQ17.setVisible(false);
				nextButtonQ17.setVisible(true);
				infoLabelQ17.setFont(new Font("ALGERIAN", Font.BOLD, 50));
				infoLabelQ17.setVerticalAlignment(JLabel.CENTER);
				answerLabelQ17.setText(answerChecking[0]);
				infoLabelQ17.setText(answerQ17[0]);
				newLayeredPaneQ17.add(answerPanelQ17, Integer.valueOf(2));
				
			} else if(e.getSource() == button4Q17 || e.getSource() == button2Q17 || e.getSource() == button3Q17) {
				panelCQ17.setVisible(false);
				nextButtonQ17.setVisible(true);
				answerLabelQ17.setText(answerChecking[1]);
				infoLabelQ17.setText(answerQ17[1]);
				newLayeredPaneQ17.add(answerPanelQ17, Integer.valueOf(1));
				
			} else if(e.getSource() == nextButtonQ17) {
				Q18Frame();
				frame.remove(frameQ17);
				frame.add(frameQ18);
				frame.setVisible(true);
			}
		}
	};
	
	
	public void frameQ17() {
		frameQ17 = new JPanel();
		frameQ17.setLayout(new BorderLayout(11, 11));
		frameQ17.setSize(1200, 700);
		
		frameQ17.add(panelNQ17, BorderLayout.NORTH);
		frameQ17.add(panelSQ17, BorderLayout.SOUTH);
		frameQ17.add(panelEQ17, BorderLayout.EAST);
		frameQ17.add(panelWQ17, BorderLayout.WEST);
		frameQ17.add(newLayeredPaneQ17, BorderLayout.CENTER);
		
		frameQ17.setVisible(true);
	}
	
	public void panelsQ17() {
		panelNQ17 = new JPanel();
		panelNQ17.setBackground(Color.LIGHT_GRAY);
		
		panelSQ17 = new JPanel();
		panelSQ17.setBackground(Color.LIGHT_GRAY);
		panelSQ17.setLayout(new BorderLayout());
		panelSQ17.add(nextButtonQ17, BorderLayout.CENTER);
		
		panelEQ17 = new JPanel();
		panelEQ17.setBackground(Color.LIGHT_GRAY);
		
		panelWQ17 = new JPanel();
		panelWQ17.setBackground(Color.LIGHT_GRAY);
		
		panelInPanelCQ17 = new JPanel();
		panelInPanelCQ17.setLayout(new GridLayout(4, 0));
		panelInPanelCQ17.add(button1Q17);
		panelInPanelCQ17.add(button2Q17);
		panelInPanelCQ17.add(button3Q17);
		panelInPanelCQ17.add(button4Q17);
		
		panelInCQ17 = new JPanel();
		panelInCQ17.setLayout(new BorderLayout());
		panelInCQ17.add(rightAnsLabelQ17, BorderLayout.NORTH);
		panelInCQ17.add(infoLabelQ17, BorderLayout.CENTER);
		
		panelCQ17 = new JPanel();
		panelCQ17.setOpaque(true);
		panelCQ17.setBackground(Color.LIGHT_GRAY);
		panelCQ17.setLayout(new BorderLayout());
		panelCQ17.add(qLabelQ17, BorderLayout.NORTH);
		panelCQ17.add(panelInPanelCQ17, BorderLayout.CENTER);
		panelCQ17.setSize(1142, 620);
		
		answerPanelQ17 = new JPanel();
		answerPanelQ17.setOpaque(true);
		answerPanelQ17.setSize(1142, 620);
		answerPanelQ17.setLayout(new BorderLayout());
		answerPanelQ17.add(answerLabelQ17, BorderLayout.NORTH);
		answerPanelQ17.add(panelInCQ17, BorderLayout.CENTER);
		
	}
	
	public void labelsQ17() {
		qLabelQ17 = new JLabel("17. The first Philippine flag was sewn on what month and year?");
		qLabelQ17.setFont(new Font("Book Antiqua", Font.PLAIN, 55));

		answerLabelQ17 = new JLabel();
		answerLabelQ17.setFont(new Font("ALGERIAN", Font.BOLD, 150));
		answerLabelQ17.setHorizontalAlignment(JLabel.CENTER);
		answerLabelQ17.setVerticalAlignment(JLabel.CENTER);
		
		infoLabelQ17 = new JLabel();
		infoLabelQ17.setFont(new Font("ALGERIAN", Font.BOLD, 35));
		infoLabelQ17.setVerticalAlignment(JLabel.TOP);
		infoLabelQ17.setHorizontalAlignment(JLabel.CENTER);
		
		rightAnsLabelQ17 = new JLabel("Correct Answer : ");
		rightAnsLabelQ17.setFont(new Font("ALGERIAN", Font.PLAIN, 50));
		rightAnsLabelQ17.setHorizontalAlignment(JLabel.CENTER);
		rightAnsLabelQ17.setVerticalAlignment(JLabel.BOTTOM);
		rightAnsLabelQ17.setPreferredSize(new Dimension(0, 110));
	}
	
	public void buttonsQ17() {

		button1Q17 = new JButton("a. May 1898");
		button1Q17.setFocusable(false);
		button1Q17.addActionListener(ActionListenerQ17);
		button1Q17.setFont(new Font("Bookman Old Style", Font.PLAIN, 40));
		
		button2Q17 = new JButton("b. March 1898");
		button2Q17.setFocusable(false);
		button2Q17.addActionListener(ActionListenerQ17);
		button2Q17.setFont(new Font("Bookman Old Style", Font.PLAIN, 40));
		
		button3Q17 = new JButton("c. May 1997");
		button3Q17.setFocusable(false);
		button3Q17.addActionListener(ActionListenerQ17);
		button3Q17.setFont(new Font("Bookman Old Style", Font.PLAIN, 40));
		
		button4Q17 = new JButton("d. March 1997");
		button4Q17.setFocusable(false);
		button4Q17.addActionListener(ActionListenerQ17);
		button4Q17.setFont(new Font("Bookman Old Style", Font.PLAIN, 40));
		
		nextButtonQ17 = new JButton("Next");
		nextButtonQ17.setFont(new Font("nextButton", Font.PLAIN, 30));
		nextButtonQ17.setVisible(false);
		nextButtonQ17.addActionListener(ActionListenerQ17);
	}
	
	public void layeredPaneQ17() {
		newLayeredPaneQ17 = new JLayeredPane();
		newLayeredPaneQ17.setBackground(Color.black);
		newLayeredPaneQ17.setSize(1200, 700);
		newLayeredPaneQ17.add(panelCQ17, Integer.valueOf(0));
		
	}
	
	
	
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	
	

	String[] answerQ18 = {"Congrats! You got the right answer", "c. Marcela Agoncillo"};
	JPanel frameQ18;
	JPanel panelNQ18, panelSQ18, panelEQ18, panelWQ18, panelCQ18, panelInPanelCQ18, answerPanelQ18, panelInCQ18;
	JLabel qLabelQ18, answerLabelQ18, infoLabelQ18, rightAnsLabelQ18;
	JButton button1Q18, button2Q18, button3Q18, button4Q18, nextButtonQ18;
	JLayeredPane newLayeredPaneQ18;
	
	ImageIcon imageQ18 = new ImageIcon("Inked111.jpg");
	
	public void Q18Frame() {
		buttonsQ18();
		labelsQ18();
		panelsQ18();
		layeredPaneQ18();
		frameQ18();
	}
	
	ActionListener ActionListenerQ18 = new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == button3Q18) {
				addScore2();
				panelCQ18.setVisible(false);
				rightAnsLabelQ18.setVisible(false);
				nextButtonQ18.setVisible(true);
				infoLabelQ18.setFont(new Font("ALGERIAN", Font.BOLD, 50));
				infoLabelQ18.setVerticalAlignment(JLabel.CENTER);
				answerLabelQ18.setText(answerChecking[0]);
				infoLabelQ18.setText(answerQ18[0]);
				newLayeredPaneQ18.add(answerPanelQ18, Integer.valueOf(2));
				
			} else if(e.getSource() == button4Q18 || e.getSource() == button2Q18 || e.getSource() == button1Q18) {
				panelCQ18.setVisible(false);
				nextButtonQ18.setVisible(true);
				answerLabelQ18.setText(answerChecking[1]);
				infoLabelQ18.setText(answerQ18[1]);
				newLayeredPaneQ18.add(answerPanelQ18, Integer.valueOf(1));
				
			} else if(e.getSource() == nextButtonQ18) {
				Q19Frame();
				frame.remove(frameQ18);
				frame.add(frameQ19);
				frame.setVisible(true);
			}
		}
	};
	
	
	public void frameQ18() {
		frameQ18 = new JPanel();
		frameQ18.setLayout(new BorderLayout(11, 11));
		frameQ18.setSize(1200, 700);
		
		frameQ18.add(panelNQ18, BorderLayout.NORTH);
		frameQ18.add(panelSQ18, BorderLayout.SOUTH);
		frameQ18.add(panelEQ18, BorderLayout.EAST);
		frameQ18.add(panelWQ18, BorderLayout.WEST);
		frameQ18.add(newLayeredPaneQ18, BorderLayout.CENTER);
		
		frameQ18.setVisible(true);
	}
	
	public void panelsQ18() {
		panelNQ18 = new JPanel();
		panelNQ18.setBackground(Color.LIGHT_GRAY);
		
		panelSQ18 = new JPanel();
		panelSQ18.setBackground(Color.LIGHT_GRAY);
		panelSQ18.setLayout(new BorderLayout());
		panelSQ18.add(nextButtonQ18, BorderLayout.CENTER);
		
		panelEQ18 = new JPanel();
		panelEQ18.setBackground(Color.LIGHT_GRAY);
		
		panelWQ18 = new JPanel();
		panelWQ18.setBackground(Color.LIGHT_GRAY);
		
		panelInPanelCQ18 = new JPanel();
		panelInPanelCQ18.setLayout(new GridLayout(4, 0));
		panelInPanelCQ18.add(button1Q18);
		panelInPanelCQ18.add(button2Q18);
		panelInPanelCQ18.add(button3Q18);
		panelInPanelCQ18.add(button4Q18);
		
		panelInCQ18 = new JPanel();
		panelInCQ18.setLayout(new BorderLayout());
		panelInCQ18.add(rightAnsLabelQ18, BorderLayout.NORTH);
		panelInCQ18.add(infoLabelQ18, BorderLayout.CENTER);
		
		panelCQ18 = new JPanel();
		panelCQ18.setOpaque(true);
		panelCQ18.setBackground(Color.LIGHT_GRAY);
		panelCQ18.setLayout(new BorderLayout());
		panelCQ18.add(qLabelQ18, BorderLayout.NORTH);
		panelCQ18.add(panelInPanelCQ18, BorderLayout.CENTER);
		panelCQ18.setSize(1142, 620);
		
		answerPanelQ18 = new JPanel();
		answerPanelQ18.setOpaque(true);
		answerPanelQ18.setSize(1142, 620);
		answerPanelQ18.setLayout(new BorderLayout());
		answerPanelQ18.add(answerLabelQ18, BorderLayout.NORTH);
		answerPanelQ18.add(panelInCQ18, BorderLayout.CENTER);
		
	}
	
	public void labelsQ18() {
		qLabelQ18 = new JLabel("18. She is known also as Lola Celay.");
		qLabelQ18.setFont(new Font("Book Antiqua", Font.PLAIN, 55));

		answerLabelQ18 = new JLabel();
		answerLabelQ18.setFont(new Font("ALGERIAN", Font.BOLD, 150));
		answerLabelQ18.setHorizontalAlignment(JLabel.CENTER);
		answerLabelQ18.setVerticalAlignment(JLabel.CENTER);
		
		infoLabelQ18 = new JLabel();
		infoLabelQ18.setFont(new Font("ALGERIAN", Font.BOLD, 35));
		infoLabelQ18.setVerticalAlignment(JLabel.TOP);
		infoLabelQ18.setHorizontalAlignment(JLabel.CENTER);
		
		rightAnsLabelQ18 = new JLabel("Correct Answer : ");
		rightAnsLabelQ18.setFont(new Font("ALGERIAN", Font.PLAIN, 50));
		rightAnsLabelQ18.setHorizontalAlignment(JLabel.CENTER);
		rightAnsLabelQ18.setVerticalAlignment(JLabel.BOTTOM);
		rightAnsLabelQ18.setPreferredSize(new Dimension(0, 110));
	}
	
	public void buttonsQ18() {

		button1Q18 = new JButton("a. Marcela del Pilar");
		button1Q18.setFocusable(false);
		button1Q18.addActionListener(ActionListenerQ18);
		button1Q18.setFont(new Font("Bookman Old Style", Font.PLAIN, 40));
		
		button2Q18 = new JButton("b. Melchora Aquino");
		button2Q18.setFocusable(false);
		button2Q18.addActionListener(ActionListenerQ18);
		button2Q18.setFont(new Font("Bookman Old Style", Font.PLAIN, 40));
		
		button3Q18 = new JButton("c. Marcela Agoncillo");
		button3Q18.setFocusable(false);
		button3Q18.addActionListener(ActionListenerQ18);
		button3Q18.setFont(new Font("Bookman Old Style", Font.PLAIN, 40));
		
		button4Q18 = new JButton("d. Tandang Sora");
		button4Q18.setFocusable(false);
		button4Q18.addActionListener(ActionListenerQ18);
		button4Q18.setFont(new Font("Bookman Old Style", Font.PLAIN, 40));
		
		nextButtonQ18 = new JButton("Next");
		nextButtonQ18.setFont(new Font("nextButton", Font.PLAIN, 30));
		nextButtonQ18.setVisible(false);
		nextButtonQ18.addActionListener(ActionListenerQ18);
	}
	
	public void layeredPaneQ18() {
		newLayeredPaneQ18 = new JLayeredPane();
		newLayeredPaneQ18.setBackground(Color.black);
		newLayeredPaneQ18.setSize(1200, 700);
		newLayeredPaneQ18.add(panelCQ18, Integer.valueOf(0));
		
	}
	
	
	
	
	
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	
	

	String[] answerQ19 = {"Congrats! You got the right answer", "d. Apolinario Mabini"};
	JPanel frameQ19;
	JPanel panelNQ19, panelSQ19, panelEQ19, panelWQ19, panelCQ19, panelInPanelCQ19, answerPanelQ19, panelInCQ19;
	JLabel qLabelQ19, answerLabelQ19, infoLabelQ19, rightAnsLabelQ19;
	JButton button1Q19, button2Q19, button3Q19, button4Q19, nextButtonQ19;
	JLayeredPane newLayeredPaneQ19;
	
	ImageIcon imageQ19 = new ImageIcon("Inked111.jpg");
	
	public void Q19Frame() {
		buttonsQ19();
		labelsQ19();
		panelsQ19();
		layeredPaneQ19();
		frameQ19();
	}
	
	ActionListener ActionListenerQ19 = new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == button4Q19) {
				addScore2();
				panelCQ19.setVisible(false);
				rightAnsLabelQ19.setVisible(false);
				nextButtonQ19.setVisible(true);
				infoLabelQ19.setFont(new Font("ALGERIAN", Font.BOLD, 50));
				infoLabelQ19.setVerticalAlignment(JLabel.CENTER);
				answerLabelQ19.setText(answerChecking[0]);
				infoLabelQ19.setText(answerQ19[0]);
				newLayeredPaneQ19.add(answerPanelQ19, Integer.valueOf(2));
				
			} else if(e.getSource() == button3Q19 || e.getSource() == button2Q19 || e.getSource() == button1Q19) {
				panelCQ19.setVisible(false);
				nextButtonQ19.setVisible(true);
				answerLabelQ19.setText(answerChecking[1]);
				infoLabelQ19.setText(answerQ19[1]);
				newLayeredPaneQ19.add(answerPanelQ19, Integer.valueOf(1));
				
			} else if(e.getSource() == nextButtonQ19) {
				Q20Frame();
				frame.remove(frameQ19);
				frame.add(frameQ20);
				frame.setVisible(true);
			}
		}
	};
	
	
	public void frameQ19() {
		frameQ19 = new JPanel();
		frameQ19.setLayout(new BorderLayout(11, 11));
		frameQ19.setSize(1200, 700);
		
		frameQ19.add(panelNQ19, BorderLayout.NORTH);
		frameQ19.add(panelSQ19, BorderLayout.SOUTH);
		frameQ19.add(panelEQ19, BorderLayout.EAST);
		frameQ19.add(panelWQ19, BorderLayout.WEST);
		frameQ19.add(newLayeredPaneQ19, BorderLayout.CENTER);
		
		frameQ19.setVisible(true);
	}
	
	public void panelsQ19() {
		panelNQ19 = new JPanel();
		panelNQ19.setBackground(Color.LIGHT_GRAY);
		
		panelSQ19 = new JPanel();
		panelSQ19.setBackground(Color.LIGHT_GRAY);
		panelSQ19.setLayout(new BorderLayout());
		panelSQ19.add(nextButtonQ19, BorderLayout.CENTER);
		
		panelEQ19 = new JPanel();
		panelEQ19.setBackground(Color.LIGHT_GRAY);
		
		panelWQ19 = new JPanel();
		panelWQ19.setBackground(Color.LIGHT_GRAY);
		
		panelInPanelCQ19 = new JPanel();
		panelInPanelCQ19.setLayout(new GridLayout(4, 0));
		panelInPanelCQ19.add(button1Q19);
		panelInPanelCQ19.add(button2Q19);
		panelInPanelCQ19.add(button3Q19);
		panelInPanelCQ19.add(button4Q19);
		
		panelInCQ19 = new JPanel();
		panelInCQ19.setLayout(new BorderLayout());
		panelInCQ19.add(rightAnsLabelQ19, BorderLayout.NORTH);
		panelInCQ19.add(infoLabelQ19, BorderLayout.CENTER);
		
		panelCQ19 = new JPanel();
		panelCQ19.setOpaque(true);
		panelCQ19.setBackground(Color.LIGHT_GRAY);
		panelCQ19.setLayout(new BorderLayout());
		panelCQ19.add(qLabelQ19, BorderLayout.NORTH);
		panelCQ19.add(panelInPanelCQ19, BorderLayout.CENTER);
		panelCQ19.setSize(1142, 620);
		
		answerPanelQ19 = new JPanel();
		answerPanelQ19.setOpaque(true);
		answerPanelQ19.setSize(1142, 620);
		answerPanelQ19.setLayout(new BorderLayout());
		answerPanelQ19.add(answerLabelQ19, BorderLayout.NORTH);
		answerPanelQ19.add(panelInCQ19, BorderLayout.CENTER);
		
	}
	
	public void labelsQ19() {
		qLabelQ19 = new JLabel("19. The Philippines first minister is?");
		qLabelQ19.setFont(new Font("Book Antiqua", Font.PLAIN, 55));

		answerLabelQ19 = new JLabel();
		answerLabelQ19.setFont(new Font("ALGERIAN", Font.BOLD, 150));
		answerLabelQ19.setHorizontalAlignment(JLabel.CENTER);
		answerLabelQ19.setVerticalAlignment(JLabel.CENTER);
		
		infoLabelQ19 = new JLabel();
		infoLabelQ19.setFont(new Font("ALGERIAN", Font.BOLD, 35));
		infoLabelQ19.setVerticalAlignment(JLabel.TOP);
		infoLabelQ19.setHorizontalAlignment(JLabel.CENTER);
		
		rightAnsLabelQ19 = new JLabel("Correct Answer : ");
		rightAnsLabelQ19.setFont(new Font("ALGERIAN", Font.PLAIN, 50));
		rightAnsLabelQ19.setHorizontalAlignment(JLabel.CENTER);
		rightAnsLabelQ19.setVerticalAlignment(JLabel.BOTTOM);
		rightAnsLabelQ19.setPreferredSize(new Dimension(0, 110));
	}
	
	public void buttonsQ19() {

		button1Q19 = new JButton("a. Genral Luna");
		button1Q19.setFocusable(false);
		button1Q19.addActionListener(ActionListenerQ19);
		button1Q19.setFont(new Font("Bookman Old Style", Font.PLAIN, 40));
		
		button2Q19 = new JButton("b. Andres Bonifacio");
		button2Q19.setFocusable(false);
		button2Q19.addActionListener(ActionListenerQ19);
		button2Q19.setFont(new Font("Bookman Old Style", Font.PLAIN, 40));
		
		button3Q19 = new JButton("c. Dr. Jose Rizal ");
		button3Q19.setFocusable(false);
		button3Q19.addActionListener(ActionListenerQ19);
		button3Q19.setFont(new Font("Bookman Old Style", Font.PLAIN, 40));
		
		button4Q19 = new JButton("d. Apolinario Mabini");
		button4Q19.setFocusable(false);
		button4Q19.addActionListener(ActionListenerQ19);
		button4Q19.setFont(new Font("Bookman Old Style", Font.PLAIN, 40));
		
		nextButtonQ19 = new JButton("Next");
		nextButtonQ19.setFont(new Font("nextButton", Font.PLAIN, 30));
		nextButtonQ19.setVisible(false);
		nextButtonQ19.addActionListener(ActionListenerQ19);
	}
	
	public void layeredPaneQ19() {
		newLayeredPaneQ19 = new JLayeredPane();
		newLayeredPaneQ19.setBackground(Color.black);
		newLayeredPaneQ19.setSize(1200, 700);
		newLayeredPaneQ19.add(panelCQ19, Integer.valueOf(0));
		
	}
	
	
	
	
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	
	

	String[] answerQ20 = {"Congrats! You got the right answer", "d. Apolinario Mabini"};
	JPanel frameQ20;
	JPanel panelNQ20, panelSQ20, panelEQ20, panelWQ20, panelCQ20, panelInPanelCQ20, answerPanelQ20, panelInCQ20;
	JLabel qLabelQ20, answerLabelQ20, infoLabelQ20, rightAnsLabelQ20;
	JButton button1Q20, button2Q20, button3Q20, button4Q20, nextButtonQ20;
	JLayeredPane newLayeredPaneQ20;
	
	ImageIcon imageQ20 = new ImageIcon("Inked111.jpg");
	
	public void Q20Frame() {
		buttonsQ20();
		labelsQ20();
		panelsQ20();
		layeredPaneQ20();
		frameQ20();
	}
	
	ActionListener ActionListenerQ20 = new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == button4Q20) {
				addScore2();
				panelCQ20.setVisible(false);
				rightAnsLabelQ20.setVisible(false);
				nextButtonQ20.setVisible(true);
				infoLabelQ20.setFont(new Font("ALGERIAN", Font.BOLD, 50));
				infoLabelQ20.setVerticalAlignment(JLabel.CENTER);
				answerLabelQ20.setText(answerChecking[0]);
				infoLabelQ20.setText(answerQ20[0]);
				newLayeredPaneQ20.add(answerPanelQ20, Integer.valueOf(2));
				
			} else if(e.getSource() == button3Q20 || e.getSource() == button2Q20 || e.getSource() == button1Q20) {
				panelCQ20.setVisible(false);
				nextButtonQ20.setVisible(true);
				answerLabelQ20.setText(answerChecking[1]);
				infoLabelQ20.setText(answerQ20[1]);
				newLayeredPaneQ20.add(answerPanelQ20, Integer.valueOf(1));
				
			} else if(e.getSource() == nextButtonQ20) {
				Q21Frame();
				frame.remove(frameQ20);
				frame.add(frameQ21);
				frame.setVisible(true);
			}
		}
	};
	
	
	public void frameQ20() {
		frameQ20 = new JPanel();
		frameQ20.setLayout(new BorderLayout(11, 11));
		frameQ20.setSize(1200, 700);
		
		frameQ20.add(panelNQ20, BorderLayout.NORTH);
		frameQ20.add(panelSQ20, BorderLayout.SOUTH);
		frameQ20.add(panelEQ20, BorderLayout.EAST);
		frameQ20.add(panelWQ20, BorderLayout.WEST);
		frameQ20.add(newLayeredPaneQ20, BorderLayout.CENTER);
		
		frameQ20.setVisible(true);
	}
	
	public void panelsQ20() {
		panelNQ20 = new JPanel();
		panelNQ20.setBackground(Color.LIGHT_GRAY);
		
		panelSQ20 = new JPanel();
		panelSQ20.setBackground(Color.LIGHT_GRAY);
		panelSQ20.setLayout(new BorderLayout());
		panelSQ20.add(nextButtonQ20, BorderLayout.CENTER);
		
		panelEQ20 = new JPanel();
		panelEQ20.setBackground(Color.LIGHT_GRAY);
		
		panelWQ20 = new JPanel();
		panelWQ20.setBackground(Color.LIGHT_GRAY);
		
		panelInPanelCQ20 = new JPanel();
		panelInPanelCQ20.setLayout(new GridLayout(4, 0));
		panelInPanelCQ20.add(button1Q20);
		panelInPanelCQ20.add(button2Q20);
		panelInPanelCQ20.add(button3Q20);
		panelInPanelCQ20.add(button4Q20);
		
		panelInCQ20 = new JPanel();
		panelInCQ20.setLayout(new BorderLayout());
		panelInCQ20.add(rightAnsLabelQ20, BorderLayout.NORTH);
		panelInCQ20.add(infoLabelQ20, BorderLayout.CENTER);
		
		panelCQ20 = new JPanel();
		panelCQ20.setOpaque(true);
		panelCQ20.setBackground(Color.LIGHT_GRAY);
		panelCQ20.setLayout(new BorderLayout());
		panelCQ20.add(qLabelQ20, BorderLayout.NORTH);
		panelCQ20.add(panelInPanelCQ20, BorderLayout.CENTER);
		panelCQ20.setSize(1142, 620);
		
		answerPanelQ20 = new JPanel();
		answerPanelQ20.setOpaque(true);
		answerPanelQ20.setSize(1142, 620);
		answerPanelQ20.setLayout(new BorderLayout());
		answerPanelQ20.add(answerLabelQ20, BorderLayout.NORTH);
		answerPanelQ20.add(panelInCQ20, BorderLayout.CENTER);
		
	}
	
	public void labelsQ20() {
		qLabelQ20 = new JLabel("20. He is known as the Brain Revolution");
		qLabelQ20.setFont(new Font("Book Antiqua", Font.PLAIN, 55));

		answerLabelQ20 = new JLabel();
		answerLabelQ20.setFont(new Font("ALGERIAN", Font.BOLD, 150));
		answerLabelQ20.setHorizontalAlignment(JLabel.CENTER);
		answerLabelQ20.setVerticalAlignment(JLabel.CENTER);
		
		infoLabelQ20 = new JLabel();
		infoLabelQ20.setFont(new Font("ALGERIAN", Font.BOLD, 35));
		infoLabelQ20.setVerticalAlignment(JLabel.TOP);
		infoLabelQ20.setHorizontalAlignment(JLabel.CENTER);
		
		rightAnsLabelQ20 = new JLabel("Correct Answer : ");
		rightAnsLabelQ20.setFont(new Font("ALGERIAN", Font.PLAIN, 50));
		rightAnsLabelQ20.setHorizontalAlignment(JLabel.CENTER);
		rightAnsLabelQ20.setVerticalAlignment(JLabel.BOTTOM);
		rightAnsLabelQ20.setPreferredSize(new Dimension(0, 110));
	}
	
	public void buttonsQ20() {

		button1Q20 = new JButton("a. Genral Luna");
		button1Q20.setFocusable(false);
		button1Q20.addActionListener(ActionListenerQ20);
		button1Q20.setFont(new Font("Bookman Old Style", Font.PLAIN, 40));
		
		button2Q20 = new JButton("b. Andres Bonifacio");
		button2Q20.setFocusable(false);
		button2Q20.addActionListener(ActionListenerQ20);
		button2Q20.setFont(new Font("Bookman Old Style", Font.PLAIN, 40));
		
		button3Q20 = new JButton("c. Dr. Jose Rizal");
		button3Q20.setFocusable(false);
		button3Q20.addActionListener(ActionListenerQ20);
		button3Q20.setFont(new Font("Bookman Old Style", Font.PLAIN, 40));
		
		button4Q20 = new JButton("d. Apolinario Mabini");
		button4Q20.setFocusable(false);
		button4Q20.addActionListener(ActionListenerQ20);
		button4Q20.setFont(new Font("Bookman Old Style", Font.PLAIN, 40));
		
		nextButtonQ20 = new JButton("Next");
		nextButtonQ20.setFont(new Font("nextButton", Font.PLAIN, 30));
		nextButtonQ20.setVisible(false);
		nextButtonQ20.addActionListener(ActionListenerQ20);
	}
	
	public void layeredPaneQ20() {
		newLayeredPaneQ20 = new JLayeredPane();
		newLayeredPaneQ20.setBackground(Color.black);
		newLayeredPaneQ20.setSize(1200, 700);
		newLayeredPaneQ20.add(panelCQ20, Integer.valueOf(0));
		
	}
	
	
	
	
	
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	
	

	String[] answerQ21 = {"Congrats! You got the right answer", "b. Apolinario Mabini y Maranan "};
	JPanel frameQ21;
	JPanel panelNQ21, panelSQ21, panelEQ21, panelWQ21, panelCQ21, panelInPanelCQ21, answerPanelQ21, panelInCQ21;
	JLabel qLabelQ21, answerLabelQ21, infoLabelQ21, rightAnsLabelQ21;
	JButton button1Q21, button2Q21, button3Q21, button4Q21, nextButtonQ21;
	JLayeredPane newLayeredPaneQ21;
	
	ImageIcon imageQ21 = new ImageIcon("Inked111.jpg");
	
	public void Q21Frame() {
		buttonsQ21();
		labelsQ21();
		panelsQ21();
		layeredPaneQ21();
		frameQ21();
	}
	
	ActionListener ActionListenerQ21 = new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == button2Q21) {
				addScore2();
				panelCQ21.setVisible(false);
				rightAnsLabelQ21.setVisible(false);
				nextButtonQ21.setVisible(true);
				infoLabelQ21.setFont(new Font("ALGERIAN", Font.BOLD, 50));
				infoLabelQ21.setVerticalAlignment(JLabel.CENTER);
				answerLabelQ21.setText(answerChecking[0]);
				infoLabelQ21.setText(answerQ21[0]);
				newLayeredPaneQ21.add(answerPanelQ21, Integer.valueOf(2));
				
			} else if(e.getSource() == button3Q21 || e.getSource() == button4Q21 || e.getSource() == button1Q21) {
				panelCQ21.setVisible(false);
				nextButtonQ21.setVisible(true);
				answerLabelQ21.setText(answerChecking[1]);
				infoLabelQ21.setText(answerQ21[1]);
				newLayeredPaneQ21.add(answerPanelQ21, Integer.valueOf(1));
				
			} else if(e.getSource() == nextButtonQ21) {
				Q22Frame();
				frame.remove(frameQ21);
				frame.add(frameQ22);
				frame.setVisible(true);
			}
		}
	};
	
	
	public void frameQ21() {
		frameQ21 = new JPanel();
		frameQ21.setLayout(new BorderLayout(11, 11));
		frameQ21.setSize(1200, 700);
		
		frameQ21.add(panelNQ21, BorderLayout.NORTH);
		frameQ21.add(panelSQ21, BorderLayout.SOUTH);
		frameQ21.add(panelEQ21, BorderLayout.EAST);
		frameQ21.add(panelWQ21, BorderLayout.WEST);
		frameQ21.add(newLayeredPaneQ21, BorderLayout.CENTER);
		
		frameQ21.setVisible(true);
	}
	
	public void panelsQ21() {
		panelNQ21 = new JPanel();
		panelNQ21.setBackground(Color.LIGHT_GRAY);
		
		panelSQ21 = new JPanel();
		panelSQ21.setBackground(Color.LIGHT_GRAY);
		panelSQ21.setLayout(new BorderLayout());
		panelSQ21.add(nextButtonQ21, BorderLayout.CENTER);
		
		panelEQ21 = new JPanel();
		panelEQ21.setBackground(Color.LIGHT_GRAY);
		
		panelWQ21 = new JPanel();
		panelWQ21.setBackground(Color.LIGHT_GRAY);
		
		panelInPanelCQ21 = new JPanel();
		panelInPanelCQ21.setLayout(new GridLayout(4, 0));
		panelInPanelCQ21.add(button1Q21);
		panelInPanelCQ21.add(button2Q21);
		panelInPanelCQ21.add(button3Q21);
		panelInPanelCQ21.add(button4Q21);
		
		panelInCQ21 = new JPanel();
		panelInCQ21.setLayout(new BorderLayout());
		panelInCQ21.add(rightAnsLabelQ21, BorderLayout.NORTH);
		panelInCQ21.add(infoLabelQ21, BorderLayout.CENTER);
		
		panelCQ21 = new JPanel();
		panelCQ21.setOpaque(true);
		panelCQ21.setBackground(Color.LIGHT_GRAY);
		panelCQ21.setLayout(new BorderLayout());
		panelCQ21.add(qLabelQ21, BorderLayout.NORTH);
		panelCQ21.add(panelInPanelCQ21, BorderLayout.CENTER);
		panelCQ21.setSize(1142, 620);
		
		answerPanelQ21 = new JPanel();
		answerPanelQ21.setOpaque(true);
		answerPanelQ21.setSize(1142, 620);
		answerPanelQ21.setLayout(new BorderLayout());
		answerPanelQ21.add(answerLabelQ21, BorderLayout.NORTH);
		answerPanelQ21.add(panelInCQ21, BorderLayout.CENTER);
		
	}
	
	public void labelsQ21() {
		qLabelQ21 = new JLabel("21. Apolinario Mabini's fullname is?");
		qLabelQ21.setFont(new Font("Book Antiqua", Font.PLAIN, 55));

		answerLabelQ21 = new JLabel();
		answerLabelQ21.setFont(new Font("ALGERIAN", Font.BOLD, 150));
		answerLabelQ21.setHorizontalAlignment(JLabel.CENTER);
		answerLabelQ21.setVerticalAlignment(JLabel.CENTER);
		
		infoLabelQ21 = new JLabel();
		infoLabelQ21.setFont(new Font("ALGERIAN", Font.BOLD, 35));
		infoLabelQ21.setVerticalAlignment(JLabel.TOP);
		infoLabelQ21.setHorizontalAlignment(JLabel.CENTER);
		
		rightAnsLabelQ21 = new JLabel("Correct Answer : ");
		rightAnsLabelQ21.setFont(new Font("ALGERIAN", Font.PLAIN, 50));
		rightAnsLabelQ21.setHorizontalAlignment(JLabel.CENTER);
		rightAnsLabelQ21.setVerticalAlignment(JLabel.BOTTOM);
		rightAnsLabelQ21.setPreferredSize(new Dimension(0, 110));
	}
	
	public void buttonsQ21() {

		button1Q21 = new JButton("a. Apolinario Maranan y Mabini");
		button1Q21.setFocusable(false);
		button1Q21.addActionListener(ActionListenerQ21);
		button1Q21.setFont(new Font("Bookman Old Style", Font.PLAIN, 40));
		
		button2Q21 = new JButton("b. Apolinario Mabini y Maranan ");
		button2Q21.setFocusable(false);
		button2Q21.addActionListener(ActionListenerQ21);
		button2Q21.setFont(new Font("Bookman Old Style", Font.PLAIN, 40));
		
		button3Q21 = new JButton("c. Apolinario Mabini Maran ");
		button3Q21.setFocusable(false);
		button3Q21.addActionListener(ActionListenerQ21);
		button3Q21.setFont(new Font("Bookman Old Style", Font.PLAIN, 40));
		
		button4Q21 = new JButton("d. Apolinario y Mabini Maranan ");
		button4Q21.setFocusable(false);
		button4Q21.addActionListener(ActionListenerQ21);
		button4Q21.setFont(new Font("Bookman Old Style", Font.PLAIN, 40));
		
		nextButtonQ21 = new JButton("Next");
		nextButtonQ21.setFont(new Font("nextButton", Font.PLAIN, 30));
		nextButtonQ21.setVisible(false);
		nextButtonQ21.addActionListener(ActionListenerQ21);
	}
	
	public void layeredPaneQ21() {
		newLayeredPaneQ21 = new JLayeredPane();
		newLayeredPaneQ21.setBackground(Color.black);
		newLayeredPaneQ21.setSize(1200, 700);
		newLayeredPaneQ21.add(panelCQ21, Integer.valueOf(0));
		
	}
	
	
	
	
	
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	
	

	String[] answerQ22 = {"Congrats! You got the right answer", "c. because of polio"};
	JPanel frameQ22;
	JPanel panelNQ22, panelSQ22, panelEQ22, panelWQ22, panelCQ22, panelInPanelCQ22, answerPanelQ22, panelInCQ22;
	JLabel qLabelQ22, answerLabelQ22, infoLabelQ22, rightAnsLabelQ22;
	JButton button1Q22, button2Q22, button3Q22, button4Q22, nextButtonQ22;
	JLayeredPane newLayeredPaneQ22;
	
	ImageIcon imageQ22 = new ImageIcon("Inked111.jpg");
	
	public void Q22Frame() {
		buttonsQ22();
		labelsQ22();
		panelsQ22();
		layeredPaneQ22();
		frameQ22();
	}
	
	ActionListener ActionListenerQ22 = new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == button3Q22) {
				addScore2();
				panelCQ22.setVisible(false);
				rightAnsLabelQ22.setVisible(false);
				nextButtonQ22.setVisible(true);
				infoLabelQ22.setFont(new Font("ALGERIAN", Font.BOLD, 50));
				infoLabelQ22.setVerticalAlignment(JLabel.CENTER);
				answerLabelQ22.setText(answerChecking[0]);
				infoLabelQ22.setText(answerQ22[0]);
				newLayeredPaneQ22.add(answerPanelQ22, Integer.valueOf(2));
				
			} else if(e.getSource() == button2Q22 || e.getSource() == button4Q22 || e.getSource() == button1Q22) {
				panelCQ22.setVisible(false);
				nextButtonQ22.setVisible(true);
				answerLabelQ22.setText(answerChecking[1]);
				infoLabelQ22.setText(answerQ22[1]);
				newLayeredPaneQ22.add(answerPanelQ22, Integer.valueOf(1));
				
			} else if(e.getSource() == nextButtonQ22) {
				Q23Frame();
				frame.remove(frameQ22);
				frame.add(frameQ23);
				frame.setVisible(true);
			}
		}
	};
	
	
	public void frameQ22() {
		frameQ22 = new JPanel();
		frameQ22.setLayout(new BorderLayout(11, 11));
		frameQ22.setSize(1200, 700);
		
		frameQ22.add(panelNQ22, BorderLayout.NORTH);
		frameQ22.add(panelSQ22, BorderLayout.SOUTH);
		frameQ22.add(panelEQ22, BorderLayout.EAST);
		frameQ22.add(panelWQ22, BorderLayout.WEST);
		frameQ22.add(newLayeredPaneQ22, BorderLayout.CENTER);
		
		frameQ22.setVisible(true);
	}
	
	public void panelsQ22() {
		panelNQ22 = new JPanel();
		panelNQ22.setBackground(Color.LIGHT_GRAY);
		
		panelSQ22 = new JPanel();
		panelSQ22.setBackground(Color.LIGHT_GRAY);
		panelSQ22.setLayout(new BorderLayout());
		panelSQ22.add(nextButtonQ22, BorderLayout.CENTER);
		
		panelEQ22 = new JPanel();
		panelEQ22.setBackground(Color.LIGHT_GRAY);
		
		panelWQ22 = new JPanel();
		panelWQ22.setBackground(Color.LIGHT_GRAY);
		
		panelInPanelCQ22 = new JPanel();
		panelInPanelCQ22.setLayout(new GridLayout(4, 0));
		panelInPanelCQ22.add(button1Q22);
		panelInPanelCQ22.add(button2Q22);
		panelInPanelCQ22.add(button3Q22);
		panelInPanelCQ22.add(button4Q22);
		
		panelInCQ22 = new JPanel();
		panelInCQ22.setLayout(new BorderLayout());
		panelInCQ22.add(rightAnsLabelQ22, BorderLayout.NORTH);
		panelInCQ22.add(infoLabelQ22, BorderLayout.CENTER);
		
		panelCQ22 = new JPanel();
		panelCQ22.setOpaque(true);
		panelCQ22.setBackground(Color.LIGHT_GRAY);
		panelCQ22.setLayout(new BorderLayout());
		panelCQ22.add(qLabelQ22, BorderLayout.NORTH);
		panelCQ22.add(panelInPanelCQ22, BorderLayout.CENTER);
		panelCQ22.setSize(1142, 620);
		
		answerPanelQ22 = new JPanel();
		answerPanelQ22.setOpaque(true);
		answerPanelQ22.setSize(1142, 620);
		answerPanelQ22.setLayout(new BorderLayout());
		answerPanelQ22.add(answerLabelQ22, BorderLayout.NORTH);
		answerPanelQ22.add(panelInCQ22, BorderLayout.CENTER);
		
	}
	
	public void labelsQ22() {
		qLabelQ22 = new JLabel("22. Why did Apolinario Mabini lost his legs? ");
		qLabelQ22.setFont(new Font("Book Antiqua", Font.PLAIN, 55));

		answerLabelQ22 = new JLabel();
		answerLabelQ22.setFont(new Font("ALGERIAN", Font.BOLD, 150));
		answerLabelQ22.setHorizontalAlignment(JLabel.CENTER);
		answerLabelQ22.setVerticalAlignment(JLabel.CENTER);
		
		infoLabelQ22 = new JLabel();
		infoLabelQ22.setFont(new Font("ALGERIAN", Font.BOLD, 35));
		infoLabelQ22.setVerticalAlignment(JLabel.TOP);
		infoLabelQ22.setHorizontalAlignment(JLabel.CENTER);
		
		rightAnsLabelQ22 = new JLabel("Correct Answer : ");
		rightAnsLabelQ22.setFont(new Font("ALGERIAN", Font.PLAIN, 50));
		rightAnsLabelQ22.setHorizontalAlignment(JLabel.CENTER);
		rightAnsLabelQ22.setVerticalAlignment(JLabel.BOTTOM);
		rightAnsLabelQ22.setPreferredSize(new Dimension(0, 110));
	}
	
	public void buttonsQ22() {

		button1Q22 = new JButton("a. because of the war");
		button1Q22.setFocusable(false);
		button1Q22.addActionListener(ActionListenerQ22);
		button1Q22.setFont(new Font("Bookman Old Style", Font.PLAIN, 40));
		
		button2Q22 = new JButton("b. because of the tumor in his legs");
		button2Q22.setFocusable(false);
		button2Q22.addActionListener(ActionListenerQ22);
		button2Q22.setFont(new Font("Bookman Old Style", Font.PLAIN, 40));
		
		button3Q22 = new JButton("c. because of polio");
		button3Q22.setFocusable(false);
		button3Q22.addActionListener(ActionListenerQ22);
		button3Q22.setFont(new Font("Bookman Old Style", Font.PLAIN, 40));
		
		button4Q22 = new JButton("d. because of the accident");
		button4Q22.setFocusable(false);
		button4Q22.addActionListener(ActionListenerQ22);
		button4Q22.setFont(new Font("Bookman Old Style", Font.PLAIN, 40));
		
		nextButtonQ22 = new JButton("Next");
		nextButtonQ22.setFont(new Font("nextButton", Font.PLAIN, 30));
		nextButtonQ22.setVisible(false);
		nextButtonQ22.addActionListener(ActionListenerQ22);
	}
	
	public void layeredPaneQ22() {
		newLayeredPaneQ22 = new JLayeredPane();
		newLayeredPaneQ22.setBackground(Color.black);
		newLayeredPaneQ22.setSize(1200, 700);
		newLayeredPaneQ22.add(panelCQ22, Integer.valueOf(0));
		
	}
	
	
	
	
	
	
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	
	

	String[] answerQ23 = {"Congrats! You got the right answer", "a. Antonio Luna"};
	JPanel frameQ23;
	JPanel panelNQ23, panelSQ23, panelEQ23, panelWQ23, panelCQ23, panelInPanelCQ23, answerPanelQ23, panelInCQ23;
	JLabel qLabelQ23, answerLabelQ23, infoLabelQ23, rightAnsLabelQ23;
	JButton button1Q23, button2Q23, button3Q23, button4Q23, nextButtonQ23;
	JLayeredPane newLayeredPaneQ23;
	
	ImageIcon imageQ23 = new ImageIcon("Inked111.jpg");
	
	public void Q23Frame() {
		buttonsQ23();
		labelsQ23();
		panelsQ23();
		layeredPaneQ23();
		frameQ23();
	}
	
	ActionListener ActionListenerQ23 = new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == button1Q23) {
				addScore2();
				panelCQ23.setVisible(false);
				rightAnsLabelQ23.setVisible(false);
				nextButtonQ23.setVisible(true);
				infoLabelQ23.setFont(new Font("ALGERIAN", Font.BOLD, 50));
				infoLabelQ23.setVerticalAlignment(JLabel.CENTER);
				answerLabelQ23.setText(answerChecking[0]);
				infoLabelQ23.setText(answerQ23[0]);
				newLayeredPaneQ23.add(answerPanelQ23, Integer.valueOf(2));
				
			} else if(e.getSource() == button2Q23 || e.getSource() == button4Q23 || e.getSource() == button3Q23) {
				panelCQ23.setVisible(false);
				nextButtonQ23.setVisible(true);
				answerLabelQ23.setText(answerChecking[1]);
				infoLabelQ23.setText(answerQ23[1]);
				newLayeredPaneQ23.add(answerPanelQ23, Integer.valueOf(1));
				
			} else if(e.getSource() == nextButtonQ23) {
				Q24Frame();
				frame.remove(frameQ23);
				frame.add(frameQ24);
				frame.setVisible(true);
			}
		}
	};
	
	
	public void frameQ23() {
		frameQ23 = new JPanel();
		frameQ23.setLayout(new BorderLayout(11, 11));
		frameQ23.setSize(1200, 700);
		
		frameQ23.add(panelNQ23, BorderLayout.NORTH);
		frameQ23.add(panelSQ23, BorderLayout.SOUTH);
		frameQ23.add(panelEQ23, BorderLayout.EAST);
		frameQ23.add(panelWQ23, BorderLayout.WEST);
		frameQ23.add(newLayeredPaneQ23, BorderLayout.CENTER);
		
		frameQ23.setVisible(true);
	}
	
	public void panelsQ23() {
		panelNQ23 = new JPanel();
		panelNQ23.setBackground(Color.LIGHT_GRAY);
		
		panelSQ23 = new JPanel();
		panelSQ23.setBackground(Color.LIGHT_GRAY);
		panelSQ23.setLayout(new BorderLayout());
		panelSQ23.add(nextButtonQ23, BorderLayout.CENTER);
		
		panelEQ23 = new JPanel();
		panelEQ23.setBackground(Color.LIGHT_GRAY);
		
		panelWQ23 = new JPanel();
		panelWQ23.setBackground(Color.LIGHT_GRAY);
		
		panelInPanelCQ23 = new JPanel();
		panelInPanelCQ23.setLayout(new GridLayout(4, 0));
		panelInPanelCQ23.add(button1Q23);
		panelInPanelCQ23.add(button2Q23);
		panelInPanelCQ23.add(button3Q23);
		panelInPanelCQ23.add(button4Q23);
		
		panelInCQ23 = new JPanel();
		panelInCQ23.setLayout(new BorderLayout());
		panelInCQ23.add(rightAnsLabelQ23, BorderLayout.NORTH);
		panelInCQ23.add(infoLabelQ23, BorderLayout.CENTER);
		
		panelCQ23 = new JPanel();
		panelCQ23.setOpaque(true);
		panelCQ23.setBackground(Color.LIGHT_GRAY);
		panelCQ23.setLayout(new BorderLayout());
		panelCQ23.add(qLabelQ23, BorderLayout.NORTH);
		panelCQ23.add(panelInPanelCQ23, BorderLayout.CENTER);
		panelCQ23.setSize(1142, 620);
		
		answerPanelQ23 = new JPanel();
		answerPanelQ23.setOpaque(true);
		answerPanelQ23.setSize(1142, 620);
		answerPanelQ23.setLayout(new BorderLayout());
		answerPanelQ23.add(answerLabelQ23, BorderLayout.NORTH);
		answerPanelQ23.add(panelInCQ23, BorderLayout.CENTER);
		
	}
	
	public void labelsQ23() {
		qLabelQ23 = new JLabel("23. Who is the Filipino general who fought on the American war?");
		qLabelQ23.setFont(new Font("Book Antiqua", Font.PLAIN, 35));

		answerLabelQ23 = new JLabel();
		answerLabelQ23.setFont(new Font("ALGERIAN", Font.BOLD, 150));
		answerLabelQ23.setHorizontalAlignment(JLabel.CENTER);
		answerLabelQ23.setVerticalAlignment(JLabel.CENTER);
		
		infoLabelQ23 = new JLabel();
		infoLabelQ23.setFont(new Font("ALGERIAN", Font.BOLD, 35));
		infoLabelQ23.setVerticalAlignment(JLabel.TOP);
		infoLabelQ23.setHorizontalAlignment(JLabel.CENTER);
		
		rightAnsLabelQ23 = new JLabel("Correct Answer : ");
		rightAnsLabelQ23.setFont(new Font("ALGERIAN", Font.PLAIN, 50));
		rightAnsLabelQ23.setHorizontalAlignment(JLabel.CENTER);
		rightAnsLabelQ23.setVerticalAlignment(JLabel.BOTTOM);
		rightAnsLabelQ23.setPreferredSize(new Dimension(0, 110));
	}
	
	public void buttonsQ23() {

		button1Q23 = new JButton("a. Antonio Luna");
		button1Q23.setFocusable(false);
		button1Q23.addActionListener(ActionListenerQ23);
		button1Q23.setFont(new Font("Bookman Old Style", Font.PLAIN, 40));
		
		button2Q23 = new JButton("b. Andres Bonifacio");
		button2Q23.setFocusable(false);
		button2Q23.addActionListener(ActionListenerQ23);
		button2Q23.setFont(new Font("Bookman Old Style", Font.PLAIN, 40));
		
		button3Q23 = new JButton("c. Lapu-Lapu");
		button3Q23.setFocusable(false);
		button3Q23.addActionListener(ActionListenerQ23);
		button3Q23.setFont(new Font("Bookman Old Style", Font.PLAIN, 40));
		
		button4Q23 = new JButton("d. Apolinario Mabini");
		button4Q23.setFocusable(false);
		button4Q23.addActionListener(ActionListenerQ23);
		button4Q23.setFont(new Font("Bookman Old Style", Font.PLAIN, 40));
		
		nextButtonQ23 = new JButton("Next");
		nextButtonQ23.setFont(new Font("nextButton", Font.PLAIN, 30));
		nextButtonQ23.setVisible(false);
		nextButtonQ23.addActionListener(ActionListenerQ23);
	}
	
	public void layeredPaneQ23() {
		newLayeredPaneQ23 = new JLayeredPane();
		newLayeredPaneQ23.setBackground(Color.black);
		newLayeredPaneQ23.setSize(1200, 700);
		newLayeredPaneQ23.add(panelCQ23, Integer.valueOf(0));
		
	}

	
	
	
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	
	

	String[] answerQ24 = {"Congrats! You got the right answer", "c. Cabanatuan"};
	JPanel frameQ24;
	JPanel panelNQ24, panelSQ24, panelEQ24, panelWQ24, panelCQ24, panelInPanelCQ24, answerPanelQ24, panelInCQ24;
	JLabel qLabelQ24, answerLabelQ24, infoLabelQ24, rightAnsLabelQ24;
	JButton button1Q24, button2Q24, button3Q24, button4Q24, nextButtonQ24;
	JLayeredPane newLayeredPaneQ24;
	
	ImageIcon imageQ24 = new ImageIcon("Inked111.jpg");
	
	public void Q24Frame() {
		buttonsQ24();
		labelsQ24();
		panelsQ24();
		layeredPaneQ24();
		frameQ24();
	}
	
	ActionListener ActionListenerQ24 = new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == button3Q24) {
				addScore2();
				panelCQ24.setVisible(false);
				rightAnsLabelQ24.setVisible(false);
				nextButtonQ24.setVisible(true);
				infoLabelQ24.setFont(new Font("ALGERIAN", Font.BOLD, 50));
				infoLabelQ24.setVerticalAlignment(JLabel.CENTER);
				answerLabelQ24.setText(answerChecking[0]);
				infoLabelQ24.setText(answerQ24[0]);
				newLayeredPaneQ24.add(answerPanelQ24, Integer.valueOf(2));
				
			} else if(e.getSource() == button2Q24 || e.getSource() == button4Q24 || e.getSource() == button1Q24) {
				panelCQ24.setVisible(false);
				nextButtonQ24.setVisible(true);
				answerLabelQ24.setText(answerChecking[1]);
				infoLabelQ24.setText(answerQ24[1]);
				newLayeredPaneQ24.add(answerPanelQ24, Integer.valueOf(1));
				
			} else if(e.getSource() == nextButtonQ24) {
				Q25Frame();
				frame.remove(frameQ24);
				frame.add(frameQ25);
				frame.setVisible(true);
			}
		}
	};
	
	
	public void frameQ24() {
		frameQ24 = new JPanel();
		frameQ24.setLayout(new BorderLayout(11, 11));
		frameQ24.setSize(1200, 700);
		
		frameQ24.add(panelNQ24, BorderLayout.NORTH);
		frameQ24.add(panelSQ24, BorderLayout.SOUTH);
		frameQ24.add(panelEQ24, BorderLayout.EAST);
		frameQ24.add(panelWQ24, BorderLayout.WEST);
		frameQ24.add(newLayeredPaneQ24, BorderLayout.CENTER);
		
		frameQ24.setVisible(true);
	}
	
	public void panelsQ24() {
		panelNQ24 = new JPanel();
		panelNQ24.setBackground(Color.LIGHT_GRAY);
		
		panelSQ24 = new JPanel();
		panelSQ24.setBackground(Color.LIGHT_GRAY);
		panelSQ24.setLayout(new BorderLayout());
		panelSQ24.add(nextButtonQ24, BorderLayout.CENTER);
		
		panelEQ24 = new JPanel();
		panelEQ24.setBackground(Color.LIGHT_GRAY);
		
		panelWQ24 = new JPanel();
		panelWQ24.setBackground(Color.LIGHT_GRAY);
		
		panelInPanelCQ24 = new JPanel();
		panelInPanelCQ24.setLayout(new GridLayout(4, 0));
		panelInPanelCQ24.add(button1Q24);
		panelInPanelCQ24.add(button2Q24);
		panelInPanelCQ24.add(button3Q24);
		panelInPanelCQ24.add(button4Q24);
		
		panelInCQ24 = new JPanel();
		panelInCQ24.setLayout(new BorderLayout());
		panelInCQ24.add(rightAnsLabelQ24, BorderLayout.NORTH);
		panelInCQ24.add(infoLabelQ24, BorderLayout.CENTER);
		
		panelCQ24 = new JPanel();
		panelCQ24.setOpaque(true);
		panelCQ24.setBackground(Color.LIGHT_GRAY);
		panelCQ24.setLayout(new BorderLayout());
		panelCQ24.add(qLabelQ24, BorderLayout.NORTH);
		panelCQ24.add(panelInPanelCQ24, BorderLayout.CENTER);
		panelCQ24.setSize(1142, 620);
		
		answerPanelQ24 = new JPanel();
		answerPanelQ24.setOpaque(true);
		answerPanelQ24.setSize(1142, 620);
		answerPanelQ24.setLayout(new BorderLayout());
		answerPanelQ24.add(answerLabelQ24, BorderLayout.NORTH);
		answerPanelQ24.add(panelInCQ24, BorderLayout.CENTER);
		
	}
	
	public void labelsQ24() {
		qLabelQ24 = new JLabel("24. Where did General Luna assassinated?");
		qLabelQ24.setFont(new Font("Book Antiqua", Font.PLAIN, 55));

		answerLabelQ24 = new JLabel();
		answerLabelQ24.setFont(new Font("ALGERIAN", Font.BOLD, 150));
		answerLabelQ24.setHorizontalAlignment(JLabel.CENTER);
		answerLabelQ24.setVerticalAlignment(JLabel.CENTER);
		
		infoLabelQ24 = new JLabel();
		infoLabelQ24.setFont(new Font("ALGERIAN", Font.BOLD, 35));
		infoLabelQ24.setVerticalAlignment(JLabel.TOP);
		infoLabelQ24.setHorizontalAlignment(JLabel.CENTER);
		
		rightAnsLabelQ24 = new JLabel("Correct Answer : ");
		rightAnsLabelQ24.setFont(new Font("ALGERIAN", Font.PLAIN, 50));
		rightAnsLabelQ24.setHorizontalAlignment(JLabel.CENTER);
		rightAnsLabelQ24.setVerticalAlignment(JLabel.BOTTOM);
		rightAnsLabelQ24.setPreferredSize(new Dimension(0, 110));
	}
	
	public void buttonsQ24() {

		button1Q24 = new JButton("a. Bagumbayan");
		button1Q24.setFocusable(false);
		button1Q24.addActionListener(ActionListenerQ24);
		button1Q24.setFont(new Font("Bookman Old Style", Font.PLAIN, 40));
		
		button2Q24 = new JButton("b. Makati");
		button2Q24.setFocusable(false);
		button2Q24.addActionListener(ActionListenerQ24);
		button2Q24.setFont(new Font("Bookman Old Style", Font.PLAIN, 40));
		
		button3Q24 = new JButton("c. Cabanatuan");
		button3Q24.setFocusable(false);
		button3Q24.addActionListener(ActionListenerQ24);
		button3Q24.setFont(new Font("Bookman Old Style", Font.PLAIN, 40));
		
		button4Q24 = new JButton("d. Tondo");
		button4Q24.setFocusable(false);
		button4Q24.addActionListener(ActionListenerQ24);
		button4Q24.setFont(new Font("Bookman Old Style", Font.PLAIN, 40));
		
		nextButtonQ24 = new JButton("Next");
		nextButtonQ24.setFont(new Font("nextButton", Font.PLAIN, 30));
		nextButtonQ24.setVisible(false);
		nextButtonQ24.addActionListener(ActionListenerQ24);
	}
	
	public void layeredPaneQ24() {
		newLayeredPaneQ24 = new JLayeredPane();
		newLayeredPaneQ24.setBackground(Color.black);
		newLayeredPaneQ24.setSize(1200, 700);
		newLayeredPaneQ24.add(panelCQ24, Integer.valueOf(0));
		
	}
	
	
	
	
	
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	
	

	String[] answerQ25 = {"Congrats! You got the right answer", "c. Antonio Narciso Luna de San Pedro y Novicio Ancheta"};
	JPanel frameQ25;
	JPanel panelNQ25, panelSQ25, panelEQ25, panelWQ25, panelCQ25, panelInPanelCQ25, answerPanelQ25, panelInCQ25;
	JLabel qLabelQ25, answerLabelQ25, infoLabelQ25, rightAnsLabelQ25;
	JButton button1Q25, button2Q25, button3Q25, button4Q25, nextButtonQ25;
	JLayeredPane newLayeredPaneQ25;
	
	ImageIcon imageQ25 = new ImageIcon("Inked111.jpg");
	
	public void Q25Frame() {
		buttonsQ25();
		labelsQ25();
		panelsQ25();
		layeredPaneQ25();
		frameQ25();
	}
	
	ActionListener ActionListenerQ25 = new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == button3Q25) {
				addScore2();
				panelCQ25.setVisible(false);
				rightAnsLabelQ25.setVisible(false);
				nextButtonQ25.setVisible(true);
				infoLabelQ25.setFont(new Font("ALGERIAN", Font.BOLD, 50));
				infoLabelQ25.setVerticalAlignment(JLabel.CENTER);
				answerLabelQ25.setText(answerChecking[0]);
				infoLabelQ25.setText(answerQ25[0]);
				newLayeredPaneQ25.add(answerPanelQ25, Integer.valueOf(2));
				
			} else if(e.getSource() == button2Q25 || e.getSource() == button4Q25 || e.getSource() == button1Q25) {
				panelCQ25.setVisible(false);
				nextButtonQ25.setVisible(true);
				answerLabelQ25.setText(answerChecking[1]);
				infoLabelQ25.setText(answerQ25[1]);
				newLayeredPaneQ25.add(answerPanelQ25, Integer.valueOf(1));
				
			} else if(e.getSource() == nextButtonQ25) {
				overAllFrame();
				frame.remove(frameQ25);
				frame.add(frameOverAll);
				frame.setVisible(true);
			}
		}
	};
	
	
	public void frameQ25() {
		frameQ25 = new JPanel();
		frameQ25.setLayout(new BorderLayout(11, 11));
		frameQ25.setSize(1200, 700);
		
		frameQ25.add(panelNQ25, BorderLayout.NORTH);
		frameQ25.add(panelSQ25, BorderLayout.SOUTH);
		frameQ25.add(panelEQ25, BorderLayout.EAST);
		frameQ25.add(panelWQ25, BorderLayout.WEST);
		frameQ25.add(newLayeredPaneQ25, BorderLayout.CENTER);
		
		frameQ25.setVisible(true);
	}
	
	public void panelsQ25() {
		panelNQ25 = new JPanel();
		panelNQ25.setBackground(Color.LIGHT_GRAY);
		
		panelSQ25 = new JPanel();
		panelSQ25.setBackground(Color.LIGHT_GRAY);
		panelSQ25.setLayout(new BorderLayout());
		panelSQ25.add(nextButtonQ25, BorderLayout.CENTER);
		
		panelEQ25 = new JPanel();
		panelEQ25.setBackground(Color.LIGHT_GRAY);
		
		panelWQ25 = new JPanel();
		panelWQ25.setBackground(Color.LIGHT_GRAY);
		
		panelInPanelCQ25 = new JPanel();
		panelInPanelCQ25.setLayout(new GridLayout(4, 0));
		panelInPanelCQ25.add(button1Q25);
		panelInPanelCQ25.add(button2Q25);
		panelInPanelCQ25.add(button3Q25);
		panelInPanelCQ25.add(button4Q25);
		
		panelInCQ25 = new JPanel();
		panelInCQ25.setLayout(new BorderLayout());
		panelInCQ25.add(rightAnsLabelQ25, BorderLayout.NORTH);
		panelInCQ25.add(infoLabelQ25, BorderLayout.CENTER);
		
		panelCQ25 = new JPanel();
		panelCQ25.setOpaque(true);
		panelCQ25.setBackground(Color.LIGHT_GRAY);
		panelCQ25.setLayout(new BorderLayout());
		panelCQ25.add(qLabelQ25, BorderLayout.NORTH);
		panelCQ25.add(panelInPanelCQ25, BorderLayout.CENTER);
		panelCQ25.setSize(1142, 620);
		
		answerPanelQ25 = new JPanel();
		answerPanelQ25.setOpaque(true);
		answerPanelQ25.setSize(1142, 620);
		answerPanelQ25.setLayout(new BorderLayout());
		answerPanelQ25.add(answerLabelQ25, BorderLayout.NORTH);
		answerPanelQ25.add(panelInCQ25, BorderLayout.CENTER);
		
	}
	
	public void labelsQ25() {
		qLabelQ25 = new JLabel("25. General Luna's fullname.");
		qLabelQ25.setFont(new Font("Book Antiqua", Font.PLAIN, 55));

		answerLabelQ25 = new JLabel();
		answerLabelQ25.setFont(new Font("ALGERIAN", Font.BOLD, 150));
		answerLabelQ25.setHorizontalAlignment(JLabel.CENTER);
		answerLabelQ25.setVerticalAlignment(JLabel.CENTER);
		
		infoLabelQ25 = new JLabel();
		infoLabelQ25.setFont(new Font("ALGERIAN", Font.BOLD, 35));
		infoLabelQ25.setVerticalAlignment(JLabel.TOP);
		infoLabelQ25.setHorizontalAlignment(JLabel.CENTER);
		
		rightAnsLabelQ25 = new JLabel("Correct Answer : ");
		rightAnsLabelQ25.setFont(new Font("ALGERIAN", Font.PLAIN, 50));
		rightAnsLabelQ25.setHorizontalAlignment(JLabel.CENTER);
		rightAnsLabelQ25.setVerticalAlignment(JLabel.BOTTOM);
		rightAnsLabelQ25.setPreferredSize(new Dimension(0, 110));
	}
	
	public void buttonsQ25() {

		button1Q25 = new JButton("a. Antonio Narciso Luna de San Pedro y Novicio");
		button1Q25.setFocusable(false);
		button1Q25.addActionListener(ActionListenerQ25);
		button1Q25.setFont(new Font("Bookman Old Style", Font.PLAIN, 40));
		
		button2Q25 = new JButton("b. Antonio Narciso Luna y de San Pedro Novicio");
		button2Q25.setFocusable(false);
		button2Q25.addActionListener(ActionListenerQ25);
		button2Q25.setFont(new Font("Bookman Old Style", Font.PLAIN, 40));
		
		button3Q25 = new JButton("c. Antonio Narciso Luna de San Pedro y Novicio Ancheta");
		button3Q25.setFocusable(false);
		button3Q25.addActionListener(ActionListenerQ25);
		button3Q25.setFont(new Font("Bookman Old Style", Font.PLAIN, 40));
		
		button4Q25 = new JButton("d. Antonio Narciso Luna y de San Pedro Novicio Ancheta");
		button4Q25.setFocusable(false);
		button4Q25.addActionListener(ActionListenerQ25);
		button4Q25.setFont(new Font("Bookman Old Style", Font.PLAIN, 40));
		
		nextButtonQ25 = new JButton("Next");
		nextButtonQ25.setFont(new Font("nextButton", Font.PLAIN, 30));
		nextButtonQ25.setVisible(false);
		nextButtonQ25.addActionListener(ActionListenerQ25);
	}
	
	public void layeredPaneQ25() {
		newLayeredPaneQ25 = new JLayeredPane();
		newLayeredPaneQ25.setBackground(Color.black);
		newLayeredPaneQ25.setSize(1200, 700);
		newLayeredPaneQ25.add(panelCQ25, Integer.valueOf(0));
		
	}
	
	
	
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	
	JPanel frameOverAll;
	JPanel panelNOverAll, panelSOverAll, panelEOverAll, panelWOverAll, panelCOverAll;
	JLabel qLabelOverAll, answerLabelOverAll;
	JButton nextButtonOverAll;
	
	ImageIcon imageOverAll = new ImageIcon("Inked111.jpg");
	
	public void overAllFrame() {
		this.name = nameField.getText();
		round += 1;
		buttonsOverAll();
		labelsOverAll();
		panelsOverAll();
		frameOverAll();
	}
	
	
	ActionListener ActionListenerOverAll = new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == nextButtonOverAll) {
				frame.remove(frameOverAll);
				panelFrame.setVisible(true);
				storeData();
				resetScore();
			}
		}
	};
	
	
	public void frameOverAll() {
		frameOverAll = new JPanel();
		frameOverAll.setLayout(new BorderLayout(10, 10));
		frameOverAll.setSize(1200, 700);
		
		frameOverAll.add(panelNOverAll, BorderLayout.NORTH);
		frameOverAll.add(panelSOverAll, BorderLayout.SOUTH);
		frameOverAll.add(panelEOverAll, BorderLayout.EAST);
		frameOverAll.add(panelWOverAll, BorderLayout.WEST);
		frameOverAll.add(panelCOverAll, BorderLayout.CENTER);
		
		frameOverAll.setVisible(true);
	}
	
	
	public void panelsOverAll() {
		panelNOverAll = new JPanel();
		panelNOverAll.setBackground(Color.LIGHT_GRAY);
		
		panelSOverAll = new JPanel();
		panelSOverAll.setBackground(Color.LIGHT_GRAY);
		panelSOverAll.setLayout(new BorderLayout());
		panelSOverAll.add(nextButtonOverAll, BorderLayout.CENTER);
		
		panelEOverAll = new JPanel();
		panelEOverAll.setBackground(Color.LIGHT_GRAY);
		
		panelWOverAll = new JPanel();
		panelWOverAll.setBackground(Color.LIGHT_GRAY);
		
		panelCOverAll = new JPanel();
		panelCOverAll.setOpaque(true);
		panelCOverAll.setBackground(Color.LIGHT_GRAY);
		panelCOverAll.setLayout(new GridLayout(2, 0));
		panelCOverAll.add(answerLabelOverAll);
		panelCOverAll.add(qLabelOverAll);
	}
	
	public void labelsOverAll() {
		
		answerLabelOverAll = new JLabel();
		answerLabelOverAll.setFont(new Font("ALGERIAN", Font.BOLD, 150));
		answerLabelOverAll.setHorizontalAlignment(JLabel.CENTER);
		answerLabelOverAll.setVerticalAlignment(JLabel.CENTER);
		answerLabelOverAll.setText("Score : " + score);
		
		qLabelOverAll = new JLabel();
		qLabelOverAll.setFont(new Font("ALGERIAN", Font.BOLD, 100));
		qLabelOverAll.setHorizontalAlignment(JLabel.CENTER);
		qLabelOverAll.setVerticalAlignment(JLabel.CENTER);
		qLabelOverAll.setText("Name : " + nameField.getText());
	}
	
	public void buttonsOverAll() {
		
		nextButtonOverAll = new JButton("End");
		nextButtonOverAll.setFont(new Font("nextButton", Font.PLAIN, 30));
		nextButtonOverAll.setVisible(true);
		nextButtonOverAll.addActionListener(ActionListenerOverAll);
	}
}
