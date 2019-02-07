package springboot.my_first_application.controller;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController

@RequestMapping("api/v1/")

public class ShipwreckController {

  @RequestMapping(value = "shipwrecks", method = RequestMethod.GET)

  public List<Shipwreck> list(){

    return Shipwreckstub.list();

  }

  @RequestMapping(value = "shipwrecks", method = RequestMethod.POST)

  public Shipwreck create(@RequestBody Shipwreck shipwreck){

    return Shipwreckstub.create(shipwreck);

  }

  @RequestMapping(value = "shipwrecks/{id}", method = RequestMethod.GET)

  public Shipwreck get(@PathVariable Long id){

    return Shipwreckstub.get(id);

  }

  @RequestMapping(value = "shipwrecks/{id}", method = RequestMethod.PUT)

  public Shipwreck update(@PathVariable Long id, @RequestBody Shipwreck shipwreck){

    return Shipwreckstub.update(id, shipwreck);

  }

  @RequestMapping(value = "shipwrecks/{id}", method = RequestMethod.DELETE)

  public Shipwreck delete(@PathVariable Long id){

    return Shipwreckstub.delete(id);

  }

}