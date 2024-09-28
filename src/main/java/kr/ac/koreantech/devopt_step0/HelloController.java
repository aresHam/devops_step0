package kr.ac.koreantech.devopt_step0;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
  @GetMapping("/")
  public String index() {
    System.out.println("안녕하세요. DevOps입니다.");
      return "index.html";
  }
  
}
