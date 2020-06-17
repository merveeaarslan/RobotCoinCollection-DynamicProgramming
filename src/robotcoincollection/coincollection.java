package robotcoincollection;

public class coincollection {
	public static double maxValue(int [][] plane)
	{
	 int row=plane.length;
	 int column=plane[0].length;
	 int[][]dizi=new int[row][column];
	 
	 dizi[0][0]=plane[0][0];
	 for(int s�tun=1;s�tun<column;s�tun++)
	 {
		 dizi[0][s�tun]=dizi[0][s�tun-1]+plane[0][s�tun];
	 }
	 for(int satir=1;satir<row;satir++)
	 {
		 dizi[satir][0]=dizi[satir-1][0]+plane[satir][0];
		 
		 for(int s�tun=1;s�tun<column;s�tun++)
		 {
			 dizi[satir][s�tun]=Math.max(dizi[satir-1][s�tun],dizi[satir][s�tun-1])+plane[satir][s�tun];
		 }
		 
	 }
	 
	 //yol matrisi
	 System.out.println("dizi[][]");
	 System.out.println("---------------");
	 for(int satir=0;satir<row;satir++)
	 {
		 for(int s�tun=0;s�tun<column;s�tun++)
		 {
			 System.out.print(dizi[satir][s�tun]+" ");
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
			for(int s�tun=0;s�tun<5;s�tun++)
			{
				System.out.print(plane[satir][s�tun]+" ");
			}
			System.out.println();
		}
		System.out.println("MAX CO�NS:"+maxValue(plane));
	}

}
