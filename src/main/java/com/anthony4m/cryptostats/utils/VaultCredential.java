package com.anthony4m.cryptostats.utils;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties("anthony4m")
public class VaultCredential {
    private String apiKey;
    private String apiHost;
}
