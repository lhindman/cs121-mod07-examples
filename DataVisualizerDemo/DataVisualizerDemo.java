import java.awt.Color;
import java.awt.Dimension;

/**
 * Demonstration of how to implement the HindmanVisualizer interface 
 * @author Luke Hindman
 */
public class DataVisualizerDemo implements HindmanVisualizer {


    /* instance variables (and constants) */
    private final int DISPLAY_WIDTH = 600;
    private final int DISPLAY_HEIGHT = 600;
    private final int MAX_VALUE = 255;
    private int[][] simData;

    /* Constructor */
    public DataVisualizerDemo() {
        this.simData = new int[DISPLAY_HEIGHT][DISPLAY_WIDTH];

        generateVerticalLines();

    }

    /* Private Helper Method */
    private void generateVerticalLines() {
        int numRows = DISPLAY_HEIGHT;
        int numCols = DISPLAY_WIDTH;

        for (int row = 0; row < numRows; row++) {
            for (int col = 0; col < numCols; col++) {
                if (col % 8 == 1) {
                    simData[row][col - 1] = MAX_VALUE/2;
                    simData[row][col] = MAX_VALUE;
                    simData[row][col + 1] = MAX_VALUE/2;
                }
            }
        }
    }

    /* Interface methods */
    @Override
    public Color[] getColorPalette() {
        /* Leaving this set to null uses the default
         *   gray scale palette built into the visualizer */
        return null;
    }

    @Override
    public int[][] getDataset() {
        
        return simData;
    }

    @Override
    public Dimension getDimensions() {
        
        return new Dimension(simData[0].length, simData.length);
    }


    /* Entry Point */
    public static void main(String[] args) {

        DataVisualizerDemo demo = new DataVisualizerDemo();
        Visualizer vis = new Visualizer(demo);
        vis.start();
    }
}
