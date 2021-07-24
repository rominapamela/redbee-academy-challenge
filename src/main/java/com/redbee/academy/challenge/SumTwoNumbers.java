package com.redbee.academy.challenge;

public class SumTwoNumbers
{
  /**
   * Method that receives two numbers and returns the
   * sum of both
   *
   * @param a - Some Integer Number
   * @param b - Another Integer Number
   * @return The result of a + b
   */
    public static Integer sum(Integer a, Integer b)
    {
      //TODO: Implement me
      if (a == null && b==null)
      {
        return null;
      }
      else
      {
        if (a==null)
        {
          return b;
        }
        else
        {
          if (b==null)
          {
            return a;
          }
          else
          {
            return a+b;
          }
        }
      }
    }
}
