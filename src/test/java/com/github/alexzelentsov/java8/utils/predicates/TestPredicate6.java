package com.github.alexzelentsov.java8.utils.predicates;

 import org.junit.Test;

 import static org.hamcrest.core.Is.is;
 import static org.junit.Assert.assertThat;

 /**
  * Created by alexander.zelentsov on 24.07.2017.
  */
 public class TestPredicate6 {

     @Test
     public void test() {
         Predicate6<Integer, Integer, Integer, Integer, Integer, Integer> predicate6 = (arg1, arg2, arg3, arg4, arg5, arg6) -> true;
         boolean result = predicate6.test(0, 1, 2, 3, 4, 5);
         assertThat(result, is(true));
     }

 }