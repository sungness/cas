package org.apereo.cas.support.oauth.services;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

/**
 * This is {@link DefaultRegisteredServiceOAuthDeviceTokenExpirationPolicy}.
 *
 * @author Misagh Moayyed
 * @since 6.1.0
 */
@Slf4j
@Getter
@Setter
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
@JsonTypeInfo(use = JsonTypeInfo.Id.CLASS)
@ToString
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DefaultRegisteredServiceOAuthDeviceTokenExpirationPolicy implements RegisteredServiceOAuthDeviceTokenExpirationPolicy {
    private static final long serialVersionUID = 2146436756392637728L;

    private String timeToKill;
}
