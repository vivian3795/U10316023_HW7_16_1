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
	ImageIcon[][] arr = new ImageIcon[4][13];
	
	//constructor
	public cards(){
		//set cards into array
		for(int c = 1 ; c <= 52 ; c++){
			if( c < 14 ){
				int i = 0;
				for(int j = 0 ; j < 13  ; j++){
					String nowcard = "card/" + c + ".png";
					arr[i][j] = new ImageIcon("card/"+c+".png");
				}
			}else if( c < 27 && c > 12){
				int i = 1;
				for(int j = 0 ; j < 13  ; j++){
					String nowcard = "card/" + c + ".png";
					arr[i][j] = new ImageIcon("card/"+c+".png");
				}
			}else if( c < 40 && c > 25){
				int i = 2;
				for(int j = 0 ; j < 13  ; j++){
					String nowcard = "card/" + c + ".png";
					arr[i][j] = new ImageIcon("card/"+c+".png");
				}
			}else {
				int i = 3;
				for(int j = 0 ; j < 13  ; j++){
					String nowcard = "card/" + c + ".png";
					arr[i][j] = new ImageIcon("card/"+c+".png");
				}
			}
		}
		//set layout
		setLayout(new GridLayout(1,5,5,5));
		//random four cards
		for(int i = 0 ;  i < 4 ; i++){
			Random ran = new Random();
			int r = ran.nextInt(4);
			int c = ran.nextInt(13);
			add(new JLabel(arr[r][c]));
		}
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
