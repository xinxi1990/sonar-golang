package fr.univartois.sonargo;

import org.sonar.api.Plugin;

public class SonarGoPlugin implements Plugin{

	public void define(Context context) {
		context.addExtension(GoLanguage.class);
		context.addExtension(GoLintIssueLoaderSensor.class);
	}

}