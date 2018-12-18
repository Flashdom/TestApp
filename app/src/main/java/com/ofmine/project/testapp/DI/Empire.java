package com.ofmine.project.testapp.DI;

import javax.inject.Inject;

public class Empire implements Fraction {
    @Inject //Dagger 2
    public Empire(){
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
