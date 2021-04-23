package helper;

import org.openqa.selenium.remote.DesiredCapabilities;

public class GridBrowserSet
{
	public static DesiredCapabilities startbrowser(String name)
	{
		DesiredCapabilities dc;
		if(name.equalsIgnoreCase("chrome"))
		{
			 dc=DesiredCapabilities.chrome();
			
		}
		else if(name.equalsIgnoreCase("firefox"))
		{
			dc=DesiredCapabilities.firefox();
			
		}
		else
		{
			dc=DesiredCapabilities.chrome();
			
		}
		return dc;
		
	}
}


