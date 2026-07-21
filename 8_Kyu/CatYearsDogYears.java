// https://www.codewars.com/kata/5a6663e9fd56cb5ab800008b

// Kata Task
// I have a cat and a dog.
//
// I got them at the same time as kitten/puppy. That was humanYears years ago.
//
// Return their respective ages now as [humanYears,catYears,dogYears]
//
// NOTES:
//
// humanYears >= 1
// humanYears are whole numbers only
// Cat Years
// 15 cat years for first year
// +9 cat years for second year
// +4 cat years for each year after that
// Dog Years
// 15 dog years for first year
// +9 dog years for second year
// +5 dog years for each year after that
// References
//
// http://www.catster.com/cats-101/calculate-cat-age-in-cat-years
// http://www.slate.com/articles/news_and_politics/explainer/2009/05/a_dogs_life.html
// If you liked this Kata there is another related one here

public class Dinglemouse {
    //1st Solution
    public static int[] humanYearsCatYearsDogYears(final int humanYears) {
        int dogYears = 0;
        int catYears = 0;
        for (int i = 0; i < humanYears; i++) {
            if (i == 0) {
                dogYears += 15;
                catYears += 15;
            } else if (i == 1) {
                dogYears += 9;
                catYears += 9;
            } else {
                dogYears += 5;
                catYears += 4;
            }
        }

        return new int[]{humanYears, catYears, dogYears};
    }
    //2nd Solution
    public static int[] humanYearsCatYearsDogYears(final int humanYears) {
        int catYears = 0;
        int dogYears = 0;
        switch (humanYears) {
            default:
                catYears = 4 * (humanYears - 2);
                dogYears = 5 * (humanYears - 2);
            case 2:
                catYears += 9;
                dogYears += 9;
            case 1:
                catYears += 15;
                dogYears += 15;
        }

        return new int[]{humanYears, catYears, dogYears};
    }
}