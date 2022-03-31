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
        // System.out.println(pojo.getField());

        sampleCast();
        sampleInstanceOf();
    }

    private static void sampleCast() {
        Cat c = new Cat();
        Animal a = c; // アップキャスト
        Cat c1 = (Cat) a; // ダウンキャスト
    }

    private static void sampleInstanceOf() {
        Cat cat = new Cat();
        Dog dog = new Dog();
        Animal animal = cat;

        System.out.println(cat instanceof Cat); // true
        System.out.println(cat instanceof Animal); // true
        System.out.println(animal instanceof Cat); // true 実行時に Cat 型となるため
        System.out.println(animal instanceof Dog); // false
    }
}
