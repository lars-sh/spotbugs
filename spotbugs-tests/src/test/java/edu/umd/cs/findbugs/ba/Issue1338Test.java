package edu.umd.cs.findbugs.ba;

import static org.hamcrest.Matchers.hasSize;
import static org.junit.Assert.assertThat;

import org.junit.Test;

import edu.umd.cs.findbugs.AbstractIntegrationTest;
import edu.umd.cs.findbugs.SortedBugCollection;

public class Issue1338Test extends AbstractIntegrationTest {
	@Test
	public void test() {
		performAnalysis("ghIssues/Issue1338.class");
		final SortedBugCollection bugCollection = (SortedBugCollection) getBugCollection();
		assertThat(bugCollection.getErrors(), hasSize(0));
	}
}
