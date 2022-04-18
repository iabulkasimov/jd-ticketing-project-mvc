package com.cybertek.implementation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class AbstractMapServices<T,ID> {

    protected Map<ID,T> map = new HashMap<>();

    T save(ID id, T object){
        map.put(id,object);
        return object;
    }

    List<T> findAll(){
        return new ArrayList<>(map.values());
    }

    T findByID(ID id){
        return map.get(id);
    }

    void deleteByID(ID id){
        map.remove(id);
    }

    void delete(T object){
        map.entrySet().removeIf(entry -> entry.equals(object));
    }

    void update(ID id, T object){
//        map.entrySet().removeIf(entry -> entry.equals(object));
        map.put(id,object);
    }


}
