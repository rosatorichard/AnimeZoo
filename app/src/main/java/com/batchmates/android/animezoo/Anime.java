package com.batchmates.android.animezoo;

/**
 * Created by Android on 6/27/2017.
 */

public class Anime {

    String animeName;
    int animePicture;
    String animeGenre;
    String animeDiscription;
    int sound;

    public Anime(String animeName, int animePicture, String animeGenre, String animeDiscription, int sound) {
        this.animeName = animeName;
        this.animePicture = animePicture;
        this.animeGenre = animeGenre;
        this.animeDiscription = animeDiscription;
        this.sound=sound;
    }

    public String getAnimeName() {
        return animeName;
    }

    public int getAnimePicture() {
        return animePicture;
    }

    public String getAnimeGenre() {
        return animeGenre;
    }

    public String getAnimeDiscription() {
        return animeDiscription;
    }

    public int getSound() {
        return sound;
    }
}
