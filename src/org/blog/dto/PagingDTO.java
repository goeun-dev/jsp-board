package org.blog.dto;

public class PagingDTO {

	// 페이지, 총 개수
	private int page;
	private int amount;

	// 초기화 생성자
	public PagingDTO() {
		this.page = 1;
		this.amount = 10;
	}

	// 생성자
	public PagingDTO(String pageStr, String amountStr) {

		// page
		try {
			this.page = Integer.parseInt(pageStr);
		} catch (Exception e) {
			page = 1;
		}

		// amount
		try {
			this.amount = Integer.parseInt(amountStr);
		} catch (Exception e) {
			amount = 10;
		}
	}

	// getter/settter, toString
	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		if (page <= 0) {
			return;
		}
		this.page = page;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "PagingDTO [page=" + page + ", amount=" + amount + "]";
	}

}
