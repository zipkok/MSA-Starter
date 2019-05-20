package board.board.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name="t_file")
@NoArgsConstructor
@Data
@ApiModel(value="BoardEntity : 게시판 파일첨부 엔티티", description="게시판 파일첨부 엔티티")
public class BoardFileEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@ApiModelProperty(value="파일 번호")
	private int idx;
	
	@ApiModelProperty(value="파일 실제 이름")
	@Column(nullable=false)
	private String originalFileName;
	
	@ApiModelProperty(value="파일 저장 경로")
	@Column(nullable=false)
	private String storedFilePath;
	
	@ApiModelProperty(value="파일 크기")
	@Column(nullable=false)
	private long fileSize;
	
	@ApiModelProperty(value="파일 업로더")
	@Column(nullable=false)
	private String creatorId;
	
	@ApiModelProperty(value="파일 생성 날짜")
	@Column(nullable=false)
	private LocalDateTime createdDatetime = LocalDateTime.now();
	
	@ApiModelProperty(value="파일 수정자")
	private String updaterId;
	
	@ApiModelProperty(value="파일 수정 날짜")
	private LocalDateTime updatedDatetime;
}
