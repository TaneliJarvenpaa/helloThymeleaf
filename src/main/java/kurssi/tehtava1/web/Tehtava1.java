package kurssi.tehtava1.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Tehtava1 {
	
	@RequestMapping("index")
	@ResponseBody
	public String ShowIndexPage() {
		return "This is the main page";
	}
	@RequestMapping("contact")
	@ResponseBody
	public String ShowContactPage() {
		return "This is the contact page";
	}
	
	@RequestMapping("hello")
	@ResponseBody
	public String sayHello(@RequestParam (name="location", required=false,defaultValue="paikka")
	String location, @RequestParam(name="name",required=false,defaultValue="nimi") String name){
		return "Welcome to the "+location+" "+name+"!";
		
	}
	
	
	
}

