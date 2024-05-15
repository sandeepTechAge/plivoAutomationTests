package runnableClasses;

import base.baseTest;
import org.testng.annotations.Test;
import pageObjects.homePage;
import org.testng.asserts.SoftAssert;
import utils.Constants;
import utils.javascriptExecutor;

public class HOME_PAGE extends baseTest {
   public homePage hp;
    SoftAssert sa = new SoftAssert();
    Constants c = new Constants();
    javascriptExecutor js = new javascriptExecutor();

    @Test
    public void homePageTests() throws InterruptedException {

        driver.get(c.URL);
        String Title = driver.getTitle();
        sa.assertEquals(Title,c.HomeTitle);
        hp = new homePage(driver);
        hp.checkForLogo();
        hp.clickOnLogo();
//Products
        hp.clickProductsHeading();
        Thread.sleep(2000);
        hp.checkProductDropdownList();
        hp.checkForSupportCTA();
        hp.clickonSupportCTA();
        String supportURL = driver.getCurrentUrl();
        sa.assertEquals(supportURL, c.supportPageURL);
        driver.navigate().back();
        hp.checkForLoginCTA();
        hp.clickOnLoginCTA();
        String loginURL = driver.getCurrentUrl();
        sa.assertEquals(loginURL,c.LoginPageURL);
        driver.navigate().back();
        hp.mouseHoverOnProducts();
        hp.checkForProgrammableAPIText();
        hp.checkForCarrierPlatformText();
        hp.checkForSolutionsText();
        hp.checkForSMSAPILinkText();
        hp.checkForProgrammaticallySendSubText();
        hp.checkForVerifyAPiLinkText();
        hp.checkForVerifyAPISubText();
        hp.checkForWhatsappBusinessText();
        hp.checkForWhatsappBusinessSubText();
        hp.checkForNumberLookUpLinkText();
        hp.checkForNumberLookupSubText();
        hp.checkForPhoneNumberLinkText();
        hp.checkForPhoneNumberSubText();
        hp.checkForVoiceAPILinkText();
        hp.checkForVoiceAPISubText();
        hp.checkForPlivoCXLinkText();
        hp.checkForPlivoCXSubText();
        hp.checkForPlivoServiceLinkText();
        hp.checkForPlivoEngageLinkText();
//products redirections
        hp.clickOnSMSAPILinkText();
        String SMSAPILink = driver.getCurrentUrl();
        sa.assertEquals(SMSAPILink,c.SMSAPILink );
        driver.navigate().back();
        hp.mouseHoverOnProducts();
        hp.clickOnVerifyAPILinkText();
        String VerifyAPILink = driver.getCurrentUrl();
        sa.assertEquals(VerifyAPILink,c.VerifyAPILink );
        driver.navigate().back();
        hp.mouseHoverOnProducts();
        hp.clickOnWhatsppBusinessText();
        String WhatsappAPILink = driver.getCurrentUrl();
        sa.assertEquals(WhatsappAPILink,c.WhatsappAPILink);
        driver.navigate().back();
        hp.mouseHoverOnProducts();
        hp.clickOnNumberLookupLinkText();
        String NumberLookupLink = driver.getCurrentUrl();
        sa.assertEquals(NumberLookupLink,c.NumberLookupLink);
        driver.navigate().back();
        hp.mouseHoverOnProducts();
        hp.clickOnPhoneNumberLinkText();
        String PhoneNumberLink = driver.getCurrentUrl();
        sa.assertEquals(PhoneNumberLink,c.PhoneNumberLink);
        driver.navigate().back();
        hp.mouseHoverOnProducts();
        hp.clickOnVoiceAPILinkText();
        String VoiceAPILink = driver.getCurrentUrl();
        sa.assertEquals(VoiceAPILink,c.VoiceAPILink);
        driver.navigate().back();
        hp.mouseHoverOnProducts();
        hp.clickOnPlivoCXLinkText();
        String PlivoCXLink = driver.getCurrentUrl();
        sa.assertEquals(PlivoCXLink,c.PlivoCXLink);
        driver.navigate().back();
// UseCases
        hp.checkForUseCasesLink();
        hp.mouseHoverOnUseCases();
        hp.checkForUseCaseVerifyAPI();
        hp.checkForUseCase2FA();
        hp.checkForUseCaseAlerts();
        hp.checkForUseCaseSMSMarketing();
        hp.checkForUseCaseVoiceNotifications();
        hp.checkForUseCaseCallForwarding();
        hp.checkForUseCaseCloudIVR();
        hp.checkForUseCaseNumberMasking();
        hp.checkForUseCaseIndustries();
        hp.checkForUseCaseHealthCare();
        hp.checkForUseCaseHospitality();
        hp.checkForUseCaseGovernment();
        hp.checkForUseCaseFinance();
        hp.checkForUseCaseRetail();
        hp.checkFrUseCaseBusinessType();
        hp.checkForUseCaseEnterprise();
        hp.checkForUseCaseStartup();
        hp.checkForUseCaseNonProfit();
//Developers
        hp.checkForDevelopers();
        hp.mouseHoverOnDevelopers();
        hp.checkForDocumentation();
        hp.checkForServiceStatus();
        hp.checkForKnowledgeBase();
        hp.checkForProductUpdates();
        hp.checkForSupport();
 //Customers
        hp.checkForCustomers();
 // Resources
        hp.checkForResources();
        hp.mouseHoverOnResources();
        hp.checkForContentLibrary();
        hp.checkForBlog();
        hp.checkForGuides();
        hp.checkForGlossary();
        hp.checkForPrivacyNSecurity();
//Pricing
        hp.checkForPricing();
        hp.mouseHoverOnPricing();
        hp.checkForSMSAPI();
        hp.checkForVerifyAPI();
        hp.checkForWhatsappAPI();
        hp.checkForVoiceAPI();
        hp.checkForPhoneNumber();
        hp.checkForZentrunkAPI();
        hp.checkForSupportPlans();
        hp.checkForViewAllPricing();
// Main Page Content
        hp.checkForHomePageHeadingText();
        hp.checkForSubHeadingText();
        hp.checkForMainImage();
        hp.checkForRequestTrialCTA();
        hp.clickOnRequestTrialCTA();
        String requestTrialURL = driver.getCurrentUrl();
        sa.assertEquals(requestTrialURL,c.RequestTrialLink);
        driver.navigate().back();
        hp.checkForGetVolumePricingCTA();
        hp.clickOnVolumePricingCTA();
        Thread.sleep(1000);
        hp.checkForVolumePricingForm();
        driver.navigate().refresh();
        js.javaScriptScroll(hp.partnerLogos1);
        js.javaScriptScroll(hp.partnerLogos2);
        hp.checkForPartnerLogo1();
        hp.checkForPartnerLogo2();
        hp.checkForLearnLinkText();
        hp.clickOnLearnLink();
        String customersLink = driver.getCurrentUrl();
        sa.assertEquals(customersLink,c.customerLinkText);
        driver.navigate().back();
        String customerChoose = hp.checkForCustomerChooseHeading();
        sa.assertEquals(customerChoose,c.Top3ReasonsHeadingText);
        hp.checkForPlivoSatisfiedHeadingText();
        hp.checkForPlivoSatisfiedSubHeading();
        hp.checkForSatisfiedReadMoreLink();
        hp.clickOnSatisfiedLink();
        String satisfiedBlogLink = driver.getCurrentUrl();
        sa.assertEquals(satisfiedBlogLink,c.TechnologyLessonsLink);
        driver.navigate().back();
        hp.checkForReliabilityHeading();
        hp.checkForReliabilitySubHeading();
        hp.checkForReliabilityLink();
        hp.clickOnReliabilityLink();
        String reliabilityLink = driver.getCurrentUrl();
        sa.assertEquals(reliabilityLink,c.ReliabilityFeaturesLink);
        driver.navigate().back();
        hp.checkForSimplifiedDesignHeading();
        hp.checkForSimplifiedDesignSubHeading();
        hp.checkForSimplifiedDesignLink();
        hp.clickOnSimplifiedLink();
        String simplifiedLink = driver.getCurrentUrl();
        sa.assertEquals(simplifiedLink,c.communicationsSimplifiedLink);
        driver.navigate().back();
        hp.checkForPCNEbookImg();
        hp.checkForCarrierNetworkHeadingText();
        hp.checkForDownloadNowCTA();
        hp.clickOnDownloadNowCTA();
        String carrierNetwork =  driver.getCurrentUrl();
        sa.assertEquals(carrierNetwork,c.carrierNetworkLink);
        driver.navigate().back();
        js.javaScriptScroll(hp.exploreProductsHeadingText);
        hp.checkForExploreProductsHeadingText();
        hp.checkForMessagingPlatformText();
        hp.checkForVoicePlatformText();
        hp.checkForGetSolutionsText();
        hp.checkForGetSMSAPILink();
        hp.checkForGetVoiceAPILink();
        hp.checkForGetMMSAPILink();
        hp.checkForGetZentrunkAPI();
        hp.checkForGetPlivoCXLink();
        hp.checkForGetStartedHeadingText();
        hp.checkForGetStartedSubHeadingText();
        hp.checkForGetRequestTrialCTA();
        hp.checkForGetVolumePricingCta();
        js.javaScriptScroll(hp.footerProductsText);
        hp.checkForFooterProductsText();
        hp.checkForFooterDevelopersText();
        hp.checkForFooterResourcesText();
        hp.checkForFooterCompanyText();
        sa.assertAll();


    }
}