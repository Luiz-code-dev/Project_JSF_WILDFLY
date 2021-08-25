package defaultPackage;

import javax.enterprise.context.ApplicationScoped;
import javax.faces.annotation.FacesConfig;
import javax.faces.annotation.FacesConfig.Version;

@FacesConfig(version = Version.JSF_2_3)
@ApplicationScoped
public class Config {

	private String text;

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
}
