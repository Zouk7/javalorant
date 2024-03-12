import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Random;

public class BtFile {
	public void TaoDanhSach(int n) {
		try {
			FileOutputStream f =new FileOutputStream("sv.txt");
			OutputStreamWriter o = new OutputStreamWriter(f);
			PrintWriter w = new PrintWriter(o);
			
			Random r = new Random();
			BtMang m = new BtMang();
			for(int i = 1;i <= n ;i++) {
				double dtb = r.nextDouble() * 10;
				w.println("Sv" + i + ";" + m.TaoHoTen() + ";" + m.TaoNgay("01/01/1960", "01/01/2000") + ";" + dtb);
 			}
			w.close();
			System.out.println("Da tao xong");
		} catch (Exception tt) {
			System.out.println("Loi o ham TaoDanh sach: " + tt.getMessage());
			// TODO: handle exception
		}
	}
	public void XuatDanhSach() 
	{
		try {
			FileInputStream f = new FileInputStream("sv.txt");
			InputStreamReader ir = new InputStreamReader(f);
			BufferedReader r = new BufferedReader(ir);
			while(true) {
				String st = r.readLine();
				if(st == "" || st == null)
					break;
				String[] ds = st.split("[;]");
				System.out.println(ds[0] + "\n" + ds[1] + "\n" + ds[2] + "\n" + ds[3] + "\n\n");
			}
			r.close();
		} catch (Exception tt) {
			System.out.println("Loi o ham XuatDanh sach: " + tt.getMessage());
			// TODO: handle exception
		}

	}
}
