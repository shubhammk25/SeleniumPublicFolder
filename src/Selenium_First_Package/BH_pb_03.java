package Selenium_First_Package;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BH_pb_03 {
	
	public static void main(String[] args) throws InterruptedException {

		ChromeDriver rv = new ChromeDriver();
		// open app
		rv.get("https://www.google.com");
		Thread.sleep(3000);
		//check dimension
		int Bhi=rv.manage().window().getSize().getHeight();
		System.out.println("hight:-"+Bhi);
		int Bwi=rv.manage().window().getSize().getWidth();
		System.out.println("widhth:-"+Bwi);
		//changes browser size
		Dimension d = new Dimension( Bhi/2, Bwi/2);
		rv.manage().window().setSize(d);
		Thread.sleep(3000);
		//check position
		int x_pos=rv.manage().window().getPosition().getX();
		System.out.println("X position:-"+x_pos);
		int y_pos=rv.manage().window().getPosition().getY();
		System.out.println("Y position:-"+y_pos);
		//change position
		Point p=new Point(x_pos*-4,y_pos*-4);
		rv.manage().window().setPosition(p);
		rv.close();
		
		

	}

}
