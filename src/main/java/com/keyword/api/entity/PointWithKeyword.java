package com.keyword.api.entity;

public class PointWithKeyword {
	private int id;
	private int leftOffset;
	private int topOffset;
	private int rightOffset;
	private int bottomOffset;
	private Keyword[] keywords;
	
	public PointWithKeyword() {
		
	}
	
	public PointWithKeyword(int id, int leftOffset, int topOffset, int rightOffset, int bottomOffset,
			Keyword[] keywords) {
		super();
		this.id = id;
		this.leftOffset = leftOffset;
		this.topOffset = topOffset;
		this.rightOffset = rightOffset;
		this.bottomOffset = bottomOffset;
		this.keywords = keywords;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getLeftOffset() {
		return leftOffset;
	}
	public void setLeftOffset(int leftOffset) {
		this.leftOffset = leftOffset;
	}
	public int getTopOffset() {
		return topOffset;
	}
	public void setTopOffset(int topOffset) {
		this.topOffset = topOffset;
	}
	public int getRightOffset() {
		return rightOffset;
	}
	public void setRightOffset(int rightOffset) {
		this.rightOffset = rightOffset;
	}
	public int getBottomOffset() {
		return bottomOffset;
	}
	public void setBottomOffset(int bottomOffset) {
		this.bottomOffset = bottomOffset;
	}
	public Keyword[] getKeywords() {
		return keywords;
	}
	public void setKeywords(Keyword[] keywords) {
		this.keywords = keywords;
	}
}
