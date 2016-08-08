public class Cat {
  private String name;
  private int age;
  private Toy[] toys;

  public Cat(String name, int age) {
    this.name = name;
    this.age = age;
    this.toys = new Toy[10];
  }

  public String getName() {
    return this.name;
  }

  public int getAge() {
    return this.age;
  }

  public int toyCount() {
    int count = 0;
    for (Toy toy : toys) {
      if (toy != null) {
        count++;
      }
    }
    return count;
  }

  public void giveToy(Toy toy) {
    if (!toyInventoryFull()) {
      int toyCount = toyCount();
      toys[toyCount] = toy;
    }
  }

  public boolean toyInventoryFull() {
    return toyCount() == toys.length;
  }

  public void sleep() {
    System.out.println("I'm going to sleep");
    try { 
      Thread.sleep(5000);
    } catch (InterruptedException e) {
      System.out.println(e);
    } 
    System.out.println("I'm awake");
  }
}