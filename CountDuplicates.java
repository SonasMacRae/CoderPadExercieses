public static void main(String[] args) {
        System.out.println(CountDuplicates("abcde")); // 0
        System.out.println(CountDuplicates("aabbcde")); // 2
        System.out.println(CountDuplicates("aabBcde")); // 2
        System.out.println(CountDuplicates("indivisibility")); // 1
        System.out.println(CountDuplicates("Indivisibilities")); // 2
        System.out.println(CountDuplicates("aA11")); // 2
        System.out.println(CountDuplicates("ABBA")); // 2
    }

    public static int CountDuplicates(String input) {
        input = input.toLowerCase();

        ArrayList<Character> tempList = new ArrayList<>();
        ArrayList<Character> duplicateList = new ArrayList<>();

        for (int i = 0; i < input.length(); i++) {
            if (!tempList.contains(input.charAt(i))) {
                tempList.add(input.charAt(i));
            }
            else {
                if (!duplicateList.contains(input.charAt(i))) {
                    duplicateList.add(input.charAt(i));
                }
            }
        }
        return duplicateList.size();
    }
