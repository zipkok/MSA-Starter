package board.board.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Entity
@Table(name = "t_member_roles")
@EqualsAndHashCode(of = "fno")
@ToString
public class MemberRoleEntity{

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long fno;
  
  private String roleName;
}