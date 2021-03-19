package pages.Ayoba;

import com.logigear.control.common.imp.Element;

import pages.Ayoba.GeneralPage_MOBILE;

public class ChannelsCategoriesPage_MOBILE extends GeneralPage_MOBILE {

	protected Element eleDynamicChannelCategory = $(Element.class, "eleDynamicChannelCategory");
	protected Element eleGoBack = $(Element.class, "eleGoBack");

	public void selectChannelCategory(String sChannelCategory) {
		eleDynamicChannelCategory.setDynamicValue(sChannelCategory);
		eleDynamicChannelCategory.click();
		}
	
	public void backToChannelTabPage() {
		eleGoBack.click();
		}
}
