package com.jkdev.glassthunk.readerApp.catController;

 

import java.util.List;
import java.util.Arrays;
 
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController	
public class CategoryController {
	
	@RequestMapping("/categories")
	public List <Category>getAllCategories(){
		return Arrays.asList( 
				new Category("Sports","SportingWorld","Whats the "
						+ "latest in the world of sports"),
				new Category("Politics","Politicing","Catch up with "
						+ "the news and scandals in the world"),
				new Category("Football","MatchDay","Keep up with "
						+ "the latest footie news")
				
				);
	}

}
