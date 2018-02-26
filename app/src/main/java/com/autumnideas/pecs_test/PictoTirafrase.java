package com.autumnideas.pecs_test;

/**
 * Created by jaimearavena on 26-02-18.
 */

public class PictoTirafrase {

    int image;
    String name;
    Boolean status = false;

    public PictoTirafrase(int image, String name, Boolean status) {
        this.image = image;
        this.name = name;
        this.status = status;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
}
