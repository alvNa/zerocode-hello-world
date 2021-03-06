package org.jsmart.zerocode.testhelp.tests.OAuth2;

import org.jsmart.zerocode.core.domain.JsonTestCase;
import org.jsmart.zerocode.core.domain.TargetEnv;
import org.jsmart.zerocode.core.domain.UseHttpClient;
import org.jsmart.zerocode.core.runner.ZeroCodeUnitRunner;
import org.jsmart.zerocode.zerocode.oauth2.OAuth2HttpClient;
import org.junit.Test;
import org.junit.runner.RunWith;

@TargetEnv("host.properties")
@RunWith(ZeroCodeUnitRunner.class)
@UseHttpClient(OAuth2HttpClient.class)
public class OAuth2Test {
	
	@Test
	@JsonTestCase("helloworld_OAuth2/OAuth_supported _request.json")
	public void injectOAuth() {
		
	}

}
