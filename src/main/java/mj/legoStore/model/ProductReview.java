package mj.legoStore.model;

import java.io.Serializable;

public class ProductReview  implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1282088590958237123L;
	private String userName;
	private Integer rating;

	public ProductReview() {
		
	}

	public ProductReview(String userName, Integer rating) {
		this.userName = userName;
		this.rating = rating;
	}

	public String getUserName() {
		return userName;
	}

	public Integer getRating() {
		return rating;
	}

}
