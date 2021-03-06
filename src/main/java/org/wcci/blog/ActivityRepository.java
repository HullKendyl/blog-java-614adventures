package org.wcci.blog;

import org.springframework.data.repository.CrudRepository;

public interface ActivityRepository extends CrudRepository<Activity, Long> {
    Activity findByName(String name);
}
