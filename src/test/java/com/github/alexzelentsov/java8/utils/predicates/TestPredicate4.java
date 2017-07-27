package com.github.alexzelentsov.java8.utils.predicates;

 import org.junit.Test;

 import static org.hamcrest.core.Is.is;
 import static org.junit.Assert.assertThat;

 /**
  * Created by alexander.zelentsov on 24.07.2017.
  */
 public class TestPredicate4 {

     @Test
     public void test() {
         Predicate4<Integer, Integer, Integer, Integer> predicate4 = (arg1, arg2, arg3, arg4) -> true;
         boolean result = predicate4.test(0, 1, 2, 3);
         assertThat(result, is(true));
     }

 }