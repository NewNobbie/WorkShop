package com.riwi.Library.Management.api.controllers;

import org.springframework.http.ResponseEntity;

public interface GenericController <RQ, RS, ID>{

    public ResponseEntity<RS> create(RQ request);

    public ResponseEntity<RS> get(Long id);

    public ResponseEntity<RS> update(RS request, Long id);

    public ResponseEntity<RS> delete(Long id);

}
