package com.chrisgya.reactivespringboot.repository;

import com.chrisgya.reactivespringboot.document.ItemCapped;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.data.mongodb.repository.Tailable;
import reactor.core.publisher.Flux;

public interface ItemReactiveCappedRepository extends ReactiveMongoRepository<ItemCapped,String> {

    @Tailable
    Flux<ItemCapped> findItemsBy();
}

