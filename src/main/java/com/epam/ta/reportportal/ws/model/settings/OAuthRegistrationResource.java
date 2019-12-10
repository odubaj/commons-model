/*
 * Copyright 2019 EPAM Systems
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.epam.ta.reportportal.ws.model.settings;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import java.io.Serializable;
import java.util.Map;
import java.util.Set;

/**
 * Settings for OAuth provider registration.
 *
 * @author Anton Machulski
 */
public class OAuthRegistrationResource implements Serializable {
	public static final String URL_PATTERN = "^(http://|https://)?(www\\.)?([a-zA-Z0-9-]+)\\.([a-zA-Z0-9-]+\\.)*[a-z]{2,}(/[a-z_-]+)*$";

	private String id;

	@NotBlank
	private String clientId;

	@NotBlank
	private String clientSecret;

	private String clientAuthMethod;

	private String authGrantType;

	private String redirectUrlTemplate;

	@Pattern(regexp = URL_PATTERN)
	private String authorizationUri;

	@Pattern(regexp = URL_PATTERN)
	private String tokenUri;

	private String userInfoEndpointUri;

	private String userInfoEndpointNameAttribute;

	private String jwkSetUri;

	private String clientName;

	private Set<String> scopes;

	private Map<String, String> restrictions;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getClientId() {
		return clientId;
	}

	public void setClientId(String clientId) {
		this.clientId = clientId;
	}

	public String getClientSecret() {
		return clientSecret;
	}

	public void setClientSecret(String clientSecret) {
		this.clientSecret = clientSecret;
	}

	public String getClientAuthMethod() {
		return clientAuthMethod;
	}

	public void setClientAuthMethod(String clientAuthMethod) {
		this.clientAuthMethod = clientAuthMethod;
	}

	public String getAuthGrantType() {
		return authGrantType;
	}

	public void setAuthGrantType(String authGrantType) {
		this.authGrantType = authGrantType;
	}

	public String getRedirectUrlTemplate() {
		return redirectUrlTemplate;
	}

	public void setRedirectUrlTemplate(String redirectUrlTemplate) {
		this.redirectUrlTemplate = redirectUrlTemplate;
	}

	public String getAuthorizationUri() {
		return authorizationUri;
	}

	public void setAuthorizationUri(String authorizationUri) {
		this.authorizationUri = authorizationUri;
	}

	public String getTokenUri() {
		return tokenUri;
	}

	public void setTokenUri(String tokenUri) {
		this.tokenUri = tokenUri;
	}

	public String getUserInfoEndpointUri() {
		return userInfoEndpointUri;
	}

	public void setUserInfoEndpointUri(String userInfoEndpointUri) {
		this.userInfoEndpointUri = userInfoEndpointUri;
	}

	public String getUserInfoEndpointNameAttribute() {
		return userInfoEndpointNameAttribute;
	}

	public void setUserInfoEndpointNameAttribute(String userInfoEndpointNameAttribute) {
		this.userInfoEndpointNameAttribute = userInfoEndpointNameAttribute;
	}

	public String getJwkSetUri() {
		return jwkSetUri;
	}

	public void setJwkSetUri(String jwkSetUri) {
		this.jwkSetUri = jwkSetUri;
	}

	public String getClientName() {
		return clientName;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	public Set<String> getScopes() {
		return scopes;
	}

	public void setScopes(Set<String> scopes) {
		this.scopes = scopes;
	}

	public Map<String, String> getRestrictions() {
		return restrictions;
	}

	public void setRestrictions(Map<String, String> restrictions) {
		this.restrictions = restrictions;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}

		OAuthRegistrationResource that = (OAuthRegistrationResource) o;

		if (id != null ? !id.equals(that.id) : that.id != null) {
			return false;
		}
		if (clientId != null ? !clientId.equals(that.clientId) : that.clientId != null) {
			return false;
		}
		if (clientSecret != null ? !clientSecret.equals(that.clientSecret) : that.clientSecret != null) {
			return false;
		}
		if (clientAuthMethod != null ? !clientAuthMethod.equals(that.clientAuthMethod) : that.clientAuthMethod != null) {
			return false;
		}
		if (authGrantType != null ? !authGrantType.equals(that.authGrantType) : that.authGrantType != null) {
			return false;
		}
		if (redirectUrlTemplate != null ? !redirectUrlTemplate.equals(that.redirectUrlTemplate) : that.redirectUrlTemplate != null) {
			return false;
		}
		if (authorizationUri != null ? !authorizationUri.equals(that.authorizationUri) : that.authorizationUri != null) {
			return false;
		}
		if (tokenUri != null ? !tokenUri.equals(that.tokenUri) : that.tokenUri != null) {
			return false;
		}
		if (userInfoEndpointUri != null ? !userInfoEndpointUri.equals(that.userInfoEndpointUri) : that.userInfoEndpointUri != null) {
			return false;
		}
		if (userInfoEndpointNameAttribute != null ?
				!userInfoEndpointNameAttribute.equals(that.userInfoEndpointNameAttribute) :
				that.userInfoEndpointNameAttribute != null) {
			return false;
		}
		if (jwkSetUri != null ? !jwkSetUri.equals(that.jwkSetUri) : that.jwkSetUri != null) {
			return false;
		}
		if (clientName != null ? !clientName.equals(that.clientName) : that.clientName != null) {
			return false;
		}
		if (scopes != null ? !scopes.equals(that.scopes) : that.scopes != null) {
			return false;
		}
		return restrictions != null ? restrictions.equals(that.restrictions) : that.restrictions == null;
	}

	@Override
	public int hashCode() {
		int result = id != null ? id.hashCode() : 0;
		result = 31 * result + (clientId != null ? clientId.hashCode() : 0);
		result = 31 * result + (clientSecret != null ? clientSecret.hashCode() : 0);
		result = 31 * result + (clientAuthMethod != null ? clientAuthMethod.hashCode() : 0);
		result = 31 * result + (authGrantType != null ? authGrantType.hashCode() : 0);
		result = 31 * result + (redirectUrlTemplate != null ? redirectUrlTemplate.hashCode() : 0);
		result = 31 * result + (authorizationUri != null ? authorizationUri.hashCode() : 0);
		result = 31 * result + (tokenUri != null ? tokenUri.hashCode() : 0);
		result = 31 * result + (userInfoEndpointUri != null ? userInfoEndpointUri.hashCode() : 0);
		result = 31 * result + (userInfoEndpointNameAttribute != null ? userInfoEndpointNameAttribute.hashCode() : 0);
		result = 31 * result + (jwkSetUri != null ? jwkSetUri.hashCode() : 0);
		result = 31 * result + (clientName != null ? clientName.hashCode() : 0);
		result = 31 * result + (scopes != null ? scopes.hashCode() : 0);
		result = 31 * result + (restrictions != null ? restrictions.hashCode() : 0);
		return result;
	}
}
