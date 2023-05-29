package Selenium_First_Package;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script_02 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver rv=new ChromeDriver();
		rv.navigate().to("https://www.google.com");
		Thread.sleep(3000);
		//print browser dimensions
		int Bheight=rv.manage().window().getSize().getHeight();
		System.out.println("Browser Height:-"+Bheight);
		int Bwidhth=rv.manage().window().getSize().getWidth();
		System.out.println("Browser Widhth:-"+Bwidhth);
		
		//Browser position
		int b_Xloc=rv.manage().window().getPosition().getX();
		System.out.println("Broswer x location:-"+b_Xloc);
		int b_Yloc=rv.manage().window().getPosition().getY();
		System.out.println("Broser y location:-"+b_Yloc);
		
		//print title
		String title=rv.getTitle();
		System.out.println("Title:-"+title);
		//print url
		String url=rv.getCurrentUrl();
		System.out.println("URL:-"+url);
		
	}

}
