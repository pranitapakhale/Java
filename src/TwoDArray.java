
public class TwoDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][] = new int[3][2];
		arr[0][0] =10;
		arr[0][1]=20;
		arr[1][0]=30;
		arr[1][1]=40;
		arr[2][0]=50;
		arr[2][1]=60;
		
		System.out.println(arr[1][0]);
		System.out.println(arr[2][1]);
		
		
		for(int i =0 ;i < 3 ;i++)
		{
			for (int j=0; j<2 ; j++)
			{
				System.out.print(arr[i][j] + " ");
			}
			System.out.println("");
		}
	}

}
