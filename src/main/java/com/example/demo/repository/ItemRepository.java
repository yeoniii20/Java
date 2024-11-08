package com.example.demo.repository;

import com.example.demo.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, Long> {
    // 추가적인 쿼리 메서드가 필요하면 여기에 선언할 수 있습니다.
}
