package javaproject;
public class Snakesandladders {
public static void main(String args []) {

	int pos1 = 0;
	int pos2 = 0;
while(true) {
int die1 = ((int) (6*Math.random()))+1;
int play1 = (int) (3*Math.random());
System.out.println("Player 1");
System.out.println("die: "+die1);
if (play1==0) {
	System.out.println("No Play");
}
else if(play1==1) {
	System.out.println("Ladder");
	pos1 = pos1 + die1;
}
else {
	System.out.println("Snake");
	pos1 = pos1 - die1;
}
	if(pos1<0)
		pos1=0;
	if(pos1>=100) {
		pos1=100;
		System.out.println("Player 1 position: "+pos1);
		System.out.println("Winner is player 1");
		break;
	}
	System.out.println("Player 1 position: "+pos1);
	System.out.println("Player 2");
if (play2==0) {
		System.out.println("No Play");
	}
	else if(play2==1) {
		System.out.println("Ladder");
		pos2 = pos2 + die2;
	}
else {
		System.out.println("Snake");
		pos2 = pos2 - die2;
	}
		if(pos2<0)
			pos2=0;
		if(pos2>=100) {
			pos2=100;
			System.out.println("Player 2 position: "+pos2);
			System.out.println("Winner is player 2");
			break;
		}
		System.out.println("Player 2 position: "+pos2);


}
} 
}