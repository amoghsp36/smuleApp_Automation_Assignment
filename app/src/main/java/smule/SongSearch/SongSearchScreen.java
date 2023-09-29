package smule.SongSearch;

import io.qameta.allure.Step;
import smule.SongBook.SongBookScreen;

public class SongSearchScreen extends SongSearchLocators{

    public boolean isSongListDisplayed(){
        return songsList.isDisplayed();
    }

    public boolean isSearchedArtistNameDisplayed(){
        return artistName.isDisplayed();
    }
}
