package com.github.alexzelentsov.java8.utils.predicates;

 import org.junit.Test;

 import static org.hamcrest.core.Is.is;
 import static org.junit.Assert.assertThat;

 /**
  * Created by alexander.zelentsov on 24.07.2017.
  */
 public class TestPredicate8 {

     @Test
     public void test() {
         Predicate8<Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer> predicate8 = (arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8) -> true;
         boolean result = predicate8.test(0, 1, 2, 3, 4, 5, 6, 7);
         assertThat(result, is(true));
     }

 }