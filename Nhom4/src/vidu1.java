import java.util.Random;
public class vidu1 {

	public static void main(String[] args) {
		while(true)
		{
			Random r = new Random();
			int sx = r.nextInt(10000);
			System.out.println("Bien so: " + sx);
			int sum = 0,sx_num = sx,numcheck = sx_num % 10;
			boolean isCheck = false;
			while(sx_num != 0) {
				int num = sx_num % 10;
				if(num > numcheck) {
					isCheck = true;
					break;
				}
				numcheck = num;
				sx_num /= 10;
			}
			if(!isCheck)
			{
				while(sx != 0) {
					sum += sx % 10;
					sx /= 10;
				}
				if(sum % 10 == 9) {
					System.out.println("Xe nay 9 diem");
					break;
				}	
			}
		}
	}

}
