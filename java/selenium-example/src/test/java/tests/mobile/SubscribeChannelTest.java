package tests.mobile;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.Ayoba.ChannelsCategoriesPage_MOBILE;
import pages.Ayoba.ChannelsListPage_MOBILE;
import pages.Ayoba.ChannelsPage_MOBILE;
import pages.Ayoba.ChatsListPage_MOBILE;
import pages.Ayoba.GeneralPage_MOBILE;
import tests.TestBase;
import utils.helper.Logger;

public class SubscribeChannelTest extends TestBase {

	GeneralPage_MOBILE generalPage;
	ChatsListPage_MOBILE chatsListPage;
	ChannelsPage_MOBILE channelsPage;
	ChannelsCategoriesPage_MOBILE channelCategoriesPage;
	ChannelsListPage_MOBILE channelsListPage;
	
	@Test(description = "User is able to subscribe to a channel.")
	public void TC01_Subscribe_Channel() {
		Logger.info("1. Launch Ayoba as a registered Ayoba user ");
		
		Logger.info("2. Subscribe to a channel.'Entertainment/The Black Star'");
		//2.1 Click on "Channels" tab
		chatsListPage.goToChannelsTab();
		
		//2.2 Click on "Find Channels"
		channelsPage.clickFindChannels();
		
		//2.3 Click on "Channel Category"
		channelCategoriesPage.selectChannelCategory("Entertainment");
		
		//2.4 Click on "Channel Name"
		//2.5 Click on "Subscribe"
		channelsListPage.subscribeChannel("The Black Star");
		
		Logger.info("3. Go back to Channels tab");
		channelsListPage.backToChannelsCategoriesPage();
		channelCategoriesPage.backToChannelTabPage();
		
		Logger.verify("VP. Verify the selected Channel Name is listed in Channels tab.");
		Assert.assertTrue(channelsPage.isSubribedChannelExist("The Black Star"),
				"Selected channel is not listed in Channels tab.");
		}
	}
