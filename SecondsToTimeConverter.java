public static void main(String[] args) {
	// write your code here
        System.out.println(HumanReadableTime(82115)); // 22:48:35
    }

    public static String HumanReadableTime(int time) {
        if (time > 359999) {
            return "The input time is too large to be converted";
        }

        int hours = 0, minutes = 0, seconds = 0;

        for (int i = 0; i < time; i++) {
            seconds++;
            if (seconds == 60) {
                seconds = 0;
                minutes++;
                if (minutes == 60) {
                    minutes = 0;
                    hours++;
                }
            }
        }

        String output = "";

        if (hours < 10) {
            output += "0" + hours + ":";
        }
        else {
            output += hours + ":";
        }

        if (minutes < 10) {
            output += "0" + minutes + ":";
        }
        else {
            output += minutes + ":";
        }

        if (seconds < 10) {
            output += "0" + seconds;
        }
        else {
            output += seconds;
        }

        return output;

    }
}
