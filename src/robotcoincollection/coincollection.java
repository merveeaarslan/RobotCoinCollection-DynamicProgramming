package robotcoincollection;

public class coincollection {
	public static double maxValue(int [][] plane)
	{
	 int row=plane.length;
	 int column=plane[0].length;
	 int[][]dizi=new int[row][column];
	 
	 dizi[0][0]=plane[0][0];
	 for(int sütun=1;sütun<column;sütun++)
	 {
		 dizi[0][sütun]=dizi[0][sütun-1]+plane[0][sütun];
	 }
	 for(int satir=1;satir<row;satir++)
	 {
		 dizi[satir][0]=dizi[satir-1][0]+plane[satir][0];
		 
		 for(int sütun=1;sütun<column;sütun++)
		 {
			 dizi[satir][sütun]=Math.max(dizi[satir-1][sütun],dizi[satir][sütun-1])+plane[satir][sütun];
		 }
		 
	 }
	 
	 //yol matrisi
	 System.out.println("dizi[][]");
	 System.out.println("---------------");
	 for(int satir=0;satir<row;satir++)
	 {
		 for(int sütun=0;sütun<column;sütun++)
		 {
			 System.out.print(dizi[satir][sütun]+" ");
		 }
		 System.out.println();
	 }
	 return dizi[row-1][column-1];
	}
	
	
	public static void main(String[] args)
	{
		int[][] plane=new int[5][5];
		
		plane[0][0]=1;
		plane[1][1]=3;
		plane[1][3]=5;
		plane[2][2]=6;
		plane[4][2]=4;
		plane[4][4]=1;
		
		System.out.println("plane[][]");
		System.out.println("----------");
		for(int satir=0;satir<5;satir++)
		{
			for(int sütun=0;sütun<5;sütun++)
			{
				System.out.print(plane[satir][sütun]+" ");
			}
			System.out.println();
		}
		System.out.println("MAX COÝNS:"+maxValue(plane));
	}

}
