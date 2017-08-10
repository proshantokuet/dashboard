package org.opensrp.dashboard.etl.repository;

import java.util.List;

import org.ektorp.CouchDbConnector;
import org.ektorp.ViewQuery;
import org.ektorp.support.CouchDbRepositorySupport;
import org.ektorp.support.GenerateView;
import org.opensrp.dashboard.etl.entity.Testss;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

@Repository
public class TestRepository extends CouchDbRepositorySupport<Testss> {

	@Autowired
	public TestRepository(@Qualifier("blogPostDatabase") CouchDbConnector couchDbConnector) {
		super(Testss.class, couchDbConnector);
		initStandardDesignDocument();
	}
	@GenerateView @Override
	public List<Testss> getAll() {
		ViewQuery q = createQuery("all")
						.descending(true)
						.includeDocs(true);
		return db.queryView(q, Testss.class);
	}

}
