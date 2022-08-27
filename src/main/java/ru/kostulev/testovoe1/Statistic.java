package ru.kostulev.testovoe1;

import java.util.*;

public class Statistic {
    private Map<String, Integer> stats = new HashMap<>();
    private double average;
    private ArrayList<String> approximate = new ArrayList<String>();

    public double getAverage() {
        return average;
    }

    public ArrayList<String> getApproximate() {
        return approximate;
    }

    public void setStats(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (!stats.containsKey(String.valueOf(str.charAt(i)))) {
                stats.put(String.valueOf(str.charAt(i)), 1);
            } else {
                stats.replace(String.valueOf(str.charAt(i)), (stats.get(String.valueOf(str.charAt(i))) + 1));
            }
        }
        for (Map.Entry<String, Integer> item : stats.entrySet()) {
            String raz;
            switch (item.getValue()) {
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
            System.out.printf("%s - %d %s \n", item.getKey(), item.getValue(),raz);
        }
    }

    public Map<String, Integer> getStats() {
        return stats;
    }

    public void setAverage(){
        int sum = 0;
        for (Map.Entry<String, Integer> item : stats.entrySet()) sum += item.getValue();
        average = (double) sum/ (double) stats.size();
        System.out.println("Среднее значение частоты " + sum + "/" + stats.size() + "=" +
                average);
    }

    public void setApproximate(){
        int round = (int) Math.round(average);
        for(Map.Entry<String,Integer> item: stats.entrySet())
            if (item.getValue()==round) approximate.add(item.getKey());
        System.out.print("Символы, которые соответствуют условию наиболее близкого значения частоты к среднему значению: ");
        System.out.print(approximate);
    }
}
