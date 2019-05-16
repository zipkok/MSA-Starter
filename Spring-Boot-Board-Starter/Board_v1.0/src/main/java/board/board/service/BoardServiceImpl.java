package board.board.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import board.board.entity.BoardEntity;
import board.board.repository.BoardRepository;

@Service
public class BoardServiceImpl implements BoardService {
	@Autowired
	BoardRepository BoardRepository;
	
	@Override
	public List<BoardEntity> selectBoardList() throws Exception {
		return BoardRepository.findAllByOrderByBoardIdxDesc();
	}	
	
	@Override
	public void saveBoard(BoardEntity board) throws Exception {
		board.setCreatorId("admin");
		BoardRepository.save(board);
	}
	
	@Override
	public BoardEntity selectBoardDetail(int boardIdx) throws Exception{
		Optional<BoardEntity> optional = BoardRepository.findById(boardIdx);
		if(optional.isPresent()){
			BoardEntity board = optional.get();
			board.setHitCnt(board.getHitCnt() + 1);
			BoardRepository.save(board);
			
			return board;
		}
		else {
			throw new NullPointerException();
		}
	}
	
	@Override
	public void deleteBoard(int boardIdx) {
		BoardRepository.deleteById(boardIdx);
	}	
}
