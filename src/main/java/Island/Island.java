package Island;

import Core.Settings;

/**
 * @author Nikolay Gabaraev
 * @created 21.05.2022
 * @project JavaRush_Module-2
 */

public class Island {

    private static final Cell[][] island = new Cell[Settings.maxY][Settings.maxX];

    public Island() {
        for (int i = 0; i < island.length; i++) {
            for (int j = 0; j < island[i].length; j++) {
                island[i][j] = new Cell();
            }
        }
    }

    public Cell[][] getIsland() {
        return island;
    }

    public static Cell[][] getStaticIsland() {
        return island;
    }

}
