package day16multidimentionalarrays;

public class MultiDimArrays04 {

	public static void main(String[] args) {
		
		
		String arr[][] = {{"A", "B", "Y", "M"}, {"e", "K", "Z"}, {"L", "X", "e", "S"}};
		
		String s= "";
		
		for (int i = 0; i < arr.length; i++) {
			
			for (int j = 0; j < arr[i].length; j++) {
				
				if(arr[i][j].equals("B")) {
					s = s + arr[i][j];
					break;
				}else if(arr[i][j].endsWith("e")){
					s = s + arr[i][j];
					break;
				}
			}
			
		}

	}

}
