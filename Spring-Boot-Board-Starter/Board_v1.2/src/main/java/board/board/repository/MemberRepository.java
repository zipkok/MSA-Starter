package board.board.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import board.board.entity.MemberEntity;

public interface MemberRepository extends CrudRepository<MemberEntity, Long> {

	List<MemberEntity> findAllByOrderByUidDesc();
	
}
