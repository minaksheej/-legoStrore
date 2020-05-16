package mj.legoStore.model;

import java.io.Serializable;
import java.time.LocalDate;

public class DeliveryInfo implements Serializable  {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2529097434461701760L;
	private LocalDate devlieryDate;
	private int deliveryFee;
	private boolean inStock;

	
	public DeliveryInfo() {
		
	}

	public DeliveryInfo(LocalDate devlieryDate, int deliveryFee, boolean inStock) {
		this.devlieryDate = devlieryDate;
		this.deliveryFee = deliveryFee;
		this.inStock = inStock;
	}

	public LocalDate getDevlieryDate() {
		return devlieryDate;
	}

	public int getDeliveryFee() {
		return deliveryFee;
	}

	public boolean isInStock() {
		return inStock;
	}

}
