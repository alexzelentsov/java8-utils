package com.github.alexzelentsov.java8.utils.predicates;

 import org.junit.Test;

 import static org.hamcrest.core.Is.is;
 import static org.junit.Assert.assertThat;

 /**
  * Created by alexander.zelentsov on 24.07.2017.
  */
 public class TestPredicate3 {

     @Test
     public void test() {
         Predicate3<Integer, Integer, Integer> predicate3 = (arg1, arg2, arg3) -> true;
         boolean result = predicate3.test(0, 1, 2);
         assertThat(result, is(true));
     }

 }