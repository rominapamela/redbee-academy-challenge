package com.redbee.academy.challenge;

public class CompareNumbers {

  /**
   * Method that receives two numbers and returns the
   * max of both
   *
   * @param a - Some Integer Number
   * @param b - Another Integer Number
   * @param c - Another Integer Number
   * @return The max of a, b and c
   */
  public static Integer max(Integer a, Integer b, Integer c) {
    //TODO: Implement me
    Integer max=0;
    if(a>=b)
    {
      if(a>=c)
      {
        max=a;
      }
      else
      {
        max=c;
      }
    }
    else
    {
      if(b>=c)
      {
        max=b;
      }
      else
      {
        max=c;
      }
    }
    return max;
    //return null;
  }
}
