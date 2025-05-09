import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DynamicPattern {
    public static void main(String[] args) throws InterruptedException {
        int prevRows = 0, prevCols = 0;

        while (true) {
            int[] size = getTerminalSize();
            int rows = size[0];
            int cols = size[1];

            // Redraw only when terminal size changes
            if (rows != prevRows || cols != prevCols) {
                prevRows = rows;
                prevCols = cols;
                drawPattern(rows, cols);
            }

            Thread.sleep(200); // Check every 200ms
        }
    }

    // Dynamically retrieves terminal size
    private static int[] getTerminalSize() {
        try {
            Process process;
            if (System.getProperty("os.name").contains("Windows")) {
                process = Runtime.getRuntime().exec(new String[] { "cmd", "/c", "mode con" });
            } else {
                process = Runtime.getRuntime().exec(new String[] { "sh", "-c", "stty size" });
            }
            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String line = reader.readLine();
            if (line != null) {
                String[] parts = line.trim().split("\\s+");
                return new int[] { Integer.parseInt(parts[0]), Integer.parseInt(parts[1]) };
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new int[] { 20, 50 }; // Default size
    }

    // Clears the console before redrawing
    private static void clearConsole() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    // Draws a stable checkerboard pattern
    private static void drawPattern(int rows, int cols) {
        clearConsole();
        for (int i = 0; i < rows - 1; i++) { // Leave last row for terminal status
            for (int j = 0; j < cols / 2; j++) { // Each block is 2 chars wide
                System.out.print((i + j) % 2 == 0 ? "██" : "  ");
            }
            System.out.println();
        }
    }
}
