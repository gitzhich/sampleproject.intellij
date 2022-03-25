package main.java.sample;

public class HelloWorldSample {
    /**
     *
     * @param args
     */

    public static void main(String[] args) {
        System.out.println("Hello World!");
        int counter = 0;

        SamplePojo pojo = new SamplePojo();
        pojo.setField(100);
        System.out.println(pojo.getField());
    }
}
