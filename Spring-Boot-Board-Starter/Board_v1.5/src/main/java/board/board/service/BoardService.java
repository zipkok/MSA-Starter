package board.board.service;

import java.util.List;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import board.board.entity.BoardEntity;
import board.board.entity.BoardFileEntity;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface BoardService {
	
	//public Page<BoardEntity> findBoardList(Pageable pageable) throws Exception;
	//public Page<BoardEntity> findBoardList(Pageable pageable) throws Exception;
	Page<BoardEntity> getAllCountrys(Pageable pageable) throws Exception;

	List<BoardEntity> selectBoardList() throws Exception;
	
	void saveBoard(BoardEntity board, MultipartHttpServletRequest multipartHttpServletRequest) throws Exception;
	
	BoardEntity selectBoardDetail(int boardIdx) throws Exception;

	void deleteBoard(int boardIdx);

	BoardFileEntity selectBoardFileInformation(int boardIdx, int idx) throws Exception;
}
