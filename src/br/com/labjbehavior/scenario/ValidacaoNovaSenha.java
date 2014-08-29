package br.com.labjbehavior.scenario;

import org.jbehave.scenario.*;
import org.jbehave.scenario.parser.*;
import org.jbehave.scenario.reporters.*;

public class ValidacaoNovaSenha extends JUnitScenario {
	
	public ValidacaoNovaSenha() {
		
		super(new MostUsefulConfiguration(){
			
			public ScenarioDefiner forDefiningScenarios(){
				return new ClasspathScenarioDefiner(
						new UnderscoredCamelCaseResolver(".scenario"),
						new PatternScenarioParser(keywords()));
			}
			
			public ScenarioReporter forReportingScenarios(){
				return new PrintStreamScenarioReporter();
			}
		});
		
		addSteps(new ValidacaoNovaSenhaSteps());
	}
}
