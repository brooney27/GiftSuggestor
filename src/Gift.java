import java.util.*;

public class Gift {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.println("Enter gender of recipient(m/f): ");
		String gender = in.nextLine();
		System.out.println("Enter price range(high/medium/low)): ");
		String price = in.nextLine();
		
		String[] prices = {"high","high","low","low","medium","medium","high","high","low","low","medium","medium",};
		String[] gifts = {"Jewelry","Weekend Getaway","Wine","Selfie Stick","Perfume","Sweater","Smart TV","Apple Watch","Books","Shoes","Guitar","Playstation"};
		String[] genders = {"f","f","f","f","f","f","m","m","m","m","m","m"};
		
		for(int i = 0; i < gifts.length;i++){
			if(prices[i].equals(price)&&genders[i].equals(gender))
				System.out.println("You could get a " + gifts[i]);
		}
	}
}
