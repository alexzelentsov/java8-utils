package com.github.alexzelentsov.java8.utils.consumers;

import org.junit.Test;

/**
 * Created by alexander.zelentsov on 25.07.2017.
 */
public class TestConsumer3 {
    @Test
    public void accept() throws Exception {
        Consumer3<Integer, Integer, Integer> consumer3 = (arg1, arg2, arg3) -> {};
        consumer3.accept(0, 1, 2);
    }

}