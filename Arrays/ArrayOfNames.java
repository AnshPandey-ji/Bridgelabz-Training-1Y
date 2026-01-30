import java.util.Scanner;

class ArrayOfNames{
	public static void main(String[] args){
		String[] arr = new String[5];
		arr[0] = "Shiv Narayan ";
		arr[1] = "Sarthak";
		arr[2] = "Akash";
		arr[3] = "Ansh";

		arr[4] = "Mohan";
		for(int i=0;i<5;i++) {
			System.out.println(arr[i]+ " ");
		}
	}
}