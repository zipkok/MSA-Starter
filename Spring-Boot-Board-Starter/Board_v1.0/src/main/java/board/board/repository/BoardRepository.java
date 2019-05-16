package board.board.repository;

import java.util.List;
import org.springframework.data.repository.CrudRepository;

import board.board.entity.BoardEntity;

public interface BoardRepository extends CrudRepository<BoardEntity, Integer> {
	List<BoardEntity> findAllByOrderByBoardIdxDesc();
}
