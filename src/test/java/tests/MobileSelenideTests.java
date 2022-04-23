package tests;

import config.SetConfig;
import io.appium.java_client.MobileBy;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Selectors.byClassName;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static helpers.Attach.getSessionId;
import static io.qameta.allure.Allure.step;
import static io.restassured.RestAssured.given;

@Tag("selenide")
public class MobileSelenideTests extends TestBase {

    @Test
    @DisplayName("The first test for the Wiki app for Android")
    void searchTest() {
        step("Skip first screen", () ->
                $(MobileBy.id("org.wikipedia.alpha:id/fragment_onboarding_skip_button")).click());

        step("Type search", () -> {
            $(MobileBy.AccessibilityId("Search Wikipedia")).click();
            $(MobileBy.id("org.wikipedia.alpha:id/search_src_text")).setValue("BrowserStack");
        });
        step("Verify content found", () ->
                $$(byClassName("android.widget.TextView")).shouldHave(sizeGreaterThan(0)));
    }
}
