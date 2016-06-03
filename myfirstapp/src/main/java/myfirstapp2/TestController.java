package myfirstapp2;

import java.util.Arrays;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController 
{
	@RequestMapping("/")
	public String home()
	{
		return "Hello World";
	}
	
	@RequestMapping("/test")
	public String test()
	{
		String name = "TestName";
		name.toUpperCase();
		return name;
	}
	
	
	@RequestMapping("/fib")
	public String fibonacci(@RequestParam("n") int n)
	{
		int[] f = new int[n];
		f[0] = 1;
		f[1] = 1;
		for (int i = 2; i < n; i++)
		{
			f[i] = f[i-1] + f[i-2];
		}
		return Arrays.toString(f);
	}

}
