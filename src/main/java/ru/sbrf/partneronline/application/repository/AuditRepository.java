package ru.sbrf.partneronline.application.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import ru.sbrf.partneronline.application.model.Audit;

/**
 * Created by vbauer on 12/05/14.
 */
public interface AuditRepository extends PagingAndSortingRepository<Audit, Long> {


}
