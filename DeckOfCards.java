/**
 * ID: U10316023 
 * Ex: 16.1
 * Information:
 *		DeckOfCards class is written according to the requirements on P656.
 */
 
 import javax.swing.*;
 import java.awt.event.*;
 import java.awt.*;

public class DeckOfCards extends JFrame{
	int[] deck = new int[52];
	//create an imageicon array
	ImageIcon[] arr = new ImageIcon[52];
	
	//create a JPanel called Ran and four cards label
	JPanel Ran = new JPanel();
	JLabel card1 = new JLabel();
	JLabel card2 = new JLabel();
	JLabel card3 = new JLabel();
	JLabel card4 = new JLabel();
	//create a JPanel called Re and refresh button
	JPanel Re = new JPanel();	
	JButton refresh = new JButton("Refresh");
	
	//constructor
	 DeckOfCards(){
		// Initialize cards
		for (int i = 0; i < deck.length; i++)
		deck[i] = i;
		
		//set cards into array
		for(int c = 1 ; c <= 52 ; c++){
			//put all of cards in file card and named them 1-52 .png 
			//arr[0] store 1.png, arr[1] store 2.png, and so on
			arr[c-1] = new ImageIcon("card/"+c+".png");
		}
			
		//set layout
		Ran.setLayout(new GridLayout(1,4));
		//pick four cards
		shuffle();
		Ran.add(card1);
		Ran.add(card2);	
		Ran.add(card3);	
		Ran.add(card4);	
		
		//create a button called Refresh
		Re.add(refresh);
		
		//add to frame
		add(Ran,BorderLayout.NORTH);
		add(Re,BorderLayout.SOUTH);

		//register listener
		refresh.addActionListener(new FreshListener()); 
	}
	 
	 void shuffle(){
		// Shuffle the cards
		for (int i = 0; i < deck.length; i++) {
			// Generate an index randomly
			int index = (int)(Math.random() * deck.length);
			int temp = deck[i];
			deck[i] = deck[index]; 
			deck[index] = temp;
		}
		//set four cards label's icon  
		card1.setIcon(arr[deck[0]]);
		card2.setIcon(arr[deck[1]]);
		card3.setIcon(arr[deck[2]]);
		card4.setIcon(arr[deck[3]]);
	}
	
	//listener class
	private class FreshListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e){
			//refresh four cards
			shuffle();
		}
	}
	
  public static void main(String[] args) {
    	//create cards object 
		cards CARDS = new cards();
		//set title
		CARDS.setTitle("Pick Four Cards");
		//set size
		CARDS.setSize(300,170);
		//center the frame
		CARDS.setLocationRelativeTo(null);
		//terminate when the frame is closed
		CARDS.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//set visible
		CARDS.setVisible(true);
	}
 }
