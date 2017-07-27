package com.github.alexzelentsov.java8.utils.consumers;

import org.junit.Test;

/**
 * Created by alexander.zelentsov on 25.07.2017.
 */
public class TestConsumer4 {
    @Test
    public void accept() throws Exception {
        Consumer4<Integer, Integer, Integer, Integer> consumer4 = (arg1, arg2, arg3, arg4) -> {};
        consumer4.accept(0, 1, 2, 3);
    }

}