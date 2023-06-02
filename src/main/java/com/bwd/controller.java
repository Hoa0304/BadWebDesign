package com.bwd;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class controller {

	
	
	@RequestMapping("/")
	public String homepagevn() {
		return "homepage";
	}

	@RequestMapping("/home")
	public String homepageVN() {
		return "homepage";
	}
	
	@RequestMapping("/home-uk")
	public String homepageEL() {
		return "homepageel";
	}
	@RequestMapping("/gioithieu-vn")
	public String gioithieuvn() {
		return "gioithieuvn";
	}
	
	@RequestMapping("/daihoc-vn")
	public String listdaihoc() {
		return "daihoc-vn";
	}
	@RequestMapping("/caodang-vn")
	public String listcaodang() {
		return "caodang-vn";
	}
	@RequestMapping("/optionlogin")
	public String option() {
		return "login/option";
	}
	@RequestMapping("/login-student-vn")
	public String loginStudent() {
		return "login/student-vn";
	}
	@RequestMapping("/login-university-vn")
	public String loginUniversity() {
		return "login/university-vn";
	}
	@RequestMapping("/login-admin-vn")
	public String loginAdmin() {
		return "login/admin-vn";
	}
	@RequestMapping("/timkiem-vn")
	public String timkiemVN() {
		return "timkiem-vn";
	}
	@RequestMapping("/tintuyensinh-vn")
	public String tintuyensinhVN() {
		return "login/message";
	}
	@RequestMapping("/sukien-vn")
	public String sukienVN() {
		return "login/message";
	}
	
	@RequestMapping("/thongtin-2")
	public String thongtin2() {
        return "thongtin2";
	}
	@RequestMapping("/xemthemnganh-vn")
	public String xemthemnganhVN() {
		return "nhomnganh-vn";
	}
	
}
