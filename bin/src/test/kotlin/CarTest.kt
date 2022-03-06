import org.testng.Assert.assertEquals;
import org.testng.Assert.assertNotNull;
import org.mockito.InjectMocks;
import org.testng.annotations.Test;

class CarTest {

  @InjectMocks
  val service: example.service.CarService = example.service.CarServiceImpl();

    @Test
    fun createCar_getPrice() {
      val o: example.model.Car = service.createCar();
      val expected = 0.0;
      assertEquals(o.price, expected);
    }

    @Test
    fun createCar_getYear() {
      val o: example.model.Car = service.createCar();
      val expected = 0;
      assertEquals(o.year, expected);
    }

    @Test
    fun createCar_getMake() {
      val o: example.model.Car = service.createCar();
      val expected = "test";
      assertEquals(o.make, expected);
    }

    @Test
    fun createCar_getModel() {
      val o: example.model.Car = service.createCar();
      val expected = "test";
      assertEquals(o.model, expected);
    }

    @Test
    fun createCar_objectNotNull() {
      val o: example.model.Car = service.createCar();
      assertNotNull(o);
    }

    @Test
    fun createRandomCar_objectNotNull() {
      val o: example.model.Car = service.createRandomCar();
      assertNotNull(o);
    }

    @Test
    fun findAll_sizeIsThree() {
      val lst: List<example.model.Car> = service.findAll();
      val expected = 3;
      assertEquals(lst.size, expected);
    }

    @Test
    fun addCar_sizeIsFour() {
      val lst: List<example.model.Car> = service.addCar();
      val expected = 4;
      assertEquals(lst.size, expected);
    }

    @Test
    fun deleteCar_sizeIsTwo() {
      val lst: List<example.model.Car> = service.deleteCar();
      val expected = 2;
      assertEquals(lst.size, expected);
    }
}
