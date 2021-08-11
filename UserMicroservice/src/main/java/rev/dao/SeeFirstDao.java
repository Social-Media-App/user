package rev.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import rev.model.SeeFirst;
import rev.model.User;

@Repository
public interface SeeFirstDao extends JpaRepository<SeeFirst, Integer> {
	
	public SeeFirst findBySeeFirstId(int id);

}
