package board;

public class ReplyCollect extends BaseCollect {
	//하나의 댓글이 가지는 최소의 데이터는 3개(내용,작성자,작성일) -> 따호 class를 만들어 주어 데이터를 관리 하기 위해 만들어진 class이다.
	// == 개념을 하나 표현한 것이다.
	
	
	int parentId; //부모글 번호 (각 댓글이 몇번 게시물의 댓글인지 구분하기 위해서)
	
	

	//collect에 String rbody;를 만들어 저장 하면 하나의 댓글 밖에 저장할 수 없다. --> 따로 만들어 주어야 한다
	//이유 : collect는 하나인데 collect에 해당하는 댓글은 여러개 이다 
	//결론 : 댓글들을 따로 모아 하나에 저장한 후에 그것을 collect와 연결 시켜준다.(ex.회원 같은 경우는 memberId로 연결해 주었다.)
	
	public ReplyCollect(int id, int parentId, String body, int memberId, String regDate) {
		super();
		this.id = id;
		this.parentId = parentId;
		this.body = body;
		this.memberId = memberId;
		this.regDate = regDate;
	}
	//위의 생성자 코드는 reply를 만들때 셋팅을 할 수 있게 해주는 코드??!!
	
}
