package Learning.PaginationLearning;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

/*Logic:
1. First we have to chk whether the pagination available
    -Identify the pagination footer and get the size
    -If the size is greater than zero, there is a pagination, if not we did't perform any opertaion
2. We need to get names from all the pages from the Webtable
    - We need two lists
    - List<String> empty list to store all the name
    - List<WebElelemt>
3. Elements need:
    - Pagination footer
    -Next button
    -Cell for names
4. Exact logic:
    - Going to find size of the pagination, if its not a zero click the next button and fetch ames from table
    - Find names and store it in the List<WebElelemt>
    - create foreach loop and iterate and store the names on  List<String>
    -
 */
public class Pagination {
    static String nxtClassName;

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://mdbootstrap.com/docs/b4/jquery/tables/pagination/#introduction");
        driver.manage().window().maximize();

        List<String> namesList = new ArrayList<String>();
        List<WebElement> lisofNames;
        WebElement nxtButton;

        //Check whether pagination available
        int paginationSize = driver.findElements(By.xpath("//div[@id='dtBasicExample_paginate']//a")).size();

        if (paginationSize > 0) {
            /*lisofNames = driver.findElements(By.xpath("//td[@class='sorting_1']"));
            for (WebElement name : lisofNames) {
                namesList.add(name.getText());
            }*/
            //We have to add the above code into the below loop for print all names
            while (true) {
                lisofNames = driver.findElements(By.xpath("//td[@class='sorting_1']"));
                for (WebElement name : lisofNames) {
                    namesList.add(name.getText());
                }
                nxtButton = driver.findElement(By.id("dtBasicExample_next"));
                //We have to click next button untill the button disabled
                //Find out the class name (when we click 6 the page, button disbaled)
                nxtClassName = nxtButton.getAttribute("class");
                if (!nxtClassName.contains("disabled")) {
                    nxtButton.click();
                } else {
                    break;
                }
            }

        } else {
            System.out.println("Pagination not available");
        }

        for (String allNames : namesList) {
            System.out.println(allNames);

        }

    }
}
