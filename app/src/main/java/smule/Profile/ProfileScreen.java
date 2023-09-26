package smule.Profile;

import common_utils.ScreenActions;
import io.qameta.allure.Step;

public class ProfileScreen extends ProfileLocators{
    private ScreenActions actions;
    public ProfileScreen(){
        this.actions = new ScreenActions();
    }

    @Step("Entering profile name and clikcing next")
    public ProfileScreen profileName(){
        actions.type(profileName,"testUser1");
        actions.tap(nextButton);
        return new ProfileScreen();
    }

    @Step("selecting genres and clicking next")
    public ProfileScreen genres(){
        actions.tap(selectGenres);
        actions.tap(nextButton);
        actions.tap(noThanksButton);
        return new ProfileScreen();
    }

}
