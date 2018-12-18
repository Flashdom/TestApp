package com.ofmine.project.testapp.DI;

import javax.inject.Inject;

public class War {

    private Republic republic;
    private Empire empire;

    @Inject
    public War(Republic republic, Empire empire) {
        this.republic = republic;
        this.empire = empire;
    }

    public void prepare() {
        republic.prepareForWar();
        empire.prepareForWar();
    }

    public void report() {
        republic.reportForWar();
        empire.reportForWar();
    }

}
