package com.learning.functionalprograming.codingbat;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CodingBat {

	public static void main(String[] args) {
		String name = "Preethi";
		CodingBat bat = new CodingBat();
		System.out.println(Arrays.stream(new int[] { 6, 7, 3 }).max().getAsInt());
		Arrays.stream(new int[] { 6, 7, 3 }).max().getAsInt();
//		System.out.println(bat.linearIn(new int[] { 1, 2, 4, 4, 6 }, new int[] { 2, 4 }));
		System.out.println(bat.wordAppend(new String[] { "a", "b", "a" }));
	}

	public String wordAppend(String[] strings) {
		String result = "";
		Map<String, Integer> map = new HashMap<String, Integer>();

		for (String currentString : strings) {
			int i = 0;
			if (map.containsKey(currentString)) {
				i = map.get(currentString) + 1;
				map.put(currentString, i);
				if (i % 2 == 0) {
					result = result + currentString;
				}
			} else {
				map.put(currentString, i + 1);
			}

		}

		return result;
	}

	public Map<String, String> firstChar(String[] strings) {
		Map<String, String> map = new HashMap<>();
		for (String string : strings) {
			String substring = string.substring(0, 1);
			if (map.containsKey(substring)) {
				String value = map.get(substring) + string;
				map.put(substring, value);
			} else {
				map.put(substring, string);
			}
		}
		return map;
	}

	public Map<String, Integer> wordLen(String[] strings) {
		Map<String, Integer> map = new HashMap<>();
		for (String str : strings) {
			if (map.containsKey(str)) {
				map.put(str, str.length());
			}

		}
		return map;
	}

	public Map<String, String> mapBully(Map<String, String> map) {
		if (map.containsKey("b")) {
			if (map.containsKey("a")) {
				map.put("b", map.get("a"));
				map.put("a", "");
			}
		}
		return map;
	}

	public int[] seriesUp(int n) {
		int nums[] = new int[n * (n * 1) / 2];
		int count = 0;
		for (int i = 1; i <= n; ++i) {
			for (int j = 1; j <= i; ++j) {
				nums[count++] = j;
			}
		}

		return nums;
	}

	public int[] squareUp(int n) {
		int nums[] = new int[n * n];
		int a = n;
		for (int i = 0; i < n; i++) {
			int pos = n * n - i - 1;
			for (int j = 0; j < a; j++) {
				nums[pos - n * j] = i + 1;
			}
			a--;
		}
		return nums;
	}

	public boolean linearIn(int[] outer, int[] inner) {
		int found = 0;

		for (int i = 0; i < inner.length; i++) {
			boolean foundj = false;
			for (int j = 0; j < outer.length; j++) {
				if (!foundj && inner[i] == outer[j]) {
					found++;
					foundj = true;
				}
			}
		}
		if (found == inner.length)
			return true;

		return false;
	}

	public boolean canBalance(int[] nums) {
		int sumI = 0;
		// int sumJ=0;

		for (int i = 0; i < nums.length; i++) {
			sumI = sumI + nums[i];
			int sumJ = 0;
			for (int j = i + 1; j < nums.length; j++) {
				sumJ = sumJ + nums[j];
			}
			if (sumI == sumJ)
				return true;
		}
		return false;
	}

	public int[] fix34(int[] nums) {
		int t = 0;
		for (int i = 0; i < nums.length; i++)
			for (int j = 0; j < nums.length; j++)

				if (nums[i] == 4 && nums[j] == 3) {
					t = nums[j + 1];
					nums[j + 1] = nums[i];
					nums[i] = t;
				}
		return nums;
	}

	public String[] fizzBuzz(int start, int end) {
		String[] str = new String[end - start];
		String temp = "";
		int count = 0;
		for (int i = start; i < end; i++) {
			if (i % 5 == 0 && i % 3 == 0) {
				temp = "FizzBuzz";
			} else if (i % 5 == 0) {
				temp = "Buzz";
			} else if (i % 3 == 0) {
				temp = "Fizz";
			} else {
				temp = String.valueOf(i);
			}
			str[count++] = temp;
		}
		return str;
	}

	public int[] evenOdd(int[] nums) {
		int start = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] % 2 == 0) {
				int temp = nums[i];
				nums[i] = nums[start];
				nums[start] = temp;
				start++;
			}
		}
		return nums;
	}

	public int[] zeroMax(int[] nums) {
		int max = 0;

		for (int i = nums.length - 1; i >= 0; i--) {
			if (nums[i] != 0 && nums[i] % 2 == 1 && max < nums[i]) {
				max = nums[i];
			}
			if (nums[i] == 0) {
				nums[i] = max;
			}
		}
		return nums;
	}

	public int[] withoutTen(int[] nums) {
		int[] intArray = new int[nums.length];
		int count = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != 10) {
				intArray[count] = nums[i];
				count++;
			}
		}
		return nums;
	}

	public int[] zeroFront(int[] nums) {
		int count = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 0) {
				nums[i] = nums[count];
				nums[count] = 0;
				count++;
			}
		}
		return nums;

	}

	public int[] fizzArray3(int start, int end) {
		int len = end - start;
		int[] intArray = new int[len];
		for (int i = 0; i < len; i++) {
			intArray[i] = start;
			start++;
		}
		return intArray;
	}

	public int[] post4(int[] nums) {
		int lastIndexOf4 = 0;

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 4)
				lastIndexOf4 = i;
		}
		int len = nums.length - lastIndexOf4;
		int[] intArray = new int[len - 1];

		for (int i = 0; i < len - 1; i++) {
			int j = lastIndexOf4 + 1;
			intArray[i] = nums[j];

		}
		return intArray;
	}

	static boolean twoTwo(int[] nums) {
		int len = nums.length;
		boolean result = true;
		boolean found = false;

		for (int i = 0; i < len; i++) {
			if (nums[i] != 2)
				found = false;

			if (nums[i] == 2 && found)
				result = true;

			if (nums[i] == 2 && !found) {
				found = true;
				result = false;
			}

		}
		return result;
	}

	public boolean haveThree(int[] nums) {
		int len = nums.length;
		boolean found3 = true;
		int count = 0;

		for (int i = 0; i <= len - 1; i++) {
			if (nums[i] == 3 && found3) {
				if (i < len - 1 && nums[i + 1] == 3 && found3) {
					count = 0;
					found3 = false;
				}
				found3 = true;
				count++;
			}

		}
		return count == 3;

	}

	public boolean modThree(int[] nums) {
		for (int i = 0; i < nums.length - 3; i++) {
			int reminder = nums[i] % 2;
			int reminder1 = nums[i + 1] % 2;
			int reminder3 = nums[i + 2] % 2;
			if (reminder == 0 && reminder1 == 0 && reminder3 == 0 || reminder != 0 && reminder1 != 0 && reminder3 != 0)
				return true;
		}
		return false;
	}

	public boolean has77(int[] nums) {
		boolean found7 = true;
		boolean found77 = false;
		for (int i = 0; i <= nums.length - 2; i++) {
			if (nums[i] == 7 && found7) {
				found7 = false;
			} else
				found7 = true;
			if (!found7 && (nums[i + 1] == 7 || nums[i + 2] == 7)) {
				found7 = true;
				found77 = true;
			}
		}
		return found77;
	}

	public boolean lucky13(int[] nums) {
		boolean found3 = false;
		boolean found1 = false;
		for (int i : nums) {
			if (i == 3 && !found3)
				found3 = true;
			if (i == 1 && !found1)
				found1 = true;
		}
		return found3 == true || found1 == true ? false : true;
	}

	public boolean either24(int[] nums) {
		boolean found4 = false;
		boolean found2 = false;
		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] == 2 && nums[i + 1] == 2 && !found2)
				found2 = true;
			if (nums[i] == 4 && nums[i + 1] == 4 && !found4)
				found2 = true;
		}
		return found4 == true && found2 == true ? false : true;
	}

	public boolean isEverywhere(int[] nums, int val) {
		int len = nums.length;
		boolean isEverywhere = false;
		if (len < 2)
			return true;

		for (int i = 0; i < len - 1; i++) {
			if (nums[i] == val || nums[i + 1] == val)
				isEverywhere = true;
			else {
				isEverywhere = false;
				break;
			}
		}
		return isEverywhere;
	}

	public int sum67(int[] nums) {
		int sum = 0;
		boolean found6 = false;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != 6 && found6 == false) {
				sum = sum + nums[i];
			}
			if (nums[i] == 6) {
				found6 = true;
			} else if (nums[i] == 7) {
				found6 = false;
			}
		}
		return sum;
	}

	public int centeredAverage(int[] nums) {
		int min = Integer.MAX_VALUE;
		int max = 0;
		int sum = 0;
		int count = 0;
		for (int i : nums) {
			min = Math.min(min, i);
			max = Math.max(max, i);
		}
		for (int i : nums) {
			if (i != min && i != max) {
				count++;
				sum = sum + i;
			}
		}
		return sum / count;
	}

	public int bigDiff(int[] nums) {
		int min = Integer.MAX_VALUE, max = 0;
		for (int i : nums) {
			min = Math.min(min, i);
			max = Math.max(max, i);
		}
		return max - min;
	}

	public String notReplace(String str) {
		String finalString = "";
		int len = str.length() - 1;
		for (int i = 0; i < len; i++) {
			if (i == 0 && str.substring(i, i + 2).equals("is") && !Character.isLetter(i + 3)) {
				finalString = finalString + "is not";
				i = i + 1;
			}
			if (i > 0 && str.substring(i, i + 2).equals("is")
					&& (!Character.isLetter(i + 3) && !Character.isLetter(i - 1))) {
				finalString = finalString + "is not";
				i = i + 1;
			} else {
				finalString = finalString + str.substring(i, i + 1);
			}

		}
		return finalString;
	}

	public int sumNumbers(String str) {
		int len = str.length();
		String numString = "";
		int sum = 0;
		int tempSum = 0;
		for (int i = 0; i < len; i++) {
			if (Character.isDigit(str.charAt(i))) {
				numString = numString + str.charAt(i);
			} else {
				if (!numString.equals("")) {
					sum = sum + Integer.parseInt(numString);
					numString = "";
				}
			}
			if (i == len - 1 && !numString.equals("")) {
				sum = sum + Integer.parseInt(numString);
				numString = "";
			}
		}

		return sum;
	}

}
