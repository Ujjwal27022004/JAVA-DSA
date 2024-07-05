public class calender2 {
    static final String[] Days = { "Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun" };
    static final String[] Months = { "Jan", "Feb", "Mar", "Apr", "May", "June", "July", "Aug", "Sept", "Oct", "Nov", "Dec" };

    static int getDayofMonth(int q, int month, int year) {
        if (month == 1 || month == 2) {
            month += 12;
            year--;
        }
        int m = month;
        int K = year % 100;
        int J = year / 100;

        // Zeller's Congruence
        int h = (q + (13 * (m + 1)) / 5 + K + K / 4 + J / 4 + 5 * J) % 7;
        int dayOfWeek = (h + 5) % 7;

        return dayOfWeek;
    }

    static boolean isLeapyear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    static int noOfDaysInMonth(int month, int year) {
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            return 31;
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            return 30;
        } else if (month == 2) {
            if (isLeapyear(year)) {
                return 29;
            } else {
                return 28;
            }
        }
        return 0;
    }

    static void printMonth(int month, int year) {
        int Day = getDayofMonth(1, month, year);

        for (String day : Days) {
            System.out.print(day + "  ");
        }
        System.out.println();
        for (int i = 0; i < Day; i++) {
            System.out.print("     ");
        }

        int noOfDays = noOfDaysInMonth(month, year);

        for (int i = 1; i < 7 - Day + 1; i++) {
            if (i < 10) {
                System.out.print("0" + i + "   ");
            } else {
                System.out.print(i + "   ");
            }
        }
        System.out.println();
        int n = 7 - Day + 1;

        while (n <= noOfDays) {
            for (int i = n; i < n + 7; i++) {
                if (i <= noOfDays) {
                    if (i < 10) {
                        System.out.print("0" + i + "   ");
                    } else {
                        System.out.print(i + "   ");
                    }
                } else {
                    System.out.print("     "); 
                }
            }
            System.out.println();
            n = n + 7;
        }
    }

    static void printYear(int year) {
        for (int i = 1; i <= 12; i++) {
            System.out.println("---------------" + Months[i - 1] + "---------------");
            System.out.println();
            calender2.printMonth(i, year);
            System.out.println();
            System.out.println();
        }
    }

    static String[] horizontalMonth(int month, int year) {
        String[] line = new String[7];

        for (int i = 0; i < line.length; i++) {
            line[i] = "";
        }

        String header = new String();
        for (int i = 0; i < 7; i++) {
            header = header + Days[i] + "  ";
        }
        line[0] = header;

        String firstLine = new String();
        int Day = getDayofMonth(1, month, year);
        for (int i = 0; i < Day; i++) {
            firstLine = firstLine + "     ";
        }

        for (int i = 1; i < 7 - Day + 1; i++) {
            if (i < 10) {
                firstLine = firstLine + " " + i + "   ";
            } else {
                firstLine = i + "   ";
            }
        }

        line[1] = firstLine;
        int noOfDays = noOfDaysInMonth(month, year);

        int n = 7 - Day + 1;

        while (n <= noOfDays) {
            for (int j = 2; j < 7; j++) {
                if (j < 7) {
                    for (int i = n; i < n + 7; i++) {
                        if (i <= noOfDays) {
                            if (i < 10) {
                                line[j] = line[j] + " " + i + "   ";
                            } else {
                                line[j] = line[j] + i + "   ";
                            }
                        } else {
                            line[j] = line[j] + "     "; 
                        }
                    }
                    n = n + 7;
                }
            }
        }

        // for (String l : line) {
        //     System.out.println(l);
        // }
        return line;
    }

    static void horizontalYear(int year, int[] grid) {
        String[][] Lines = new String[12][7];

        for (int i = 0; i < 12; i++) {
            Lines[i] = horizontalMonth(i + 1, year);
        }
        int monthsPerRow = grid[0];
        int numRows = grid[1];

        for (int row = 0; row < numRows; row++) {
            for (int lineIndex = 0; lineIndex < 7; lineIndex++) {
                for (int col = 0; col < monthsPerRow; col++) {
                    int monthIndex = row * monthsPerRow + col;
                    if (monthIndex < 12) {
                        System.out.print(Lines[monthIndex][lineIndex] + "     ");
                    } else {
                        System.out.print("                                    ");
                    }
                }
                System.out.println();
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        calender2 A = new calender2();
        int[] grid = { 2, 6 };
        A.horizontalYear(2024, grid);
    }
}