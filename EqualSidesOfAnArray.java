public static void main(String[] args) {
        int[] intArray = {1, 2, 3, 4, 3, 2, 1};
        System.out.println(EqualSides(intArray)); // 3

        int[] intArray2 = {1, 100, 50, -51, 1, 1};
        System.out.println(EqualSides(intArray2)); // 1

        int[] intArray3 = {20, 10, -80, 10, 10, 15, 35};
        System.out.println(EqualSides(intArray3)); // 0
    }

    public static int EqualSides(int[] intArray) {
        for (int i = 0; i < intArray.length; i++) {
            int leftTotal = 0;
            int rightTotal = 0;
                
            for (int j = 0; j < i; j++) {
                leftTotal += intArray[j];
            }
                
            for (int k = i; k < intArray.length; k++) {
                rightTotal += intArray[k];
            }

            rightTotal -= intArray[i];

            if (leftTotal == rightTotal) {
                return i;
            }
        }

        return -1;
    }
