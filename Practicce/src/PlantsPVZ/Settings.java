package PlantsPVZ;

interface SunProducer {
    int produce_sun();
}


interface PlantUpgrade {
    int concurrentSunCost();
}

interface Attacker {
    int attack(); //print attack action, return integer of dmg
    int rangeType(); //return integer of range capability (SL / AOE)
}

interface InstantKiller{
    int killType();
}

interface Upgradable{
    String upgrade();
}
// add more interfaces here