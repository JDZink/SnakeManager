package web.controllers;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import data.SnakeDAO;

@Controller
public class SnakeManager {
	
	@Autowired
	private SnakeDAO snakeDAO;
	
	@RequestMapping("index.do")
	public ModelAndView displayIndexOfSnakes(HttpSession session){
		ModelAndView mv = new ModelAndView();
		mv.setViewName("index.jsp");
		session.setAttribute("allSnakes", snakeDAO.getAllSnakes());
		return mv;
	}
	
}
