package pl.ireneuszderucki.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class HomeController {
	
	@GetMapping("/hello")
	private String goHello() {
		return "main";
	}
	
	@GetMapping("/")
	private String goUpload(MultipartFile file, Model model) {
		model.addAttribute("file", file);
		return "fileUpload";
	}
	
	@PostMapping("/upload")
	public String submit(@RequestParam("file") MultipartFile file, Model model) {
	    model.addAttribute("file", file);
	    return "main";
	}

}
