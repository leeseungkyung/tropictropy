package main.board;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import main.front.CommandService;

public class selectService implements CommandService{

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		int num =Integer.parseInt(request.getParameter("num"));
		
		boardDAO dao = boardDAO.getDao();
		boardDTO dto =dao.selectNum(num);
		
		request.setAttribute("select", dto);
		
		return "formselect.jsp";
	}

	@Override
	public boolean getType() {
		// TODO Auto-generated method stub
		return false;
	}

}
