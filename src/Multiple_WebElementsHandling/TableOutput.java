package Multiple_WebElementsHandling;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class TableOutput {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver rv = new ChromeDriver();
		rv.get("file:///C:/Users/admin/OneDrive/Desktop/API/HTML_Automation/seleniumTable.html");
		rv.manage().window().maximize();
		List<WebElement> row = rv.findElements(By.xpath(".//tr"));
		int count = row.size();
		System.out.println("Total nos of rows are present in web page : " + count);
		System.out.println("--------------------------");
		List<WebElement> subject = rv.findElements(By.xpath(".//tr/td[2]"));
		int sub_count = subject.size();
		System.out.println("Total nos of subjects are present in web page :" + sub_count);
		System.out.println("--------------------------");
		List<WebElement> third_row = rv.findElements(By.xpath(".//tr[3]/td"));
		int td_count = third_row.size();
		System.out.println("No of data is present in 3rd row :" + td_count);
		for (WebElement data : third_row) {
			String data_output = data.getText();
			System.out.println("row dats is :" + data_output);
		}
		System.out.println("--------------------------");
		List<WebElement> cost = rv.findElements(By.xpath(".//tr/td[3]"));
		int total_cost = cost.size();
		int sum = 0;
		for (WebElement ttl_cost : cost) {
			String out_cost = ttl_cost.getText();
			int cost1 = Integer.parseInt(out_cost);
			sum = sum + cost1;
		}
		String total_cost1 = rv.findElement(By.xpath(".//tr[6]/th[2]")).getText();
		int total = Integer.parseInt(total_cost1);
		System.out.println("total cost is present on webpage is:" + total_cost1);
		System.out.println("Total cost as per addition of the cost is:" + sum);
		if (sum == total) {
			System.out.println("The total cost is correct");
		} else {
			System.out.println("The total cost is not matching");
		}
		rv.close();
	}
}
