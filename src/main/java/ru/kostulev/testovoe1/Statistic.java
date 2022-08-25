package ru.kostulev.testovoe1;

import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Statistic {
    private ArrayList<String> chStat = new ArrayList<>();
    private ArrayList<Integer> countStat = new ArrayList<>();
    private double average;
    private ArrayList<String> approximate = new ArrayList<String>();

    public ArrayList<String> getChStat() {
        return chStat;
    }

    public ArrayList<Integer> getCountstat() {
        return countStat;
    }

    public double getAverage() {
        return average;
    }

    public ArrayList<String> getApproximate() {
        return approximate;
    }

    public void setStat(String str){
        Set<Character> set = new HashSet<>();
        StringBuilder sb = new StringBuilder();
        for (char c : str.toCharArray())
        {
            if (!set.contains(c))
            {
                int count = StringUtils.countMatches(str, c);
                String raz;
                switch (count){
                    case (2):
                        raz = " раза";
                        break;
                    case (3):
                        raz = " раза";
                        break;
                    case (4):
                        raz = " раза";
                        break;
                    default:
                        raz = " раз";
                        break;
                }
                System.out.println(c + " - " + count  + raz);
                chStat.add(String.valueOf(c));
                countStat.add(count);
                set.add(c);
                sb.append(c);
            }
        }
        String result = sb.toString();
    }

    public void setAverage(){
        int sum = 0;
        for (int elements: countStat) sum += elements;
        average = (double) sum/ (double) countStat.size();
        System.out.println("Среднее значение частоты " + sum + "/" + countStat.size() + "=" +
                average);
    }

    public void setApproximate(){
        int round = (int) Math.round(average);
        for (int i = 0; i < countStat.size(); i++){
            if (countStat.get(i)==round) approximate.add(chStat.get(i));
        }
        System.out.print("Символы, которые соответствуют условию наиболее близкого значения частоты к среднему значению: ");
        System.out.print(approximate);
    }
}
