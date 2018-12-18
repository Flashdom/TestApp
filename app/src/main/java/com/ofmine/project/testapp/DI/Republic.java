package com.ofmine.project.testapp.DI;

import android.widget.FrameLayout;

import javax.inject.Inject;

public class Republic implements Fraction {


    @Inject //Dagger 2
    public Republic(){
    }

    @Override
    public void prepareForWar() {
        // что-то происходит
        System.out.println(this.getClass().getSimpleName()+" prepared for war");
    }

    @Override
    public void reportForWar() {
        // что-то происходит
        System.out.println(this.getClass().getSimpleName()+" reporting..");
    }

}
