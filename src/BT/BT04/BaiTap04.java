package BT.BT04;

import java.util.ArrayList;
import java.util.List;

public class BaiTap04 {
    public static void main(String[] args) {
        bubbleSort();
        selectionSort();
        insertionSort();
    }

    public static List<FootballTeam> getArr() {
        List<FootballTeam> footballTeams = new ArrayList<>();

        for (int i = 0; i < 5; i++)
            footballTeams.add(i, new FootballTeam(i + 1, i + 1, (int) Math.round((Math.random() * 10) + 1), "Player " + (i + 1)));

        return  footballTeams;
    }

    public static void bubbleSort() {
        List<FootballTeam> footballTeams = getArr();

        for (int i = footballTeams.size() - 1; i > 1; i--) {
            for (int j = 0; j < i; j++) {
                if(footballTeams.get(j).getScore() > footballTeams.get(j + 1).getScore()) {
                    FootballTeam temp = footballTeams.get(j);
                    footballTeams.set(j, footballTeams.get(j + 1));
                    footballTeams.set(j + 1, temp);
                }
            }
        }

        System.out.println("Sắp xếp nổi bọt:");
        System.out.println(footballTeams);
    }

    public static void selectionSort() {
        List<FootballTeam> footballTeams = getArr();

        for (int i = 0; i < footballTeams.size() - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < footballTeams.size(); j++) {
                if(footballTeams.get(minIndex).getScore() > footballTeams.get(j).getScore()) {
                    minIndex = j;
                }
            }

            FootballTeam temp = footballTeams.get(minIndex);
            footballTeams.set(minIndex, footballTeams.get(i));
            footballTeams.set(i, temp);
        }

        System.out.println();
        System.out.println("Sắp xếp chọn:");
        System.out.println(footballTeams);
    }

    public static void insertionSort() {
        List<FootballTeam> footballTeams = getArr();

        for (int i = 1; i < footballTeams.size(); i++) {
            FootballTeam temp = footballTeams.get(i);
            int j = i - 1;

            while(j >= 0 && footballTeams.get(j).getScore() > temp.getScore()) {
                footballTeams.set(j + 1, footballTeams.get(j));
                j = j - 1;
            }

            footballTeams.set(j + 1, temp);
        }

        System.out.println();
        System.out.println("Sắp xếp chèn:");
        System.out.println(footballTeams);
    }
}
