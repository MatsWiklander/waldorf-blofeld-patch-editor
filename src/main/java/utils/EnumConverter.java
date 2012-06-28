package main.java.utils;

public interface EnumConverter<E extends Enum<E> & EnumConverter<E>> {
        int convert();

        E convert(int value);
}
