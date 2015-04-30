package io.nuun.extension.configuration;

import java.util.Map;

/**
 * @author Pierre Thirouin
 *         Date: 30/04/15
 */
public interface ConfigurationProvider {

    Map<String, Object> getConfiguration();
}
