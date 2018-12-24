package intro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\razum_000\\Desktop\\Automation\\chromedriver.exe");
		WebDriver driver=new ChromeDriver ();
				driver.get("https://www.weightwatchers.com/us/");
				System.out.println (driver.getTitle());//validates page title
				driver.findElement(By.className("find-a-meeting")).click();
				System.out.println (driver.getTitle());//validates page title
				driver.findElement(By.id("meetingSearch")).sendKeys("10011");
				driver.findElement(By.xpath("//button[@class='btn spice-translated']")).click();
				String location = driver.findElement(By.xpath("//*[@id=\'ml-1180510\']/result-location/div/div[1]/a/location-address/div/div/div[1]/div[1]")).getText();
			    System.out.println("Location name:   " + location);
			    String distance = driver.findElement(By.className("location__distance")).getText();
			   System.out.println("Location distance:  "+ distance);
				driver.findElement(By.className("meeting-location")).click();
				
				String day = driver.findElement(By.xpath("//*[@id=\'content\']/div/div/ui-view/ui-view/div[1]/div[2]/div/div/div[1]/div/div/schedule-detailed/div/div[1]/div[1]")).getText();
                System.out.println("Schedule for:  " + day);
                String name = driver.findElement(By.xpath("//*[@id=\'content\']/div/div/ui-view/ui-view/div[1]/div[2]/div/div/div[1]/div/div/schedule-detailed/div/div[1]/div[2]/div[1]/div[2]")).getText();
                WebElement body = driver.findElement(By.tagName("body"));
                String bodyText = body.getText();

                // count occurrences of the string
                int count = 0;

                // search for the String within the text
                while (bodyText.contains(name)){

                    // when match is found, increment the count
                    count++;

                    // continue searching from where you left off
                    bodyText = bodyText.substring(bodyText.indexOf(name) + name.length());
                }  System.out.println("Name: "+ name + "  Total: " + count);
	}

}
