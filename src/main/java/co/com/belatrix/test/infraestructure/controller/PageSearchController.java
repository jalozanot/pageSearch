package co.com.belatrix.test.infraestructure.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.com.belatrix.test.infraestructure.utils.FileUtils;


@RestController
@RequestMapping("/search")
public class PageSearchController {
	
	@GetMapping("/{path}")
	public String listar(@PathVariable final String path) {

		FileUtils.getStreamFromDirectory(path.replace("_", "\\")).get().forEach(System.out :: println  );

		return "Succeful";
		
	}

}


