package board.board.entity;

import java.sql.Timestamp;
//import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
//import javax.persistence.JoinColumn;
//import javax.persistence.OneToMany;
//import javax.persistence.CascadeType;
//import javax.persistence.FetchType;


import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

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
public class MemberEntity {

  @Id
  @GeneratedValue(strategy=GenerationType.AUTO)
  private Long uid;
  
  private String upw;
  
  private String bcrypt;
  
  private String uname;
  
  @CreationTimestamp
  private Timestamp regdate;
  
  @UpdateTimestamp
  private Timestamp updatedate;
  
  //@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
  //@JoinColumn(name = "member")
  //private List<MemberRole> roles;

}