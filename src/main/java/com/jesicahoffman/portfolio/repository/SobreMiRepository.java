
package com.jesicahoffman.portfolio.repository;

import com.jesicahoffman.portfolio.model.SobreMi;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SobreMiRepository extends JpaRepository <SobreMi, Long>{
    
}
