package th.co.gosoft.spring.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
public class HelloWord {
	
		@RequestMapping("/")
		public String welcome()
		{
			return "HelloWorld";
		}
}
