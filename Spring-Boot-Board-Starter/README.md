### Board_v1.5 LTS .....   
(2019.05.18)  
Paging 구현
Search 구현

Error : csrf와 mutipart를 Form 형식으로  에러 발생, 현재는 csrf.disable() 상태 .....    
INFO  : board.interceptor.LoggerInterceptor의 perHandle 메소드의 log.info 내용 정렬    
  
  
### Board_v1.4 LTS .....   
(2019.05.06)  
Swagger2 설정  

Error : csrf와 mutipart를 Form 형식으로  에러 발생, 현재는 csrf.disable() 상태 .....    
INFO  : LoginController의 PostRegister 내용을 CommonService로 옮김      
INFO  : MemberEntity에서 @OneToMany Column을 Member -> Uid로 변경  


### Board_v1.3 LTS .....  
(2019.05.05)  
Spring Security 설정  
회원가입 페이지와 Spring Security 연결  

Error : csrf와 mutipart를 Form 형식으로  에러 발생, 현재는 csrf.disable() 상태 .....  
Warn  : LoginController의 PostRegister 내용을 CommonService로 옮겨놓는게 구조상 맞는 것 같음 .....  
(2019.05.06) INFO  : MemberEntity에서 @OneToMany Column을 Member -> Uid로 변경  


### Board_v1.2 LTS ..... 
(2019.05.04)  
로그인 페이지 생성  
회원가입 페이지 생성  


### Board_v1.1 LTS ..... 
(2019.05.04)  
게시글 수정 + 파일 업로드 / 다운로드  
게시글 작성 + 파일 업로드 / 다운로드  


### Board_v1.0 LTS ..... 
(2019.05.03)  
Spring Boot / Tymeleaf / Jpa를 통한 게시글 조회  
Spring Boot / Tymeleaf / Jpa를 통한 게시글 수정  
Spring Boot / Tymeleaf / Jpa를 통한 게시글 작성  
Interceptor 설정  
LogBack + log4jdbc 설정  
JDBC 설정  
