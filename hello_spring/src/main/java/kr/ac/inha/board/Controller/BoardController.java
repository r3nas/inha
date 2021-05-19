package kr.ac.inha.board.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BoardController {
	@RequestMapping("/hello")
	public String hello(int param) {
		String result="";
		for (int i = 1; i < 9; i++) {
			result = result + param + "*" + i;
			result = result + "="+ (int) (param * i)+"<br>";
		}
		return result;
	}

	@RequestMapping("/inha")
	public String inha(String param) {
		return param + "inha.ac.kr";
	}

	@RequestMapping("/getsid")
	public String name(String id) {
		return "학번 : " + id;
	}
}
