package me.vukas.common.entity.generation.map;

import me.vukas.common.entity.EntityGeneration;
import me.vukas.common.entity.element.Element;
import me.vukas.common.entity.key.Key;

import java.util.Map;

public class MapEntityGeneration extends EntityGeneration<Map> {
    @Override
    public <N> Element<N, Map> diff(Map original, Map revised, N elementName, Class fieldType, Class containerType, Key<N, Map> key) {
        return null;
    }

    @Override
    public <N> Key<N, Map> generateKey(N elementName, Class elementType, Class containerType, Map value) {
        return null;
    }

    @Override
    public boolean compare(Map entity1, Map entity2, Class fieldType) {
        return false;
    }
}
