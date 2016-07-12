import java.io.*;
import java.util.*;
public class CommonFriends {

	public static void main(String[] args) 
			throws FileNotFoundException{
		
		int line = 0;
		int count = 0;
		int count2 = 0;
		int num = 0;
		boolean flag = false;
		
		List<String> list = new ArrayList<String>();

		List<String> friends = new ArrayList<String>();
		List<String> friends2 = new ArrayList<String>();
		Scanner input = new Scanner(new File("friends.txt"));
		
		friends = new ArrayList<String>(Arrays.asList(input.nextLine().split(" "))); 
		friends2 = new ArrayList<String>(Arrays.asList(input.nextLine().split(" "))); 
		
		
		for (int i = 2; i <= friends2.size()-1; i++){
			if (friends.contains(friends2.get(i))){
				count++;
			}
		}

		
		System.out.println(friends.get(0) + " and " + friends2.get(0) + " have the following common friends: " );
		


		for (int i = 2; i <= friends2.size()-1; i++){
		
			if(search(friends, friends2.get(i))){
				System.out.print(friends2.get(i) + " ");
				count2++;
			}
		}

	//if (count2 > 0){
		System.out.print("\nThere are " + count2 + " friends in common");
	//}
	//else{
	//	System.out.println("");
	//}
	}
	


	public static boolean search(List<String> searchList, String searchName){
		
	for (int i = 2; i <= searchList.size() - 1; i++){
		if (searchList.get(i).equalsIgnoreCase(searchName)){
			return true;
		}
		}
	return false;
	}
}
