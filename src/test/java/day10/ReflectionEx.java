package day10;

import java.lang.reflect.Method;

public class ReflectionEx 
{
	public static void main(String[] args) throws Exception
	{
		Class cl=Class.forName("org.openqa.selenium.chrome.ChromeDriver");
		Method[] mt=cl.getDeclaredMethods();
		for(Method m:mt)
		{
			System.out.println(m.getName());
		}
		mt=cl.getMethods();
		System.out.println("\n");
		for(Method m:mt)
		{
			System.out.println(m.getName());
		}
		System.out.println(cl.getSuperclass());
	}

}
