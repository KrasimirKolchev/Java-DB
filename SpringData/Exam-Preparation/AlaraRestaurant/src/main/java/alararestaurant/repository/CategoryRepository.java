package alararestaurant.repository;

import alararestaurant.domain.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
    Category findCategoryByName(String name);

    @Query("select c from alararestaurant.domain.entities.Category as c " +
            "order by c.items.size desc")
    List<Category> findAllCategoriesOrderByCount();
}
