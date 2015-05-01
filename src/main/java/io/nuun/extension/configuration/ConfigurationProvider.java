package io.nuun.extension.configuration;

import org.apache.commons.configuration.Configuration;

/**
 * @author Pierre Thirouin
 *         Date: 30/04/15
 */
public interface ConfigurationProvider {

    Configuration getConfiguration();
}
