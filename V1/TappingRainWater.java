public class TappingRainWater {

    public static int trapRainwater(int[] height) {

        int n = height.length;
        int leftMax[] = new int[n];
        int rightMax[] = new int[n];

        // Find maximum left boundary among bars
        leftMax[0] = height[0];
        for (int i = 1; i < leftMax.length; i++) {

            if (leftMax[i - 1] > height[i]) {

                leftMax[i] = leftMax[i - 1];
            } else if (leftMax[i - 1] <= height[i]) {
                leftMax[i] = height[i];
            }
        }

        // Find maximum right boundary among bars
        rightMax[rightMax.length - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {

            if (rightMax[i + 1] > height[i]) {

                rightMax[i] = rightMax[i + 1];

            } else if (rightMax[i + 1] <= height[i]) {

                rightMax[i] = height[i];
            }
        }

        // Calculating tapping rainwater
        int tapWater = 0;
        for (int i = 0; i < rightMax.length; i++) {

            int waterLevel = Math.min(leftMax[i], rightMax[i]);

            tapWater += waterLevel - height[i];
        }

        return tapWater;
    }

    public static void main(String[] args) {

        // int height[] = { 4, 2, 0, 6, 3, 2, 5 };

        // System.out.println("Taped water for given bar is: " + trapRainwater(height));
        int height2[] = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
        System.out.println("Taped water for given bar is: " + trapRainwater(height2));
    }

}
