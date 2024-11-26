package com.javarush.island.popov.creators;
import com.javarush.island.popov.map.IslandMap;
import com.javarush.island.popov.repo.Constants;
import com.javarush.island.popov.view.ConsoleInputOutput;
import com.javarush.island.popov.view.ConsoleView;


public class Test {
    public static void main(String[] args) {
        ConsoleInputOutput consoleInputOutput = new ConsoleInputOutput();
        consoleInputOutput.write(Constants.CREATE_MAP_AND_FILL);

        consoleInputOutput.write(Constants.HORIZONTAL_RANGE);
        int col = consoleInputOutput.read();
        consoleInputOutput.write(Constants.VERTICAL_RANGE);
        int row = consoleInputOutput.read();
        Constants.ROWS = row;
        Constants.COLS = col;
        IslandMapCreator islandMapCreator = new IslandMapCreator();
        IslandMap map = islandMapCreator.createMap(Constants.ROWS, Constants.COLS);

        consoleInputOutput.write(Constants.LIFE_DAY_NUMBERS);
        int daysNumbers = consoleInputOutput.read();
        Constants.DAYS_NUMBER=daysNumbers;

        StatisticsCreator statistics = new StatisticsCreator();
        statistics.getStatisticByUnits(map);

        ConsoleView consoleView = new ConsoleView();
        consoleView.showStaticticByUnits(statistics, map);


        }
}
