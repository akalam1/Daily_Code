import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;
import java.util.function.DoubleToIntFunction;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.imageio.plugins.tiff.ExifTIFFTagSet;
import javax.swing.event.CaretListener;

// import java.io.File;
// import java.io.FileNotFoundException;
// import java.io.FileWriter;
// import java.util.Scanner;

// public class hello {

// public static void main(String[] args) {

// // System.out.println("hey");

// // well, lets work with method

// add(5, 6);
// add(100, 60);
// divide(20, 10);
// // adding strings
// stringss("Hey Abul ", "Welcome");

// }

// public static void add(int a, int b) {
// System.out.println(a + b);
// }

// public static void divide(int a, int b) {
// System.out.println(a / b);

// }

// public static void stringss(String a, String b) {
// System.out.println(a + b);

// }
// }

// in this section, lets get current time using java

// public class hello {
// public static void main(String[] args) {

// Date time = new Date();
// System.out.println("The time is: " + time);

// }
// }

// now lets create a programs that reads and write to a text file

// public class hello {
// public static void main(String[] args) throws FileNotFoundException {

// File file = new File("C:/Users/akala/OneDrive/Documents/Java/captmidn.txt");
// // now lets scan throuh the file
// Scanner scan = new Scanner(file);

// String emptyFile = "";

// while (scan.hasNextLine()) {

// emptyFile = emptyFile.concat(scan.nextLine() + "\n");

// }

// System.out.println("value" + emptyFile);

// try {
// FileWriter newFile = new
// FileWriter("C:/Users/akala/OneDrive/Documents/Java/text.txt.txt");
// newFile.write(emptyFile);
// newFile.close();

// } catch (Exception e) {
// System.out.println("An error occurred.");
// e.printStackTrace();
// }

// }
// }

// // in this section we will prctice array
// public class hello {

// public static void main(String[] args) {

// // lets create an array
// int[] array = { 1, 2, 3, 4, 5 };

// int size = array.length;

// // System.out.println(size);
// for (int i = 0; i < size; i++) {
// System.out.println(array[i]);

// }

// }
// }

// in this section we will try to find maximum or minimum number in the list

// public class hello {

// public static void main(String[] args) {

// // lets create an array

// int[] array = { 10, 5, -8, 1, 2, 3, 4, 5 };
// int max = 0;

// // lets find tye smnallest number in the array
// for (int i = 0; i < array.length; i++) {
// if (array[i] > max) {
// max = array[i];

// }
// }
// System.out.println("The max num is: " + max);

// }
// }

// lets find the minimu of an array

// public class hello {

// public static void min(int[] array) {
// int min = 0;

// for (int i = 0; i < array.length; i++) {
// if (array[i] < min) {
// min = array[i];

// }
// }

// System.out.println("the min is: " + min);

// }

// public static void main(String[] args) {
// int[] myArray = { 10, 5, -8, 1, 2, 3, 4, 5 };

// // hello find_min = new hello();

// min(myArray);

// // System.out.println("the min is: " + find_min.min(myArray));

// }
// }

// well now lets work with array_list

// public class hello {
// public static void main(String[] args) {

// // lets create a arraylist

// ArrayList<String> myArrya = new ArrayList<>();

// myArrya.add("Abul");
// myArrya.add("kalam");
// myArrya.add("Abul");

// System.out.println(myArrya.size());

// System.out.println(myArrya.get(1));

// System.out.println(myArrya);

// for (int i = 0; i < myArrya.size(); i++) {

// // by per index
// System.out.println(myArrya.get(i));

// }

// // lets run this in fir each loop

// System.out.println("For Each loop");
// for (String names : myArrya) {
// System.out.println(names);

// }

// }
// }

// leetcode problem

// Example 1:

// Input: nums = [2,7,11,15], target = 9
// Output: [0,1]
// Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

// public class hello {

// public int[] twoSum(int[] nums, int target) {

// int[] res = new int[2];

// for (int i = 0; i < nums.length; i++) {

// for (int j = 1 + i; j < nums.length; j++) {

// if (nums[i] + nums[j] == target) {

// res[0] = j;
// res[1] = i;

// }

// }

// }

// return res;

// }

// public static void main(String[] args) {
// int [] nums = {2,7,11,15};
// int target = 9;

// hello find_min = new hello();

// twoSum(nums, target);

// System.out.println("the min is: " + twoSum);

// }
// }

// public class hello {
// public static void main(String[] args) {
// // public static void fizzBuzz(int n) {

// // int n = 15;

// // for (int i = 1; i <= n; i++) {

// // // System.out.println("The n value is " + n);

// // if (i % 3 == 0 && i % 5 == 0) {
// // System.out.println("FizzBuzz");

// // } else if (i % 3 == 0) {
// // System.out.println("Fizz");

// // } else if (i % 5 == 0) {
// // System.out.println("Buzz");

// // } else {
// // }
// // System.out.println(i);
// // }

// String name = " Abul";

// System.out.println(name[1]);
// }
// }

// leetcode problem

// class hello {
// public int[] twoSum(int[] nums, int target) {

// // given array of integers called NUM also TARGET
// // add-up two NUMS to get TARGET

// /*
// *
// * Input: nums = [2,7,11,15], target = 9
// * Output: [0,1]
// * Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
// */

// // so add two nums from an array, we have create a loops that adds both index
// // and
// // checks if that matches with target

// int sums;
// int indexF;
// int indexL;

// int[] indexes = new int[2];

// // this will be start with first index
// for (int i = 0; i < nums.length; i++) {

// // while this loop will start with next index of first index,
// // lets say fisrt one is 1, second loop will be 2 and go on
// for (int j = i + 1; j < nums.length; j++) {

// indexF = nums[i];
// indexL = nums[j];
// sums = indexF + indexL;

// if (sums == target) {

// indexes[0] = i;
// indexes[1] = j;

// }

// }

// }

// return indexes;

// }
// }

// interview quetion
// you are given a two-digit integer n. return the sum of its digits.

// class hello {
// public static void main(String[] args) {

// int n = 123;

// String s = Integer.toString(n);

// int sum = 0;

// for (int i = 0; i < s.length(); i++) {
// char toChar = s.charAt(i);
// // this gettimg actual value of char
// int convertedChar = Character.getNumericValue(toChar);

// // lets convert it to a CHAR

// sum = sum + convertedChar;
// System.out.println("Convereted char is: " + toChar);

// }

// System.out.println("Added char: " + sum);

// }

// }

/*
 * For deposits = [9, 7, 12] and
 * 
 * operations = [
 * "buy 1 3 2",
 * "sell 1 4 10",
 * "deposit 2 12",
 * "buy 2 10 2",
 * "buy 2 6 3"
 * ]
 * the output should be solution(deposits, operations) = [3, 3, 19, 19, 1].
 */

// int[] solution(int[] deposits, String[] operations) {

// }

// remove duplicates from the an array

// class hello {

// public static void main(String[] args) {

// int[] nums = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };

// int[] temp = new int[nums.length];

// int y = 0;

// int k = 0; // this is for the tototal index on

// for (int i = 0; i < nums.length - 1; i++) {

// // int firstI = nums[i];
// // int secondI = nums[i + 1];

// if (nums[i] != nums[i + 1]) {

// temp[y++] = nums[i];
// }
// }

// temp[y++] = nums[nums.length - 1];

// for (int j = 0; j < y; j++) {
// // System.out.println(temp[j]);

// k++;
// }

// System.out.println("Length: " + k);

// }
// }

// HASHMAP in JAVA

// class hello {
// public static void main(String[] args) {

// HashMap<String, Integer> Map = new HashMap<>();

// Map.put("Abul", 1);
// Map.put("Kalam", 3);

// // here asking if its conrain key. if so it will return true..

// // System.out.println(Map.containsKey("Abul"));

// // this sattement getting value of key
// // System.out.println(Map.get("Abul"));

// // this statement checking if it contaijs valu

// // System.out.println(Map.containsValue(1));

// System.out.println(Map);

// System.out.println("The Value for Abul is: " + Map.get("Abul"));

// System.out.println("The added for Abul is: " + Map.get("Abul") + 1);

// }
// }

// HASPMAP CONTINUES, LETS FIND DUBLICATES OF NUMBERS

// class hello {
// public static void main(String[] args) {

// // initialized array, we will be using tghis array to find duplicates

// int[] nums = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4, 0, 1, 4, 6, 8 };

// // declaring hasmap
// HashMap<Integer, Integer> array = new HashMap<>();

// int nLength = nums.length;

// for (int i = 0; i < nLength; i++) {
// // if the key contain values, we will add 1+1 to it

// if (array.containsValue(nums[i])) {

// array.put(nums[i], array.get(nums[i] + 1));
// // System.out.println(array.put(nums[i], array.get(nums[i] + 1)));
// // else we will just add value as one to each of the key and add to the
// } else {
// array.put(nums[i], 1);
// }

// // else we will just add value as one to each of the key and add to the

// }
// // this should get all the key in the haspmap that we just stored
// for (Integer key : array.keySet()) {

// System.out.println(key);

// }
// // System.out.println(array);

// }
// }

// class hello {
// public static void main(String[] args) {

// int[] nums = { 0, 0, 0, 1, 1, 1, 2, 2, 2, 3, 3, 4, 0, 1, 4, 6, 8, 8, 8 };

// int n_length = nums.length;

// HashMap<Integer, Integer> array = new HashMap<>();

// for (int i = 0; i < n_length; i++) {
// // tryint to get the value of the key
// // int number = array.get(nums[i]);

// if (array.containsValue(nums[i] >= 3)) {

// System.out.println("This printing is: " + array.put(nums[i],
// array.get(nums[i]) + 1));

// } else {

// array.put(nums[i], 1);

// }
// }

// for (Integer key : array.keySet()) {
// // System.out.println(key);

// }

// System.out.println(array);

// }
// }

// class hello {

// public static void main(String[] args) {

// int[] nums = { 1, 1, 1, 2, 2, 3 };

// // 0 2

// int length = nums.length;

// int i = 2;

// for (int j = i; i < length; j++) {

// // in this case i is in the 2nd index 0 and j is in 0 index
// // if 0 = 0 not exual we will add to array if

// if (nums[j] != nums[i - 2]) {

// nums[i] = nums[j];

// }
// i++;

// }

// System.out.println(i - 1);

// }

// }

// leetcode

// public class hello {
// public static void main(String[] args) {
// int[] H = { 1, 1 };

// int ans = 0, i = 0, j = H.length - 1, res = 0;
// while (i < j) {
// if (H[i] <= H[j]) {
// // System.out.println("\n");

// // System.out.println("H[i] <= H[j]");

// // System.out.println(H[i] <= H[j]);

// res = H[i] * (j - i);

// // System.out.println(" res = H[i] * j-i ");
// // System.out.println("J is " + j);
// // System.out.println("-");
// // System.out.println("I is " + i);
// // System.out.println("\n");
// // System.out.println("H[i]: " + H[i]);
// // System.out.println((H[i]) + " * " + (j - i));

// // System.out.println(H[i] * (j - i));

// // System.out.println(" res = H[i] " + (H[i]) + " j-i " + (j - i));
// i++;

// // System.out.println("\n");
// // System.out.println("Now i is: " + i);

// // System.out.println("\n");
// // System.out.println("Ans is: " + res);
// } else {

// res = H[j] * (j - i);

// // System.out.println("\n");

// // System.out.println("Now else implementiong");

// // System.out.println(H[i] <= H[j]);

// // System.out.println(" res = H[i] * j-i ");
// // System.out.println("J is " + j);
// // System.out.println("-");
// // System.out.println("I is " + i);
// // System.out.println((H[i]) + " * " + (j - i));

// // System.out.println(H[i] * (j - i));

// // System.out.println("res = H[i] " + (H[i]) + " j-i " + (j - i));
// j--;

// // System.out.println("\n");
// // System.out.println("Now j is: " + j);

// // System.out.println("\n");
// // System.out.println("Ans is: " + res);
// }

// if (res > ans)
// ans = res;

// // System.out.println(ans = res);
// }
// // return ans;
// System.out.println("The ans is: " + ans);

// }
// }

// public class hello {
// public static void main(String[] args) {

// int[] height = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
// // length of the array
// int j = height.length - 1;
// int area = 0;
// // this idex will be used to compare the indexes along with j
// int i = 0;
// int ans = 0;

// // since we will compare thsese two indexes from both side, we have to make
// sure
// // they
// // stop in a way that they arent passing each other

// while (i < j) {

// if (height[i] <= height[j]) {

// // do the follwing formular to find the Area with most water

// // Area = Length * Distance/width
// // to find the distance we have to subtract the width/indexes

// area = height[i] * (j - i);

// i++;

// }

// else {
// area = height[i] * (j - i);

// j--;

// }

// if (area > ans)
// ans = area;

// }
// // return area;
// System.out.println(ans);

// }

// }

// leetcode

/*
 * You are given a large integer represented as an integer array digits, where
 * each digits[i] is the ith digit of the integer. The digits are ordered from
 * most significant to least significant in left-to-right order. The large
 * integer does not contain any leading 0's.
 * 
 * Increment the large integer by one and return the resulting array of digits.
 * 
 * 
 * Example 1:
 * 
 * Input: digits = [1,2,3]
 * Output: [1,2,4]
 * 
 * Explanation: The array represents the integer 123.
 * Incrementing by one gives 123 + 1 = 124.
 * Thus, the result should be [1,2,4].
 * 
 */

// public class hello {
// public static void main(String[] args) {

// // byte ak[] = { 71, 101, 101, 107, 115 };

// // String s1 = new String(ak);
// // System.out.println(s1);

// // String s2 = new String(ak, 0, 2);
// // System.out.println(s2);

// // stringbuffers

// // StringBuffer s = new StringBuffer("GeeksforGeeks");

// // System.out.println(s);

// // s.append("yup");
// // System.out.println(s);

// // // s.delete(0, 1);
// // // System.out.println(s);

// // s.insert(1, "ayo");
// // System.out.println(s);

// // s.reverse();
// // System.out.println(s);
// // s.reverse();
// // System.out.println(s);
// // s.replace(1, 4, "");
// // System.out.println(s);

// StringBuffer s = new StringBuffer("GeeksforGeeks");
// // letws check the length of it
// int length = s.length();

// System.out.println(length);

// int q = s.capacity();
// System.out.println(q);
// }

// }

// string builder,
// the big difference between string builder and stringbuffer is that
// stringbuffer is secure and gd for multithread
// and stringbuilder is faster
// public class hello {
// public static void main(String[] args) {

// StringBuilder str = new StringBuilder();
// str.append("HEY");

// System.out.println(str);
// System.out.println(str.toString());

// }
// }

// lets review java a bit
// multidimensional Array
// public class hello {
// public static void main(String[] args) {
// int[][] myNumbers = { { 1, 2, 3, 4 }, { 5, 6, 7 } };
// // int x = myNumbers[1][3];

// // System.out.println(x); // Outputs 7

// for (int i = 0; i < myNumbers.length; ++i) {
// for (int j = 0; j < myNumbers[i].length; ++j) {
// System.out.println(myNumbers[i][j]);
// }
// }

// }

// }
// methods
// public class hello {

// public static void mymethod() {

// System.out.println("The method is working");

// }

// public static void main(String[] args) {

// mymethod();
// mymethod();
// mymethod();
// }
// }

// Java Method Parameters

// public class hello {

// public static void myMrthod(int num1, int age) {

// int total = num1 + age;

// System.out.println("The total num is " + total);

// }

// public static void main(String[] args) {

// myMrthod(1, 19);
// myMrthod(2, 19);
// myMrthod(3, 19);
// }
// }

// recursive

// public class hello {

// public static void main(String[] args) {

// int result = mymethod(10);

// System.out.println(result);
// }

// public static int mymethod(int k) {

// if (k > 0) {
// return k + mymethod(k - 1);
// } else {
// return 0;
// }
// }
// }

// public class hello {

// final int x = 5;
// int y = 10;

// public static void main(String[] args) {

// // accesing the class

// hello myobj = new hello();

// // myobj.x = 20;

// // lets print ot from the class
// // we acessing from the class by using the dot
// System.out.println(myobj.x);
// System.out.println(myobj.y);

// }
// }

// polymorphism

// class Animal {
// public void mysound() {
// System.out.println("Animal sounds like.....");
// }
// }

// class cat extends Animal {
// public void mysound() {
// System.out.println("mew mew");
// }
// }

// class cow extends Animal {
// public void mysound() {
// System.out.println("hughh, hughhh");
// }
// }

// public class hello {

// public static void main(String[] args) {
// // lets creat an objects for the animal so we can them

// Animal myAnumAnimal = new Animal(); /// created an objextsa for ANIMAL
// Animal mycat = new cat();
// Animal mycow = new cow();

// myAnumAnimal.mysound();
// mycat.mysound();
// mycow.mysound();

// }
// }

// interface

// interface Animal {
// public void catSound();

// public void dogSound();
// }

// class cat implements Animal {

// // lets inherit and give body to catSount();
// public void catSound() {
// System.out.println(" Cat makes noice like: mewwww, mewwww, mewwww");
// }

// // lets inherit and give body to dogsound();

// public void dogSound() {
// System.out.println(" Dogas sounds like: poww, powwww, powwww");
// }

// }

// public class hello {

// public static void main(String[] args) {

// cat catanddog = new cat(); //creating object for CAT

// catanddog.catSound();
// catanddog.dogSound();
// }
// }

// arrayList

// public class hello {

// public static void main(String[] args) {

// // lets create an arraylist

// ArrayList<String> car = new ArrayList<>();
// car.add("bmw");
// car.add("toyota");
// car.add("honda");

// // System.out.println(car);

// // lets use loop to print out value

// // for (int i = 0; i < car.size(); i++) {
// // System.out.println(car.get(i));

// // }

// // forEach loop

// Collections.sort(car);

// for (String i : car) {
// System.out.println(i);

// }
// }
// }

// hashmap

// public class hello {

// public static void main(String[] args) {

// HashMap<Integer, String> cars = new HashMap<>();

// cars.put(1, "bmw");
// cars.put(2, "toyota");
// cars.put(3, "hunda");
// cars.put(4, "lexus");

// // System.out.println(cars);

// for (String i : cars.values()) {
// System.out.println(i);
// }
// }
// }

// try catch
// public class hello {

// public static void main(String[] args) {

// try {
// int arraylist[] = { 1, 2, 3, 4, 5 };

// System.out.println(arraylist[10]);
// // if its givens an error, catch exception will go on excecuting
// } catch (Exception e) {
// System.out.println("Something went wrong");
// }
// }
// }

// regular expression

// public class hello {

// public static void main(String[] args) {

// // this is what we are searching for , It describes what is being searched
// for.

// Pattern pattern = Pattern.compile("k", Pattern.CASE_INSENSITIVE);
// // and this is where are searching this in

// Matcher matcher = pattern.matcher("Visit W3Schools! akk");

// boolean matchFound = matcher.find();

// if (matchFound) {
// System.out.println("Match found");
// } else {
// System.out.println("Match not found");
// }

// }
// }

// java lambda expression

// public class hello {

// public static void main(String[] args) {

// ArrayList<Integer> array_list = new ArrayList<>();

// // array_list.add(5);
// // array_list.add(6);
// // array_list.add(4);
// // array_list.add(3);
// // array_list.add(1);

// // instead of adding it manually lets use loop to add it byitself

// for (int i = 0; i <= 10; i++) {
// array_list.add(i);

// }

// // for (int integer : array_list) {
// // System.out.println(integer);

// // }

// // now lets use lambda exression to implement same thing

// array_list.forEach((list) -> {
// System.out.println(list);
// });

// }
// }

// leetcode again

/*
 * Given a non-empty array of integers nums, every element appears twice except
 * for one. Find that single one.
 * 
 * You must implement a solution with a linear runtime complexity and use only
 * constant extra space.
 * 
 * 
 * 
 * Example 1:
 * 
 * Input: nums = [2,2,1]
 * Output: 1
 */

// public class hello {

// public static void main(String[] args) {

// int nums[] = { 4, 1, 2, 1, 2 };

// int result = nums[0];

// // here we are getting the size of the array
// int size = nums.length;
// System.out.println(size);

// // lets loopm through the array
// for (int i = 1; i < size; i++) {

// result = result ^ nums[i];

// }

// System.out.println(result);

// }
// }

// public class hello {

// public static void main(String[] args) {

// int nums[][] = { { 1, 2, 3 },
// { 4, 5, 6 } };

// // System.out.println(nums.length);
// // System.out.println(nums[0][2]);

// for (int row = 0; row < nums.length; row++) {

// for (int index = 0; index < nums[row].length; index++) {

// System.out.println(nums[row][index]);

// }

// }

// }
// }

// list,
// pascall triangle
// public class hello {

// public static void main(String[] args) {
// int row = 3;

// List<List<Integer>> traiangle = new ArrayList<>();
// // in this case we are creating a row, since it starts with one alwys, so
// just
// // hardcoding 1 to it and then
// // adding to main triangle
// // first row just have 1
// List<Integer> firstRow = new ArrayList<>();

// firstRow.add(1);
// traiangle.add(firstRow);

// // this seeting limit till given row..
// // seeting it one cuz, previosly we set row [0] as 1
// for (int i = 1; i < row; i++) {
// List<Integer> prevRow = traiangle.get(i - 1);
// List<Integer> currRow = new ArrayList<>();
// // this just adding first value as one as it always will be same
// currRow.add(1);
// // starting j from one cuz j[0] been hard coded at the begining
// for (int j = 1; j < i; j++) {
// // prevRow.get(j-1) = 0 = 1 and prevRow.get(j) = 1

// currRow.add(prevRow.get(j - 1) + prevRow.get(j));

// }

// // adding 1 to the end
// currRow.add(1);

// // adding currentRow to the main triangle

// traiangle.add(currRow);
// }

// System.out.println(traiangle);

// }
// }

// public class hello {

// public static void main(String[] args) {

// int N = 20;

// if (N % 2 != 0) {
// System.out.println("Weird");
// } else if (N % 2 == 0 && N < 5 && N > 2) {
// System.out.println("Not Weird");
// } else if (N % 2 == 0 && N <= 20 && N >= 6) {
// System.out.println("weird");
// } else if (N % 2 == 0 && N > 20) {
// System.out.println("not weird");

// }

// }
// }

// leetcode

// public class hello {

// public static void main(String[] args) {

// int nums1[] = { 1 };
// int nums2[] = {};

// ArrayList<Integer> nums = new ArrayList<>();
// // this is for nums1
// for (int i = 0; i < nums1.length; i++) {
// if (nums1[i] != 0) {
// nums.add(nums1[i]);

// }
// }
// // this is for nums2

// for (int j = 0; j < nums2.length; j++) {
// if (nums2[j] != 0) {
// nums.add(nums2[j]);

// }

// }
// Collections.sort(nums);
// for (int k : nums) {
// System.out.println(k);

// }

// }
// }

// public class hello {

// public static void main(String[] args) {

// int array[] = { 1, 2, 3, 0, 0, 0 };
// int array2[] = { 4, 5, 6 };
// // int index = 1;
// // array[index] = 10;
// // System.out.println("This is main array");
// // for (int k : array) {
// // System.out.println(k);

// // }
// int length = array.length - 1;
// int lengths = array2.length - 1;

// // System.out.println(lengths);
// for (int i = length; i >= 0;) {
// // System.out.println(array[i]);

// for (int k = 0; k < lengths;) {

// array[i] = array2[k];
// k++;
// i--;
// }
// // System.out.println(array[i]);

// }

// for (int y : array) {
// System.out.println(y);
// }

// }
// }

// public class hello {

// public static void main(String[] args) {

// try {
// File textF = new File("C:/Users/akala/OneDrive/Documents/text.txt");
// Scanner readingF = new Scanner(textF);
// while (readingF.hasNextLine()) {
// String data = readingF.nextLine();
// List<String> list = new ArrayList<String>();

// list.add(data);
// System.out.println("ArrayList : " + list.toString());

// // System.out.println(data);
// }
// readingF.close();
// } catch (FileNotFoundException e) {
// System.out.println("An error occurred.");
// e.printStackTrace();
// }
// }
// }

// public class hello {

// public static void main(String[] args) {

// int num1[] = { 1, 2, 3, 0, 0, 0 };

// int num2[] = { 2, 5, 6 };

// int lengthn1 = num1.length - 1;
// int lengthn2 = num2.length;

// // System.out.println("length of num1 " + lengthn1);

// int index = 0;
// // this loop will go over the num1 array from the last to first

// for (int i = lengthn1; i >= lengthn2; i--) {
// // this will assign from the last array till length of the second array, a
// new
// // value from array2

// // i = lengthn1 - 1;
// num1[i] = num2[index];

// index++;
// }
// Arrays.sort(num1);
// for (int j : num1) {
// System.out.println(j);

// }

// }
// }

// leetcode problem MERGE SORT
// public class hello {
// public static void main(String[] args) {

// int num1[] = { 1, 2, 3, 0, 0, 0 };

// int num2[] = { 2, 5, 6 };

// int m = num1.length;
// int n = num2.length;

// int len = m - 1;
// int index = 0;
// // System.out.println("value of n " + n);
// while (n > 0) {
// System.out.println("value of n " + n);
// System.out.println("value of index " + index);
// // 3 >=0
// // 3 >=0
// // 3 >=0

// num1[len] = num2[index];
// // num1[5] = num2[0]
// // num1[4] = num2[1]
// // num1[3] = num2[2]

// len--;
// index++;
// n--;

// }
// Arrays.sort(num1);
// for (int j : num1) {
// System.out.println(j);

// }

// }

// }

// public class hello {
// public static void main(String[] args) {

// int[] prices = { 7, 1, 5, 3, 6, 4 };

// int lengths = prices.length;

// int bigNum = prices[0];
// int buys = prices[0];
// int profit = 0;

// for (int i = 2; i < lengths; i++) {

// if (prices[i] > bigNum) {
// // 1 < 5
// bigNum = prices[i];

// System.out.println(" the big number is " + bigNum);

// }
// }

// if (bigNum > buys) {
// profit = bigNum - buys;
// System.out.println(" the proit is " + profit);

// }
// else {
// profit = 0;
// System.out.println(" the proit is " + profit);
// }

// System.out.println(" the proit is " + profit);

// System.out.println(" Amount we paid " + buys);
// System.out.println(" the big number is " + bigNum);

// }
// }
// public class hello {
// public static void main(String[] args) {
// for (int i = 0; i < 7; i++) {

// for (int j = 0; j <= i; j++) {
// System.out.print("*");

// }
// System.out.println();
// }
// }
// }

// leetcode

// Given a binary array nums, return the maximum number of consecutive 1's in
// the array.
/*
 * Input: nums = [1,1,0,1,1,1]
 * Output: 3
 */
// public class hello {
// public static void main(String[] args) {

// int nums[] = { 1, 0, 1, 1, 0, 1 };
// // well count the number of onces exist there
// // so lets run a loop
// int num1 = 0;
// int num2 = 0;
// // this is what we will do,
// // we will have two tracker which will count the nums of rep. 1
// // one of them will rset and other will keep the highets repetative of num
// and
// // then pick rthe max

// for (int i = 0; i < nums.length; i++) {
// if (nums[i] == 1) {
// num1++;
// } else {
// // if num[i] = 0, the value of num1 will equal to zero
// // but before that we will save the prev recrds of repetative of 1s
// if (num1 > num2)
// num2 = num1;
// num1 = 0;
// }

// }

// System.out.println(Math.max(num1, num2));
// }
// }

// public class hello {
// public static void main(String[] args) {

// int nums[] = { 12, 345, 2, 6, 7896 };
// int total = 0;

// for (int i = 0; i < nums.length; i++) {

// float added = nums[i] / 2;

// // System.out.println(added);
// if (added % 2 == 0) {
// total++;
// }
// }
// double test = 345 / 2;

// System.out.println("test " + test);
// // System.out.println(total);
// }
// }

// public class hello {
// public static void main(String[] args) {
// int i = 5;
// for (int k = 0; k <= i; k++) {
// System.out.println(k);

// }

// }
// }

// leetcode q: 13
// Strings
// public class hello {
// public static void main(String[] args) {

// int res = 0;

// String s = "CMXCVII";

// Map<Character, Integer> m = new HashMap<>();

// m.put('I', 1);
// m.put('V', 5);
// m.put('X', 10);
// m.put('L', 50);
// m.put('C', 100);
// m.put('D', 500);
// m.put('M', 1000);

// for (int i = 0; i <= s.length() - 1; i++) {

// if (i < s.length() - 1 && m.get(s.charAt(i)) < m.get(s.charAt(i + 1))) {

// res -= m.get(s.charAt(i));

// } else {

// res += m.get(s.charAt(i));

// }
// }
// System.out.println("Total num: " + res);

// }
// }

// leetcode q:14
// public class hello {
// public static void main(String[] args) {

// String[] strs = { "flower", "flow", "flight" };

// Arrays.sort(strs);

// String s1 = strs[0];
// String s2 = strs[strs.length - 1];

// int num = 0;

// while (num < s1.length() && num < s2.length()) {

// if (s1.charAt(num) == s2.charAt(num)) {
// num++;

// } else {
// break;
// }

// }
// System.out.println("The subsstring: " + s1.substring(0, num));

// }
// }

// #leetcode 20

// public class hello {
// public static void main(String[] args) {
// String s = "()";

// Stack<Character> stack = new Stack<Character>(); // create an empty stack
// for (char c : s.toCharArray()) { // loop through each character in the string
// if (c == '(') // if the character is an opening parenthesis
// stack.push(')'); // push the corresponding closing parenthesis onto the stack
// else if (c == '{') // if the character is an opening brace
// stack.push('}'); // push the corresponding closing brace onto the stack
// else if (c == '[') // if the character is an opening bracket
// stack.push(']'); // push the corresponding closing bracket onto the stack
// else if (stack.isEmpty() || stack.pop() != c) // if the character is a
// closing bracket
// // if the stack is empty (i.e., there is no matching opening bracket) or the
// top
// // of the stack
// // does not match the closing bracket, the string is not valid, so return
// false
// // return false;
// System.out.println("False");
// }
// // if the stack is empty, all opening brackets have been matched with their
// // corresponding closing brackets,
// // so the string is valid, otherwise, there are unmatched opening brackets,
// so
// // return false
// // return stack.isEmpty();
// System.out.println(stack.isEmpty());

// }
// }
// // leetcode 459
// public class hello {
// public static void main(String[] args) {
// String y = "abababab";
// String s = y+y;
// System.out.println(s.length());

// String subs_string = s.substring(1, s.length()-1);
// System.out.println("Subsstring "+ subs_string);

// System.out.println(subs_string.contains(y));

// }
// }

// leetcode 412

// public class hello {
// public static void main(String[] args) {

// int n = 15;

// LinkedList<String> cars = new LinkedList<String>();
// for (int i = 1; i <= n; i++) {

// if (i % 3 == 0 && i % 5 == 0) {

// // System.out.println("FizzBuzz");
// cars.add("FizzBuzz");

// } else if (i % 3 == 0) {
// // System.out.println("Fizz");
// cars.add("Fizz");

// } else if (i % 5 == 0) {

// // System.out.println("Buzz");
// cars.add("Buzz");

// } else {
// // System.out.println(i);
// String s =String.valueOf(i);
// cars.add(s);
// }
// }

// System.out.println(cars);

// }
// }

// leetcode 344
// public class hello {
// public static void main(String[] args) {

// // reverse characters

// char[] s = { 'a', 'b', 'c', 'd', 'e' };

// char a;
// for (int i = 0, j = s.length - 1; i < s.length / 2; i++, j--) {
// a = s[i];
// s[i] = s[j];
// s[j] = a;

// }

// for (char element : s)

// System.out.print(element + " ");
// }

// }
// leetcode 345
// public class hello {
// public static void main(String[] args) {

// String s = "leetcode";
// System.out.println(s);

// int count = 0;

// HashMap<Character, Integer> hashM = new HashMap<>();

// for (char c : s.toCharArray()) {
// if (hashM.containsKey(c)) {
// int currentV = hashM.get(c);

// hashM.put(c, currentV + 1);

// } else {
// hashM.put(c, 1);
// }

// }
// System.out.println(hashM);

// for (int i = 0; i <= s.toCharArray().length - 1; i++) {

// if (hashM.get(s.charAt(i)) == 1) {
// count = i;
// // count++;
// break;

// } else {
// count = -1;
// }

// }
// System.out.println(count);
// // return count;

// }

// }

// public class hello {
// public static void main(String[] args) {

// String s = "nwcn";
// char[] k = s.toCharArray();

// HashSet<Character> hashS = new HashSet<>();

// for (char c : s.toCharArray()) {
// if (hashS.contains(c)) {
// // return c;
// System.out.println(c);
// break;

// } else {
// hashS.add(c);
// }

// }

// }

// }

// #leetcode 1
// two sum

// public class hello {
// public static void main(String[] args) {
// int[] nums = { -1, -2, -3, -4, -5 };

// int target = -8;
// int start = 0;
// int end = nums.length - 1;
// // Arrays.sort(nums);

// List<Integer> list = new ArrayList<Integer>();

// for (int i = 0; i <= nums.length - 1; i++) {

// if (nums[start] + nums[end] == target) {

// list.add(start);
// list.add(end);
// break;

// } else if (nums[start] + nums[end] <= target) {
// start++;

// } else {
// end--;
// }

// }
// System.out.println(list);

// }
// }

// 1leetcode 1

// public class hello {
// public static void main(String[] args) {
// int[] nums = { -1, -2, -3, -4, -5 };
// int target = -8;

// int[] res = new int[2];

// for (int i = 0; i <= nums.length - 1; i++) {
// for (int j = i + 1; i <= nums.length - 1; j++) {

// if (nums[i] + nums[j] == target) {

// res[0] = i;
// res[1] = j;

// }

// }
// }
// for (int k : res) {
// System.out.println(k);

// }

// }
// }

// leetcode
// 412

// public class hello {
// public static void main(String[] args) {

// int n = 15;

// for (int i = 1; i <= n; i++) {

// if (i % 3 == 0 && i % 5 == 0) {
// System.out.println("FizzBuzz");

// } else if (i % 3 == 0) {
// System.out.println("Fizz");

// } else if (i % 5 == 0) {
// System.out.println("Buzz");
// } else {
// System.out.println(i);
// }

// }
// }
// }

// #387

// public class hello {
// public static void main(String[] args) {

// String s = "loveleetcode";

// HashMap<Character, Integer> letter = new HashMap<>();

// for (char c : s.toCharArray()) {

// if (letter.containsKey(c)) {
// int currentv = letter.get(c);
// letter.put(c, currentv + 1);

// } else {
// letter.put(c, 1);
// }

// }

// for (int i = 0; i < s.length(); i++) {
// if (letter.containsKey(s.charAt(i)) && letter.get(s.charAt(i)) == 1) {
// System.out.println(i);

// }

// }
// }
// }

// public class hello {
// public static void main(String[] args) {

// char[] s = { 'h', 'e', 'l', 'l', 'o' };
// char a;
// for (int i = 0, j = s.length - 1; i < s.length / 2; i++, j--) {

// System.out.println(" a=s[i]: ");

// a = s[i];
// System.out.println(a +""+ s[i]);

// System.out.println(" s[i]=s[j]: ");

// s[i] = s[j];
// System.out.println(s[i] + " "+ s[j]);

// System.out.println(" s[j]=a: ");
// s[j] = a;
// System.out.println(s[j] +" "+ a);
// }
// }
// }

/// leetcode
// //217
// public class hello {
// public static void main(String[] args) {

// int nums [] = {1,2,3,4,1};

// HashSet <Integer> list = new HashSet<>();

// for (int i: nums){
// if (list.contains(i)){
// System.out.println("True ");

// }else{
// list.add(i);

// }

// }

// }
// }
// if (letter.containsKey(c)) {
// // int currentv = letter.get(c);
// // letter.put(c, currentv + 1);

// // } else {
// // letter.put(c, 1);
// // }

// public class hello {
// public static void main(String[] args) {

// String s = "anagram";
// String t = "nagagram";

// char[] schar = s.toCharArray();
// char[] tchar = t.toCharArray();

// Arrays.sort(schar);
// Arrays.sort(tchar);

// return Arrays.equals(schar,tchar);

// HashMap<Character, Integer> charr = new HashMap<>();

// for (char i: s.toCharArray()){
// System.out.println(i);
// if (charr.containsKey(i)){
// int currentV = charr.get(i);
// charr.put(i, currentV+1);

// }else{
// charr.put(i, 1);
// }

// }
// for (char i: t.toCharArray()){

// if (charr.containsKey(i) == charr.containsKey(t)){
// int currentV = charr.get(i);
// charr.put(i, currentV+1);
// }

// }
// }

// public class hello {
// public static void main(String[] args) {

// // find two integer that totalkled up to the target
// // and return the location of those integers that ended up eqiual to target

// int[] nums = { 3, 2, 4 };
// int target = 6;

// // int [] result ;
// ArrayList<Integer> myNumbers = new ArrayList<Integer>();
// for (int i = 0; i <= nums.length - 1;) {

// for (int j = i + 1; j <= nums.length - 1;) {

// if (nums[j] + nums[i] != target) {
// i++;
// j++;

// }else{
// myNumbers.add(j);
// myNumbers.add(i);
// }
// }

// }
// for (int i : myNumbers) {
// System.out.println(i);
// }
// }
// }
// public class hello {
// public static void main(String[] args) {
// int[] nums = { 3,2,4};
// int target = 6;

// int[] res = new int[2];

// for (int i = 0; i <= nums.length - 1; i++) {
// for (int j = i + 1; i <= nums.length - 1; j++) {

// if (nums[i] + nums[j] == target) {

// res[0] = i;
// res[1] = j;

// }

// }
// }
// for (int k : res) {
// System.out.println(k);

// }

// }
// }

// Happy Numbers

// public class hello {
// public static void main(String[] args) {

// int n = 19;

// HashSet<Integer> numbers = new HashSet<Integer>();

// while (n != 1 && !numbers.contains(n)) {

// numbers.add(n);
// int sum = 0;
// while (n != 0) {

// sum += Math.pow(n % 10, 2);
// System.out.println(sum);
// Math.floor(n / 10);

// }

// n = sum;

// }
// return n==1;
// System.out.println("N is equal to 1 now ");

// for (Integer i : numbers) {
// System.out.println(i);
// }

// }

// }

// class Solution {
// public boolean isHappy(int n) {
// HashSet<Integer> numbers = new HashSet<Integer>();

// while (n != 1 && !numbers.contains(n)) {

// numbers.add(n);
// int sum = 0;

// //calculates the squareroot of each number
// while (n != 0) {

// sum += Math.pow(n % 10, 2);

// n/=10;

// }
// // once a number is done squareing, it added the to the hasset
// System.out.println(sum);

// n = sum;

// }
// return n==1;

// }
// }

// 20. Valid Parentheses

// public class hello {
// public static void main(String[] args) {

// String s = "(}";
// Stack<Character> stack = new Stack<>();

// for (char c: s.toCharArray() ){

// if (c == '('){
// stack.push(')');

// }else if (c == '['){
// stack.push(']');

// } else if (c == '{'){
// stack.push('}');
// }else if(stack.empty() || stack.pop() != c){
// // return false;
// System.out.println("false");

// }
// }
// // return stack.isEmpty();
// System.out.println(stack.isEmpty());

// }
// }

// public class hello {
// public static void main(String[] args) {

// String palindrome = "abccba";
// // convert to a char, Cuz gotta access them individually

// if (palindrome.length() == 1)
// // return "";
// System.out.println("");
// char[] ch = palindrome.toCharArray();
// for (int i = 0; i < ch.length / 2; i++) {

// if (ch[i] != 'a') {
// ch[i] = 'a';
// break;

// } else if (i == palindrome.length() / 2 - 1 && ch[i] == 'a') {

// ch[ch.length - 1] = 'b';

// }

// }

// for (char c : ch) {
// System.out.println(c);

// }
// }
// }

// public class hello {
// public static void main(String[] args) {
// // Create an instance of the Solution class
// Solution solution = new Solution();
// // Example palindrome string

// String palindromeString = "abccba";

// // Call the breakPalindrome method on the solution instance
// String result = solution.breakPalindrome(palindromeString);

// // Print the result
// System.out.println(result);

// }
// }

// class Solution {
// public String breakPalindrome(String palindrome) {
// // if the length is one, obiously you cant compare the or palindrome so
// return
// // as none ""
// if (palindrome.length() == 1)
// return "";
// char[] ch = palindrome.toCharArray();
// for (int i = 0; i < ch.length / 2; i++) {

// if (ch[i] != 'a') {
// ch[i] = 'a';
// break;

// } else if (i == palindrome.length() / 2 - 1 && ch[i] == 'a') {

// ch[ch.length - 1] = 'b';

// }

// }
// return new String(ch);

// }
// }

// Palindrome number 9

// public class hello {
// public static void main(String[] args) {

// rev=0;
// formula: rev= (revx10)+last_digit
// int x = 121;
// int temp = x;

// int rev =0;
// while (x>0){
// int last_digit = x%10;
// rev = (rev*10)+last_digit;
// x=x/10;

// }

// if (temp==rev){
// // return true;
// System.out.println("true");

// }else{
// System.out.println("False");
// }

// }

// }

// 121. Best Time to Buy and Sell Stock

// public class hello {
// public static void main(String[] args) {

// int[] prices = { 1,2};

// int cheap_p = prices[0];
// int profit_of_day = 0;
// int max_prof = 0;

// for (int i = 0; i <= prices.length - 1; i++) {
// if (prices[i] < cheap_p) {
// cheap_p = prices[i];

// }
// profit_of_day = prices[i] - cheap_p;

// if (max_prof < profit_of_day) {
// max_prof = profit_of_day;
// }

// }

// System.out.println(max_prof);

// }

// }
// Reverse Integer 7
// public class hello {
// public static void main(String[] args) {
// // our goal is find the max time from the array
// // by default lets assume, fisrt digist is the highest sum of all
// // and then we'll go on comparing if the current sum is greater than i+1, if
// so
// // well update
// // if not we'll continue looking for max sum;

// int[] nums = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
// int max_sum = nums[0];
// int current_sum = max_sum;

// for (int i = 1; i <= nums.length - 1; i++) {
// // checks which sum is grater either current one for next num[i], if so
// update
// // else move on
// current_sum = Math.max(current_sum + nums[i], nums[i]);
// max_sum = Math.max(max_sum, current_sum);

// }
// System.out.println(max_sum);
// }
// }
// 7. Reverse Integer

// public class hello {
// public static void main(String[] args) {
// int x = 123;
// int reversed = 0;
// int last_digit;

// while (x != 0) {

// // lets find the last digit of the integer, we can use modular 10 which gives
// // last digit
// last_digit = x % 10;
// // now store the last digit to revesred int
// if (reversed > Integer.MAX_VALUE/10 || reversed == Integer.MAX_VALUE/10 &&
// last_digit>7) return 0;
// if (reversed < Integer.MIN_VALUE/10 || reversed == Integer.MIN_VALUE/10 &&
// last_digit<-8) return 0;
// reversed = (reversed * 10) + last_digit;

// // now lets take off the last_digit we just used, could be done using devide
// // sign by 10

// x /= 10;

// }

// System.out.println(reversed);
// }
// }

// 349 Intersection of Two Arrays

// public class hello {
// public static void main(String[] args) {

// int[] nums1 = { 4, 9, 5 };
// int[] nums2 = { 9, 4, 9, 8, 4 };

// HashSet<Integer> saved = new HashSet<Integer>();

// Arrays.sort(nums1);
// Arrays.sort(nums2);

// for (int i = 0; i < nums1.length; i++) {
// for (int j = 0; j < nums2.length; j++) {
// if (nums1[i] == nums2[j]) {

// saved.add(nums1[i]);

// }
// }

// }

// List<Integer> res = new ArrayList<>();
// for (int k: saved){

// res.add(k);

// }
// int[] ans=new int[res.size()];
// for(int i=0;i<ans.length;i++){
// ans[i]=res.get(i);
// }

// }
// }

// 387. First Unique Character in a String
// public class hello {
// public static void main(String[] args) {

// String s = "leetcode";

// HashMap<Character, Integer> ch = new HashMap<>();

// for (char c : s.toCharArray()) {
// if (ch.containsKey(c)) {
// int contain_V = ch.get(c);
// ch.put(c, contain_V + 1);

// } else {
// ch.put(c, 1);
// }

// }
// for (int i = 0; i < s.length(); i++) {

// if (ch.containsKey(s.charAt(i)) && ch.get(s.charAt(i)) == 1) {
// return i;

// }
// }
// return -1;

// }
// }
// 1, swo sum

// public class hello {
// public static void main(String[] args) {

// int[] nums = { 2, 4, 11, 3 };
// int target = 6;

// int[] res = new int[2];
// for (int i = 0; i < nums.length; i++) {
// for (int j = i + 1; j < nums.length; j++) {

// if (nums[i] + nums[j] == target) {
// res[0] = i;
// res[1] = j;

// }

// }

// }

// for (int k : res) {
// System.out.println(k);

// }

// }
// }

// public class hello {
// public static void main(String[] args) {

// int n = 19;
// HashSet<Integer> numbers = new HashSet<Integer>();

// int result = 0;

// while (n != 0 && numbers.contains(n)) {

// numbers.add(n);

// while (n != 0) {

// // lets get last digit of n and square it

// result += Math.pow(n % 10, 2);

// n /= 10;
// }
// n = result;
// }

// System.out.println(result);
// }
// }

// //20 valid parenthesis

// public class hello {
// public static void main(String[] args) {

// String s = "(]";

// Stack<Character> stack = new Stack<>();

// for (char c : s.toCharArray()) {

// if (c == '(') {
// stack.push(')');

// } else if (c == '[') {
// stack.push(']');

// } else if (c == '{') {
// stack.push('}');

// } else if (stack.empty() || stack.pop() != c) {
// System.out.println("False");
// }

// }

// System.out.println(stack.isEmpty());
// }
// }

// 121 Best Time to Buy and Sell Stock

// public class hello {
// public static void main(String[] args) {

// /*
// * Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
// * Note that buying on day 2 and selling on day 1 is not allowed because you
// * must buy before you sell.
// */

// // goal is to buy the stock on cheap day and sell it on higher price, if
// there
// // isnt highser price return o
// // else retun the profut

// int[] prices = { 7, 1, 5, 3, 6, 4 };

// int cheapeast_stock = prices[0];

// int profit_of_Day = 0;
// int max_profit = 0;

// for (int i = 0; i <= prices.length-1; i++) {

// if (prices[i] < cheapeast_stock) {

// cheapeast_stock = prices[i];

// }

// profit_of_Day = prices[i]- cheapeast_stock;
// if (max_profit < profit_of_Day) {

// max_profit = profit_of_Day;

// }

// }

// System.out.println(max_profit);
// }
// }

// 1328 Break a Palindrome

// public class hello {
// public static void main(String[] args) {

// String palindrome = "abccba";
// if(palindrome.length() == 1)
// // return "";

// // goal is to break the palindrome, palindrme is like a pattern such as its
// same
// // both ways, from which ever side you read from
// // such as abccba, so we gotta break it'

// // one way to do is, lets convery the string into char, so that we can get
// // indivial letetr
// char[] ch = palindrome.toCharArray();

// // now lets loop through to cxheck fisrt half and replace if any non "a" to
// an b

// for (int i = 0; i < ch.length / 2; i++) {

// if (ch[i] != 'a'){
// ch[i] = 'b';
// break;

// // so if we found the none 'a' in fisrt half, we are good and done, breaking
// the loopp a nd edming it here
// // we achived our goal, but not, we assumes that the last char obouosly an
// "a" and now replcae it to an 'b'

// }else if (i == palindrome.length()/2-1; && ch[i] == 'a'){

// ch[ch.length-1] = 'b';

// }

// }
// // return new String(ch);

// System.out.println(ch);

// }
// }

// 9 Palindrome Number

// public class hello {
// public static void main(String[] args) {

// int x = 121;
// int reversedd = 0;

// // we have a decide weather a following number is a palindrome
// // one way to do is, tghe number above gotta be same whne reading from the
// both
// // side
// // but if theres anything negative, its not a plaindrome

// // lets create a varible to hold temp value of x, so we can compare at the
// end
// int temp_x = x;

// while (x > 0) {

// // lets save the numbers and add to a varibkle from the last to first
// // one way to do is to is, take a last digit out from the x and save to new
// // varibke and keep going till first

// // lets get last variable of given x
// // we can use modular
// int last_digitt = x % 10;

// // lets add it to the reversed varibke

// reversedd = (reversedd * 10) + last_digitt;

// // now that we added, lets take out that digist from the x, cuz we used it
// // alredy

// x /= 10;

// }

// if (temp_x == reversedd){

// // return true;
// System.out.println(true);

// }else{
// // return false;
// System.out.println("false");

// }

// }
// }

// 7. Reverse Integer

// public class hello {
// public static void main(String[] args) {

// /*
// * the big catch if all would be to do this:
// * " Assume the environment does not allow you to store 64-bit integers
// (signed or unsigned)."
// */

// // revesring intiger, its same method as the palindrom

// int x = 123;

// int reversed = 0;

// // lets reversed the following integer
// // in order to do that, lets use a loopp to go over all the integer

// while (x != 0) {

// // lets get the last digist from the x

// int last_digit = x % 10;
// // lets save it somehwre
// // we'll use the following formuka to store the numbes

// // for edges case
// // for edge cases

// // if (reversed > Integer.MAX_VALUE / 10 || reversed == Integer.MAX_VALUE /
// 10 && last_digit > 7)
// // return 0;
// // if (reversed < Integer.MIN_VALUE / 10 || reversed == Integer.MIN_VALUE /
// 10 && last_digit < -8)
// // return 0;

// reversed = (reversed * 10) + last_digit;

// // now lets take out last digist and redo the following again
// x /= 10;

// }

// System.out.println(reversed);

// }
// }

// 387. First Unique Character in a String

// public class hello {
// public static void main(String[] args) {

// HashMap<Character, Integer> chars = new HashMap<>();

// // So our goal is find, first non repeatinfg char
// // if there isnt one, retunr -1

// String s = "leetcode";

// // we'll use hashmap to that we can keep track of each char by adding value
// to
// // it

// // lets concert into char, so that we can loop over each charcater
// for (char c : s.toCharArray()) {

// // if the 'c' alredy exist, add an value to at
// // if it does nit eaist just add 1 to it

// if (chars.containsKey(c)) {

// // get the value of that key

// int value_of_key = chars.get(c);
// chars.put(c, value_of_key + 1);

// } else {
// chars.put(c, 1);
// }

// }

// for (int i = 0; i < s.length(); i++) {

// if (chars.containsKey(s.charAt(i)) && chars.get(s.charAt(i)) == 1) {
// // return i;
// System.out.println(i);
// break;

// } else {
// // return -1;

// System.out.println("-1");
// }
// }
// }
// }

// 349. Intersection of Two Arrays

// public class hello {
// public static void main(String[] args) {

// /*
// * xample 1:
// *
// * Input: nums1 = [1,2,2,1], nums2 = [2,2]
// * Output: [2]
// * Example 2:
// *
// * Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
// * Output: [9,4]
// * Explanation: [4,9] is also accepted
// */
// int[] nums1 = { 1, 2, 2, 1 };
// int[] nums2 = { 2, 2 };

// // goal is find number and return them that exist in both arrays
// // we can really use hashset which only keeps uniqe value therefore it doesnt
// // keep a duplicated
// // fisrt lets sort themmm

// Arrays.sort(nums1);
// Arrays.sort(nums2);

// HashSet<Integer> num1 = new HashSet<>();
// HashSet<Integer> num2 = new HashSet<>();

// for (int n : nums1) {
// num1.add(n);

// }

// for (int k : nums2) {
// if (num1.contains(k)) {
// num2.add(k);

// }

// }

// int[] res = new int[num2.size()];
// int i = 0;

// for (int n : num2) {
// res[i++] = n;

// }
// System.out.println("");

// }
// }

// 53. Maximum Subarray

// public class hello {
// public static void main(String[] args) {

// // goal is find the maximum sum
// // lets loop over the integer

// int[] nums = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };

// // lets assume that the fisrt index is the maximum sum till we find the
// latgest

// int max_sum = nums[0];

// // we created current so that we can comare if the current sum is bigger than
// // the max sum, if so, we can upadte it
// int current_sum = max_sum;

// for (int i = 0; i < nums.length; i++) {

// current_sum = Math.max(current_sum + nums[i],nums[i] );
// max_sum = Math.max(max_sum, current_sum);

// }

// System.out.println(max_sum);

// }
// }

//
// Blind 75 LeetCode Questions

// //two sum
// public class hello {
// public static void main(String[] args) {

// int[] nums = { 2, 7, 11, 15 };
// int target = 9;

// // lets create a two pointer, one from the begning and one from begining + 1
// and
// // add them to find the target

// int[] res = new int[2];

// for (int i = 0; i < nums.length; i++) {
// for (int j = i + 1; j <= nums.length - 1; j++)

// if (nums[i] + nums[j] == target) {

// res[0] = i;
// res[1] = j;
// break;

// }

// }
// for (int k : res) {
// System.out.println(k);
// }

// }
// }

// public class Daily_Code {
//     public static void main(String[] args) {

//         int[] prices = { 7, 1, 5, 3, 6, 4 };
//         int max_profit = 0;
//         int current_profit = 0;

//         int cheapeast_stock = prices[0];

//         for (int i = 0; i <= prices.length - 1; i++) {

//             if (prices[i] < cheapeast_stock) {
//                 cheapeast_stock = prices[i];

//             }
//             current_profit = prices[i] - cheapeast_stock;

//             if (current_profit > max_profit) {

//                 max_profit = current_profit;

//             }

//         }

//         System.out.println(max_profit);
//     }
// }

//217 contain duplicate

// public class Daily_Code {
//     public static void main(String[] args) {
//         int[] nums = { 1, 2, 3, 1 };

//         HashSet<Integer> digits = new HashSet<>();

//         for (int i = 0; i <= nums.length - 1; i++) {

//             if (digits.contains(nums[i])) {
//                 // return true;
//                 System.out.println("true");

//             } else {
//                 digits.add(nums[i]);
//             }

//         }

//     }
// }

//leeetcode 238

// public class Daily_Code {
//     public static void main(String[] args) {

//         int[] nums = { 1, 2, 3, 4 };

//         int[] res = new int[nums.length];

//         int left = 1;
//         int right = 1;

//         for (int i = 0; i < nums.length; i++) {

//             res[i] = left;
//             left *= nums[i];

//         }

//         for (int j = nums.length - 1; j > -1; j--) {
//             res[j] *= right;
//             right *= nums[j];

//         }

//         for (int i : res) {
//             System.out.println(i);

//         }

//     }
// }

//53. Maximum Subarray

// public class Daily_Code {
//     public static void main(String[] args) {
//         int[] nums = { 1};

//         int max_sum = nums[0];
//         int current_sum = max_sum;

//         for (int i = 1; i <=nums.length-1; i++) {

//             current_sum = Math.max(current_sum + nums[i], nums[i]);

//             if (current_sum > max_sum) {

//                 max_sum = current_sum;

//             }

//         }

//         System.out.println(max_sum);

//     }
// }

//152. Maximum Product Subarray

public class Daily_Code {
    public static void main(String[] args) {
        int[] nums = { 0,2 };

        int max_sum = nums[0];
        int right_sum = 1;
        int left_sum = 1;
        for (int i = 0, j = nums.length - 1; i < nums.length; i++, j--) {

            if (left_sum == 0) {
                left_sum = 1;

            }
            if (right_sum == 0) {
                right_sum = 1;
            }

            left_sum *= nums[i];
            right_sum *= nums[j];

            max_sum = Math.max(max_sum, Math.max(left_sum, right_sum));

        }

        System.out.println(max_sum);

    }

}