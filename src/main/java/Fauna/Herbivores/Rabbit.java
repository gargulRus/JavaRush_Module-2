package Fauna.Herbivores;

/**
 * @author Nikolay Gabaraev
 * @created 14.05.2022
 * @project JavaRush_Module-2
 */

import Fauna.Animal;
import Fauna.Herbivor;
import Fauna.Herbivorc;

public class Rabbit extends Herbivorc implements Herbivor {

    private static int maxOnCell = 750;

    public Rabbit() {
        super(3, 3, 0.45, 7);
    }

    public static int getMaxOnCell() {
        return maxOnCell;
    }
}