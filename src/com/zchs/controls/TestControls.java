package com.zchs.controls;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
* @author 作者 E-mail:Tian
* @version 创建时间：2018年8月21日 下午2:19:38
* 类说明
*/
@Controller
public class TestControls {
	
	
	@GetMapping("/getmath")
	public void getmath() {
		System.err.println("heheheheh");
	}
	
	@GetMapping("/infomath")
	public void infomath() {
		System.err.println("草集游戏");
		System.err.println("ascansjcnj");
	}
}
