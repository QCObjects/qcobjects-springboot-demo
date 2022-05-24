package com.qcobjects.demoweb.demoweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@SpringBootApplication
@Controller
public class DemowebApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemowebApplication.class, args);
	}
	
	@GetMapping("/")
	public String index() {
		return "index";
	}

	@GetMapping("/templates/components/{templatename}.tpl.html")
	public String showTemplate(@PathVariable String templatename) {
		return "components/"+templatename+".tpl.html";
	}
	
	@GetMapping("/js/{scriptfilename}.js")
	public String showJs(@PathVariable String scriptfilename) {
		return "js/"+scriptfilename+".js";
	}

	@GetMapping("/js/packages/{scriptfilename}.js")
	public String showJsPackages(@PathVariable String scriptfilename) {
		return "js/packages/"+scriptfilename+".js";
	}	
	
}
