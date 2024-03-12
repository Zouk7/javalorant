import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class vidu1 {

	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);

			SimpleDateFormat f = new SimpleDateFormat("HH:mm dd/MM/yyyy");
			Date dt1 = f.parse(sc.nextLine());
			Date dt2 = f.parse(sc.nextLine());
			Long time = dt2.getTime() - dt1.getTime();
			double hour = (double) time / 1000 / 60 / 60;
			System.out.println(hour);

			System.out.println("Nhập loại xe: \n1.Xe Đạp\n2.Xe máy\n3.Xe oto\nNhập:");
			int loaixe = sc.nextInt();
			// sc.nextLine();
			hour = Math.ceil(hour);

			double total = 0;
			if (loaixe == 1) {
				total = hour * 500;
			} else if (loaixe == 2) {
				total = hour * 1000;
			} else if (loaixe == 3) {
				total = hour * 2000;
			}
			System.out.println("Tổng tiền gửi xe là: " + (int) total);

			sc.close();

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
