import static org.junit.Assert.assertEquals;
import org.junit.*;

public class CatTest {
  Cat cat;
  Toy toy;

  @Before
  public void before() {
    cat = new Cat("Alfred", 1);
    toy = new Toy();
  }

  @Test
  public void hasName() {
    assertEquals("Alfred", cat.getName());
  }

  @Test
  public void hasAge() {
    assertEquals(1, cat.getAge());
  }

  @Test
  public void toyInventoryStartsEmpty() {
    assertEquals(0, cat.toyCount());
  }

  @Test
  public void canAddToy() {
    cat.giveToy(toy);
    assertEquals(1, cat.toyCount());
  }

  @Test
  public void toyInventoryIsFull() {
    for (int i = 0; i < 10; i++) {
      cat.giveToy(toy);
    }
    assertEquals(true, cat.toyInventoryFull());
  }

  @Test
  public void sleep() {
    
  }


}