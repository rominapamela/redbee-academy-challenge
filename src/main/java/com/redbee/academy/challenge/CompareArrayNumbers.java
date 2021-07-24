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
    int i=0;
    while (i<a.size() && i<b.size())
    {
      if (a.get(i)>=b.get(i))
      {
        maximos.add(a.get(i));
      }
      else
      {
        maximos.add(b.get(i));
      }
      i++;
    }
    if (i>=b.size())
    {
      for(int j=i;j<a.size();j++)
      {
        maximos.add(a.get(i));
      }
    }
    else
    {
      for(int j=i;j<b.size();j++)
      {
        maximos.add(b.get(i));
      }
    }
    return maximos;
  }
}
