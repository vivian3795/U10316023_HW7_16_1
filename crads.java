/**
 * ID: U10316023 
 * Ex: 16.1
 * Information:
 *		cards class is written according to the requirements on P656.
 */
 
 import javax.swing.*;
 import java.awt.*;
 import java.util.Random;
 
public class cards extends JFrame{
	//create an imageicon array
	ImageIcon[] arr = new ImageIcon[52];
	
	//constructor
	public cards(){
		//set cards into array
		for(int c = 1 ; c <= 52 ; c++){
			arr[c-1] = new ImageIcon("card/"+c+".png");
		}
		
		//set layout
		setLayout(new GridLayout(1,5,5,5));

		//random four cards
		Random ran = new Random();
		int r1,r2,r3,r4;
		do{
		r1 = ran.nextInt(52);
		r2 = ran.nextInt(52);
		r3 = ran.nextInt(52);
		r4 = ran.nextInt(52);
		}while((r1 == r2) || (r1 == r3) || (r1 == r4)
		|| (r3 == r2) || (r4 == r2) || (r3 == r4));
		add(new JLabel(arr[r1]));
		add(new JLabel(arr[r2]));
		add(new JLabel(arr[r3]));
		add(new JLabel(arr[r4]));
	}

	//main method
	public static void main(String[] args) {
		//create cards object 
		cards CARDS = new cards();
		//set title
		CARDS.setTitle("Pick Four Cards");
		//set size
		CARDS.setSize(400,150);
		//center the frame
		CARDS.setLocationRelativeTo(null);
		//terminate when the frame is closed
		CARDS.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//set visible
		CARDS.setVisible(true);
	}
}
