package com.riwi.Library.Management.infrastructure.abstractServices;

import org.springframework.data.domain.Page;

public interface CRUDService <RQ,RS, ID> {

    public RS create(RQ request);
    public Page<RS> getAll(int page, int size);
    public RS update(RQ request,ID id);
    RS get(ID id);
    public void delete(ID id);



}
