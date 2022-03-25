package main.java.sample;

/**
 * sample POJO class
 * @author zhich
 * @version 1.0
 */
class SamplePojo implements java.io.Serializable {
    int field;

    public int getField() {
        return field;
    }

    public void setField(int field) {
        this.field = field;
    }

    public SamplePojo() {

    }
}