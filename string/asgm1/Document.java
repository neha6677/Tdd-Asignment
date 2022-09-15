package com.yash.tddAssignment.string.asgm1;

 public class Document {
	private String title;
	private String filepath;
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getFilepath() {
		return filepath;
	}
	public void setFilepath(String filepath) {
		this.filepath = filepath;
	}
	
	
	
	@Override
	public String toString() {
		return "Document [title=" + title + ", filepath=" + filepath + "]";
	}
	
	public String showDocumentInformation() {
		//System.out.println(this.getTitle()+" , "+this.getFilepath());
		return this.getTitle()+" , "+this.getFilepath();
	}
	

}

