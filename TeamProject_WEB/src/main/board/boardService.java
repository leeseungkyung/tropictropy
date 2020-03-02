package main.board;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import main.front.CommandService;

public class boardService implements CommandService{

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		boardDAO dao = boardDAO.getDao();//준비자
		ArrayList<boardDTO> list = dao.selectAll();

		request.setAttribute("boardlist", list);//전달자

		return "board.jsp"; // 화면에 보여질 위치
	}

	@Override
	public boolean getType() {
		// TODO Auto-generated method stub
		return false;
	}

	
	
}
