package org.example;

import com.google.common.collect.Lists;
import java.util.List;

public class Main {

  public static void main(String[] args) {
    HelloOtus greeting = new HelloOtus();

    List<String> words = Lists.newArrayList("HELLO ", "Bank", "OTUS!", "Window", "Alexander");
    greeting.findWords(words, "O");
  }
}