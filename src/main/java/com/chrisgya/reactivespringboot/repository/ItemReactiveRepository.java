package com.chrisgya.reactivespringboot.repository;

import com.chrisgya.reactivespringboot.document.Item;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Mono;

public interface ItemReactiveRepository extends ReactiveMongoRepository<Item, String> {
    Mono<Item> findByDescription(String description);
}
