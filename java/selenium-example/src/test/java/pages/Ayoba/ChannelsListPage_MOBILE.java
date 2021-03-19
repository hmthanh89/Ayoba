package pages.Ayoba;

import com.logigear.control.common.imp.Element;

import pages.Ayoba.GeneralPage_MOBILE;

public class ChannelsListPage_MOBILE extends GeneralPage_MOBILE {

	protected Element eleDynamicSubscriptIcon = $(Element.class, "eleDynamicSubscriptIcon");
	protected Element eleGoBack = $(Element.class, "eleGoBack");

	public void subscribeChannel(String sChannel) {
		eleDynamicSubscriptIcon.setDynamicValue(sChannel);
		eleDynamicSubscriptIcon.click();
		eleDynamicSubscriptIcon.waitForValuePresentInAttribute("enabled", "false", 30);
		}
	
	public void backToChannelsCategoriesPage() {
		eleGoBack.click();
		}
}
