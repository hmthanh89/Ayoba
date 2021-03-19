package pages.Ayoba;

import com.logigear.control.common.imp.Element;

public class ChatsListPage_MOBILE extends GeneralPage_MOBILE {

	protected Element eleChannels = $(Element.class, "eleChannels");

	public void goToChannelsTab() {
		eleChannels.click();
		}

}
