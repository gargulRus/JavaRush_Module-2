package Fauna.Herbivores;

/**
 * @author Nikolay Gabaraev
 * @created 14.05.2022
 * @project JavaRush_Module-2
 */

import Core.Settings;
import Fauna.Animal;
import Fauna.Herbivor;
import Fauna.HerbivoreClass;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Duck extends HerbivoreClass implements Herbivor {

    private static int maxOnCell = Settings.duckMaxOnCell;

    public Duck() {
        super(1, 1, 0.15, 4);
    }

    public static int getMaxOnCell() {
        return maxOnCell;
    }

    @Override
    public void eat(List<?> listOfFood, List<?> listOfFood1) {
        try {
            if (this.getSatiety() < this.getMaxSatiety()) {
                int eatChance = ThreadLocalRandom.current().nextInt(0, 100);
                if (eatChance > 10) {
                    double diff = this.getMaxSatiety() - this.getSatiety();
                    if (listOfFood.size() > diff) {
                        this.setSatiety(this.getMaxSatiety());
                        this.setStarvingTime(this.getMaxStarvingTime());
                        listOfFood.subList(0, (int) diff).clear();
                    }
                } else {
                    for (Object predator : listOfFood1) {
                        Animal predator1 = (Animal) predator;
                        if (predator1.getClass().getSimpleName().equals("Caterpillar")) {
                            listOfFood1.remove(predator);
                        }
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}