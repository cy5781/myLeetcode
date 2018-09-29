package org.leetcode;

import java.util.HashMap;

public class Roman2Int {


    public static void main(String[] args){
        System.out.println(roman2Int("IV"));
    }

    private static int roman2Int(String input){
        char[] splitRomans =new char[input.length()];
        for(int i = 0;i< input.length(); i++){
            splitRomans[i]=input.charAt(i);
        }
        HashMap<Character,Integer> romansMapping = new HashMap<>();
        romansMapping.put('I',1);
        romansMapping.put('V',5);
        romansMapping.put('X',10);
        romansMapping.put('L',50);
        romansMapping.put('C',100);
        romansMapping.put('D',500);
        romansMapping.put('M',1000);

        int value = 0;
        for(int k = input.length()-1; k > 0; k--){
            if(splitRomans[k]=='V'){
                if(k-1>=0&&splitRomans[k-1]=='I'){
                    value += romansMapping.get('V') - romansMapping.get('I');
                }
            }
            if(splitRomans[k]=='X'){
                if(k-1>=0&&splitRomans[k-1]=='I'){
                    value += romansMapping.get('X') - romansMapping.get('I');
                }
            }
        }

        int result = romansMapping.get('I');
        return value;
    }
}
