package org.example;

import com.google.common.base.Predicates;
import com.google.common.collect.Collections2;
import java.util.List;

public class HelloOtus {

  public void findWords(List<String> words, String chars) {

    Collections2.filter(words, Predicates.containsPattern(chars)).forEach(System.out::print);
  }
}
