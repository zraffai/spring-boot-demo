

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

import junit.framework.Assert;
import springboot.my_first_application.controller.Shipwreck;
import springboot.my_first_application.controller.ShipwreckController;

@RunWith(SpringRunner.class)
public class ShipwreckControllerTest {

	ShipwreckController shipwreckCon=new ShipwreckController();
	
	@Test
	public void testList(){
		List<Shipwreck> list=shipwreckCon.list();
		Assert.assertNotNull(list);
		
	}
	
	@Test
	public void testGet(){
		Long id=2L;
		Shipwreck shipwreck=shipwreckCon.get(id);
		Assert.assertNotNull(shipwreck);
	}
	
	@Test
	public void testcreate(){
		Shipwreck shipwreck=new Shipwreck();
		shipwreck.setEmpId("2345678");
		shipwreck.setId(4L);
		shipwreck.setLocation("Hyderabad");
		shipwreck.setName("Santhosh");
		shipwreck.setPhoneNo("9765845145");
		shipwreck.setProject("MCK");
		Shipwreck ShipwreckResponse=shipwreckCon.create(shipwreck);
		Assert.assertNotNull(ShipwreckResponse);
		
	}
	@Test
	public void testUpdate(){
		Shipwreck shipwreck=new Shipwreck();
		shipwreck.setEmpId("2345679");
		shipwreck.setId(4L);
		shipwreck.setLocation("Hyderabad");
		shipwreck.setName("Santhosh");
		shipwreck.setPhoneNo("9765845145");
		shipwreck.setProject("MCK");
		Shipwreck ShipwreckResponse=shipwreckCon.update(4L, shipwreck);
		Assert.assertNotNull(ShipwreckResponse);
	}
	
	@Test
	public void testDelete(){
		Shipwreck ShipwreckResponse=shipwreckCon.delete(4L);
		
	}
}
