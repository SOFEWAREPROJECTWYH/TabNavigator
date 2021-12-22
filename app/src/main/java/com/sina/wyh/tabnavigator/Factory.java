package com.sina.wyh.tabnavigator;

/**
 * 工厂类。
 * 百度：设计模式-工厂模仿
 *
 * @param <T>
 * @param <R>
 */
public interface Factory<T, R> {
    R create(T t);
}
