package io.github.talentdevelopment004.statickeyword;

public class LocalClassDemo {

    public void processData() {

        class DataProcessor {
            public String trim(String value) {
                System.out.println("Before trimming:" + value.length());
                return value.trim();
            }

        }
        DataProcessor dataProcessor = new DataProcessor();
        String result = dataProcessor.trim("  Hello world!!  ");
        System.out.println("After trimming:" + result.length() + result);
    }

}
