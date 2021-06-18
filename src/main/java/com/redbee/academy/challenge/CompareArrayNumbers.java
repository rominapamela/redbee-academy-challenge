package com.redbee.academy.challenge;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CompareArrayNumbers {

  /**
   * Method that receives two lists and returns
   * another list with de max of each index
   *
   * @param a - Some Integer Number
   * @param b - Another Integer Number
   * @return The result of a + b
   */
  public static List<Integer> max(List<Integer> a, List<Integer> b) {
    //TODO: Implement me
    List<Integer> maximos=new ArrayList<Integer>();
    Collections.sort(a);
    Integer max_a = a.get(a.size()-1);
    Collections.sort(b);
    Integer max_b = b.get(b.size()-1);
    maximos.add(max_a);
    maximos.add(max_b);
    return maximos;
  }



}
