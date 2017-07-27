package com.github.alexzelentsov.java8.utils.creators;

import java.io.IOException;
import java.net.URISyntaxException;

/**
 * Created by alexander.zelentsov on 25.07.2017.
 */
public class Runner {
    public static void main(String[] args) throws URISyntaxException, IOException {
        for (int i = 3; i < 11; i++) {
            PredicateNClassCreator.createClassesForCPredicateN(i);
        }
    }
}
