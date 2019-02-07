package springboot.my_first_application.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Shipwreckstub {

	  private static Map<Long, Shipwreck> wrecks = new HashMap<Long, Shipwreck>();

	  private static Long idIndex = 3L;

	  static {

	    Shipwreck a = new Shipwreck(1L, "12345", "Suresh", "Apple", "9490415868", "HYD");

	    wrecks.put(1L, a);

	    Shipwreck b = new Shipwreck(2L, "12346", "Naresh", "Samsung", "9490415878", "HYD");
	    wrecks.put(2L, b);

	    Shipwreck c = new Shipwreck(3L, "12348", "Mahesh", "Nokia", "9490415888", "HYD");

	    wrecks.put(3L, c);

	  }

	  public static List<Shipwreck> list() {

	    return new ArrayList<Shipwreck>(wrecks.values());

	  }

	  public static Shipwreck create(Shipwreck wreck) {

	    idIndex += idIndex;

	    wreck.setId(idIndex);

	    wrecks.put(idIndex, wreck);

	    return wreck;

	  }

	  public static Shipwreck get(Long id) {

	    return wrecks.get(id);

	  }

	  public static Shipwreck update(Long id, Shipwreck wreck) {

	    wrecks.put(id, wreck);

	    return wreck;

	  }

	  public static Shipwreck delete(Long id) {

	    return wrecks.remove(id);

	  }

	}
