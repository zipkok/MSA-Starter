package board.board.entity;

import javax.persistence.CascadeType;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

import board.board.entity.BoardFileEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.time.LocalDateTime;
import java.util.Collection;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="t_board")
@NoArgsConstructor
@Data
@ApiModel(value="BoardEntity : 게시판 엔티티", description="게시판 엔티티")
public class BoardEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@ApiModelProperty(value="게시글 번호")
	//private int boardIdx;
	private Integer boardIdx;

	@ApiModelProperty(value="게시글 이름")
	@Column(nullable=false)
	private String title;
	
	@ApiModelProperty(value="게시글 내용")
	@Column(nullable=false)
	private String contents;
	
	@ApiModelProperty(value="게시글 조회수")
	@Column(nullable=false)
	private int hitCnt = 0;
	
	@ApiModelProperty(value="게시글 작성자")
	@Column(nullable=false)
	private String creatorId;
	
	@ApiModelProperty(value="게시글 생성 날짜")
	@Column(nullable=false)
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "Asia/Seoul")
	private LocalDateTime createdDatetime = LocalDateTime.now();
	
	@ApiModelProperty(value="게시글 수정자")
	private String updaterId;
	
	@ApiModelProperty(value="게시글 수정 날짜")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "Asia/Seoul")
	private LocalDateTime updatedDatetime;
	
	@ApiModelProperty(value="게시글 파일첨부")
	@OneToMany(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
	@JoinColumn(name="board_idx")
	private Collection<BoardFileEntity> fileList;
}
