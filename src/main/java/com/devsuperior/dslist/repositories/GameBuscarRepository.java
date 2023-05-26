package com.devsuperior.dslist.repositories;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;



import com.devsuperior.dslist.entities.Game;





public interface GameBuscarRepository extends JpaRepository<Game, Long>{
	
	
	//Game findByTitle(String title);
	
	List<Game> findByTitleContainingIgnoreCase(String title);
	
	@Query(nativeQuery = true, value = "SELECT title FROM tb_game title WHERE title LIKE %:title% ")
	List<Game> findByTitleLike(@Param("title")String title);
	

	
	

}
