package Fauna.Herbivores;

/**
 * @author Nikolay Gabaraev
 * @created 14.05.2022
 * @project JavaRush_Module-2
 */

import Core.Settings;
import Fauna.Herbivor;
import Fauna.HerbivoreClass;

public class Hamster extends HerbivoreClass implements Herbivor {

    private static int maxOnCell = Settings.hamsterMaxOnCell;

    public Hamster() {
        super(0.03, 1, 0.0075, 3);
    }

    public static int getMaxOnCell() {
        return maxOnCell;
    }
}