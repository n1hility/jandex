package org.jboss.jandex.test;


import java.io.FileInputStream;
import java.io.IOException;

import org.jboss.jandex.ClassInfo;
import org.jboss.jandex.Index;
import org.jboss.jandex.Indexer;
import org.junit.Test;

public class TestClassBounds {

    @Test
    public void classBounds() throws IOException {
        Indexer indexer = new Indexer();
        ClassInfo info = indexer.index(new FileInputStream("ArrayTable$1.class"));
        System.out.println("info = " + info);
        Index index = indexer.complete();
        System.out.println("subclasses");
        index.printSubclasses();
        System.out.println("annotations");
        index.printAnnotations();
    }
}
