package PASD.ADT.MyStack;

import java.math.BigInteger;

public class StackNode {
    private int value;
    private BigInteger valueBI;
    private StackNode next;

    public StackNode() {
        this.value = 0;
        this.valueBI = BigInteger.ZERO;
        this.next = null;
    }

    public StackNode(int value) {
        this.value = value;
        this.valueBI = BigInteger.valueOf(value);
        this.next = null;
    }

    public StackNode(BigInteger valueBI) {
        this.value = valueBI.compareTo(BigInteger.valueOf(Integer.MAX_VALUE)) > 0 ? 0 : valueBI.intValue();
        this.valueBI = valueBI;
        this.next = null;
    }

    public int getValue() {
        return this.value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public BigInteger getValueBI() {
        return this.valueBI;
    }

    public void setValueBI(int valueBI) {
        this.valueBI = BigInteger.valueOf(valueBI);
        this.value = this.valueBI.compareTo(BigInteger.valueOf(Integer.MAX_VALUE)) > 0 ? 0 : this.valueBI.intValue();
    }

    public void setValueBI(String valueBI) {
        this.valueBI = new BigInteger(valueBI);
        this.value = this.valueBI.compareTo(BigInteger.valueOf(Integer.MAX_VALUE)) > 0 ? 0 : this.valueBI.intValue();
    }

    public StackNode getNext() {
        return this.next;
    }

    public void setNext(StackNode next) {
        this.next = next;
    }

    public void setNext(int value) {
        this.next = new StackNode(value);
    }

    @Override
    public String toString() {
        return "[value=" + value + "]"+"[valueBI=" + valueBI + "]";
    }
}
