package Fauna.Herbivores;

/**
 * @author Nikolay Gabaraev
 * @created 14.05.2022
 * @project JavaRush_Module-2
 */

import Core.Settings;
import Fauna.Herbivor;
import Fauna.HerbivoreClass;

public class Kangoroo extends HerbivoreClass implements Herbivor {

    private static int maxOnCell = Settings.kangorooMaxOnCell;

    public Kangoroo() {
        super(47, 2, 7, 8);
    }

    public static int getMaxOnCell() {
        return maxOnCell;
    }
}