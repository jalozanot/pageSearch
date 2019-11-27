package co.com.pagesearch.demo.infraestructure.controller;

import co.com.pagesearch.demo.application.SaveUrlContent;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/search")
public class PageSearchController {

	private SaveUrlContent saveUrlContent;

	public PageSearchController(SaveUrlContent saveUrlContent ){
		this.saveUrlContent = saveUrlContent ;
	}
	
	@GetMapping("/{path}")
	public String listar(@PathVariable final String path) {

		//FileUtils.getStreamFromDirectory(path.replace("_", "\\")).get().forEach(System.out :: println  );
		this.saveUrlContent.handler();
		return "Succeful";
	}

}


