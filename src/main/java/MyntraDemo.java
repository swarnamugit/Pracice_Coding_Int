import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class MyntraDemo {

    public static void main(String[] args) throws IOException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.amazon.in/?&tag=googinhydmabk-21&ref=pd_sl_7lvdlypdab_e&adgrpid=159067175452&hvpone=&hvptwo=&hvadid=674834481520&hvpos=&hvnetw=g&hvrand=4087024466274376740&hvqmt=e&hvdev=m&hvdvcmdl=&hvlocint=&hvlocphy=9061994&hvtargid=kwd-10573980&hydadcr=28228_2321541&gad_source=1");

      //Search
        driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Tshirts", Keys.ENTER);
        // Capture the Pricer


        // To take screen //  For Screenshot we can either use FileUtlis class / or use Filehandler in Slenium's default
        TakesScreenshot sc=(TakesScreenshot) driver; // Webdriver cannot stored as screenshot so typecast
        File srcscreenshot=sc.getScreenshotAs(OutputType.FILE);
        //mention location
        //1. create a file location - create an object for File class
        File filedestination= new File("C://Users//swarn//OneDrive//Desktop//sample.png");
        FileHandler.copy(srcscreenshot,filedestination);


        List <WebElement> prices = driver.findElements(By.xpath("//div[@class='a-row']//span//span//span[contains(text(),'₹')]/following-sibling::span[@class='a-price-whole']"));

//        for (WebElement price : prices) {
//
//            System.out.println(price.getText());

            // converting to Array List

            List<Integer> priceList= new ArrayList<>();
            for (WebElement price : prices) {
                String priceText = price.getText();
                priceText = priceText.replace(",", "");

                //covert to interger
                int value = Integer.parseInt(priceText);
                priceList.add(value); // Storing the integer into Array

                System.out.println(priceList.size());
            }
                System.out.println("Before sort: " + priceList);


                //Sorting
                for(int i=0; i<priceList.size()-1;i++){
                    for(int j=0;j<priceList.size()-1;j++){
                        if(priceList.get(j)>priceList.get(j+1)){
                            int temp= priceList.get(j);
                            priceList.set(j, priceList.get(j+1)); //Take value at index 1 → 284//Put it at index 0
                            priceList.set(j + 1, temp);

                            //int temp = priceList.get(j);                  // store 799
                            //priceList.set(j, priceList.get(j + 1));       // put 284 at index 0
                            //priceList.set(j + 1, temp);                  // put 799 at index 1

                        }
                    }
                }
                System.out.println("After Sort: " + priceList);

        }
    }


