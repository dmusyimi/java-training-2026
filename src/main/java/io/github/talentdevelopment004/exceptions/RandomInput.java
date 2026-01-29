package io.github.talentdevelopment004.exceptions;

public class RandomInput implements AutoCloseable {
    @Override
    public void close() throws Exception {
        System.out.println("Closing RandomInput");
    }
}
