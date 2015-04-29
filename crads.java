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
	ImageIcon[][] arr = new ImageIcon[4][13];

	public cards(){
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

		setLayout(new GridLayout(1,5,5,5));
		for(int i = 0 ;  i < 4 ; i++){
			Random ran = new Random();
			int r = ran.nextInt(4);
			int c = ran.nextInt(13);
			String shuffle = "arr["+r+"]["+c+"]";
			add(new JLabel(shuffle));
		}
	}

	public static void main(String[] args) {
		cards CARDS = new cards();
		CARDS.setTitle("Pick Four Cards");
		CARDS.setSize(400,150);
		CARDS.setLocationRelativeTo(null);
		CARDS.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		CARDS.setVisible(true);
	}
}
