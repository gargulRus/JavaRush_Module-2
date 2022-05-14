package Fauna.Herbivores;

/**
 * @author Nikolay Gabaraev
 * @created 14.05.2022
 * @project JavaRush_Module-2
 */

import Fauna.Animal;
import Fauna.Herbivor;
import Fauna.Herbivorc;
import Fauna.Predator;

public class Horse extends Herbivorc implements Herbivor {

    private static int maxOnCell = 23;

    public Horse() {
        super(300, 3, 45, 5);
    }

    public static int getMaxOnCell() {
        return maxOnCell;
    }
}