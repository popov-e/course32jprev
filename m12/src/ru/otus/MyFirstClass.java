package ru.otus;

import com.sun.scenario.effect.impl.sw.java.JSWBlend_SRC_OUTPeer;

import java.util.Objects;

public class MyFirstClass {
    int a;
    boolean t = true;

    @Override
    public String toString() {
        return "MyFirstClass{" +
                "a=" + a +
                ", t=" + t +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MyFirstClass)) return false;
        MyFirstClass that = (MyFirstClass) o;
        return a == that.a &&
                t == that.t;
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, t);
    }
}
