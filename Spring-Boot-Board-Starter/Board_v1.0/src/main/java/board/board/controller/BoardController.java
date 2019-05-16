package board.board.controller;
import board.board.entity.BoardEntity;
import board.board.service.BoardService;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BoardController {
	Logger log = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private BoardService BoardService;
	
	@RequestMapping(value="/board", method=RequestMethod.GET)
	public ModelAndView BoardList(ModelMap model) throws Exception{
		ModelAndView mav = new ModelAndView("/board/BoardList");
		List<BoardEntity> list = BoardService.selectBoardList();
		mav.addObject("list", list);
		return mav;
	}
	
	@RequestMapping(value="/board/write", method=RequestMethod.GET)
	public String BoardWrite() throws Exception{
		return "/board/BoardWrite";
	}
	
	@RequestMapping(value="/board/write", method=RequestMethod.POST)
	public String writeBoard(BoardEntity board) throws Exception{
		BoardService.saveBoard(board);
		return "redirect:/board";
	}
	
	@RequestMapping(value="/board/{boardIdx}", method=RequestMethod.GET)
	public ModelAndView BoardDetail(@PathVariable("boardIdx") int boardIdx) throws Exception{
		ModelAndView mav = new ModelAndView("/board/BoardDetail");
		BoardEntity board = BoardService.selectBoardDetail(boardIdx);
		mav.addObject("board", board);
		return mav;
	}
	
	@RequestMapping(value="/board/{boardIdx}", method=RequestMethod.PUT)
	public String saveBoard(BoardEntity board) throws Exception{
		BoardService.saveBoard(board);
		return "redirect:/board";
	}
	
	@RequestMapping(value="/board/{boardIdx}", method=RequestMethod.DELETE)
	public String deleteBoard(@PathVariable("boardIdx") int boardIdx) throws Exception{
		BoardService.deleteBoard(boardIdx);
		return "redirect:/board";
	}
}

