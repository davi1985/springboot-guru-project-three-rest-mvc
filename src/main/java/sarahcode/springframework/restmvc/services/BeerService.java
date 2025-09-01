package sarahcode.springframework.restmvc.services;

import java.util.UUID;
import sarahcode.springframework.restmvc.model.Beer;

public interface BeerService {

  Beer getBeerById(UUID id);
}
