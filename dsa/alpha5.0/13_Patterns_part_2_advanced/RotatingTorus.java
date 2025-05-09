import java.io.IOException;

public class RotatingTorus {
    static final int WIDTH = 80; // Default console width
    static final int HEIGHT = 24; // Default console height
    static final double R1 = 1.0; // Small radius
    static final double R2 = 2.0; // Large radius
    static final double K1 = 15; // Distance of viewer
    static final double K2 = 5; // Perspective scaling

    public static void main(String[] args) throws InterruptedException, IOException {
        double A = 0, B = 0; // Rotation angles
        while (true) {
            double[] zBuffer = new double[WIDTH * HEIGHT];
            char[] output = new char[WIDTH * HEIGHT];
            for (int i = 0; i < WIDTH * HEIGHT; i++) {
                output[i] = ' ';
                zBuffer[i] = 0;
            }

            for (double theta = 0; theta < 2 * Math.PI; theta += 0.07) {
                for (double phi = 0; phi < 2 * Math.PI; phi += 0.02) {
                    double costheta = Math.cos(theta), sintheta = Math.sin(theta);
                    double cosphi = Math.cos(phi), sinphi = Math.sin(phi);

                    // Rotating in 3D
                    double circleX = R2 + R1 * costheta;
                    double circleY = R1 * sintheta;
                    double x = circleX * Math.cos(B) - circleY * Math.sin(B);
                    double y = circleX * Math.sin(B) + circleY * Math.cos(B);
                    double z = x * Math.sin(A) + sinphi * Math.cos(A);
                    double ooz = 1 / (z + K2); // Inverse depth

                    int xp = (int) (WIDTH / 2 + K1 * ooz * x * 2);
                    int yp = (int) (HEIGHT / 2 - K1 * ooz * y);
                    int idx = xp + yp * WIDTH;

                    if (idx >= 0 && idx < WIDTH * HEIGHT) {
                        if (ooz > zBuffer[idx]) {
                            zBuffer[idx] = ooz;
                            output[idx] = ".,-~:;=!*#$@".charAt((int) (ooz * 12));
                        }
                    }
                }
            }

            // Clear screen
            System.out.print("\033[H\033[2J");
            System.out.flush();

            // Print frame
            for (int i = 0; i < WIDTH * HEIGHT; i++) {
                System.out.print(output[i]);
                if (i % WIDTH == WIDTH - 1)
                    System.out.println();
            }

            A += 0.04;
            B += 0.08;
            Thread.sleep(50); // Delay to control speed
        }
    }
}
