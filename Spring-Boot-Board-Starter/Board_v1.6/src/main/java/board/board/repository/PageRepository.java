package board.board.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import board.board.entity.BoardEntity;

public interface PageRepository extends JpaRepository<BoardEntity, Integer> {
}
