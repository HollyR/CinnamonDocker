package io.magentys.pages;

import io.magentys.cinnamon.webdriver.elements.PageElement;
import org.openqa.selenium.support.FindBy;

import static io.magentys.cinnamon.webdriver.conditions.ElementConditions.*;

public class MagenTysBlogPage {

    @FindBy(id ="post-6541")
    public PageElement firstBlogPost;

    @FindBy(css = ".share_it > a:nth-child(2)")
    public PageElement twitterShare;

    @FindBy(css = ".share_it > a:nth-child(3)")
    public PageElement linkedInShare;

    @FindBy(css = ".share_it > a:nth-child(4)")
    public PageElement googlePlusShare;

    @FindBy(css = ".share_it > a:nth-child(5)")
    public PageElement emailShare;


    public MagenTysBlogPage clickFirstBlog() {
        firstBlogPost.waitUntil(displayed.and(enabled)).click();
        return this;
    }

    public boolean isTwitterSharingOptionPresent() {
        return twitterShare.waitUntil(clickable).isPresent();
    }

    public boolean isLinkedInSharingOptionPresent() {
        return linkedInShare.waitUntil(clickable).isPresent();
    }

    public boolean isGooglePlusSharingOptionPresent() {
        return googlePlusShare.waitUntil(clickable).isPresent();
    }

    public boolean isEmailSharingOtpionPresent() {
        return emailShare.waitUntil(clickable).isPresent();
    }
}
