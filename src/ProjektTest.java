

/**
 * Die Test-Klasse ProjektTest.
 *
 * @author  (Ihr Name)
 * @version (eine Versionsnummer oder ein Datum)
 */
public class ProjektTest extends junit.framework.TestCase
{
    /**
     * Konstruktor fuer die Test-Klasse ProjektTest
     */
    public ProjektTest()
    {
    }

    /**
     *  Setzt das Testgeruest fuer den Test.
     *
     * Wird vor jeder Testfall-Methode aufgerufen.
     */
    protected void setUp()
    {
    }

    /**
     * Gibt das Testgeruest wieder frei.
     *
     * Wird nach jeder Testfall-Methode aufgerufen.
     */
    protected void tearDown()
    {
    }

	public void testProjektTest()
	{
		Stuhl stuhl1 = new Stuhl();
		Tisch tisch1 = new Tisch();
		Sessel sessel1 = new Sessel();
		Schrank schrank1 = new Schrank();
		Bett bett1 = new Bett();
		Schrankwand swand1= new Schrankwand();
		stuhl1.zeige();
		tisch1.zeige();
		sessel1.zeige();
		schrank1.zeige();
		bett1.zeige();
		swand1.zeige();
	}
}

