package org.codingevents.codingevents.data;

import org.codingevents.codingevents.models.Event;
import org.codingevents.codingevents.models.EventCategory;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventCategoryRepository extends CrudRepository<EventCategory, Integer> {
}
