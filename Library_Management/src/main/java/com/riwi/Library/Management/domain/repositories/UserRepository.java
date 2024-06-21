package com.riwi.Library.Management.domain.repositories;

import com.riwi.Library.Management.domain.entities.User;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User , Long> {

    /*public Page<User>*/

}
