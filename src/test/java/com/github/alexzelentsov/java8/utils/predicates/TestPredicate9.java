package com.github.alexzelentsov.java8.utils.predicates;

 import org.junit.Test;

 import static org.hamcrest.core.Is.is;
 import static org.junit.Assert.assertThat;

 /**
  * Created by alexander.zelentsov on 24.07.2017.
  */
 public class TestPredicate9 {

     @Test
     public void test() {
         Predicate9<Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer> predicate9 = (arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9) -> true;
         boolean result = predicate9.test(0, 1, 2, 3, 4, 5, 6, 7, 8);
         assertThat(result, is(true));
     }

 }