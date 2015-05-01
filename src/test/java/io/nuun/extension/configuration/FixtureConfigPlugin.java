package io.nuun.extension.configuration;

import io.nuun.kernel.core.AbstractPlugin;
import org.apache.commons.configuration.BaseConfiguration;
import org.apache.commons.configuration.Configuration;

/**
 * @author Pierre Thirouin
 *         Date: 01/05/15
 */
public class FixtureConfigPlugin extends AbstractPlugin implements ConfigurationProvider {
    @Override
    public String name() {
        return "fixture-config-plugin";
    }

    @Override
    public Configuration getConfiguration() {
        Configuration configuration = new BaseConfiguration();
        configuration.addProperty("key1", 1);
        configuration.addProperty("key2", 2);
        return configuration;
    }
}
