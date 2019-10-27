package org.blog.dto;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class PageMaker {

	private int start;
	private int end;
	private boolean prev, next;
	private int total;
	private PagingDTO paging;

	// 생성자
	public PageMaker(int total, PagingDTO paging) {
		super();
		this.total = total;
		this.paging = paging;

		// 시작 페이지, 끝 페이지
		int tempEnd = (int) (Math.ceil(paging.getPage() / 10.0)) * 10;
		this.start = tempEnd - 9;

		int realEnd = (total / paging.getAmount()) + 1;

		this.end = tempEnd > realEnd ? realEnd : tempEnd;

		// prev, next
		this.prev = this.start != 1;
		this.next = this.end * paging.getAmount() < total;

	}
}
