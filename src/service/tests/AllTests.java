package service.tests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ AfficherClientTests.class, AjouterClientTests.class, SupprimerClientTests.class,
		VirementCompteACompteTests.class })
public class AllTests {

}
