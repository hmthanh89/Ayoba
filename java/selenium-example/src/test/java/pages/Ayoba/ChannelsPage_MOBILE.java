package pages.Ayoba;

import com.logigear.control.common.imp.Element;

public class ChannelsPage_MOBILE extends GeneralPage_MOBILE {

	protected Element eleFindChannels = $(Element.class, "eleFindChannels");
	protected Element eleDynamicSubribedChannel = $(Element.class, "eleDynamicSubribedChannel");

	public void clickFindChannels() {
		eleFindChannels.click();
		}
	
	public boolean isSubribedChannelExist(String sChannel) {
		eleDynamicSubribedChannel.setDynamicValue(sChannel);
		return eleDynamicSubribedChannel.isDisplayed();
	}
	
}
