package main.java.utils;

import java.util.HashMap;
import java.util.Map;

public class ReverseEnumMap<V extends Enum<V> & EnumConverter<?>> {
        private final Map<Integer, V> map = new HashMap<Integer, V>();

        public ReverseEnumMap(final Class<V> valueType) {
                for (V v : valueType.getEnumConstants()) {
                        map.put(v.convert(), v);
                }
        }

        public final V get(final int num) {
                return map.get(num);
        }
}
