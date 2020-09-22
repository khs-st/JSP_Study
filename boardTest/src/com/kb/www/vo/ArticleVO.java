package com.kb.www.vo;

public class ArticleVO {
	//글번호
	private int articleNumber;
	
	//글 제목
	private String articleSubject;
	
	//글내용
	private String articleContents;
	
	//조회수
	private int hit;
	
	//작성날짜
	private String writeDate;
	
	//수정날짜
	private String updateDate;
	
	//삭제날짜
	private String deleteDate;
	
	public int getArticleNumber() {
		return articleNumber;
	}
	public void setArticleNumber(int articleNumber) {
		this.articleNumber = articleNumber;
	}
	public String getArticleSubject() {
		return articleSubject;
	}
	public void setArticleSubject(String articleSubject) {
		this.articleSubject = articleSubject;
	}
	public String getArticleContents() {
		return articleContents;
	}
	public void setArticleContents(String articleContents) {
		this.articleContents = articleContents;
	}

	public int getHit() {
		return hit;
	}
	public void setHit(int hit) {
		this.hit = hit;
	}
	public String getWriteDate() {
		return writeDate;
	}
	public void setWriteDate(String writeDate) {
		this.writeDate = writeDate;
	}
	public String getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(String updateDate) {
		this.updateDate = updateDate;
	}
	public String getDeleteDate() {
		return deleteDate;
	}
	public void setDeleteDate(String deleteDate) {
		this.deleteDate = deleteDate;
	}
	
}
