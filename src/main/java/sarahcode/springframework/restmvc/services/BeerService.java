package sarahcode.springframework.restmvc.services;

import java.util.List;
import java.util.UUID;
import sarahcode.springframework.restmvc.model.Beer;

public interface BeerService {

    List<Beer> beerList();

    Beer getBeerById(UUID id);

    Beer saveNewBeer(Beer beer);

    void updateById(UUID beerId, Beer beer);

    void remove(UUID beerUuid);

    void update(UUID beerUuid, Beer beer);
}
