package org.blog.domain;

import java.util.Date;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Data
@Setter
@Getter
public class BoardVO {

	// bno, title, content, writer, regdate, updatedate
	private Long bno;
	private String title, content, writer;
	private Date regdate, updatedate;
}
