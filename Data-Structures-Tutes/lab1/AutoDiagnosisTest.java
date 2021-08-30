package lab1;

import static org.junit.Assert.*;

import org.junit.Test;

public class AutoDiagnosisTest {

	@Test
	public void testFlu() {
		AutoDiagnosis a = new AutoDiagnosis();
		a.addSymptom("Headache");
		a.addSymptom("Coughing");
		a.addSymptom("Vomiting");
		
		assertEquals("Flu", a.diagnose());
		
		AutoDiagnosis b = new AutoDiagnosis();
		b.addSymptom("Vomiting");
		b.addSymptom("Headache");
		b.addSymptom("Coughing");
		
		assertEquals("Flu", b.diagnose());
	}
	
	@Test
	public void testViralInfection()
	{
		AutoDiagnosis c = new AutoDiagnosis();
		c.addSymptom("Headache");
		c.addSymptom("Sore Stomache");
		
		assertEquals("Viral Infection", c.diagnose());
	}
	
	@Test
	public void testHealthy()
	{
		AutoDiagnosis f = new AutoDiagnosis();

		assertEquals("Healthy", f.diagnose());
	}
	
	@Test
	public void testUnknown()
	{
		AutoDiagnosis d = new AutoDiagnosis();
		d.addSymptom("Headache");
		d.addSymptom("Coughing");
		d.addSymptom("Sore Limb");
		
		assertEquals("Unknown Illness", d.diagnose());
		
		AutoDiagnosis e = new AutoDiagnosis();
		e.addSymptom("Missing Leg");
		e.addSymptom("Bleeding");
		
		assertEquals("Unknown Illness", e.diagnose());
	}
}
