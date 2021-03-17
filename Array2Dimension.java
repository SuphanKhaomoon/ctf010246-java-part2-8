package CTF01.Java.part2.No8;

public class Array2Dimension
{

	public static void main(String[] args)
	{
//		1. ทดลองสร้างอาเรย์ 2 มิติ และ วนลูปแล้ว print ให้
//		ครบทุกจำนวน (หน้าที่แล้ว)
		System.out.print("1. ผลจากการ print อาเรย์ 2 มิติ : ");
		int[][] myArray = {
				{ 11, 12, 13 },
				{ 15, 14, 16, 17 },
				{ 18, 19 } 
		};
		for (int[] row : myArray)
		{
			for (int element : row)
			{
				System.out.print(element + " ");
			}
		}
		System.out.println();

//		2. ทดลองดึงค่าในอาเรย์ 2 มิติ เอาสมาชิกตัวสุดท้าย
//		ของแต่ละแถวจากการวนลูป มาบวกกัน และ แสดง
//		ผลลัพธ์จากการบวกกันบน Console
		System.out.print ("2. ค่าสมาชิกตัวสุดท้ายใน อาเรย์ 2 มิติ ได้แก่ ");
		int result = 0;
		for (int row = 0; row < myArray.length; row++)
		{
			for (int element = 0; element < myArray[row].length; element++)
			{	
				if (element == myArray[row].length -1)
				{				
					System.out.print(myArray[row][element] + " ");
					result += myArray[row][element];
				}
			}
		}
		System.out.println();
		System.out.println("ผลลัพธ์จากการบวกกัน คือ " + result);

	}

}
