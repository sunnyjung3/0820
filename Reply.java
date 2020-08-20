package board;

public class Reply {

	private String reply;
	private String writer;
	private String regDate;

	public Reply() {
		
	}
	
	public Reply(String reply, String writer, String regDate ) {
		this.reply = reply;
		this.writer = writer;
		this.regDate = regDate;
	}
	
	
	public String getReply() {
		return reply;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getRegDate() {
		return regDate;
	}

	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}

	public void setReply(String reply) {
		this.reply = reply;
	}
	
}
