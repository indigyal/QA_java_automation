package UnitTesting;
/*
TestNG is a testing framework designed to simplify a broad range of testing needs, from
unit testing to integration testing. The "NG" in TestNG stands for "Next Generation", as
it is an enhanced version of JUnit, which was the most widely used testing framework for
Java before TestNG came along. Here are some key aspects of TestNG that make it
particularly powerful and flexible.

 */

import org.testng.Assert;
import org.testng.annotations.Test;
import JavaCourseExercises.PracticeExercises;

public class testOne {
    //1.
    @Test(groups = {"unit"})
    public void equalElements() {
        int[] arr1 = {3, 9, 3, 4, 5, 3};

        Assert.assertTrue(PracticeExercises.equalElements(arr1));
    }

   // 2.
    @Test (groups = {"unit"})
    public void arraySum() {
        int[] arr2 = {4, 2, 3, 4, 5};

        Assert.assertEquals(PracticeExercises.arraySum(arr2),6);
    }

    //3.
    @Test
    public void largestNum() {
        int[] arr3 = {2, 4, 6, 2, 9};

        Assert.assertEquals(PracticeExercises.largestNum(arr3),9);
    }

    //4.
    @Test
    public void twiceNum() {
        int[] arr4 = {1,8,3,4,5,1,2,0,4,5};

        Assert.assertFalse(PracticeExercises.twiceNum(arr4));
    }

//    //5.
   //@Test
//    public void swapNum() {
//        int[]nums1 = {1,2,3};
//        int[]nums2 = {4};
//        int[]nums2 = {4};
//
//        Assert.assertEquals(PracticeExercises.swapNum(arr5),7,2,3,4,5,6,1);
//    }
//
//    //6.
//    @Test
//    public void twoArray() {
//        int[] arr6 = {1,2,3};
//        int[]arr7 = {0,0,0};
//        int []arr8 = {0,0,0,1,2,3};
//
//        Assert.assertEquals(PracticeExercises.twoArray(arr6, arr7),arr8);
//    }

    //7.
    @Test
    public void moveLeft() {
        int[] arr8 = {1,2,3};

        Assert.assertEquals(PracticeExercises.moveLeft(arr8),2,3, String.valueOf(1));
    }

    //8.
    @Test(groups = {"unit"})
    public void squirrels() {
        int cigars = 105;
        boolean isWeekend = true;

        Assert.assertTrue(PracticeExercises.squirrels(cigars, isWeekend));
    }

    //9.
    @Test
    public void ticket() {
        int a= 86;

        Assert.assertEquals(PracticeExercises.ticket(a),3);
    }

    //10.
    @Test
    public void multipleOfTwenty() {
        int b=22;

        Assert.assertFalse(PracticeExercises.multipleOfTwenty(b));
    }

    //11.
    @Test
    public void multipleOfTen() {
        int c=10;

        Assert.assertFalse(PracticeExercises.multipleOfTen(c));
    }

    //12.
    @Test (groups = {"smoke"})
    public void party() {
        int t=8;
        int d=20;

        Assert.assertEquals(PracticeExercises.party(t,d),2);
    }

    //13.
    @Test
    public void addingNums() {
        int e=2;
        int f=2;
        int g=4;

        Assert.assertTrue(PracticeExercises.addingNums(e,f,g));
    }

    //14.
    @Test
    public void fizzBuzz() {
        String str = "Freddy Fazzb";

        Assert.assertEquals(PracticeExercises.fizzBuzz(str),"FizzBuzz");
    }

    //15.
    @Test
    public void not20() {
        int n= (40);

        Assert.assertFalse(PracticeExercises.not20(n));
    }

    //16.
    @Test(groups = {"smoke"})
    public void alarm() {
        int nums = 6;
        boolean vacation =true;

        Assert.assertFalse(PracticeExercises.alarm(nums, vacation));
    }

    //17.
    @Test
    public void cellPhone() {
        boolean isMorning = false;
        boolean isSleeping = true;

        Assert.assertFalse(PracticeExercises.cellPhone(isMorning, isSleeping));
    }

    //18.
    @Test(groups = {"unit,smoke"})
    public void doubleDigit() {
        int y = 12;
        int z = 83;

        Assert.assertFalse(PracticeExercises.doubleDigit(y, z));
    }
    //19.
    @Test
    public void dinnerDate() {
        int you = 3;
        int date = 6;

        Assert.assertEquals(PracticeExercises.dinnerDate(you, date),1);
    }

    //20.
    @Test
    public void squirrelsPlay() {
        int temperature = 100;
        boolean isSummer = false;

        Assert.assertFalse(PracticeExercises.squirrelsPlay(temperature, isSummer));
    }

    //21.
    @Test
    public void copyString() {
        String str2 ="Hello";
        int nn = 1;

        Assert.assertEquals(PracticeExercises.copyString(str2,nn),"Hello");
    }

    //22.
    @Test
    public void twoX() {
        String str3 = "xxhello";

        Assert.assertTrue(PracticeExercises.twoX(str3));
    }

    //23.
    @Test
    public void countingX() {
        String str4 = "abcxxxx";

        Assert.assertEquals(PracticeExercises.countingX(str4),3);
    }

    //24.
    @Test
    public void teen() {
        int teen1 = 19;
        int teen2 = 11;
        int teen3 = 10;

        Assert.assertTrue(PracticeExercises.teen(teen1,teen2,teen3));
    }

    //25.
    @Test
    public void rangeNums() {
        int range1 = 23;
        int range2 = 50;

        Assert.assertFalse(PracticeExercises.rangeNums(range1,range2));
    }

    //26.
    @Test
    public void sum10() {
        int num1 = 7;
        int num2 = 2;

        Assert.assertFalse(PracticeExercises.sum10(num1,num2));
    }

    //27.
    @Test
    public void twoChar() {
        String str5 = "ca";

        Assert.assertEquals(PracticeExercises.twoChar(str5),"cacaca");
    }

    //28.
    @Test
    public void threeChar() {
        String str6 = "bu";

        Assert.assertEquals(PracticeExercises.threeChar(str6),"bububu");
    }

    //29.
    @Test
    public void temps() {
        int temp1 = -12;
        int temp2 = 191;

        Assert.assertTrue(PracticeExercises.temps(temp1, temp2));
    }

    //30.
    @Test
    public void inTrouble() {
        boolean aSmile = true;
        boolean bSmile = false;

        Assert.assertFalse(PracticeExercises.inTrouble(aSmile, bSmile));
    }



}

