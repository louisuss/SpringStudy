package com.dobi.tacos.data;

import com.dobi.tacos.Taco;
import org.springframework.data.repository.CrudRepository;

public interface TacoRepository extends CrudRepository<Taco, Long> {
//    Taco save(Taco design);
}
