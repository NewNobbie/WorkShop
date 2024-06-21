package com.riwi.Library.Management.infrastructure.abstractServices;

import org.springframework.data.domain.Page;

public interface CRUDService <RQ,RS,Long> {

    public void delete(Long id);
    public RS create(RQ request);
    public RS update(Long id,RQ request);
    public Page<RS> getAll(int page, int size);
}
