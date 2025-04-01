package com.bootBasic.quizapplication;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class javaDemo {
    public static void main(String[] args) {
        System.out.println("hut");
    List<List<String>> skills= Arrays.asList(
            Arrays.asList("Java","Python","SQL"),
            Arrays.asList("Java Script","HTML","CSS"),
            Arrays.asList("JWT","Ruby","MySQL")
    );
    List<String> finalSkills= skills.stream()
            .flatMap(allskills -> allskills.stream())
            .collect(Collectors.toList());
        System.out.println(finalSkills);
        List<String> sCharc=finalSkills.stream()
                .filter(skill -> skill.startsWith("s"))
                .collect(Collectors.toList());
        System.out.println(sCharc);

        ThreadDemo demo=new ThreadDemo();
        Thread demo1= new Thread(demo);
        demo1.start();
    }

}
