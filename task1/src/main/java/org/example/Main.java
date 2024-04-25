package org.example;
import java.util.HashMap;
import java.util.Map;
import java.util.HashSet;
import java.util.List;
import java.util.Stack;

public class Main {
    public static int[] findTwoSum(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (numMap.containsKey(complement)) {
                return new int[] { numMap.get(complement), i };
            }
            numMap.put(nums[i], i);
        }
        return new int[] {-1, -1}; // Возвращаем пустой результат, если не нашли
    }

    public static boolean containsDuplicates(List<Integer> list) {
        HashSet<Integer> set = new HashSet<Integer>();
        for (int number : list) {
            if (!set.add(number)) { // если число уже существует в HashSet, add вернет false
                return true; // дубликат найден
            }
        }
        return false; // дубликаты отсутствуют
    }
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        for (char c : s.toCharArray()) {
            switch (c) {
                case '(':
                case '{':
                case '[':
                    stack.push(c);
                    break;
                case ')':
                    if (stack.isEmpty() || stack.pop() != '(') return false;
                    break;
                case '}':
                    if (stack.isEmpty() || stack.pop() != '{') return false;
                    break;
                case ']':
                    if (stack.isEmpty() || stack.pop() != '[') return false;
                    break;
            }
        }
        return stack.isEmpty(); // если стек пуст, все скобки сбалансированы
    }


    public static void main(String[] args) {
    }
}