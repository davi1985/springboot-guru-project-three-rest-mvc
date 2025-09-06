package sarahcode.springframework.restmvc.controller;

import java.util.List;
import java.util.UUID;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import jakarta.annotation.PostConstruct;
import sarahcode.springframework.restmvc.model.Beer;
import sarahcode.springframework.restmvc.services.BeerService;

@Slf4j
@AllArgsConstructor
@RestController
@RequestMapping("/api/v1/beer")
public class BeerController {

    private final BeerService beerService;

    // @RequestMapping(method = RequestMethod.POST)
    @PostMapping()
    public ResponseEntity<Beer> handlePost(@RequestBody Beer beer) {
        Beer savedBeer = beerService.saveNewBeer(beer);

        return ResponseEntity.ok(savedBeer);
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<Beer> beerList() {
        return beerService.beerList();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Beer getBeerById(@PathVariable("id") UUID id) {
        log.debug("Get Beer Id in controller");

        return beerService.getBeerById(id);
    }
}
