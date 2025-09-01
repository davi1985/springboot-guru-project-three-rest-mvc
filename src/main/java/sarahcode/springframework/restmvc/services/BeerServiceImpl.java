package sarahcode.springframework.restmvc.services;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import sarahcode.springframework.restmvc.model.Beer;
import sarahcode.springframework.restmvc.model.BeerStyle;

@Slf4j
@Service
public class BeerServiceImpl implements BeerService {

  @Override
  public Beer getBeerById(UUID id) {
    log.debug("Get Beer Id in service: " + id.toString());

    return Beer.builder().
        id(id)
        .version(1)
        .beerName("Galaxy Cat")
        .beerStyle(BeerStyle.PALE_ALE).upc("12345")
        .price(new BigDecimal("12.00"))
        .quantityOnHand(122)
        .createdDate(LocalDateTime.now())
        .updatedDate(LocalDateTime.now())
        .build();
  }
}
