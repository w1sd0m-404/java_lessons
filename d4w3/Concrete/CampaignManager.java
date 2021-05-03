package Concrete;

import Abstract.CampaignService;
import Entities.Campaign;

public class CampaignManager implements CampaignService {

	@Override
	public void campaignAdd(Campaign campaign) {
		System.out.println(campaign.getDiscountCode() + " kodu ile yeni bir kampanya eklendi. " + "Ýndirim oraný : %" + campaign.getDiscountRate());
		
	}

	@Override
	public void campaignUpdate(Campaign campaign) {
		System.out.println(campaign.getCampaignId() + " id'li kampanyanýn bilgileri güncellendi.");
		
	}

	@Override
	public void campaignDelete(Campaign campaign) {
		System.out.println(campaign.getCampaignId() + " id'li kampanya silindi.");
		
	}

}
