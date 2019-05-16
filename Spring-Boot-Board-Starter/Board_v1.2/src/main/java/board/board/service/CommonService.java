package board.board.service;

import java.util.List;

import board.board.entity.MemberEntity;


public interface CommonService {
	List<MemberEntity> selectMemberList() throws Exception;
	
	void saveMember(MemberEntity member) throws Exception;
}
