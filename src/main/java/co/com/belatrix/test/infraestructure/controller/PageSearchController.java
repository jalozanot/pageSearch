package co.com.belatrix.test.infraestructure.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/search")
public class PageSearchController {
	
	@GetMapping
	public String listar() {
		return "Ok";
	}

}
