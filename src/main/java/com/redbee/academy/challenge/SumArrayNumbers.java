public class SumArrayNumbers {

  /**
   * Method that receives an array of numbers and
   * returns the sum of each number
   *
   * @param array - Some integer list. ([1,2,3])
   * @return The result of 1 + 2 + 3
   */
  public static Integer sum(List<Integer> array) {
    //TODO: Implement me
    Integer suma=0;
    for (int i=0;i<array.size();i++)
    {
      suma=suma+array.get(i);
    }
    return suma;
  }
}
