package Entities;

public class Campaign{

	private int campaignId;
	private String discountCode;
	private double discountRate;
	
	public int getCampaignId() {
		return campaignId;
	}

	public void setCampaignId(int campaignId) {
		this.campaignId = campaignId;
	}

	public String getDiscountCode() {
		return discountCode;
	}

	public void setDiscountCode(String discountCode) {
		this.discountCode = discountCode;
	}

	public double getDiscountRate() {
		return discountRate;
	}

	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}

	public Campaign() {}

	public Campaign(int campaignId, String discountCode, double discountRate) {
		super();
		this.campaignId = campaignId;
		this.discountCode = discountCode;
		this.discountRate = discountRate;
	}
	
	
}
