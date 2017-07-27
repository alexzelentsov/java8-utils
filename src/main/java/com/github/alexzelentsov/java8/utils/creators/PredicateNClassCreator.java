package com.github.alexzelentsov.java8.utils.creators;

import java.io.IOException;
import java.net.URISyntaxException;

/**
 * Class for creation Function with N args.
 *
 * Created by alexander.zelentsov on 24.07.2017.
 */
public class PredicateNClassCreator {

    public static final String TEMPLATE_FILE_NAME = "predicate_template";
    public static final String TEST_TEMPLATE_FILE_NAME = "predicate_test_template";

    public static void createClassesForCPredicateN(int i) throws URISyntaxException, IOException {
        CommonClassCreator.createClass(i, TEMPLATE_FILE_NAME, "Predicate");
        CommonClassCreator.createTestClass(i,TEST_TEMPLATE_FILE_NAME, "TestPredicate");
    }

}
