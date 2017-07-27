package com.github.alexzelentsov.java8.utils.predicates;

 import org.junit.Test;

 import static org.hamcrest.core.Is.is;
 import static org.junit.Assert.assertThat;

 /**
  * Created by alexander.zelentsov on 24.07.2017.
  */
 public class TestPredicate5 {

     @Test
     public void test() {
         Predicate5<Integer, Integer, Integer, Integer, Integer> predicate5 = (arg1, arg2, arg3, arg4, arg5) -> true;
         boolean result = predicate5.test(0, 1, 2, 3, 4);
         assertThat(result, is(true));
     }

 }