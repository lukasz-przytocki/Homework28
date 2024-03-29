package pl.lukasz.demo.Recipe;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface RecipeRepository extends JpaRepository<Recipe,Long> {


    @Query(value = "select * from Recipe order by LIKE_NUMBER DESC LIMIT 3", nativeQuery = true)
    List<Recipe> findThreeMostPopular();


    List<Recipe> findByCategory_Id(Long id);
}
