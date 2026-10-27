package dsa.strings;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Interview {
    // 10 million ids

    // 10 million users

    static class Users{
        public int id;
        public String name;
        public int score;

        public Users(int id, String name, int score){
            this.id = id;
            this.name = name;
            this.score = score;
        }

        public int getScore() {
            return score;
        }

        public String toString(){
            return id + " " + name + " " + score;
        }
    }

    public static void main(String[] args) {

        List<Users> u = Arrays.asList(
                new Users(1, "Alice", 90),
                new Users(2, "Bob", 80),
                new Users(3, "Charlie", 70),
                new Users(4, "David", 60),
                new Users(5, "Eve", 50),
                new Users(6, "Frank", 40),
                new Users(7, "Grace", 30),
                new Users(8, "Heidi", 20),
                new Users(9, "Ivan", 10),
                new Users(10, "Judy", 0),
                new Users(11, "Alice", 90),
                new Users(12, "Bob", 80),
                new Users(13, "Charlie", 70),
                new Users(14, "David", 60),
                new Users(15, "Eve", 50),
                new Users(16, "Frank", 40),
                new Users(17, "Grace", 30),
                new Users(18, "Heidi", 20),
                new Users(19, "Ivan", 10),
                new Users(20, "Judy", 0)
        );

//        List<Users> result = u.stream()
//                .collect(Collectors.groupingBy(Users::getScore),Collectors.maxBy(Comparator.comparingInt(Users::getScore)))
//                .entrySet()
//                .stream()
//                .distinct()
//                .limit(10).collect(Collectors.toList());
//
//        System.out.println(result.toString());
    }




}
