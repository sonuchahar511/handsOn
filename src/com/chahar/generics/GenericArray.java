package com.chahar.generics;

public class GenericArray<T> {
    // this one is fine
    public T[] notYetInstantiatedArray;
  
    // causes compiler error; Cannot create a generic array of T
    
}