package org.example.app.cdModel;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class InternationalCD extends CD {

	private Integer cdId;
	private String cdName;
	private String language;
	
	@Override
	public String getDetails() {
		return "CD ID" + cdId + " CD Name: " + cdName + " CD Language: " + language;
	}

	
	

}
