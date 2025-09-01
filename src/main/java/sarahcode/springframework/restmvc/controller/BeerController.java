package sarahcode.springframework.restmvc.controller;

import java.util.UUID;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import sarahcode.springframework.restmvc.model.Beer;
import sarahcode.springframework.restmvc.services.BeerService;

@Slf4j
@AllArgsConstructor
@Controller
public class BeerController {

  private final BeerService beerService;

  public Beer getBeerById(UUID id) {
    log.debug("Get Beer Id in controller");

    return beerService.getBeerById(id);
  }
}
