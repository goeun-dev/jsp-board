package org.blog.domain;

import java.util.Date;

import lombok.Data;

@Data
public class BoardVO {

	// bno, title, content, writer, regdate, updatedate
	private long bno;
	private String title, content, writer;
	private Date regdate, updatedate;
}
