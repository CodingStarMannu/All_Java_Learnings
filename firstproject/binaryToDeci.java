package firstproject;
import java.util.Scanner;
public class binaryToDeci {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int n = s.nextInt();

		int pv= 1;
		int ans = 0;
		int lastd = n%10;
		for (int i=1; i<=n;i++){
			if (lastd!=0){
				ans= lastd*pv;
				pv = pv*2;
				System.out.println(ans);
			}
			else {
			break;
		}

	}

}
}
