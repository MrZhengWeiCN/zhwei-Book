package edu.zhwei.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.zhwei.pojo.Menu;
import edu.zhwei.pojo.Menutype;
import edu.zhwei.service.MenuService;

@Controller
public class PageController {

	@Autowired
	private MenuService menuService;
	
	@RequestMapping("/")
	public String index(HttpServletRequest request,Model model,Integer typeId){
		HttpSession session = request.getSession();
		List<Menutype> types = menuService.findAll();
		session.setAttribute("types", types);
		session.setMaxInactiveInterval(7*24*60*60);
		List<Menu> menus = null;
		if(typeId==null){
			menus = menuService.findAllMenu();
		}else {
			menus = menuService.selectTypeMenu(typeId);
		}
		model.addAttribute("menus", menus);
		return "index";
	}
}
