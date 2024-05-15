package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static base.baseTest.driver;

public class homePage {


    public WebDriver ldriver;
    Actions actions  = new Actions(driver);

    public homePage(WebDriver rdriver) {
        ldriver = rdriver;
        PageFactory.initElements(ldriver,this);
    }

   @FindBy(xpath = "//img[@alt='Plivo']")
    private WebElement plivoLogoLink;

   @FindBy(xpath = "//div[text()= 'Products'][1]")
    private WebElement productsNavBarHeading;

   @FindBy(xpath = "//div[@class='nav_dropdown-list-wrapper'][1]")
    private WebElement productsDropdownList;

   @FindBy(linkText = "Support")
    private WebElement supportCTA;

   @FindBy(linkText = "Log in")
    private WebElement loginCTA;

   @FindBy(xpath = "//div[text()='PROGRAMMABLE API'][1]")
   private WebElement programmableAPIText;

    @FindBy(xpath = "//div[text()='CARRIER PLATFORM'][1]")
    private WebElement carrierPlatformText;

    @FindBy(xpath = "//strong[text()='SOLUTIONS']")
    private WebElement solutionsText;

    @FindBy(xpath = "//div[text()='SMS API'][1]")
    private WebElement SMSAPILinkText;

    @FindBy(xpath = "//div[contains(text(),'Programmatically send')][1]")
    private WebElement programmaticallySendSubText;

    @FindBy(xpath = "//div[text()='Verify API'][1]")
    private WebElement verifyAPiLinkText;

    @FindBy(xpath = "//div[contains(text(),'Verify users')][1]")
    private WebElement verifyUsersSubText;

    @FindBy(xpath = "//strong[text()='WhatsApp Business API'][1]")
    private WebElement whatsappBusinessLinkText;

    @FindBy(xpath = "//div[contains(text(),'Automate customer')][1]")
    private WebElement whatsappBusinessSubText;

    @FindBy(xpath = "//div[text()='Voice API'][1]")
    private WebElement voiceAPILinkText;

    @FindBy(xpath = "//div[contains(text(),'Integrate voice')][1]")
    private WebElement voiceAPISubText;

    @FindBy(xpath = "//div[text()='Number Lookup'][1]")
    private WebElement numberLookupLinkText;

    @FindBy(xpath = "//div[contains(text(),'Determine carrier')][1]")
    private WebElement numberLookUpSubText;

    @FindBy(xpath = "//div[text()='Phone Numbers'][1]")
    private WebElement phoneNumbersLinkText;

    @FindBy(xpath = "//div[contains(text(),'Local, mobile,')][1]")
    private WebElement phoneNumberSubText;

    @FindBy(xpath = "//img[@alt='plivo cx'][1]")
    private WebElement plivoCXLinkText;

    @FindBy(xpath = "//p[contains(text(),'One powerful platform')][1]")
    private WebElement plivoCXSubText;

    @FindBy(linkText = "Service")
    private WebElement plivoServiceLinkText;

    @FindBy(linkText = "Engage")
    private WebElement plivoEngageLinkText;

    @FindBy(linkText = "Use Cases")
    private WebElement useCaseLink;

    @FindBy(xpath = "//div[@class='usecase-dropdown-wrapper']//div[text()='Verify API']")
    private WebElement useCaseVerifyAPIHeading;

    @FindBy(xpath = "//div[@class='usecase-dropdown-wrapper']//a[text()='Industries']")
    private WebElement useCaseIndustriesHeading;

    @FindBy(xpath = "//div[@class='usecase-dropdown-wrapper']//a[text()='Business Types']")
    private WebElement useCaseBusinessTypeHeading;

    @FindBy(xpath = "//div[@class='usecase-dropdown-content']//a[text()='2FA/OTP']")
    private WebElement useCase2FA;

    @FindBy(xpath = "//div[@class='usecase-dropdown-content']//a[text()='Alerts/Notifications']")
    private WebElement useCaseAlerts;

    @FindBy(xpath ="//div[@class='usecase-dropdown-content']//a[text()='SMS Marketing']")
    private WebElement useCaseSMSMarketing;

    @FindBy(xpath = "//div[@class='usecase-dropdown-content']//a[text()='Voice Notifications']")
    private WebElement useCaseVoiceNotification;

    @FindBy(xpath = "//div[@class='usecase-dropdown-content']//a[text()='Call Forwarding']")
    private WebElement useCaseCallForward;

    @FindBy(xpath = "//div[@class='usecase-dropdown-content']//a[text()='Cloud IVR']")
    private WebElement useCaseCloudIVR;

    @FindBy(xpath = "//div[@class='usecase-dropdown-content']//a[text()='Number Masking']")
    private WebElement useCaseNumberMasking;

    @FindBy(xpath = "//div[@class='usecase-dropdown-content']//a[text()='Healthcare']")
    private WebElement useCaseHealthcare;

    @FindBy(xpath = "//div[@class='usecase-dropdown-content']//a[text()='Finance']")
    private WebElement useCaseFinance;

    @FindBy(xpath = "//div[@class='usecase-dropdown-content']//a[text()='Hospitality']")
    private WebElement useCaseHospitality;

    @FindBy(xpath = "//div[@class='usecase-dropdown-content']//a[text()='Retail']")
    private WebElement useCaseRetail;

    @FindBy(xpath = "//div[@class='usecase-dropdown-content']//a[text()='Government']")
    private WebElement useCaseGovernment;

    @FindBy(xpath = "//div[@class='usecase-dropdown-content is-verticle']/a[1]")
    private WebElement useCaseEnterprise;

    @FindBy(xpath = "//div[@class='usecase-dropdown-content is-verticle']/a[2]")
    private WebElement useCaseStartup;

    @FindBy(xpath = "//div[@class='usecase-dropdown-content is-verticle']/a[3]")
    private WebElement useCaseNonprofit;

    @FindBy(xpath = "//div[text()='Developers']")
    private WebElement developers;

    @FindBy(xpath = "//div[text()='Documentation']")
    private WebElement developersDocumentation;

    @FindBy(xpath = "//div[text()='Service Status']")
    private WebElement developersServiceStatus;

    @FindBy(xpath = "//div[text()='Knowledge Base']")
    private WebElement developersKnowledgeBase;

    @FindBy(xpath = "//div[text()='Knowledge Base']")
    private WebElement developersProductUpdates;

    @FindBy(xpath = "//div[text()='Support']")
    private WebElement developersSupport;

    @FindBy(xpath = "//div[text()='Customers']")
    private WebElement Customers;

    @FindBy(xpath = "//div[@id='w-dropdown-toggle-3']/div")
    private WebElement Resources;

    @FindBy(xpath = "//div[text()='Content Library']")
    private WebElement resourcesContentLibrary;

    @FindBy(xpath = "//div[text()='Blog']")
    private WebElement resourcesBlog;

    @FindBy(xpath = "//div[text()='Guides']")
    private WebElement resourcesGuides;

    @FindBy(xpath = "//div[text()='Glossary']")
    private WebElement resourcesGlossary;

    @FindBy(xpath = "//div[text()='Privacy and Security']")
    private WebElement resourcesPrivacySecurity;

    @FindBy(xpath = "//div[@id='w-dropdown-toggle-4']/div")
    private WebElement Pricing;

    @FindBy(xpath = "//div[@class='product_type-wrapper is-blue']//child::div[text()='PRODUCTS']")
    private WebElement pricingProductLabel;

    @FindBy(xpath = "//div[@class='product_type-wrapper is-blue opacity-0']//child::strong[text()='DETAILED PLANS AND PRICING']")
    private WebElement pricingDetailPlansLabel;

    @FindBy(xpath = "//div[@class='nav-dropdown w-dropdown']/following::div[text()='SMS API']")
    private WebElement pricingSMSAPI;

    @FindBy(xpath = "//div[@class='nav-dropdown w-dropdown']/following::div[text()='Verify API']")
    private WebElement pricingVerifyAPI;

    @FindBy(xpath = "//div[@class='nav-dropdown w-dropdown']/following::div[text()='WhatsApp Business API']")
    private WebElement pricingWhatsappAPI;

    @FindBy(xpath = "//div[@class='nav-dropdown w-dropdown']/following::div[text()='Voice API']")
    private WebElement pricingVoiceAPI;

    @FindBy(xpath = "//div[@class='nav-dropdown w-dropdown']/following::div[text()='Phone Numbers']")
    private WebElement pricingPhoneNumber;

    @FindBy(xpath = "//div[@class='nav-dropdown w-dropdown']/following::div[text()='Zentrunk SIP Trunking']")
    private WebElement pricingZentrunkSIP;

    @FindBy(xpath = "//div[@class='nav-dropdown w-dropdown']/following::div[text()='Support Plans']")
    private WebElement pricingSupportPlans;

    @FindBy(xpath = "//div[@class='nav-dropdown w-dropdown']/following::div[text()='View All Pricing']")
    private WebElement pricingViewAllPricing;

    @FindBy(xpath = "//*[contains(text(),'Engage customers')]")
    private WebElement homePageHeadingText;

    @FindBy(xpath = "//*[contains(text(),'Thousands of businesses')]")
    private WebElement homePageSubHeadingText;

    @FindBy(css = "div.home_hero-image.max-width-50 > img")
    private WebElement homePageMainImage;

    @FindBy(css = "div.button-group.text-style-allcaps.text-sm-center > a:first-child")
    private WebElement requestTrialCTA;

    @FindBy(css = "div.button-group.text-style-allcaps.text-sm-center > a:nth-child(2)")
    private WebElement getVolumePricingCTA;

    @FindBy(css = "div.contact-form-wrapper")
    private WebElement volumePricingForm;


    @FindBy(css = "div.partner_logo-wrapper:first-child")
    public WebElement partnerLogos1;

    @FindBy(css = "div.partner_logo-wrapper:last-child")
    public WebElement partnerLogos2;

    @FindBy(partialLinkText= "Learn how thousands")
    private WebElement learnLink;

    @FindBy(css = "div.section_heading-wrapper.text-sm-center > h2")
    private WebElement customerChooseHeading;

    @FindBy(xpath = "//*[contains(text(),'We’re not satisfied')]")
    private WebElement plivoSatisfiedHeading;

    @FindBy(xpath = "//*[contains(text(),'Our consultative approach')]")
    private WebElement plivoSatisfiedSubHeading;

    @FindBy(xpath = "//h3[contains(text(),'We’re not satisfied')]//following::div[1]")
    private WebElement plivoSatisfiedLink;

    @FindBy(xpath = "//*[contains(text(),'We build reliability')]")
    private WebElement plivoReliabilityHeading;

    @FindBy(xpath = "//*[contains(text(),'Behind the scenes,')]")
    private WebElement plivoReliabilitySubHeading;

    @FindBy(xpath = "//h3[contains(text(),'We build reliability')]//following::div[1]")
    private WebElement plivoReliabilityLink;

    @FindBy(xpath = "//*[contains(text(),'simple by design')]")
    private WebElement plivoSimpleDesignHeading;

    @FindBy(xpath = "//*[contains(text(),'build complex applications.')]")
    private WebElement plivoSimpleDesignSubHeading;

    @FindBy(xpath = "//h3[contains(text(),'Our complex')]//following::div[1]")
    private WebElement plivoSimpleDesignLink;

    @FindBy(css = "img[alt ='PCN ebook']")
    private WebElement pcnEbookImg;

    @FindBy(css = "h2.text-color-blue.text-sm-center.heading-style-h2")
    private WebElement carrierNetworkHeadingText;

    @FindBy(css = "a[href*='premium-carrier-network']")
    private WebElement downloadNowCTA;

    @FindBy(css = "div.max-width-large.margin-auto > h2.text-color-blue.text-align-center")
    public WebElement exploreProductsHeadingText;

    @FindBy(xpath = "//*[contains(text(),'Messaging Platform')]")
    private WebElement messagingPlatformText;

    @FindBy(xpath = "//*[contains(text(),'Voice Platform')]")
    private WebElement voicePlatformText;

    @FindBy(xpath = "//*[contains(text(),'Solutions')]")
    private WebElement getSolutionText;

    @FindBy(css = "div.margin-top.margin-custom1 > a[href*= 'sms']")
    private WebElement getSMSAPILink;

    @FindBy(css = "div.margin-top.margin-custom1 > a[href*= 'voice']")
    private WebElement getVoiceAPILink;

    @FindBy(css = "div.margin-top.margin-custom1 > a[href*= 'mms']")
    private WebElement getMMSAPILink;

    @FindBy(css = "div.margin-top.margin-custom1 > a[href*= 'sip-trunking']")
    private WebElement getZentrunkLink;

    @FindBy(css = "div.margin-top.margin-custom1 > a[href*= 'cx']")
    private WebElement getPlivoCXLink;

    @FindBy(css = "div.max-width-x-medium.margin-auto > h2")
    private WebElement getStartedHeadingText;

    @FindBy(css = "div.margin-vertical.margin-custom1 > p")
    private WebElement getStartedSubText;

    @FindBy(css = "div.button-group.align-center > a:first-child")
    private WebElement getRequestTrialCTA;

    @FindBy(css = "div.button-group.align-center > a:last-child")
    private WebElement getVolumePricingCta;

    @FindBy(xpath = "//*[@class='footer_item-heading-wrapper']/div[contains(text(),'PRODUCTS')]")
    public WebElement footerProductsText;

    @FindBy(xpath = "//*[@class='footer_item-heading-wrapper']/div[contains(text(),'DEVELOPERS')]")
    private WebElement footerDevelopersText;

    @FindBy(xpath = "//*[@class='footer_item-heading-wrapper']/div[contains(text(),'Resources')]")
    private WebElement footerResourcesText;

    @FindBy(xpath = "//*[@class='footer_item-heading-wrapper']/div[contains(text(),'COMPANY')]")
    private WebElement footerCompanyText;

    @FindBy(css = "div.footer_nav-wrapper > a[href*='sms']")
    private WebElement footerSMSAPILink;

    @FindBy(css = "div.footer_nav-wrapper > a[href*='voice']")
    private WebElement footerVoiceAPILink;

    @FindBy(css = "div.footer_nav-wrapper > a[href*='verify']")
    private WebElement footerVerifyAPILink;

    @FindBy(css = "div.footer_nav-wrapper > a[href*='lookup']")
    private WebElement footerNumberLookupLink;

    @FindBy(css = "div.footer_nav-wrapper > a[href*='phone-numbers']")
    private WebElement footerPhoneNumbersLink;

    @FindBy(css = "div.footer_nav-wrapper > a[href*='contacto']")
    private WebElement footerContactoLink;

    @FindBy(css = "div.footer_nav-wrapper > a[href*='support-plans']")
    private WebElement footerSupportPlansLink;

    @FindBy(css = "div.footer_nav-wrapper > a[href*='support-plans']")
    private WebElement footerDocsLink;

    @FindBy(css = "div.footer_nav-wrapper > a[href*='en-us']")
    private WebElement footerKnBaseLink;

    @FindBy(css = "div.footer_nav-wrapper > a[href*='php-sdk']")
    private WebElement footerClientSDKLink;




    public void checkForLogo(){
       plivoLogoLink.isDisplayed();
   }
   public void clickOnLogo(){
       plivoLogoLink.click();
   }
   public void clickProductsHeading(){
       productsNavBarHeading.click();
   }
   public void checkProductDropdownList(){
       productsDropdownList.isDisplayed();
   }
   public void checkForSupportCTA(){
       supportCTA.isDisplayed();
   }
   public void clickonSupportCTA(){
       supportCTA.click();
   }
   public void checkForLoginCTA(){
       loginCTA.isDisplayed();
   }
   public void clickOnLoginCTA(){
       loginCTA.click();
   }
   public void checkForProgrammableAPIText(){
        programmableAPIText.isDisplayed();
   }
   public void checkForCarrierPlatformText(){
        carrierPlatformText.isDisplayed();
   }
   public void checkForSolutionsText(){
        solutionsText.isDisplayed();
   }
   public void mouseHoverOnProducts(){

        actions.moveToElement(productsNavBarHeading).build().perform();

   }
   public void checkForSMSAPILinkText(){
        SMSAPILinkText.isDisplayed();
   }
   public void clickOnSMSAPILinkText(){
        SMSAPILinkText.click();
   }
   public void checkForProgrammaticallySendSubText() {
       programmaticallySendSubText.isDisplayed();
   }
   public void checkForVerifyAPiLinkText(){
        verifyAPiLinkText.isDisplayed();
   }
   public void clickOnVerifyAPILinkText(){
        verifyAPiLinkText.click();
   }
   public void checkForVerifyAPISubText(){
        verifyUsersSubText.isDisplayed();
   }
   public void checkForWhatsappBusinessText(){
        whatsappBusinessLinkText.isDisplayed();
   }
   public void clickOnWhatsppBusinessText(){
        whatsappBusinessLinkText.click();
   }
   public void checkForWhatsappBusinessSubText(){
        whatsappBusinessSubText.isDisplayed();
   }
    public void checkForVoiceAPILinkText(){
        voiceAPILinkText.isDisplayed();
    }
    public void clickOnVoiceAPILinkText(){
        voiceAPILinkText.click();
    }
   public void checkForVoiceAPISubText(){
        voiceAPISubText.isDisplayed();
   }
    public void checkForNumberLookUpLinkText(){
        numberLookupLinkText.isDisplayed();
    }
    public void clickOnNumberLookupLinkText(){
        numberLookupLinkText.click();
    }
    public void checkForNumberLookupSubText(){
        numberLookUpSubText.isDisplayed();
    }
    public void checkForPhoneNumberLinkText(){
        phoneNumbersLinkText.isDisplayed();
    }
    public void clickOnPhoneNumberLinkText(){
        phoneNumbersLinkText.click();
    }
    public void checkForPhoneNumberSubText(){
        phoneNumberSubText.isDisplayed();
    }
    public void checkForPlivoCXLinkText(){
        plivoCXLinkText.isDisplayed();
    }
    public void clickOnPlivoCXLinkText(){
        plivoCXLinkText.click();
    }
    public void checkForPlivoCXSubText(){
        plivoCXSubText.isDisplayed();
    }

    public void checkForPlivoServiceLinkText() {
        plivoServiceLinkText.isDisplayed();
    }
    public void checkForPlivoEngageLinkText(){
        plivoEngageLinkText.isDisplayed();
    }
    public void checkForUseCasesLink(){
        useCaseLink.isDisplayed();
    }
    public void mouseHoverOnUseCases(){

        actions.moveToElement(useCaseLink).build().perform();

    }
    public void checkForUseCaseVerifyAPI(){
        useCaseVerifyAPIHeading.isDisplayed();
    }
    public void checkForUseCaseIndustries(){
        useCaseIndustriesHeading.isDisplayed();
    }
    public void checkFrUseCaseBusinessType(){
        useCaseBusinessTypeHeading.isDisplayed();
    }
    public void checkForUseCase2FA(){
        useCase2FA.isDisplayed();
    }
    public void checkForUseCaseAlerts(){
        useCaseAlerts.isDisplayed();
    }
    public void checkForUseCaseSMSMarketing(){
        useCaseSMSMarketing.isDisplayed();
    }
    public void checkForUseCaseVoiceNotifications(){
        useCaseVoiceNotification.isDisplayed();
    }
    public void checkForUseCaseCallForwarding(){
        useCaseCallForward.isDisplayed();
    }
    public void checkForUseCaseCloudIVR(){
        useCaseCloudIVR.isDisplayed();
    }
    public void checkForUseCaseNumberMasking(){
        useCaseNumberMasking.isDisplayed();
    }
    public void checkForUseCaseHealthCare(){
        useCaseHealthcare.isDisplayed();
    }
    public void checkForUseCaseHospitality(){
        useCaseHospitality.isDisplayed();
    }
    public void checkForUseCaseGovernment(){
        useCaseGovernment.isDisplayed();
    }
    public void checkForUseCaseFinance(){
        useCaseFinance.isDisplayed();
    }
    public void checkForUseCaseRetail(){
        useCaseRetail.isDisplayed();
    }
    public void checkForUseCaseEnterprise(){
        useCaseEnterprise.isDisplayed();
    }
    public void checkForUseCaseStartup(){
        useCaseStartup.isDisplayed();
    }
    public void checkForUseCaseNonProfit(){
        useCaseNonprofit.isDisplayed();
    }
    public void checkForDevelopers(){
       developers.isDisplayed();
    }
    public void mouseHoverOnDevelopers(){

        actions.moveToElement(developers).build().perform();

    }
    public void checkForDocumentation(){
        developersDocumentation.isDisplayed();
    }
    public void checkForServiceStatus(){
        developersServiceStatus.isDisplayed();
    }
    public void checkForKnowledgeBase(){
        developersKnowledgeBase.isDisplayed();
    }
    public void checkForProductUpdates(){
        developersProductUpdates.isDisplayed();
    }
    public void checkForSupport(){
        developersSupport.isDisplayed();
    }
    public void checkForCustomers(){
        Customers.isDisplayed();
    }
    public void checkForResources(){
        Resources.isDisplayed();
    }
    public void mouseHoverOnResources(){

        actions.moveToElement(Resources).build().perform();

    }
    public void checkForContentLibrary(){
        resourcesContentLibrary.isDisplayed();
    }
    public void checkForBlog(){
        resourcesBlog.isDisplayed();
    }
    public void checkForGuides(){
        resourcesGuides.isDisplayed();
    }
    public void checkForGlossary(){
        resourcesGlossary.isDisplayed();
    }
    public void checkForPrivacyNSecurity(){
        resourcesPrivacySecurity.isDisplayed();
    }
    public void checkForPricing(){
        Pricing.isDisplayed();
    }
    public void mouseHoverOnPricing(){
        actions.moveToElement(Pricing).build().perform();
    }
    public void checkForProductsLabel(){
        pricingProductLabel.isDisplayed();
    }
    public void checkForDetailedPlansLabel(){
        pricingDetailPlansLabel.isDisplayed();
    }
    public void checkForSMSAPI(){
        pricingSMSAPI.isDisplayed();
    }
    public void checkForVerifyAPI(){
        pricingVerifyAPI.isDisplayed();
    }
    public void checkForWhatsappAPI(){
        pricingWhatsappAPI.isDisplayed();
    }
    public void checkForVoiceAPI(){
        pricingVoiceAPI.isDisplayed();
    }
    public void checkForPhoneNumber(){
        pricingPhoneNumber.isDisplayed();
    }
    public void checkForZentrunkAPI(){
        pricingZentrunkSIP.isDisplayed();
    }
    public void checkForSupportPlans(){
        pricingSupportPlans.isDisplayed();
    }
    public void checkForViewAllPricing(){
        pricingViewAllPricing.isDisplayed();
    }
    public void checkForHomePageHeadingText(){
        homePageHeadingText.isDisplayed();
    }
    public void checkForSubHeadingText(){
        homePageSubHeadingText.isDisplayed();
    }
    public void checkForMainImage(){
        homePageMainImage.isDisplayed();
    }
    public void checkForRequestTrialCTA(){
        requestTrialCTA.isDisplayed();
    }
    public void clickOnRequestTrialCTA(){
        requestTrialCTA.click();
    }
    public void checkForGetVolumePricingCTA(){
        getVolumePricingCTA.isDisplayed();
    }
    public void clickOnVolumePricingCTA(){
        getVolumePricingCTA.click();
    }
    public void checkForVolumePricingForm(){
        volumePricingForm.isDisplayed();
    }
    public void checkForPartnerLogo1(){
        partnerLogos1.isDisplayed();
    }
    public void checkForPartnerLogo2(){
        partnerLogos2.isDisplayed();
    }
    public void checkForLearnLinkText(){
        learnLink.isDisplayed();
    }
    public void clickOnLearnLink(){
        learnLink.click();
    }
    public String checkForCustomerChooseHeading(){
        return customerChooseHeading.getText();
    }
    public void checkForPlivoSatisfiedHeadingText(){
        plivoSatisfiedHeading.isDisplayed();
    }
    public void checkForPlivoSatisfiedSubHeading(){
        plivoSatisfiedSubHeading.isDisplayed();
    }
    public void checkForSatisfiedReadMoreLink(){
        plivoSatisfiedLink.isDisplayed();
    }
    public void clickOnSatisfiedLink(){
        plivoSatisfiedLink.click();
    }
    public void checkForReliabilityHeading(){
        plivoReliabilityHeading.isDisplayed();
    }
    public void checkForReliabilitySubHeading(){
        plivoReliabilitySubHeading.isDisplayed();
    }
    public void checkForReliabilityLink(){
        plivoReliabilityLink.isDisplayed();
    }
    public void clickOnReliabilityLink(){
        plivoReliabilityLink.click();
    }
    public void checkForSimplifiedDesignHeading(){
        plivoSimpleDesignHeading.isDisplayed();
    }
    public void checkForSimplifiedDesignSubHeading(){
        plivoSimpleDesignSubHeading.isDisplayed();
    }
    public void checkForSimplifiedDesignLink(){
        plivoSimpleDesignLink.isDisplayed();
    }
    public void clickOnSimplifiedLink(){
        plivoSimpleDesignLink.click();
    }
    public void checkForPCNEbookImg(){
        pcnEbookImg.isDisplayed();
    }
    public void checkForCarrierNetworkHeadingText(){
        carrierNetworkHeadingText.isDisplayed();
    }
    public void checkForDownloadNowCTA(){
        downloadNowCTA.isDisplayed();
    }
    public void clickOnDownloadNowCTA(){
        downloadNowCTA.click();
    }
    public void checkForExploreProductsHeadingText(){
        exploreProductsHeadingText.isDisplayed();
    }
    public void checkForMessagingPlatformText(){
        messagingPlatformText.isDisplayed();
    }
    public void checkForVoicePlatformText(){
        voicePlatformText.isDisplayed();
    }
    public void checkForGetSolutionsText(){
        getSolutionText.isDisplayed();
    }
    public void checkForGetSMSAPILink(){
        getSMSAPILink.isDisplayed();
    }
    public void checkForGetVoiceAPILink(){
        getVoiceAPILink.isDisplayed();
    }
    public void checkForGetMMSAPILink(){
        getMMSAPILink.isDisplayed();
    }
    public void checkForGetZentrunkAPI(){
        getZentrunkLink.isDisplayed();
    }
    public void checkForGetPlivoCXLink(){
        getPlivoCXLink.isDisplayed();
    }
    public void checkForGetStartedHeadingText(){
        getStartedHeadingText.isDisplayed();
    }
    public void checkForGetStartedSubHeadingText(){
        getStartedSubText.isDisplayed();
    }
    public void checkForGetRequestTrialCTA(){
        getRequestTrialCTA.isDisplayed();
    }
    public void checkForGetVolumePricingCta(){
        getVolumePricingCta.isDisplayed();
    }
    public void checkForFooterProductsText(){
        footerProductsText.isDisplayed();
    }
    public void checkForFooterDevelopersText(){
        footerDevelopersText.isDisplayed();
    }
    public void checkForFooterResourcesText(){
        footerResourcesText.isDisplayed();
    }
    public void checkForFooterCompanyText(){
        footerCompanyText.isDisplayed();
    }

}


