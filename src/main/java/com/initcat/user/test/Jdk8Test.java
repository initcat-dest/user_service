package com.initcat.user.test;

import com.initcat.user.model.db.CommUser;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * java8Test
 *
 * @author libo
 * @package com.initcat.user.ServiceTest
 * @company initcat
 * @date 2018/12/25
 */
public class Jdk8Test {

//    public static void main(String[] args) {
//        Runnable r = () -> System.out.println("do something.");
//        Runnable r1 = () -> System.out.println("do something1.");
//        Runnable r2 = () -> System.out.println("do something2.");
//        new Thread(r).start();
//        new Thread(r1).start();
//        new Thread(r2).start();
//
//        boolean isAdult = doPredicate(20, x -> x >= 21);
//        System.out.println(isAdult);
//
//        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
//        //输出大于5的数字
//        List<Integer> result = conditionFilter(list, integer -> integer > 5);
//        result.forEach(System.out::println);
//        System.out.println("-------");
//        //输出大于等于5的数字
//        result = conditionFilter(list, integer -> integer >= 5);
//        result.forEach(System.out::println);
//        System.out.println("-------");
//        //输出小于8的数字
//        result = conditionFilter(list, integer -> integer < 8);
//        result.forEach(System.out::println);
//        System.out.println("-------");
//        //输出所有数字
//        result = conditionFilter(list, integer -> true);
//        result.forEach(System.out::println);
//        System.out.println("-------");
//    }

    private static boolean doPredicate(int age, Predicate<Integer> predicate) {
        return predicate.test(age);
    }

    //高度抽象的方法定义，复用性高
    private static List<Integer> conditionFilter(List<Integer> list, Predicate<Integer> predicate) {
        return list.stream().filter(predicate).collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<CommUser> list = getCommUserList();
        HashMap<Long, String> test = list.stream().collect(Collectors.toMap(CommUser::getId, CommUser::getPhone, (a, b) -> b, HashMap::new));
        test.keySet().forEach(System.out::println);
    }

    public static List<CommUser> getCommUserList() {
        List<CommUser> list = new ArrayList<>();
        CommUser commUser = null;
        for (int i = 1; i < 10; i++) {
            commUser = new CommUser();
            commUser.setId((long) i);
            commUser.setPhone(String.valueOf(i));
            list.add(commUser);
        }
        return list;
    }
}
