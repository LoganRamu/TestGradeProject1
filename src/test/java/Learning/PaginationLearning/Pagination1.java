package Learning.PaginationLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

public class Pagination1 {
    static String disbaledValue;
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://mdbootstrap.com/docs/b4/jquery/tables/pagination/#introduction");
        driver.manage().window().maximize();
        List<String> nameList=new ArrayList<String>();
        WebElement btn;
        int pagination = driver.findElements(By.xpath("//div[@id='dtBasicExample_paginate']//a")).size();

        while(true)
        if(pagination>0)
        {
            List<WebElement> firstName = driver.findElements(By.xpath("//td[@class='sorting_1']"));

            for (WebElement names:firstName) {
                nameList.add(names.getText());
            }
                btn=driver.findElement(By.id("dtBasicExample_next"));
                disbaledValue=btn.getAttribute("class");
                if(!disbaledValue.contains("disabled"))
                {
                    btn.click();
                }
                else{
                    break;
                }

            }

            for (String allNames:nameList)
            {
            System.out.println(allNames);

            }
        }

}
