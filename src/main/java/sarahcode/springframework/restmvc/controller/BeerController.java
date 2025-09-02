package sarahcode.springframework.restmvc.controller;

import java.util.List;
import java.util.UUID;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sarahcode.springframework.restmvc.model.Beer;
import sarahcode.springframework.restmvc.services.BeerService;

@Slf4j
@AllArgsConstructor
@RestController
public class BeerController {

  private final BeerService beerService;

  @RequestMapping("/api/v1/beer")
  public List<Beer> beerList() {
    return beerService.beerList();
  }

  public Beer getBeerById(UUID id) {
    log.debug("Get Beer Id in controller");

    return beerService.getBeerById(id);
  }
}
