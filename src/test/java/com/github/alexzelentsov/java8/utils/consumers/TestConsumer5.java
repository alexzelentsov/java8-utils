package com.github.alexzelentsov.java8.utils.consumers;

import org.junit.Test;

/**
 * Created by alexander.zelentsov on 25.07.2017.
 */
public class TestConsumer5 {
    @Test
    public void accept() throws Exception {
        Consumer5<Integer, Integer, Integer, Integer, Integer> consumer5 = (arg1, arg2, arg3, arg4, arg5) -> {};
        consumer5.accept(0, 1, 2, 3, 4);
    }

}