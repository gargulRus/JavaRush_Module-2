package Fauna.Herbivores;

/**
 * @author Nikolay Gabaraev
 * @created 14.05.2022
 * @project JavaRush_Module-2
 */

import Core.Settings;
import Fauna.Herbivor;
import Fauna.HerbivoreClass;

public class Sheep extends HerbivoreClass implements Herbivor {

    private static int maxOnCell = Settings.sheepMaxOnCell;

    public Sheep() {
        super(45, 1, 7, 5);
    }

    public static int getMaxOnCell() {
        return maxOnCell;
    }
}