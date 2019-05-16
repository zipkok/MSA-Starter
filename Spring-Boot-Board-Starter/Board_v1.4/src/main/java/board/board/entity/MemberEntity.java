package board.board.entity;

import java.sql.Timestamp;
//import java.util.List;
import java.util.List;

import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.CascadeType;
import javax.persistence.FetchType;


import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Entity
@Table(name = "t_members")
@EqualsAndHashCode(of = "uid")
@ToString
@ApiModel(value="BoardEntity : 로그인 엔티티", description="로그인 엔티티")
public class MemberEntity {

  @Id
  //@GeneratedValue(strategy=GenerationType.AUTO)
  //private Long uid;
  @ApiModelProperty(value="로그인 아이디")
  private String uid;
  
  @ApiModelProperty(value="로그인 비밀번호")
  private String bcrypt;
  
  @CreationTimestamp
  @ApiModelProperty(value="로그인 계정 생성날짜")
  private Timestamp regdate;
  
  @UpdateTimestamp
  @ApiModelProperty(value="로그인 계정 수정날짜")
  private Timestamp updatedate;
  
  @OneToMany(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
  @JoinColumn(name = "Uid")
  @ApiModelProperty(value="로그인 계정 권한")
  private List<MemberRoleEntity> roles;
}