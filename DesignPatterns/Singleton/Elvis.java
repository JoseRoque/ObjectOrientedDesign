public class Elvis implements Serializable{
  private static final long serialVersionUID = -7604766932017737115L;
  private Elvis() {}

  public static class ElvisSerializeHelper {
    private static final Elvis INSTANCE = new Elvis();
  }

  public static Elvis getInstance(){
    return ElvisSerializeHelper.INSTANCE;
  }
}
