package main.java.se.matswiklander.waldorfblofeldpatcheditor.utils;

public interface EnumConverter<E extends Enum<E> & EnumConverter<E>> {
        int convert();

        E convert(int value);
}
