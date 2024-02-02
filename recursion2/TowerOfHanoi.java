package recursion2;

public class TowerOfHanoi {
	
	public static void towerOfHanoi(int disks, char source, char helper , char destination) {
		
		if (disks==1) {
			System.out.println("move 1st disk from " + source + " to "+ destination);
			return;
		}
		
		towerOfHanoi(disks-1, source, destination, helper);
		System.out.println( "move" + disks + " from " + source + " to  " + destination );
		towerOfHanoi(disks -1 , helper , source , destination);
	}

	public static void main(String[] args) {
		towerOfHanoi(5, 'a' , 'b' , 'c');
		

	}

}
