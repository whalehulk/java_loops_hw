public class question11{

	public static void main(String[] args){

		for(int i=0;i<3;i++)
		{
			for(int j=0;j<=5;j++)
			{

				if(j==i || j==(5-i)){
					System.out.print("*");

				}
				System.out.print(" ");
			}
			System.out.print("\n");
		}
	}
}