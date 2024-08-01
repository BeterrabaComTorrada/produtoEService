package com.produtosES.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class JwtConfig {

    @Value("${security.jwt.uri:/auth/**}")
    private String Uri;

    @Value("${security.jwt.header:Authorization}")
    private String header;

    @Value("${security.jwt.prefix:Bearer }")
    private String prefix;

    @Value("${security.jwt.expiration:#{24*60*60}}")
    private int expiration;

    @Value("${security.jwt.secret:JwtSecretKey}")
    private String secret;

    // eu nao sei como interagir com a config do jwt em apli.proper
 public String getUri() {
    return uri;
}

public String getHeader() {
    return header;
}

public String getPrefix() {
    return prefix;
}

public int getExpiration() {
    return expiration;
}

public String getSecret() {
    return secret;
}
}
