package com.ofmine.project.testapp.DI;

import dagger.Component;

public class BattleForGalaxy {

    public void mainMethod() {
        BattleComponent component = DaggerBattleComponent.create();
        War war = component.getWar();
        war.prepare();
        war.report();
    }


}

@Component
interface BattleComponent {
    War getWar();
}
