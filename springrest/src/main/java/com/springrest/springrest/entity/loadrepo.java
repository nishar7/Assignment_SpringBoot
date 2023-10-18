package com.springrest.springrest.entity;

import java.util.List;

public interface loadrepo extends JpaRepository<Load, Long> {
    List<Load> findByShipperId(String shipperId);
}
