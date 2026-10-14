
public class rainWater_traping {

    public static void trappedRainwater(int height[]) {

        int leftB[] = new int[height.length];
        int rightB[] = new int[height.length];

        // Calculate left maximum boundaries
        leftB[0] = height[0];

        for (int i = 1; i < height.length; i++) {
            leftB[i] = Math.max(height[i], leftB[i - 1]);
        }

        // Calculate right maximum boundaries
        rightB[height.length - 1] = height[height.length - 1];

        for (int i = height.length - 2; i >= 0; i--) {
            rightB[i] = Math.max(height[i], rightB[i + 1]);
        }

        // Calculate trapped rainwater
        int trappedWater = 0;

        for (int i = 0; i < height.length; i++) {

            // Water level = minimum of left and right maximum
            int waterLevel = Math.min(leftB[i], rightB[i]);

            // Water trapped above the current bar
            trappedWater += waterLevel - height[i];
        }

        System.out.println("Trapped Rainwater = " + trappedWater);
    }

    public static void main(String args[]) {

        int height[] = {4, 2, 0, 6, 3, 2, 5};

        trappedRainwater(height);
    }
}
