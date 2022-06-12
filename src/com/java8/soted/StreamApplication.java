package com.java8.soted;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApplication {

       public static void main(String[] args) {
    	   List<User> users = new ArrayList();
    	      User u1 = new User("C", 30);
    	      User u2 = new User("D", 40);
    	      User u3 =  new User("A", 10);
    	      User u4 =  new User("B", 20);
    	      User u5 =  new User("E", 50);
    	      users.add(u1);users.add(u2);users.add(u3);users.add(u4);users.add(u5);
        
       List<User> sortedList = users.stream()
			.sorted((us1,us2)->-us1.getAge().compareTo(us2.getAge()))
			.collect(Collectors.toList());
 
        sortedList.forEach(System.out::println);

    }

}
class User {

    private String name;
    private Integer age;

    public User(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}