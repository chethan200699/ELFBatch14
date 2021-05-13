package genriclib;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SelectClassGenric {

	public void selectByMethod(WebElement elementaddress,String input)
	{
		Select select=new Select(elementaddress);
		if(input=="0")
		{
			select.selectByIndex(0);
		}
		List<WebElement> alloptions = select.getOptions();
		for (WebElement Singleoption : alloptions) {
			String optionText = Singleoption.getText();
			String optionvalue = Singleoption.getAttribute("value");
			try{
			if(input.equals(optionText))
			{
				select.selectByVisibleText(input);
				break;
			}
			else if (input.equals(optionvalue)) {
				
			select.selectByValue(input);
			break;
			}
			}
			catch (Exception e) {
			 select.selectByIndex(Integer.parseInt(input));
			}
			
		}
	}
}