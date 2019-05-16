package board.board.service;

import java.util.List;

import board.board.entity.BoardEntity;

public interface BoardService {

	List<BoardEntity> selectBoardList() throws Exception;

	void saveBoard(BoardEntity board) throws Exception;
	
	BoardEntity selectBoardDetail(int boardIdx) throws Exception;

	void deleteBoard(int boardIdx);
}
